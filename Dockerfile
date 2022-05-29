FROM openjdk:8
EXPOSE 8080
ADD target/account-management.jar account-management.jar
ENTRYPOINT ["java","-jar","/account-management-0.0.1.jar"]