FROM openjdk:17
EXPOSE 8081
ADD target/gateway-service-0.0.1-SNAPSHOT.jar gateway-service.jar
ENTRYPOINT ["java","-jar","/gateway-service.jar"]