/*
 * Copyright (c) 2023 gtk-kn
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

import ext.PublishConfigExt
import ext.config

plugins {
    id("config-conventions")
    `maven-publish`
    signing
}

val publish = config.extensions.create<PublishConfigExt>("publish").apply {
    ossrhUsername.convention(
        providers.gradleProperty("org.gtkkn.signing.ossrh.username")
            .orElse(providers.environmentVariable("OSSRH_USERNAME")),
    )
    ossrhPassword.convention(
        providers.gradleProperty("org.gtkkn.signing.ossrh.password")
            .orElse(providers.environmentVariable("OSSRH_PASSWORD")),
    )
    signingKeyId.convention(
        providers.gradleProperty("org.gtkkn.signing.keyId")
            .orElse(providers.environmentVariable("SIGNING_KEY_ID")),
    )
    signingPassword.convention(
        providers.gradleProperty("org.gtkkn.signing.password")
            .orElse(providers.environmentVariable("SIGNING_PASSWORD")),
    )
    signingSecretKey.convention(
        providers.gradleProperty("org.gtkkn.signing.secretKey")
            .orElse(providers.environmentVariable("SIGNING_SECRET_KEY")),
    )
}

val javadocJar by tasks.registering(Jar::class) {
    archiveClassifier.set("javadoc")
}

publishing {
    // Configure Sonatype snapshots repository
    repositories {
        maven {
            name = "Snapshots"
            setUrl("https://s01.oss.sonatype.org/content/repositories/snapshots/")
            credentials {
                username = publish.ossrhUsername.orNull
                password = publish.ossrhPassword.orNull
            }
        }
    }

    // Configure all publications
    publications.withType<MavenPublication> {
        // Provide artifacts information requited by Maven Central
        pom {
            name.set(project.name)
            description.set("Provides Kotlin Native bindings for the GTK framework")
            url.set(config.website)

            licenses {
                license {
                    name.set("LGPL")
                    url.set("https://www.gnu.org/licenses/lgpl-3.0.html")
                }
            }

            developers {
                // In alphabetical order
                developer {
                    id.set("leinardi")
                    name.set("Roberto Leinardi")
                    email.set("roberto@leinardi.com")
                }
                developer {
                    id.set("petuska")
                    name.set("Martynas Petuška")
                    email.set("martynas@petuska.dev")
                }
                developer {
                    id.set("vbsteven")
                    name.set("Steven Van Bael")
                    email.set("steven@quantus.io")
                }
            }

            scm {
                connection.set("scm:git:git://gitlab.com/gtk-kn/gtk-kn.git")
                developerConnection.set("scm:git:git@gitlab.com:gtk-kn/gtk-kn.git")
                url.set(config.vcsUrl)
            }
        }
    }
}

tasks {
    val cleanMavenLocal by registering {
        group = BasePlugin.BUILD_GROUP
        doLast {
            val groupRepo =
                file("${System.getProperty("user.home")}/.m2/repository/${project.group.toString().replace(".", "/")}")
            publishing.publications.filterIsInstance<MavenPublication>().forEach {
                groupRepo.resolve(it.artifactId).deleteRecursively()
            }
        }
    }
    named(BasePlugin.CLEAN_TASK_NAME) {
        dependsOn(cleanMavenLocal)
    }
    withType<AbstractPublishToMaven> {
        mustRunAfter(withType<Sign>())
    }
}

// Signing artifacts. Signing.* extra properties values will be used
signing {
    isRequired = publish.signingPassword.isPresent
    useInMemoryPgpKeys(publish.signingKeyId.orNull, publish.signingSecretKey.orNull, publish.signingPassword.orNull)
    sign(publishing.publications)
}

tasks.withType<AbstractPublishToMaven> {
    mustRunAfter(tasks.withType<Sign>())
}
