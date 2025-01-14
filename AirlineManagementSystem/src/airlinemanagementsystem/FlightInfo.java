package airlinemanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class FlightInfo extends JFrame {
    
    public FlightInfo(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JTable table = new JTable();
        
        try{
            Con con = new Con();
            
            ResultSet rs = con.s.executeQuery("Select * from flight");
            table.setModel (DbUtils.resultSetToTableModel(rs));
                    
        }catch(Exception e){
            e.printStackTrace();
        }
        
        JScrollPane jsp = new JScrollPane(table);
        table.setBounds(0, 0, 800, 500);
        add(table);
        
        setSize(800, 500);
        setLocation(400, 200);
        setVisible(true);
        
    }
    public static void main(String[]args){
        
        new FlightInfo();
        
    }
    
}
