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
public class TRININGG  {
    
   String ligne ;
        StringTokenizer str ;
        int m_rows=0 ,a_cols=0 ;
        int    rows_datad , cols_datac ;
        double [][]H=new double[50][50] ;
        File f=new File("data.txt");
         int  rows_data =0 ;
         int cols_data =0 ;
    public TRININGG(double a,int b,double c) throws IOException{
       
         BufferedReader d=new BufferedReader(new FileReader(f));
         while(( ligne =d.readLine())!=null){
	a_cols =0 ;
        //System.out.print("voila");
	           str=new StringTokenizer(ligne,"\t");
	           while(str.hasMoreTokens()){
	       //   System.out.print(H[a_cols][m_rows]);
	           H[m_rows][a_cols]=Double.valueOf(str.nextToken()).doubleValue();
	            
	            a_cols++;
                    // System.out.println(H[m_rows][a_cols]);
	           }
                     m_rows++;
                     // System.out.println("nombre ligne"+m_rows);
	        
	            rows_data=m_rows;
	            cols_data=a_cols;
	       }
        
        int q ;
        d.close();
        /* double [][]k =new double[10][5];
       for(  q=0 ;q<10;q++){
       
        for(int r=0;r<5;r++){
        k[q][r]=H[q][r]; 
        //System.out.println(k[q][r]);
    }
       }
       */
        
       /* BufferedReader D=new BufferedReader(new FileReader(new File("sortied.txt")));
        m_rows =0 ;
         while(( ligne =D.readLine())!=null){
	a_cols =0 ;
        //System.out.print("voila");
	           str=new StringTokenizer(ligne,"\t");
	           while(str.hasMoreTokens()){
	       //   System.out.print(H[a_cols][m_rows]);
	           H[m_rows][a_cols]=Double.valueOf(str.nextToken()).doubleValue();
	            
	            a_cols++;
                    // System.out.println(H[m_rows][a_cols]);
	           }
                    m_rows++;
	           System.out.println("nombre ligne DESIRE  "+m_rows);
	         
	           rows_datad=m_rows;
	            cols_datac=a_cols;
	       }
        */
        int j =1 ;
        Grosberg g =new Grosberg();
        g.create(1 ,rows_data);
        
       
            //System.out.println();
             // System.out.println("pour le  sortie de kohonen");
              int[] k =new int[rows_data];
              
           
            g.train(1 ,rows_data,a,b,c);
        }
    
        }
        
        
      
    
     
       
    
