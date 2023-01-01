# To build image use command: docker build -t lexsolo/first-task .
# To push image use command: docker push lexsolo/first-task
# To run image use command: docker run --rm -it first-task:latest

FROM maven:3.8.6-jdk-11-slim
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
