package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class operations {

    void createTable(Connection c) {
        String q="create table products(id int primary key, name varchar(50),price int,quantity int)";
        try (Statement s=c.createStatement())
        {
             int rows=s.executeUpdate(q);
            System.out.println("Table created successfully!");
            System.out.println("No. of rows affected:"+rows);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    void insert(Connection c,product prod)
    {
        String query="insert into products(id,name,price,quantity) values(?,?,?,?)";
        try(PreparedStatement p=c.prepareStatement(query))
        {
            p.setInt(1,prod.getId());
            p.setString(2,prod.getName());
            p.setInt(3,prod.getPrice());
            p.setInt(4,prod.getQuantity());

            int rows=p.executeUpdate();
            System.out.println("Data added successfully");
            System.out.println("Rows affected"+rows);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
