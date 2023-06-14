# Slightly Techie: Blog API

This project is an API for a blog application that allows users to perform various CRUD operations on blog posts, including creating, viewing one, viewing all, updating, and deleting posts. The API has been developed using the Spring Boot framework and follows RESTful principles.

## API Endpoints

The following endpoints are available in the API:
[Test out the API!](https://speeding-firefly-620298.postman.co/workspace/New-Team-Workspace~c84a270b-7864-4b6e-bca7-dd3ac852e54b/collection/27282177-3c575d29-ade7-4e35-98b6-f756e9b0a28e?action=share&creator=27282177)

### Create a Post

- **Endpoint**: `POST /api/v1/posts`
- **Description**: Creates a new blog post.
- **Request Body**: JSON object containing the post details (title, content, author).
- **Response**: The newly created post object.

### Get All Posts

- **Endpoint**: `GET /api/v1/posts`
- **Description**: Retrieves all blog posts.
- **Response**: An array of post objects.

### Get a Single Post

- **Endpoint**: `GET /api/v1/posts/{postId}`
- **Description**: Retrieves a specific blog post by its ID.
- **Response**: The post object with the specified ID.

### Update a Post

- **Endpoint**: `PUT /api/v1/posts/{postId}`
- **Description**: Updates a specific blog post with new details.
- **Request Body**: JSON object containing the updated post details (title, content, author).
- **Response**: The updated post object.

### Delete a Post

- **Endpoint**: `DELETE /api/v1/posts/{postId}`
- **Description**: Deletes a specific blog post.
- **Response**: No content.

### Delete all Post

- **Endpoint**: `DELETE /api/v1/posts/clear`
- **Description**: Deletes a specific blog post.
- **Response**: No content.

## Tools and Technologies Used

- Java 17
- Spring Boot 3.10
- Maven
- MySQL (or any database of your choice)
- Postman (for testing API endpoints)
- GitHub (for version control and code repository)
- Deployment Platform: Azure

## Getting Started

To run the API locally on your machine, follow these steps:

1. Clone the GitHub repository: [GitHub Repository URL](https://github.com/dvc-77/azure-spring-group)

2. Open the project in your preferred Java IDE.

3. Configure the database connection settings in the application properties file.

4. Build the project using Maven.

5. Run the application.

6. Test the API endpoints using Postman or any other API testing tool.

## Deployment

To deploy the API on Azure, you can refer to this [site](https://learn.microsoft.com/en-us/training/modules/deploy-java-spring-boot-app-service-mysql/1-introduction). Follow the deployment instructions and ensure that you configure the necessary environment variables and database settings.

Thank you for using the Slightly Techie: Blog API!
