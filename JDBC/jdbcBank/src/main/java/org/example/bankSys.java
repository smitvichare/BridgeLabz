package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.sql.*;
import java.util.List;


public class bankSys {

    public Connection getConnection()throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sample1";
        String user = "root";
        String password = "smit@123";
        return DriverManager.getConnection(url,user,password);
    }

    public void createTable(){
        String sqlQuery = "create table bank(id int primary key,name varchar(50),balance int)";
        try(Connection connection = getConnection();
            Statement statement = connection.createStatement()){
            int rows = statement.executeUpdate(sqlQuery);
            System.out.println("Table created Successfully"+rows);
        }catch (SQLException exception){
            exception.printStackTrace();
        }
    }
    public void createBank(Bank b){
        String sqlQuery = "insert into bank(id,name,balance) values (?,?,?)";

        try(Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery)){

            preparedStatement.setInt(1,b.getId());
            preparedStatement.setString(2, b.getName());
            preparedStatement.setInt(3,b.getBalance());

            int rows = preparedStatement.executeUpdate();
            System.out.println("Account added successfully");
            System.out.println("Rows Effected: " +rows);

        }catch (SQLException exception){
            exception.printStackTrace();
        }
    }

    public void readBank(){
        List<Bank> bankList = new ArrayList<>();
        String sqlQuery = "select * from bank";

        try(Connection connection = getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlQuery)){
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int balance = resultSet.getInt("balance");
                Bank b = new Bank(id,name,balance);
                bankList.add(b);
                System.out.println("ID: " +id+ ", Name: " +name+ ", Balance: " +balance);
            }

        }catch (SQLException exception){
            exception.printStackTrace();
        }
    }

    void transaction(int id1,int id2,int amount)
    {
        try(Connection c=getConnection())
        {
            c.setAutoCommit(false);
            String debit="update bank set balance=balance-? where id=?";
            String credit="update bank set balance=balance+? where id=?";
            try (PreparedStatement debp=c.prepareStatement(debit);
                PreparedStatement credp= c.prepareStatement(credit) ){

                debp.setInt(1,amount);
                debp.setInt(2,id1);
                int d1=debp.executeUpdate();
                credp.setInt(1,amount);
                credp.setInt(2,id2);
                int c1=credp.executeUpdate();
                if(c1==d1)
                {
                    System.out.println("Transaction Successful.");
                    c.commit();
                }
                else {
                    System.out.println("Transaction failed.");
                    c.rollback();
                }



            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}