# Open Weather Service Application


### The service provides an API
#### `WeatherAPI`
* To search 5 day forecast with a 3-hour step weather report by city name.


### How does the application works?
* Application receives the requested via `/v1/api/weather/{city}` url with `{city}` path variables
* There is a validation for city parameter. City value can not be decimal or a blank value.


On the swagger page you can find the relevant api endpoint.
You can reach the openapi page by `http://localhost:8080/swagger-ui/index.html` url.


## Technologies

---
- Java 17
- Spring Boot 3.0
- Open API Documentation
- Spring Data JPA
- H2 In Memory Database
- Restful API
- Maven
- Junit5
- Mockito
- Github Actions



## Prerequisites

---
- Maven or Docker
---

## Docker Run
The application can be built and run by the `Docker` engine. The `Dockerfile` has multistage build, so you do not need to build and run separately.

Please follow the below directions in order to build and run the application with Docker Compose;

---
## Maven Run
To build and run the application with `Maven`, please follow the directions below;

```sh
$ cd WeatherApp
$ mvn clean install
$ mvn spring-boot:run
```
You can reach the swagger-ui via  `http://{HOST}:8080/swagger-ui.html`
---

## Screenshots

![App Screenshot](https://imgur.com/a/GQDWukw)

