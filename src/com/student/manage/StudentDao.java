package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDao {

    public static boolean insertToDatabase(Student student){

        boolean inserted = false;
        try{
            Connection connection = ConnectionProvider.createConnection();
            String query = "insert into students(sname,sphone,scity) values(?,?,?)";

            // Prepard Statement

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            // Set the values of parameters

            preparedStatement.setString(1, student.getStudentName());
            preparedStatement.setString(2, student.getStudentCity());
            preparedStatement.setString(3, student.getStudentPhone());

            preparedStatement.executeUpdate();

            inserted = true;


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return inserted;
    }

    public void updateStudent(){

    }

    public void deleteStudent(){

    }

}
