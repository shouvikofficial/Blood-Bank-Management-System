


import Project.*;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionProvider {
    
    public static Connection getCon()
    {
        try{
           Class.forName("com.mysql.cj..jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms","root","Pagol@420");
           return con;
        }
        catch(Exception e)
        {
           return null;
        }
    }
}