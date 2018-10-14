/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfe;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author simo
 */
public class Pfe {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        
        
          //    System.out.println("grosberg bien fait");
        Scanner lire= new Scanner(System.in);
        //int dim=0,itermax=0,dimoval=0,n=0,k=0,x,y;
	double[] table=new double[50];
	double errmoy,tauxappr;
        //Kohonen ts=new Kohonen();
        app a =new app();
        a.setVisible(true);
       // Apprentissage A =new Apprentissage();
       
      /*       
    System.out.println("voila notre application ");
    System.out.println("donnee la dimention de la carte ");
    dim=lire.nextInt();
    System.out.println("donnee l'iteration maximale");
    itermax=lire.nextInt();
    System.out.println("donnee l'erreur moyenne ");
    
    
     
    errmoy=lire.nextDouble();
    System.out.println("donnee le taux d'apprentissage ");
    tauxappr=lire.nextDouble();
   ts.Tm(table,dim,itermax,errmoy,tauxappr);
   */
        //System.out.print("look");
           //    vainqueur v =new vainqueur();
   
    
      
    }
    
}
