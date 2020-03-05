import kr.entree.spigradle.kotlin.dependency.commandhelper
import kr.entree.spigradle.kotlin.repository.enginehub
import kr.entree.spigradle.kotlin.repository.jitpack

plugins {
    java
    id("kr.entree.spigradle") version "1.1.5"
}

group = "kr.entree"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    enginehub()
    jitpack()
}

dependencies {
    compileOnly(commandhelper())
    compileOnly("com.github.SkriptLang:Skript:2.4.1")
    testCompile("junit", "junit", "4.12")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

val generatedSourceDir = File(buildDir, "generated/sources/chskriptMeta/java/main")

sourceSets {
    main {
        java {
            srcDir(generatedSourceDir)
        }
    }
}

tasks {
    val generateSource by registering {
        File(generatedSourceDir, "kr/entree/chskript/CHSkriptGradle.java").apply {
            parentFile.mkdirs()
        }.bufferedWriter().use {
            //language=JAVA
            it.write("""
                package kr.entree.chskript;
                public class CHSkriptGradle {
                    public static final String VERSION = "${project.version}";
                }
            """.trimIndent())
        }
    }
    compileJava {
        dependsOn(generateSource)
    }
    spigotPluginYaml {
        enabled = false
    }
}