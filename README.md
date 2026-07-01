# Employee Management System

A Java console-based Employee Management System built using Core Java and Java 8 concepts.

This project was created to practice real project structure before moving into Spring Boot.

---

## Features

### Employee Module
- Add Employee
- View Employees
- Search Employee by ID
- Remove Employee
- Update Salary

### Reports
- Display Highest Salary Employee
- Filter Employees by Department
- Sort Employees by Salary
- Count Employees

### Java 8 Features Used
- Stream API
- Lambda Expressions
- Method References
- Comparator
- Optional
- Functional Interfaces

### Validation
- Custom Exceptions
- Input Validation
- Utility Classes

---

## Project Structure

```plaintext
employee-management-system

src

├── model
│   ├── Person.java
│   ├── Employee.java
│   ├── Developer.java
│   ├── Staff.java
│
├── service
│   ├── EmployeeService.java
│
├── serviceImpl
│   ├── EmployeeServiceImpl.java
│
├── repository
│   ├── EmployeeRepository.java
│
├── util
│   ├── DataSeeder.java
│   ├── ValidationUtil.java
│   └── EmployeeUtil.java
│
├── exception
│   ├── EmployeeNotFoundException.java
│
├── constant
│   └── Message.java
│
└── Main.java
```

---

## Technologies Used

- Java
- Java 8
- OOP
- Collections
- Stream API
- IntelliJ IDEA
- Git
- GitHub

---

## Concepts Practiced

### Core Java
✔ Encapsulation  
✔ Inheritance  
✔ Abstraction  
✔ Polymorphism  
✔ Exception Handling  

### Collections
✔ ArrayList  
✔ Stream API  
✔ Comparator  

### Java 8
✔ Lambda  
✔ Functional Interface  
✔ Method Reference  
✔ Optional  

---

## Example Output

```text
1 Ram IT 90000
2 Hari HR 50000

Highest Salary Employee:
Ram
```

---

## Future Improvements

- Attendance System
- Salary Management
- Login System
- File Storage
- Spring Boot Migration
- MySQL Integration
- REST API
- JWT Authentication

---

## How To Run

Clone project:

```bash
git clone https://github.com/your-username/employee-management-system.git
```

Open in IntelliJ.

Run:

```text
Main.java
```

---

## Author: Ushudha Sanwa Limbu

Project created for learning Core Java → Java 8 → Spring Boot roadmap.
