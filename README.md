# Container Routing Optimization API

## Overview

This API is designed to optimize the routing of containers, providing a more efficient way to move them from one location to another. The optimization process uses a mathematical approach to minimize costs associated with moving containers to various destinations.

This project leverages **Spring Boot** for building a robust and scalable backend API.



## Technologies Used

- **Java 17**: The latest version of Java to ensure security and modern language features.
- **Spring Boot**: For creating the RESTful API.
- **Maven**: To manage dependencies and the build process.



## Endpoints

### POST /api/route

This is the core endpoint. It receives a JSON body with the container and destination details, and returns the optimized movement plan.

#### Request Format:

json
{
  "containers": [1, 2, 3],
  "destinations": [101, 102, 103],
  "costMatrix": [
    [10.5, 5.2, 9.1],
    [7.3, 6.4, 3.9],
    [4.0, 8.2, 2.1]
  ]
}


- **containers**: The list of container IDs.
- **destinations**: The list of destination IDs.
- **costMatrix**: A 2D array where each element represents the cost of moving a container to a destination.

#### Response Format:

json
[
    {
        "container": 1,
        "destination": 102
    },
    {
        "container": 2,
        "destination": 103
    },
    {
        "container": 3,
        "destination": 101
    }
]


- **container**: The ID of the container being moved.
- **destination**: The ID of the destination where the container is moved.

#### Example Latency Output:
Latency: 3.567 ms




## Getting Started

To get the project running locally, follow these steps:

1. **Clone the Repository**:

   git clone https://github.com/praneethrdy/container-routing-api.git
   

2. **Open the Project** in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse).

3. **Install Dependencies**:

   Ensure you have **Maven** set up, and it will automatically download required dependencies.

4. **Run the Application**:

   Navigate to `src/main/java/com/example/containerroutingapi/ContainerRoutingApiApplication.java` and run the `main` method.

5. The API will be live on **http://localhost:8080**.


## Example Usage

- **Postman** or **curl** can be used to test the API.

**Request**:  
- Set the HTTP method to **POST**.
- URL: `http://localhost:8080/api/route`.
- In the **Body** section, select **raw** and choose **JSON**.
- Paste the example JSON data from above into the body.

**Response**:  
The API will respond with an optimized route plan, like so:

json
[
    {
        "container": 1,
        "destination": 102
    },
    {
        "container": 2,
        "destination": 103
    },
    {
        "container": 3,
        "destination": 101
    }
]



## Folder Structure

src/
 └── main/
      └── java/
           └── com/
                └── example/
                     └── containerroutingapi/
                          ├── model/
                          │     ├── MoveRequest.java
                          │     └── MovePlan.java
                          ├── service/
                          │     └── RoutingService.java
                          ├── controller/
                          │     └── RoutingController.java
                          └── ContainerRoutingApiApplication.java
 └── pom.xml


## Conclusion

With this API, we can efficiently calculate the optimal routes for container movement, helping to save time and reduce costs. The API is designed to handle large datasets and is easy to integrate into existing logistics management systems.
