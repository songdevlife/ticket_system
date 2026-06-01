# Ticket System

Spring Boot backend learning project.

## Project Goal

This project was built to learn backend development step by step using Java and Spring Boot.

The main focus is understanding how REST APIs, databases, validation, and backend architecture work together in a real application.

## Features

### CRUD Operations

* Create Ticket (POST)
* Read All Tickets (GET)
* Update Ticket (PUT)
* Delete Ticket (DELETE)

### Backend Features

* REST API Development
* JSON Request / Response Handling
* Spring Data JPA
* MySQL Database Integration
* Request Validation
* Global Exception Handling
* Entity Mapping
* Repository Pattern

## API Endpoints

| Method | Endpoint      | Description         |
| ------ | ------------- | ------------------- |
| POST   | /tickets      | Create a new ticket |
| GET    | /tickets      | Get all tickets     |
| PUT    | /tickets/{id} | Update a ticket     |
| DELETE | /tickets/{id} | Delete a ticket     |

## Tech Stack

* Java 17
* Spring Boot
* Spring Data JPA
* MySQL
* MySQL Workbench
* Maven
* Postman
* Git
* GitHub

## Database Setup

```sql
CREATE DATABASE ticket_system;
```

## Learning Outcomes

Through this project I learned:

* HTTP Request and Response flow
* REST API design
* JSON to Java object mapping
* DTO concepts
* Spring Boot annotations
* Validation using @Valid
* Exception handling with @RestControllerAdvice
* Database persistence using JPA
* CRUD operations
* Git and GitHub workflow

## Future Improvements

* Service Layer
* Request and Response DTOs
* Search functionality
* Pagination
* Authentication and Authorization
* Unit Testing

## Project Status

✅ CRUD functionality completed

Current version includes full Create, Read, Update and Delete operations connected to a MySQL database.
