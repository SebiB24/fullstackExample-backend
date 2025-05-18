# Backend README (Spring Boot)

## Employee Management System - Backend

### Overview
This is a Spring Boot backend application for an Employee Management System. It provides RESTful APIs to perform CRUD operations on employee data.

### Technologies
- Java 17
- Spring Boot 3.x
- Spring Data JPA
- MySQL Database
- Maven

### Project Structure
src/
├── main/
│ ├── java/
│ │ └── org/example/fullstackexample/
│ │ ├── domain/ # Entity classes
│ │ ├── exception/ # Custom exceptions
│ │ ├── repo/ # Repository interfaces
│ │ ├── service/ # Business logic
│ │ └── resource/ # REST controllers
│ └── resources/
│ └── application.properties # Configuration


### Key Features
- REST API endpoints for employee management
- JPA repositories with custom query methods
- Exception handling
- MySQL database integration

### API Endpoints
| Method | Endpoint                | Description                     |
|--------|-------------------------|---------------------------------|
| GET    | /employee/all           | Get all employees               |
| GET    | /employee/find/{id}     | Get employee by ID              |
| POST   | /employee/add           | Add new employee                |
| PUT    | /employee/update        | Update existing employee        |
| DELETE | /employee/delete/{id}   | Delete employee by ID           |

### Setup Instructions

1. **Prerequisites**
   - Java 17 JDK
   - MySQL Server
   - Maven

2. **Database Configuration**
   - Create a MySQL database named `fullstackexemployee`
   - Update `application.properties` with your credentials:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/fullstackexemployee
     spring.datasource.username=your_username
     spring.datasource.password=your_password
     ```

3. **Run the Application**
   ```bash
   mvn spring-boot:run
Access the API

The API will be available at http://localhost:8080

Dependencies
Spring Web

Spring Data JPA

MySQL Driver

Lombok
