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
  "environment": "8100FEIGN"
}
```

The book price will be in Reais, brazilian's currency. 

### Projetcs Struture:

This simple repository has some important Spring Boot concepts, for example:

 

- API Gateway with Spring Cloud API Gateway:
    - Look api-gateway folder
- Service Discovery/Service Registry with Eureka Discovery Client:
    - Look naming-server folder
- Load Balancing with Eureka
    - Look api-gateway folder
- Documentation with Open API
    - Look book-service folder
    - Look cambio-service folder
- Swagger
    - Look book-service folder
    - Look cambio-service folder
- Spring Data JPA
    - Look book-service folder
    - Look cambio-service folder
- Migrations: Using Flywaydb
    - Look book-service folder
    - Look cambio-service folder
- Proxy using Feign:
    - Look book-service folder
- Spring Boot Actuator:
    - Look book-service folder
    - Look cambio-service folder
- Tracing with Zipkin and Sleuth
    - Look book-service folder
    - Look cambio-service folder
- RabbitMQ:
    - Look docker compose file.
- Circuit Breaker with Resilience4j
    - Look book-service folder
    - Look cambio-service folder
    - Look api-gateway folder
- Bulkhead, Ratelimiter and Retry with Resilience4j
    - Look book-service folder
- Docker and Docker Compose
