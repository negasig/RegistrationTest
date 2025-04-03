FROM openjdk:17-jdk

LABEL mentainer="negaso@gmail.com"
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
