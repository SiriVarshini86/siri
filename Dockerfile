FROM openjdk:latest
WORKDIR /app
COPY . /app
RUN javac devops.java
CMD ["java","devops"]
