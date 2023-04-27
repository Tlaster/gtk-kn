/*
 * Copyright (c) 2023 gtk-kn
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.gtkkn.gradle.plugin.task

import org.gradle.api.DefaultTask
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.logging.LogLevel
import org.gradle.api.provider.ListProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Internal
import org.gradle.api.tasks.Nested
import org.gradle.api.tasks.TaskAction
import java.io.ByteArrayOutputStream

abstract class NativeTask : DefaultTask() {
    @get:Input
    abstract val executable: Property<String>

    @get:Internal
    abstract val workingDir: DirectoryProperty

    @get:Input
    abstract val args: ListProperty<String>

    @get:Nested
    abstract val packages: ToolingPackages

    /**
     * Added utility for extending classes to prepend some arguments before [args]
     */
    protected open fun prependArgs(): List<String> = emptyList()

    protected open fun processOutput(output: String) {}

    @TaskAction
    fun run() {
        project.checkTooling(executable.get(), true, packages)
        ByteArrayOutputStream().use { outputStream ->
            project.exec {
                logging.captureStandardOutput(LogLevel.INFO)
                logging.captureStandardError(LogLevel.ERROR)
                executable = this@NativeTask.executable.get()
                workingDir = this@NativeTask.workingDir.asFile.getOrElse(temporaryDir)
                args = prependArgs() + this@NativeTask.args.get()
                standardOutput = outputStream
            }
            outputStream.toString()
        }.also(::processOutput)
    }
}
