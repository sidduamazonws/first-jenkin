FROM openjdk:8
EXPOSE 8080
ADD target/first-jenkin1.jar first-jenkin1.jar
ENTRYPOINT [ "java","-jar","/first-jenkin1.jar" ]