/*
 * Copyright (c) 2024 gtk-kn
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * gtk-kn is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with gtk-kn. If not, see https://www.gnu.org/licenses/.
 */

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    id("detekt-conventions")
    id("org.gtkkn.gtk")
}

kotlin {
    linuxX64 {
        binaries {
            executable {
                entryPoint = "org.gtkkn.samples.webkit.browser.main"
            }
        }
        gtk {
            targetLibraryVersions.put("gio", "2.28")
            targetLibraryVersions.put("glib", "2.66")
            targetLibraryVersions.put("gobject", "2.26")
        }
    }
    sourceSets {
        nativeMain {
            dependencies {
                // Import from project
                implementation(projects.bindings.extra.webkit)
                implementation(projects.bindings.adwaita)
                // Import from mavenLocal
                // implementation("org.gtkkn:webkit:0.0.1-SNAPSHOT")
            }
        }
    }
}
