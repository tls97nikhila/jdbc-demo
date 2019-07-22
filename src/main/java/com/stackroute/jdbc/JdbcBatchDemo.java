package com.stackroute.jdbc;

import java.sql.*;

public class JdbcBatchDemo {

    public void jdbcBatch() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Root@123");
            connection.setAutoCommit(false);

            Statement statement = connection.createStatement();
            statement.executeUpdate("insert into employeeDetails values(191,'atif khan',26,'male')");
            statement.executeUpdate("insert into employeeDetails values(169,'charita',23,'female')");

            statement.executeBatch();//executing the batch

            connection.commit();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
