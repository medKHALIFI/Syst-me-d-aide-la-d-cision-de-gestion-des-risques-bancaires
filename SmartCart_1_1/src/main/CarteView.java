/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import main.* ;

public class CarteView  extends JFrame{
     
       private final BackView crtView =new BackView();
       private final MyCanvas canvas =new MyCanvas();
        
	  public CarteView(){
		  this.setSize(690,558);
		  this.setTitle("SmartMap");
		  this.setLocationRelativeTo(null);
		  this.setLayout(null);
		  this.setVisible(true);
		  
		  canvas.setBounds(0, 0,719,532);
		 
		  crtView.setBounds(0, 0,719,532);

	
		  
		
		//  crtView.setBackground(Color.red);
		  this.add(canvas);
		 //this.add(crtView);
          }}