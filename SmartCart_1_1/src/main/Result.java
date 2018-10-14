/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.*;

/**
 *
 * @author the mizz
 */
public class Result extends JFrame  {
    private int id;
	private String Name;
	private String surface;
	private String descrip;
        JLabel lab = new JLabel();
        JFrame fr = new JFrame("resultat");
        
    
 Result(int x,String name,String surf,String desc){
     System.out.println("City Id :"+this.id);
	     System.out.println("City Name :"+this.Name);
	     System.out.println("City Surface :"+this.surface+"Km²");
	     System.out.println("Description :"+this.descrip);
             
    
    }

    Result() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
}
