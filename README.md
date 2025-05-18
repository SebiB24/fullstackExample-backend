# 🛠️ Employee Management System - Backend (Spring Boot)

A Spring Boot REST API for managing employee data. This backend service supports full CRUD operations with a MySQL database and follows clean architecture practices.

---

## Link to FrontEnd app repository

https://github.com/SebiB24/fullstackExample-frontend

---

## 🚀 Features

- RESTful API endpoints for employee management  
- Spring Data JPA for database access  
- Global exception handling  
- MySQL integration  
- Clean and modular codebase

---

## 🧰 Tech Stack

- **Java 17**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **MySQL**
- **Maven**
- **Lombok**

---

## 📁 Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── org/example/fullstackexample/
│   │       ├── domain/        # Entity classes
│   │       ├── exception/     # Custom exceptions
│   │       ├── repo/          # Repository interfaces
│   │       ├── service/       # Business logic layer
│   │       └── resource/      # REST controllers
│   └── resources/
│       └── application.properties  # App config
```

---

## 📡 API Endpoints

| Method | Endpoint               | Description               |
|--------|------------------------|---------------------------|
| GET    | `/employee/all`        | Retrieve all employees    |
| GET    | `/employee/find/{id}`  | Find employee by ID       |
| POST   | `/employee/add`        | Add a new employee        |
| PUT    | `/employee/update`     | Update an existing employee |
| DELETE | `/employee/delete/{id}`| Delete employee by ID     |

---

## ⚙️ Setup Instructions

### 1. Prerequisites
- Java 17+
- MySQL Server
- Maven 3+

### 2. Database Configuration

Create a MySQL database named `fullstackexemployee`, then update the `application.properties` file:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/fullstackexemployee
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 3. Run the Application

```bash
mvn spring-boot:run
```

---

## 🌐 API Base URL

```
http://localhost:8080
```

---

## 📦 Dependencies

- spring-boot-starter-web  
- spring-boot-starter-data-jpa  
- mysql-connector-java  
- lombok  

