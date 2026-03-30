git add Practical8/Dockerfilegit add Practical8/DockerfileFROM openjdk:17
WORKDIR /app
COPY . .
RUN javac Pattern.java
CMD ["java", "Pattern"]