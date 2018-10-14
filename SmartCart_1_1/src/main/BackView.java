/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class BackView extends JPanel{
	 public void paintComponent(Graphics grphcs){
		    //Vous verrez cette phrase chaque fois que la méthode sera invoquée
		    System.out.println("Je suis exécutée !"); 
		    Graphics2D g2d = (Graphics2D) grphcs;
		    
		      Image img=null;
		      try {img=ImageIO.read(new File("images/carte.jpg"));}
		      catch(IOException e)
		        {System.out.println("ok");System.exit(0);}
		      g2d.drawImage(img,0,0,this);
			     
		       
		    }
}