#this file is to creat docker image
FROM openjdk:17-alpine
COPY target/userregistrationsystem-0.0.1-SNAPSHOT.jar userregistrationsystem-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/userregistrationsystem-0.0.1-SNAPSHOT.jar"]

#SNAPSHOT version should be same as the pom.xml file and below is the command to create docker iamge
#docker build -t userregistrationsystem-0.0.1 . (if we dont mention version then version will be latest)
#docker build -t userRegistrationImage:1.0 .  (creating docker image with specified image name and specified version

#docker run -t userregistrationsystem-0.0.1     (cannot access application outside docker)
#docker run -p 8080:8080 -t userregistrationsystem-0.0.1 (with exported port to access application outside docker)
#       export port:docker port in which container is running