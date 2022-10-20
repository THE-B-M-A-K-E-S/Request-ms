FROM openjdk:17
EXPOSE 8086
ADD target/request-ms.jar request-ms.jar
ENTRYPOINT ["java", "-jar", "request-ms.jar"]