package airlinemanagementsystem;

import java.sql.*;

public class Con {
    
    Connection c;
    Statement s;
    
    public Con(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///airlinemanagementsystem", "root", "Yuva@2003");
            s = c.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
