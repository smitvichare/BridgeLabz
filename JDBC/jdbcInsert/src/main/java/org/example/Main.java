package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {

        try {
            String url = "jdbc:mysql://localhost:3306/sample1";
            String user = "root";
            String password = "smit@123";
            Connection connection= DriverManager.getConnection(url, user, password);
            System.out.println("Connected Successfully!"+DriverManager.getConnection(url, user, password));
            operations m=new operations();
            m.createTable(connection);
            product p1=new product(1,"ball",20,1);
            m.insert(connection,p1);
            product p2=new product(2,"bat",80,3);
            m.insert(connection,p2);
            product p3=new product(3,"net",10,6);
            m.insert(connection,p3);
            product p4=new product(4,"glove",40,9);
            m.insert(connection,p4);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}