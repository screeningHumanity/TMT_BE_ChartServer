FROM openjdk:17
ENV TZ=Asia/Seoul
COPY build/libs/chartService-0.0.1.jar ChartServer.jar
ENTRYPOINT ["java", "-jar", "ChartServer.jar"]