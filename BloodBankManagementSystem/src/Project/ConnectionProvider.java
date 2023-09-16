
package Project;

import java.sql.*;

public class ConnectionProvider {
    
    public static Connection getCon()
    {
        try{
           Class.forName("com.mysql.cj..jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://loccalhost:3306/bbms","root","Pagol@420");
           return con;
        }
        catch(Exception e)
        {
           return null;
        }
    }
}
