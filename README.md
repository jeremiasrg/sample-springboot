# Sample Spring Boot

This sample has been created to show part of my knowledge using Spring Boot.

### App Description:

Here we have two more important services called "cambio-service" and "book-service".

- Cambio-Service converts from one currency to another.
- Book-Service is a book store, but the books prices always are em american dollars

When Book-Service is called is necessary pass the currency to convert.

 

Example:

```jsx
//PATTERN
http://localhost:8765/book-service/{book_id}/{Currency}

//EXEMPLE
http://localhost:8765/book-service/1/BRL
```

The response will show:

```jsx
{
  "id": 1,
  "author": "Michael C. Feathers",
  "launchDate": "2017-11-29",
  "price": 49.11,
  "title": "Working effectively with legacy code",
}
```

The book price will be in Reais, brazilian currency. 

### Projetcs Struture:

This simple repository has some important Spring Boot concepts, for example:

 

- API Gateway with Spring Cloud API Gateway:
    - Look api-gateway [folder](https://github.com/jeremiasrg/sample-springboot/tree/main/api-gateway)
- Service Discovery/Service Registry with Eureka Discovery Client:
    - Look naming-server [folder](https://github.com/jeremiasrg/sample-springboot/tree/main/naming-server)
- Load Balancing with Eureka
    - Look api-gateway [folder](https://github.com/jeremiasrg/sample-springboot/tree/main/api-gateway)
- Documentation with Open API
    - Look book-service [folder](https://github.com/jeremiasrg/sample-springboot/tree/main/book-service)
    - Look cambio-service [folder](https://github.com/jeremiasrg/sample-springboot/tree/main/cambio-service)
- Swagger
    - Look book-service [folder](https://github.com/jeremiasrg/sample-springboot/tree/main/book-service)
    - Look cambio-service [folder](https://github.com/jeremiasrg/sample-springboot/tree/main/cambio-service)
- Spring Data JPA
    - Look book-service [folder](https://github.com/jeremiasrg/sample-springboot/tree/main/book-service)
    - Look cambio-service [folder](https://github.com/jeremiasrg/sample-springboot/tree/main/cambio-service)
- Migrations: Using Flywaydb
    - Look book-service [folder](https://github.com/jeremiasrg/sample-springboot/tree/main/book-service)
    - Look cambio-service [folder](https://github.com/jeremiasrg/sample-springboot/tree/main/cambio-service)
- Proxy using Feign:
    - Look book-service [folder](https://github.com/jeremiasrg/sample-springboot/tree/main/book-service)
- Spring Boot Actuator:
    - Look book-service [folder](https://github.com/jeremiasrg/sample-springboot/tree/main/book-service)
    - Look cambio-service [folder](https://github.com/jeremiasrg/sample-springboot/tree/main/cambio-service)
- Tracing with Zipkin and Sleuth
    - Look book-service [folder](https://github.com/jeremiasrg/sample-springboot/tree/main/book-service)
    - Look cambio-service [folder](https://github.com/jeremiasrg/sample-springboot/tree/main/cambio-service)
- RabbitMQ:
    - Look Docker compose [file](https://github.com/jeremiasrg/sample-springboot/blob/main/docker-compose.yml).
- Circuit Breaker with Resilience4j
    - Look sample class [here](https://github.com/jeremiasrg/sample-springboot/blob/main/book-service/src/main/java/br/com/jr/controller/FakeController.java) [](https://github.com/jeremiasrg/sample-springboot/tree/main/api-gateway)
- Bulkhead, Ratelimiter and Retry with Resilience4j
    - Look sample class [here](https://github.com/jeremiasrg/sample-springboot/blob/main/book-service/src/main/java/br/com/jr/controller/FakeController.java) [](https://github.com/jeremiasrg/sample-springboot/tree/main/api-gateway)
- Docker and Docker Compose
    - Look Docker compose [file](https://github.com/jeremiasrg/sample-springboot/blob/main/docker-compose.yml).

## How to run:

1. Download docker compose [file](https://github.com/jeremiasrg/sample-springboot/blob/main/docker-compose.yml).
2. run command below in the same directory of the file:

```jsx
docker-compose up -d
```

### Services URI:

API Gateway

```jsx
//Call book service using API Gateway
http://localhost:8765/book-service/1/BRL

//Call Cambio service using API Gateway
 http://localhost:8765/cambio-service/10/USD/BRL

```

### Naming Server / Service Discovery / Service Registry

```jsx
//Eureka
http://localhost:8761/
```

### Zipkin Tracing Server

```jsx
http://localhost:9411/zipkin
```

### RabbitMQ

```jsx
http://localhost:15672/
```

### Swagger

```jsx
http://localhost:8100/swagger-ui.html

http://localhost:8765/swagger-ui.html

http://localhost:8002/swagger-ui.html
```

### Open API

```jsx
http://localhost:8002/cambio-service/v3/api-docs

http://localhost:8100/book-service/v3/api-docs
```

Is missing something that you think important ? Send me a message and I will create it. 

Thank you.
