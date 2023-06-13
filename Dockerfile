FROM openjdk:8-jdk-slim
EXPOSE 8080
COPY target/users-0.0.1-SNAPSHOT.jar users.jar  
ENTRYPOINT ["java","-jar","users.jar"]
