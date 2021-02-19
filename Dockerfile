FROM openjdk:8
COPY ./target/docker-maven-hello.jar ./
WORKDIR ./
CMD ["java", "-cp", "docker-maven-hello.jar", "main"]