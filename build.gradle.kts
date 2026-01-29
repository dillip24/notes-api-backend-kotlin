buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("org.flywaydb:flyway-database-postgresql:12.0.0")
    }
}

plugins {
    kotlin("jvm") version "2.3.0"
    id("org.flywaydb.flyway") version "12.0.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.flywaydb:flyway-core:12.0.0")
    implementation("org.postgresql:postgresql:42.7.9")
    implementation("org.flywaydb:flyway-database-postgresql:12.0.0")
}

flyway {
    url = "jdbc:postgresql://localhost:54322/db"
    user = "user"
    password = "borat"
}
kotlin {
    jvmToolchain(25)
}

tasks.test {
    useJUnitPlatform()
}
