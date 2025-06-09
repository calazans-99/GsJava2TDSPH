# Cole o conteúdo abaixo:
#################################################
# Etapa 1: build da aplicação com Maven + Java 21
FROM maven:3.9-eclipse-temurin-21-alpine AS builder
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Etapa 2: runtime com Temurin 21
FROM eclipse-temurin:21-jdk-alpine
RUN adduser -D -H appuser
WORKDIR /app
COPY --from=builder /app/target/*.jar app.jar
RUN chown appuser:appuser app.jar && chmod 444 app.jar
ENV APP_PROFILE=default
EXPOSE 8080
USER appuser
ENTRYPOINT ["sh", "-c", "java -jar app.jar --spring.profiles.active=$APP_PROFILE"]
#################################################
