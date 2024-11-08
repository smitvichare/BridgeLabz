package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {
            String url = "jdbc:mysql://localhost:3306/sample1";
            String user = "root";
            String password = "smit@123";
            Connection connection=DriverManager.getConnection(url, user, password);
            System.out.println("Connected Successfully!"+DriverManager.getConnection(url, user, password));
            Main m=new Main();
            m.read(connection);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void read(Connection connection)
    {
        List<Employee> employeeList = new ArrayList<>();
        String sqlQuery = "select * from employee";

        try(
            Statement statement = connection.createStatement();
            ResultSet r = statement.executeQuery(sqlQuery)){
            while (r.next()){
                int id = r.getInt("id");
                String name = r.getString("name");
                int age = r.getInt("age");
                Employee employee = new Employee(id,name,age);
                employeeList.add(employee);
                System.out.println("ID: " +id+ ", Name: " +name+ ", Age: " +age);
            }

        }catch (SQLException exception){
            exception.printStackTrace();
        }
    }
}