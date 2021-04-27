FROM openjdk:8-jdk-alpine
EXPOSE 9092
ADD target/*.jar app.jar
ENTRYPOINT ["sh", "-c", "java -jar hello-world.jar"]