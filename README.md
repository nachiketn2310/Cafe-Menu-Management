# Cafe Management Application

This is a simple Cafe Management application built using Spring Boot and Java. The application allows users to add, update, delete, and view cafe items.

## Features

- **Add Item**: Add new items to the cafe menu.
- **Update Item**: Update existing items in the cafe menu.
- **Delete Item**: Remove items from the cafe menu.
- **View Items**: View all items available in the cafe menu.

## Technologies Used

- Java
- Spring Boot
  (Used Dependencies : Spring Web, Spring Data JPA, Thymeleaf, MySQL Driver, Lombok)
- Maven
- MySQL (for DB Management)

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 11 or newer
- Maven
- MySQL (for production)

### Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/nachiketn2310/Cafe-Menu-Management.git
    cd Cafe-Menu-Management
    ```

2. Build the project using Maven:
    ```bash
    mvn clean install
    ```

3. Run the application:
    ```bash
    mvn spring-boot:run
    ```

### Configuration

- Update `application.properties` for database configurations:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/cafe
    spring.datasource.username=root
    spring.datasource.password=yourpassword
    ```

## API Endpoints

- **Add Item**: `POST /api/items`
- **Update Item**: `PUT /api/items/{id}`
- **Delete Item**: `DELETE /api/items/{id}`
- **View Items**: `GET /api/items`

## Authors

- nachiketn2310

