/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.Servier;
import java.sql.*;  

/**
 *
 * @author Hesham
 */
public class DataBaseConnect {//jdbc:oracle:thin:@//DESKTOP-795057F:1521/orcl [ManagmentSys on MANAGMENTSYS]
   Connection conn;
    public void DBConnect(String statment) throws ClassNotFoundException, SQLException{
        try{
        Class.forName("oracle.jdbc.driver.OracleDriver");  
        
            conn = DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-795057F:1521/orcl","ManagmentSys","Hesham");
         Statement stmt=conn.createStatement();  
         stmt.executeQuery(statment);
         conn.close(); 
         
        }catch(ClassNotFoundException | SQLException e){}
        finally{conn.close();}
        
    }
    
    
}
