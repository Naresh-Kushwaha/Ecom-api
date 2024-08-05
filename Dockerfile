# Use the official Maven image to create a build artifact.
# https://hub.docker.com/_/maven
FROM maven:3.8.4-openjdk-11 AS build
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline -B
COPY src ./src


# Use the official OpenJDK image to run the application
# https://hub.docker.com/_/openjdk
FROM openjdk:11-jre-slim
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
