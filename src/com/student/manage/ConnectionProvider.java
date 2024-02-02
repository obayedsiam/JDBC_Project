package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

   static  Connection connection;

    public static Connection createConnection(){
        try{
            // Load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            String username = "root";
            String password = "";
            String url = "jdbc:mysql://localhost:3306/student_manage";

            // Create the connection
            connection = DriverManager.getConnection(url, username, password);

        }catch(Exception e){
            e.printStackTrace();
        }

        return connection;


    }
}
