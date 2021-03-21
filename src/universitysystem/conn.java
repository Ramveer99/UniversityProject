package universitysystem;

import java.sql.*;

public class conn
{
    Connection c;
    Statement s;
    conn()
    {
    try
    {
    Class.forName("com.mysql.jdbc.Driver");
    c=DriverManager.getConnection("jdbc:mysql:///projectun","root","");
    s=c.createStatement();
    }catch(Exception e){System.out.println(e);}
    
    }
    
}