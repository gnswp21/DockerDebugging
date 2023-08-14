FROM openjdk:11

COPY build/libs/docker_debug-0.0.1-SNAPSHOT.jar /app.jar

WORKDIR /app

EXPOSE 5005
EXPOSE 8080

CMD ["java", "-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005", "-jar", "/app.jar"]
