from java:8
copy sprint-boot-demo1-0.0.1-SNAPSHOT.jar /app/
ENTRYPOINT ["java","-jar" ,"/app/sprint-boot-demo1-0.0.1-SNAPSHOT.jar","--server.port=8085"]
expose 8085
