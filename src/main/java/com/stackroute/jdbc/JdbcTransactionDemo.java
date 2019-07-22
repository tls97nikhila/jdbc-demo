package com.stackroute.jdbc;

import java.sql.*;

public class JdbcTransactionDemo {
    public void jdbcTransaction() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Root@123");
            connection.setAutoCommit(false);

            Statement statement = connection.createStatement();
            statement.executeUpdate("insert into employeeDetails values(190,'atif',26,'male')");
            statement.executeUpdate("insert into employeeDetails values(167,'rudrani',23,'female')");

            connection.commit();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
