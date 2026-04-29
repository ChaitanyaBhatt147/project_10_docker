FROM eclipse-temurin:11-jre-jammy

WORKDIR /app

COPY target/ORSProject-10-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]