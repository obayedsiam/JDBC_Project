## **Student Management System - JDBC Project**

This is a simple console-based Java project for performing CRUD (Create, Read, Update, Delete) operations on a student database using JDBC (Java Database Connectivity). The project allows you to interact with a MySQL database to manage student records.

# **Prerequisites**

Before running the project, ensure you have the following installed:

JDK (Java Development Kit) version 17 or later 

MySQL database server 

MySQL Connector/J library (version 8.0.12 or later)

# **Setup**
# **Database Configuration:**

Create a MySQL database named student-management.
Create a table named 'students' with the following columns:
sid (Student ID)
sname (Student Name)
sphone (Student Phone)
scity (Student City)
Connector/J Library:

Download the MySQL Connector/J library (JAR file) version 8.0.12 or later.
Add the Connector/J JAR file to your project's classpath.
Usage
Clone the Repository:

bash
Copy code
git clone https://github.com/your-username/student-management-jdbc.git
Compile the Java Files:

Copy code
javac *.java
Run the Application:

css
Copy code
java Main
Follow the On-screen Instructions:

Use the console menu to perform CRUD operations on student records.
Choose options to create, read, update, or delete student records.
Project Structure
Main.java: Main class containing the console menu and application entry point.
Student.java: Student class representing student entities with getter and setter methods.
Database.java: Database class handling database connections and CRUD operations.
Contributing
Contributions are welcome! If you find any issues or have suggestions for improvements, feel free to open an issue or submit a pull request.