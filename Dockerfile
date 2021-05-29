FROM openjdk:13-jdk-alpine
EXPOSE 8080
ARG JAR_FILE=build/libs/spring-boot-mysql-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} spring-boot-mysql.jar
ENTRYPOINT ["java", "-jar", "/spring-boot-mysql.jar"]