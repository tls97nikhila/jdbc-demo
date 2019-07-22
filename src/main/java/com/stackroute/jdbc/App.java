package com.stackroute.jdbc;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        SimpleJdbcDemo simpleJdbcDemo = new SimpleJdbcDemo();
      simpleJdbcDemo.getEmployeeDetails();
        System.out.println();
       simpleJdbcDemo.getEmployeeDetailsInReverse();
        System.out.println();
         simpleJdbcDemo.getEmployeeDetailsFromSecondRowInReverse();
        System.out.println();
       simpleJdbcDemo.getEmployeeDetailsByNameAndGender("Amar","male");
        System.out.println();
        DatabaseMetadataDemo databaseMetadataDemo = new DatabaseMetadataDemo();
       databaseMetadataDemo.databaseMetadata();
        System.out.println();
        JdbcBatchDemo jdbcBatchDemo = new JdbcBatchDemo();
      jdbcBatchDemo.jdbcBatch();
        System.out.println();
        JdbcTransactionDemo jdbcTransactionDemo = new JdbcTransactionDemo();
       jdbcTransactionDemo.jdbcTransaction();
        System.out.println();
        ResultSetMetadataDemo resultSetMetadataDemo = new ResultSetMetadataDemo();
        resultSetMetadataDemo.resultSetMetadata();
        System.out.println();
        RowSetDemo rowSetDemo = new RowSetDemo();
       rowSetDemo.rowSet();


    }
}
