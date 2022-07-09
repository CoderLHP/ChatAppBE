package coder.chatApp;

import java.sql.*;

public class TestDB {
    public static void main(String args[]) {
        try {
            String databaseURL = Constant.mysqlURL + Constant.database;
            String username = Constant.username;
            String password = Constant.password;
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con = DriverManager.getConnection(databaseURL,username,password);  
            System.out.println("Success");
            Statement stmt=con.createStatement();  
            int result=stmt.executeUpdate("INSERT INTO user VALUES (1, 'Chung', 'chung0807', 'online')");  
            con.close();  
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
