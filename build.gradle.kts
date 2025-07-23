plugins {
    id("java")
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

    // Вспомогательные библиотеки
    testImplementation("org.hamcrest:hamcrest:2.2")
    testImplementation("org.slf4j:slf4j-simple:2.0.12") // Логирование для Selenide
}

tasks.test {
    useJUnitPlatform()
    systemProperty("selenide.headless", "true") // Опционально: запуск в headless-режиме
}