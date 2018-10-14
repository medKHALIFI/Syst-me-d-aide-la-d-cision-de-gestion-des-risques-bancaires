/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class City {
	
	public double id;
	public String Name;
public double surface;
	public double descrip;
	
    public City(){
    	  this.id=0;
    	  this.Name="";
    	  this.surface=0;
    	  this.descrip=0;
    }
    public City(int x,String name,double surf,double desc){
  	  this.id=x;
  	  this.Name=name;
  	  this.surface=surf;
  	  this.descrip=desc;
  }
 public void affichCity() throws IOException{
      Maps mp=new Maps();
       
        //MyCanvas m =new MyCanvas();
       double x[][]=new double[1][4];
       x[0][0]=this.id;
       x[0][1]=this.surface;
       x[0][2]=this.descrip;
    int pp=mp.appretissage(x); // on affect l winner noued por pp
        BufferedReader sortie_poids = new BufferedReader(new FileReader("sortie.txt"));
  
     String poids[][]=new String[10][10];
     double []input_vector = new double[50];
          int m1=0,a=0,cols=0,rows=0,g=0;
        String ligne2;
           while((ligne2=sortie_poids.readLine())!=null){
              a=0;
           StringTokenizer st = new StringTokenizer(ligne2,"\t");
              while(st.hasMoreTokens()){
              
              poids[m1][0]=st.nextToken();
            //  ner[m].Weight_of_Node[a]=poids[m][a];
              a++;
               
              }
             // g++;
             m1++;
              rows=m1;
              cols=a;
       }
           
           System.out.println();
           fenetre1 f =new fenetre1(poids[pp][0]);
           f.setVisible(true);
	/* System.out.println("City Id :"+this.id);
	     System.out.println("City Name :"+this.Name);
	     System.out.println("City Surface :"+this.surface+"Km²");
	     System.out.println("Description :"+this.descrip);
    	*/
    }
    
}
