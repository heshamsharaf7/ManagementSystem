
import View.Frames.JMain;
import java.sql.*;
import Logic.Servier.DataBaseConnect;
import View.Interfaces.IProject;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hesham
 */
public class MainClass {
    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {
       //IProject j=new IProject();
       //System.out.print(j.get);
        
        JMain j=new JMain();
        j.setVisible(true);
        
    }
    
}
