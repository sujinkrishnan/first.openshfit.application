FROM openjdk:11
ADD target/first.openshfit.application-0.0.1-SNAPSHOT.jar /project/first.openshfit.application-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/project/first.openshfit.application-0.0.1-SNAPSHOT.jar"]
EXPOSE 9090