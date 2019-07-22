package com.stackroute.jdbc;

import java.sql.*;

public class DatabaseMetadataDemo {

    public void databaseMetadata(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Root@123");
            DatabaseMetaData metaData=connection.getMetaData();

            System.out.println("Driver Name: "+metaData.getDriverName());
            System.out.println("Driver Version: "+metaData.getDriverVersion());
            System.out.println("UserName: "+metaData.getUserName());
            System.out.println("Database Product Name: "+metaData.getDatabaseProductName());
            System.out.println("Database Product Version: "+metaData.getDatabaseProductVersion());

            connection.close();
        }catch(Exception e){ System.out.println(e);}
    }
}

