FROM openjdk:8
COPY ./target/docker-maven-hello-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-cp", "docker-maven-hello-jar-with-dependencies.jar", "Main"]