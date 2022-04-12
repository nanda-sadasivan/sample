FROM openjdk:17-jdk
ADD target/sample.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
