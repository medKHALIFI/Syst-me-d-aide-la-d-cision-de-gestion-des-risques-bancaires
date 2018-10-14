/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JWindow;
import java.awt.*;
import static java.awt.SystemColor.text;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MyCanvas extends JPanel implements MouseListener{
      
   
    
    
    
	 public List<Shape>shapes = new ArrayList<Shape>();
	 public List<City>citys =new ArrayList<City>();
	 
public  City larach = new City(1,"Laraache",472386,2783);
	 private   City tetouan = new City(2,"Tetouan",6135,6025);
	 private   City tanger = new City(3,"Tanger-assilah",5676258,8910);
	 private   City fnideq= new City(4,"Fahs-anjra",93556,178);
	 private   City chefchaoun = new City(5,"Chefchaoun",77445819,343);
	    
	    
	 private  Shape cirlce1 = new Ellipse2D.Double(203, 334, 20, 20);
	 private  Shape cirlce2 = new Ellipse2D.Double(470, 390, 20, 20);
	 private  Shape cirlce3 = new Ellipse2D.Double(330, 217, 20, 20);
	 private  Shape cirlce4 = new Ellipse2D.Double(207, 176, 20, 20);
	 private  Shape cirlce5 = new Ellipse2D.Double(265, 100, 20, 20);
	 

	 MyCanvas(){
		 //circle listener
		 this.addMouseListener(this);
		 citys.add(larach);
		 citys.add(chefchaoun);
		 citys.add(tetouan);
		 citys.add(tanger);
		 citys.add(fnideq);
		 
				  
	 }
         @Override
	 public void paintComponent(Graphics grphcs){
		    //Vous verrez cette phrase chaque fois que la méthode sera invoquée
		    System.out.println("Je suis exécutée !"); 
		    Graphics2D g2d = (Graphics2D) grphcs;
		    shapes.add(cirlce1);
		    shapes.add(cirlce2);
		    shapes.add(cirlce3);
		    shapes.add(cirlce4);
		    shapes.add(cirlce5);
		      Image img=null;
		      try {img=ImageIO.read(new File("C:\\Users\\the mizz\\Documents\\NetBeansProjects\\SmartCart\\src\\main\\carte.jpg"));}
		      catch(IOException e)
		        {System.out.println("ok");System.exit(0);}
		      g2d.drawImage(img,0,0,this);
			     
                      shapes.stream().forEach((s) -> {
                          g2d.fill(s);
             });
		        
		    }
	 //fin de tracage des circles
         @Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
         @Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
         @Override
	public void mousePressed(MouseEvent me) {
		// TODO Auto-generated method stub
		
	}
         @Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
         @Override
	public void mouseClicked(MouseEvent me) {
		// TODO Auto-generated method stub
		
               int i=0;
             
                for (Shape s : shapes) {
                   if (i<citys.size()){ 
                    if (s.contains(me.getPoint())) {try {
                        //check if mouse is clicked within shape
                        
                        citys.get(i).affichCity();
                        } catch (IOException ex) {
                            Logger.getLogger(MyCanvas.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    
                    
                    }
                    }i++;
                    
                    
                }}
        
            
        
        
        }
        
                
	



