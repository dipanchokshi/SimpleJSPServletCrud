/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bari.util;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author maitri
 */
public class Database {
    
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/javademo",
                    "root", 
                    "");
            return con;
        }
        catch(Exception ex){
            System.out.println("Database.getConnection() Error -->" + ex.getMessage());
            return null;
        }
    
    }
    public static void close(Connection con){
        try{
               con.close(); 
        }
        catch(Exception ex){
        }
        
    }
        
}
    
