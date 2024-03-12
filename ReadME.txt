# Cart Service Application

This is a Spring Boot application that functions as a Cart Service. It makes API calls to the Fake Store API and provides several features like getting all carts, getting a single cart, getting carts in a date range, getting user carts, adding a new product, updating a product, and deleting a cart.

## Project Structure

The project has the following structure:

- `models`: This package contains the model classes `Cart`, `Product`, and `User`. Each class represents an entity in the application.

- `controller`: This package contains the `CartController` class. This class handles HTTP requests and uses the service classes to perform operations.

- `DTO`: This package contains the `CartDTO` class. This class is used to transfer data between processes.

- `services`: This package contains the service classes `CartService` and `FakeStoreApiClient`. `CartService` contains the business logic of the application, and `FakeStoreApiClient` is used to make API calls to the Fake Store API.

## Running the Application

To run the application, you need to have Java and Maven installed on your machine. You can then navigate to the project directory and run the following command:

```bash
mvn spring-boot:run
