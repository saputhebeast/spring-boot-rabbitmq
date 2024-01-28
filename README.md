# Spring Boot RabbitMQ Architecture with Multiple Queues

![RabbitMQ Architecture with Multiple Queues](https://github.com/saputhebeast/spring-boot-rabbitmq/assets/72787452/7e7f6471-748f-4a1e-b305-e2088172bd49)

This repository showcases an implementation of a Spring Boot application integrated with RabbitMQ, focusing on fundamental RabbitMQ core concepts. The code covers the creation of queues, exchanges, bindings, producers, and consumers, providing a comprehensive understanding of messaging patterns. It demonstrates the exchange of both string and JSON messages between producers and consumers, highlighting the versatility of RabbitMQ in handling diverse message types. Additionally, the code exemplifies the creation of multiple queues within the RabbitMQ broker, offering a practical guide for building robust and scalable messaging solutions.

### Run RabbitMQ using Docker
```
docker run --rm -it -p 15672:15672 -p 5672:5672 rabbitmq:3.12-management
```
