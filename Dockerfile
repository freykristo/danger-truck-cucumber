FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/danger-truck-cucumber.jar /danger-truck-cucumber/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/danger-truck-cucumber/app.jar"]
