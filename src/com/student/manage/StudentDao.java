package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDao {

    public static boolean insertToDatabase(Student student) {

        boolean inserted = false;
        try {
            Connection connection = ConnectionProvider.createConnection();

            String query = "insert into students(sname,sphone,scity) values(?,?,?)";

            // Prepared Statement
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            // Set the values of parameters
            preparedStatement.setString(1, student.getStudentName());
            preparedStatement.setString(2, student.getStudentPhone());
            preparedStatement.setString(3, student.getStudentCity());

            // Execute
            preparedStatement.executeUpdate();
            inserted = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return inserted;
    }

    public static boolean deleteStudent(int studentId) {
        boolean inserted = false;
        try {
            Connection connection = ConnectionProvider.createConnection();
            String query = "delete from students where sid = ?";

            // Prepared Statement

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            // Set the values of parameters

            preparedStatement.setInt(1, studentId);
            preparedStatement.executeUpdate();

            inserted = true;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return inserted;
    }

    public static Student displayStudent(int studentId) {
        Connection connection = ConnectionProvider.createConnection();
        Student student = new Student();
        try{
            String query = "select * from students where sid = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, studentId);
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println(resultSet);

            while(resultSet.next()){
                student.setStudentId(resultSet.getInt(1));
                student.setStudentName(resultSet.getString(2));
                student.setStudentPhone(resultSet.getString(3));
                student.setStudentCity(resultSet.getString(4));
            }

            resultSet.close();
            preparedStatement.close();
            connection.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return student;
    }

    public void updateStudent(){

    }

    public void deleteStudent() {

    }

}
