FROM openjdk:8
EXPOSE 8080
ADD target/first-jenkin.jar first-jenkin.jar
ENTRYPOINT [ "java","-jar","/first-jenkin.jar" ]