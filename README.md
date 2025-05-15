# Remind-Me-Later API

 The application provides an API endpoint to save reminder details to a database. The project is developed using Java with the Spring Framework.

## Technologies Used

- **Java**: The primary programming language used for the project.
- **Spring Boot**: A framework that simplifies the bootstrapping and development of new Spring applications.
- **Spring Data JPA**: Part of the Spring Data project, used for data access and persistence.
- **MySQL**: The database used to store reminder information.
- **Maven**: A build automation tool used for project management.

## Setup and Installation

### Prerequisites

- Java Development Kit (JDK) 8 or later
- Maven
- MySQL Server

### Installation Steps

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/CodesbyLakshay/Remind-me-later.git
   cd Remind-me-later

2. **Configure the Database**:
  - Create a MySQL database named remindmelaterdb.
  - Update the application.properties file with your MySQL database credentials.
   
4. **Build the Project**:
   ```bash
   mvn clean install

5. **Run the Application**:
   ```bash
   mvn spring-boot\:run
