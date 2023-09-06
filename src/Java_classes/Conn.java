package Electricity;  //iam inside this package now

import java.sql.*;  

public class Conn{
    Connection c;
    Statement s;     // Both are variable referrencing the Connection and Statement class from java.sql
    public Conn(){  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  // method for establishing the connetion with JDBC driver (mysql-connection-java .jar)
             c =DriverManager.getConnection("jdbc:mysql://localhost:3306/prodemo","root","Manojbinn@l01");   //root by default and database is ebs
            s =c.createStatement();    // create statement using the connection variable
            //now we have statemnt variable ready
            //now our connections with the JDBC mysql driver is setup with our database mySQL
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  
