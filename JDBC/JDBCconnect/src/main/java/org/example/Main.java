package org.example;
import java.sql.*;

public class Main {
    public static void main(String[] args) {

        try {
            String url = "jdbc:mysql://localhost:3306/sample1";
            String user = "root";
            String password = "smit@123";
            Connection connection=DriverManager.getConnection(url, user, password);
            System.out.println("Connected Successfully!"+DriverManager.getConnection(url, user, password));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}