# Spring Boot Simple Blog Application 

This project demonstrates a simple blog application using Spring Boot. It includes basic CRUD operations for blog posts, including creating, updating, retrieving, and deleting posts.

## Features

- Create new blog posts
- Update existing blog posts
- Retrieve a single blog post by ID
- Retrieve all blog posts
- Delete a blog post by ID

## Technologies Used

- Java 20
- Spring Boot 3.3.2
- Spring Data JPA
- Hibernate
- H2 Database (or another database of your choice)
- Lombok

## Getting Started

### Prerequisites

- Java 20
- Maven

### Installation

1. **Clone the repository**
    ```bash
    git clone https://github.com/your-username/blog-application.git
    cd blog-application
    ```

2. **Build and run the application**
    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

### Configuration

The application is pre-configured to use an H2 in-memory database for simplicity. You can access the H2 console at `http://localhost:8080/h2-console`.

### API Endpoints

1. **Create a new post**
    - **URL**: `/posts`
    - **Method**: `POST`
    - **Request Body**:
        ```json
        {
            "title": "Sample Post",
            "content": "This is a sample post content."
        }
        ```
    - **Response**:
        ```json
        {
            "id": 1,
            "title": "Sample Post",
            "content": "This is a sample post content."
        }
        ```

2. **Update a post**
    - **URL**: `/posts/{id}`
    - **Method**: `PUT`
    - **Request Body**:
        ```json
        {
            "title": "Updated Post",
            "content": "This is updated post content."
        }
        ```
    - **Response**:
        ```json
        {
            "id": 1,
            "title": "Updated Post",
            "content": "This is updated post content."
        }
        ```

3. **Retrieve a post by ID**
    - **URL**: `/posts/{id}`
    - **Method**: `GET`
    - **Response**:
        ```json
        {
            "id": 1,
            "title": "Sample Post",
            "content": "This is a sample post content."
        }
        ```

4. **Retrieve all posts**
    - **URL**: `/posts`
    - **Method**: `GET`
    - **Response**:
        ```json
        [
            {
                "id": 1,
                "title": "Sample Post",
                "content": "This is a sample post content."
            },
            {
                "id": 2,
                "title": "Another Post",
                "content": "This is another post content."
            }
        ]
        ```

5. **Delete a post**
    - **URL**: `/posts/{id}`
    - **Method**: `DELETE`

## Project Structure

- `controller`: Contains REST controllers for handling HTTP requests.
- `model`: Contains entity classes.
- `service`: Contains service classes for business logic.
- `repository`: Contains JPA repository interfaces.

## Contributing

1. Fork the repository
2. Create a new branch (`git checkout -b feature-branch`)
3. Commit your changes (`git commit -m 'Add some feature'`)
4. Push to the branch (`git push origin feature-branch`)
5. Open a Pull Request
