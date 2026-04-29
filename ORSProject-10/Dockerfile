FROM eclipse-temurin:11-jdk-jammy 

WORKDIR /app 

COPY target/*.jar app.jar 

ENTRYPOINT ["java", "-jar", "app.jar"]