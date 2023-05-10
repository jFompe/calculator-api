# calculator-api

Author: Jaime Fomperosa

Date: May 2023


## Installation 

```bash
# Install trace jar in local repository
./mvnw install:install-file -Dfile=libs/tracer-1.0.0.jar -DgroupId=io.corp -DartifactId=calculator -Dversion=1.0.0 -Dpackaging=jar

# Generate jar of the application
./mvnw clean package
```

## Execution

```bash
java -jar target/calculator-0.0.1-SNAPSHOT.jar
```

## Test

```bash
curl "localhost:8080/calculate/binary?a=3&b=5&op=PLUS"

curl "localhost:8080/calculate/binary?a=3&b=5&op=MINUS"
```