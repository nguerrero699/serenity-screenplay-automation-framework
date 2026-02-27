plugins {
    java
    id("net.serenity-bdd.serenity-gradle-plugin") version "4.2.16"
}

group = "com.nycoodev.automation"
version = "1.0.0"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

repositories {
    mavenCentral()
}

dependencies {

    // Serenity (sin BOM)
    testImplementation("net.serenity-bdd:serenity-core:4.2.16")
    testImplementation("net.serenity-bdd:serenity-junit5:4.2.16")
    testImplementation("net.serenity-bdd:serenity-screenplay:4.2.16")
    testImplementation("net.serenity-bdd:serenity-screenplay-webdriver:4.2.16")
    testImplementation("net.serenity-bdd:serenity-cucumber:4.2.16")
    testImplementation("org.hamcrest:hamcrest:2.2")

    // Cucumber Engine para JUnit 5
    testImplementation("io.cucumber:cucumber-junit-platform-engine:7.14.0")

    // Selenium
    testImplementation("org.seleniumhq.selenium:selenium-java:4.20.0")

    // JUnit
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
    testImplementation("org.junit.platform:junit-platform-suite:1.10.2")
}

tasks.test {
    useJUnitPlatform()
    finalizedBy("aggregate")
}

tasks.withType<Test> {
    systemProperty("file.encoding", "UTF-8")
}

serenity {
    reports = listOf("single-page-html")
}