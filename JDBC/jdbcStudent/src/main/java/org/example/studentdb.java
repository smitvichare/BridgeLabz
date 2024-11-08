package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class studentdb {

    public Connection getConnection()throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sample1";
        String user = "root";
        String password = "smit@123";
        return DriverManager.getConnection(url,user,password);
    }

    public void createTable(){
        String sqlQuery = "create table student2(id int primary key,name varchar(50),grade int)";
        try(Connection connection = getConnection();
            Statement statement = connection.createStatement()){
            int rows = statement.executeUpdate(sqlQuery);
            System.out.println("Table created Successfully"+rows);
        }catch (SQLException exception){
            exception.printStackTrace();
        }
    }
    public void createStud(Student s){
        String sqlQuery = "insert into student2(id,name,grade) values (?,?,?)";

        try(Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery)){

            preparedStatement.setInt(1,s.getId());
            preparedStatement.setString(2, s.getName());
            preparedStatement.setInt(3,s.getGrade());

            int rows = preparedStatement.executeUpdate();
            System.out.println("Account added successfully");
            System.out.println("Rows Effected: " +rows);

        }catch (SQLException exception){
            exception.printStackTrace();
        }
    }
    public void readStud(){
        List<Student> studList = new ArrayList<>();
        String sqlQuery = "select * from student2";

        try(Connection connection = getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlQuery)){
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int grade = resultSet.getInt("grade");
                Student s = new Student(id,name,grade);
                studList.add(s);
                System.out.println("ID: " +id+ ", Name: " +name+ ", Grade: " +grade);
            }

        }catch (SQLException exception){
            exception.printStackTrace();
        }
    }

    void updateGrade(int id,int ngrade)
    {
        try(Connection c=getConnection())
        {
            String q1="update student2 set grade=? where id=?";
            PreparedStatement p=c.prepareStatement(q1);
            p.setInt(1,ngrade);
            p.setInt(2,id);
            int rows=p.executeUpdate();
            System.out.println("Grade updated!"+rows);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

