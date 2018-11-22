package utility;
import java.sql.*;

import javax.swing.*;

public class DBConnection extends IPAddress{

    private static Connection con;
    private static Statement stmt;
    private static String user="root";
    private static String password="";
    private static boolean status=false;
    
    public static void connection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://"+getAddress()+"/epa";
            con=DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            System.out.print("Database Connected");
            status=true;
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, 
                    "Cannot connect to database "+e.getMessage());
            status = false;
        }
    }
    
    public static void Connection(String sIP){    
        //connect to database
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://"+sIP+"/epa";
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();    
            System.out.println("Database Connected!");
            status = true;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Unable to Connect");
            status = false;
        }    
    }
    public static Connection getConnection(){
        return con;
    }
    
    public static Statement getStatement(){
        return stmt;
    }
    
    public static boolean getStatus(){
        return status;
    }
    
}
