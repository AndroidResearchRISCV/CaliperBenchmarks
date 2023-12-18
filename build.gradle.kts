plugins {
    id("java")
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

group = "blue"
version = "0.1"

repositories {
    mavenCentral()
    maven(
        url = "https://maven.google.com"
    )
}

dependencies {

//    implementation(platform("org.junit:junit-bom:5.9.1"))
//    implementation("org.junit.jupiter:junit-jupiter")
    implementation("com.google.caliper:caliper:1.0-beta-3")
}


tasks.withType<Jar> {
    manifest {
        attributes(
            "Main-Class" to "com.google.caliper.runner.CaliperMain",
            "Premain-Class" to "com.google.monitoring.runtime.instrumentation.AllocationInstrumenter",
            "Can-Redefine-Classes" to "true",
            "Can-Retransform-Classes" to "true"
        )
    }

//    from {
//        configurations.runtimeClasspath.map { it.fi.isDirectory() ? it : zipTree(it) }
//    }
}

task("getRuntimeClasspath") {
    println(
        sourceSets.main.get().runtimeClasspath.joinToString(":")
    )
}

tasks.test {
    useJUnitPlatform()
}