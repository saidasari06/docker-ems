FROM openjdk:21-jdk-slim

WORKDIR /app
COPY gradle /app/gradle
COPY gradlew /app/

COPY build.gradle /app/
COPY gradle.properties /app/
COPY settings.gradle /app/
RUN chmod +x gradlew

COPY src /app/src
RUN ./gradlew build
RUN cp /app/build/libs/employee-1.0.0.jar /app/


EXPOSE 8092
CMD ["java", "-jar", "/app/employee-1.0.0.jar"]
