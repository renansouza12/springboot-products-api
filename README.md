# 🌱 Spring Boot REST API - Product CRUD

## 📝 Overview
This is a simple Spring Boot application that implements a REST API for CRUD operations on products.

## ✨ Features
- ➕ Create new products
- 📄 Retrieve all products
- 🔍 Retrieve a specific product by ID
- 🛠️ Update an existing product
- ❌ Delete a product

## 🛠️ Technologies
- **Spring Boot**
- **Spring Data JPA**
- **Lombok** (optional)
- **Spring HATEOAS** (optional)

## 🗂️ Project Structure
- `pom.xml`: Defines project dependencies and configuration.
- `src/main/java/`: Contains Java source code for models, controllers, and services.
  - `models`: Defines the `ProductModel` class representing a product entity.
  - `controllers`: Contains the `ProductController` class handling product-related API requests.
- `src/main/resources/`: (Optional) Contains application properties files.

## 🚀 Running the Application
1. Ensure you have Maven installed.
2. Clone this repository.
3. Navigate to the project directory in your terminal.
4. Run `mvn clean install`.
5. The application will start on a default port (usually 8080). You can access the API endpoints using tools like Postman or curl.

## 🌐 API Endpoints
| Method | URL               | Description                        |
|--------|-------------------|------------------------------------|
| POST   | `/products`        | ➕ Creates a new product            |
| GET    | `/products`        | 📄 Retrieves all products          |
| GET    | `/products/{id}`   | 🔍 Retrieves a specific product by ID |
| PUT    | `/products/{id}`   | 🛠️ Updates an existing product     |
| DELETE | `/products/{id}`   | ❌ Deletes a product               |

## 📝 Notes
- The provided code utilizes **Lombok** annotations for cleaner code (optional).
- **Spring HATEOAS** is included as a dependency (optional) for adding self-referencing links and relationships to responses.
- This is a basic example. You can extend it to include features like user authentication, product categories, etc.
- Refer to the official Spring Boot documentation for more details on configuration and functionalities.

