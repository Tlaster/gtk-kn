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

package org.gtkkn.samples.playground

import io.github.oshai.KotlinLogging
import io.github.oshai.KotlinLoggingConfiguration
import io.github.oshai.Level
import org.gtkkn.bindings.gio.ApplicationFlags
import org.gtkkn.bindings.gtk.Application
import org.gtkkn.bindings.gtk.ApplicationWindow
import org.gtkkn.extensions.gio.runApplication

val logger = KotlinLogging.logger("main")

@Suppress("FunctionName")
fun Application(builder: ApplicationWindow.() -> Unit) {
    KotlinLoggingConfiguration.logLevel = Level.TRACE
    logger.trace { "Hello World!" }
    val app = Application("org.gtkkn.samples.playground", ApplicationFlags.FLAGS_NONE)
    app.connectActivate {
        logger.info { "Application activate" }

        val window = ApplicationWindow(app)
        window.builder()
        window.present()
    }
    app.runApplication()
}