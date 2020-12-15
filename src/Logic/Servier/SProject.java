/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.Servier;

import java.sql.SQLException;

/**
 *
 * @author Hesham
 */
public class SProject {
    DataBaseConnect db=new DataBaseConnect();
    
    
    public void insert(int id,String title,String location,String detials) throws ClassNotFoundException, SQLException{
        db.DBConnect("insert into project values("+id+",'"+title+"','"+location+"','"+detials+"')");
    }
           
    public void delete(int id) throws ClassNotFoundException, SQLException{
        db.DBConnect("delete from project where proid="+id+"");
    }        
            
            
            
    
}
