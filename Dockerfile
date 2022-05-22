FROM openjdk:8
EXPOSE 8080
ADD target/account-management-0.0.1-SNAPSHOT.war account-management-0.0.1-SNAPSHOT.war
ENTRYPOINT ["java","-war","/account-management-0.0.1-SNAPSHOT.war"]