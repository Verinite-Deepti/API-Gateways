# API Gateways

## Topics Covered <--> Applications Mapped
- **Spring Hystrix** - Customer Service
- **Spring Eureka Server** - Discovery Server
- **Spring Feign Client** - Customer Service
- **Spring Ribbon (Load Balancer)** - Customer Service
- **Spring Zuul Server** - API Gateway
- **Spring Sleuth** - Configured in all applications
- **Spring Zipkin Server** - [Zipkin Server JARs](http://localhost:9411/zipkin/)

## Descriptions

### 1. Discovery Server
Eureka Server functions as a service registry where each microservice registers and deregisters itself upon startup and shutdown. Access the Eureka Server UI at [http://localhost:8761/](http://localhost:8761/) to monitor registered services.

### 2. Zipkin Server
Zipkin Server aggregates logs from all microservices in a centralized location. Access the Zipkin UI at [http://localhost:9411/zipkin/](http://localhost:9411/zipkin/) to view distributed tracing data.

### 3. Zuul API Gateway
The Zuul API Gateway provides a single entry point for routing requests to various microservices. It also facilitates centralized authentication, monitoring, and logging. Start the Zuul server and access the endpoint at [http://localhost:7005/customer/customers/1](http://localhost:7005/customer/customers/1) after starting all applications.

### 4. CreditCard Service
A simple web application exposing a REST API. To test load balancing, start multiple instances of this application on different ports (e.g., 7002, 8002, 8003). The default URL is [http://localhost:7002/creditcards/1}](http://localhost:7002/creditcards/1).

### 5. Customer Service
This service demonstrates the integration of a circuit breaker using Spring Boot. It internally invokes the CreditCard Service, and Ribbon will handle load balancing across multiple CreditCard Service instances. The URL is [http://localhost:7001/customers/1](http://localhost:7001/customers/1). For more information on Hystrix and Ribbon, refer to the following articles:
- [Circuit Breaker and Microservices](http://www.waheedtechblog.com/2019/06/circuit-breaker-and-microservices.html)
- [Netflix Hystrix Circuit Breaker](http://www.waheedtechblog.com/2019/06/netflix-hystrix-circuit-breaker.html)
- [Spring Cloud Ribbon](http://www.waheedtechblog.com/2019/08/microservices-spring-cloud-ribbon-with.html)

### 6. Feign Client
Demonstrates communication between microservices using Feign Client. Access the Feign client at [http://localhost:7003/feign/{id}](http://localhost:7003/feign/{id}).
