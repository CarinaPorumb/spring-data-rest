# Spring Data-Rest

This is a simple Java application that uses Spring Data REST, Spring Data JPA, and an H2 in-memory database to create a
RESTful API for managing coffee and customer data. This project provides a basic API to manage different types of coffee
and customer information.

---

## Features

- Manage coffee entities with different types and prices
- Manage customer information
- In-memory H2 database for quick setup and testing
- Auto-generated RESTful endpoints with Spring Data REST
- Basic initial data loading on startup

---

## Technologies Used

- Java 21
- Spring Boot 3.3.0
- Spring Data JPA
- Spring Data REST
- H2 in-memory database
- Postman (or preferred HTTP client)
- Lombok

---

## Getting Started

### Prerequisites

Make sure you have the following installed on your system:

- Java 21
- Maven

### Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/CarinaPorumb/SpringDataRest.git
    ```

2. Build the project using Maven:

    ```bash
    mvn clean install
    ```

### Running the Application

   You can run the application using your IDE or from the command line:

  ```bash
   mvn spring-boot:run
   ```

Once the application is running, it will be available at http://localhost:8080.

### Using the API

Open Postman (or your preferred HTTP client) and explore the RESTful API endpoints for managing coffees and customers.

### Accessing the H2 Database Console

To access the H2 database console, navigate to [http://localhost:8080/h2-console](http://localhost:8080/h2-console) in
your web browser.

- **JDBC URL:** `jdbc:h2:mem:coffee`
- **Username:** `root`
- **Password:** `password`

---
