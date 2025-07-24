# Базовый образ с Java 17
FROM openjdk:17-alpine

# Рабочая директория
WORKDIR /app

# Копируем всё (кроме указанного в .dockerignore)
COPY . .

# Собираем проект (пропускаем тесты)
RUN ./gradlew build -x test

# Запускаем тесты при старте контейнера
CMD ["./gradlew", "clean", "test", "allureReport"]