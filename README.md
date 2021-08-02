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
http://localhost:8765/book-service/10/BRL
```

This simple repository has the important Spring Boot concepts listeds bellow:

 

- API Gateway with Spring Cloud API Gateway:
- Service Discovery/Service Registry with Eureka Discovery Client:
- Load Balancing with Eureka
- Documentation with Open API
- Swagger
- Spring Data JPA
- Migrations: Using Flywaydb
- Proxy using Feign:
- Spring Boot Actuator:
- Tracing with Zipkin and Sleuth
- RabbitMQ:
- Circuit Breaker with Resilience4j
- Bulkhead, Ratelimiter and Retry with Resilience4j
- Docker and Docker Compose
