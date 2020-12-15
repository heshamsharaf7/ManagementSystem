/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.Prensenter;

import Modle.MProject;
import View.Interfaces.IProject;
import Logic.Servier.SProject;
import java.sql.SQLException;

/**
 *
 * @author Hesham
 */
public class PProject {
    
    MProject mProject=new MProject();
    SProject p=new SProject();
    //connect interface with modle
    private void connect(){
        mProject.setId(IProject.id);
        mProject.setTitle(IProject.title);
        mProject.setLocation(IProject.location);
        mProject.setDetails(IProject.details);
        
    }
    public void insertProject() throws ClassNotFoundException, SQLException{
        connect();
        
        p.insert(mProject.getId(), mProject.getTitle(), mProject.getLocation(), mProject.getDetails());
        
    }
    public void deleteProject() throws ClassNotFoundException, SQLException{
        connect();
        System.out.print(mProject.getId());
        p.delete(mProject.getId());
    }
    
}
