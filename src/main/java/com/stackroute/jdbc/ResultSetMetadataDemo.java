package com.stackroute.jdbc;

import java.sql.*;

public class ResultSetMetadataDemo {
    public  void resultSetMetadata(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Root@123");

            PreparedStatement preparedStatement=connection.prepareStatement("select * from employeeDetails");
            ResultSet resultSet=preparedStatement.executeQuery();
            ResultSetMetaData metaData=resultSet.getMetaData();

            System.out.println("Total columns: "+metaData.getColumnCount());
            System.out.println("Column Name of 2nd column: "+metaData.getColumnName(2));
            System.out.println("Column Type Name of 2nd column: "+metaData.getColumnTypeName(2));

            connection.close();
        }catch(Exception e){ System.out.println(e);}
    }
}
