plugins {
    id("java")
    id("io.qameta.allure") version "2.11.2"  // Плагин для Allure
}

repositories {
    mavenCentral()
}

dependencies {
    // JUnit 5
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")

    // REST Assured
    testImplementation("io.rest-assured:rest-assured:5.4.0")
    testImplementation("io.rest-assured:json-path:5.4.0")

    // Selenide (последняя стабильная версия)
    testImplementation("com.codeborne:selenide:7.2.3")
    testImplementation("org.seleniumhq.selenium:selenium-java:4.15.0")
    testImplementation("io.github.bonigarcia:webdrivermanager:5.6.3")

    testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
    testImplementation("io.qameta.allure:allure-junit5:2.24.0")  // Интеграция с JUnit 5
    testImplementation("io.qameta.allure:allure-commandline:2.24.0")  // Генерация отчётов

    // Вспомогательные библиотеки
    testImplementation("org.hamcrest:hamcrest:2.2")
    testImplementation("org.slf4j:slf4j-simple:2.0.12") // Логирование для Selenide
}

tasks.test {
    useJUnitPlatform()
    systemProperty("selenide.headless", "true")
    systemProperty("allure.results.directory", "build/allure-results")  // Куда со// Опционально: запуск в headless-режиме
}

allure {
    adapter {
        frameworks {
            junit5 {
                adapterVersion.set("2.24.0")  // Версия адаптера
            }
        }
    }
    report {
        reportDir.set(file("build/allure-report"))  // Где создавать отчёт
    }
}