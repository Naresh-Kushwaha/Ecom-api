FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests
COPY --from=build/target/demo-0.0.1-SNAPSHOT.jar demo.jar
EXPOSE 8080
#ENTRYPOINT ["java","-jar","demo.jar"']
# For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar demo.jar
