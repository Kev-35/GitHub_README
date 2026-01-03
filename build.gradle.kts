import org.gradle.api.tasks.testing.logging.TestExceptionFormat

plugins {
    id("java")
    id("io.qameta.allure") version "2.10.0"
}

group = "ru.kev35"
version = "1.0-SNAPSHOT"


allure {
    report {
        version.set("2.19.0") //версия Allure Report (https://github.com/allure-framework/allure2)
    }
    adapter {
        aspectjWeaver.set(true) // обработка аннотации @Step
        frameworks {
            junit5 {
                adapterVersion.set("2.19.0") //версия Allure JUnit5 (https://github.com/allure-framework/allure-java)
            }
        }
    }
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("com.codeborne:selenide:7.10.1")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    testImplementation("io.qameta.allure:allure-selenide:2.17.3")
    testRuntimeOnly("org.aspectj:aspectjweaver:1.9.25")
    implementation("org.slf4j:slf4j-api:2.0.7")
    testImplementation("org.slf4j:slf4j-simple:2.0.16")
}

tasks.withType<Test> {
    useJUnitPlatform()

    // ПЕРЕДАЧА СИСТЕМНЫХ СВОЙСТВ (Добавьте эту строку)
    systemProperties(System.getProperties().toMap() as Map<String, Any>)

    testLogging {
        lifecycle {
            events("started", "skipped", "failed", "standard_error", "standard_out")
            exceptionFormat = TestExceptionFormat.SHORT
        }
    }
}