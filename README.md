# Microservice Notifier

Microservice that allows the sending of notifications by email.

## Running Development

```sh
$ mvn spring-boot:run
```

## Configuration 

### Database connection

You must create a database in PostgreSQL with a **scheme** called "**notifications**" and then configure the connection data in the st-microservice-notifier/src/main/resources/**application.yml** file

```yml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/sistema-transicion
    username: postgres
    password: 123456
    driver-class-name: org.postgresql.Driver
  jpa:
    database-platform: org.hibernate.dialect.PostgreSQL10Dialect
    hibernate.ddl-auto: create
```

### How to disable eureka client?

Modify the **enabled** property in st-microservice-notifier/src/main/resources/**application.yml** file:

```yml
eureka:
  client:
    enabled: false
```

### How to disable config client?

Modify the **enabled** property in st-microservice-notifier/src/main/resources/**bootstrap.yml** file:

```yml
spring:
  application:
    name: st-microservice-notifier
  cloud:
    config:
      enabled: false
```

## Swagger Documentation?

See [http://localhost:8886/swagger-ui.html](http://localhost:8886/swagger-ui.html)

## License

[Agencia de Implementación - BSF Swissphoto - INCIGE](https://github.com/SwissTierrasColombia/st-microservice-notifier/blob/master/LICENSE)
