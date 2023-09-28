# spring-cloud-refresh-scope-aot
minimal project to reproduce issue with @RefreshScope running on AOT

Steps to produce:
- Build jar file:
  ```sh
  ./gradlew assemble
  ```
- Run the spring boot jar in AOT mode:
  ```sh
  java -Dspring.aot.enabled=true -jar build/libs/refresh-scope-native-0.0.1-SNAPSHOT.jar
  ```
- Hit the following URL:
  ```sh
  curl http://localhost:8080
  ```

