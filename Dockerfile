FROM openjdk:17-jdk-alpine
MAINTAINER Team2
COPY build/libs/order-0.0.1-SNAPSHOT.jar order-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/message-server-1.0.0.jar"]