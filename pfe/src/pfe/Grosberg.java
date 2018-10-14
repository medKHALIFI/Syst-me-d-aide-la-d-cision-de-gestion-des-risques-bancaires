/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfe;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.StringTokenizer;
/**
 *
 * @author simo
 */
public class Grosberg {
    double []yd ;
    //rempisaager de sortie diseri
    
    double vitesseApp =0  ;
   // int iterationmax= 1000;
  //  double erreurm = 0.00001 ;
    int j,i;
    int neuroneCacher=3;
    Node []ca ;
    double []y ;
    File file =new File("gdata.txt");
    File filey =new File("sortiegross.txt");
    File fileyd =new File("soried.txt");
    File fileDATA =new File("sortieDATA.txt");
     File INFO =new File("INFO.txt");
    StringTokenizer str ;
     
    BufferedReader sortie_data=null;
    
    public Grosberg(){
        
}
    
    public void create(int nembreneuron, int nembrepoids)throws IOException{
        //i nombre des neuron de G
        //r nombre des poides de neuron de G
  // System.out.println("voila la creation de grosberg ");
       
        PrintWriter se=null;
       se =new PrintWriter(new FileWriter(file),true);
        ca =new Node[nembreneuron];
    se.println("couche cache");
    for(  j=0 ; j < nembreneuron ; j++){
       ca[j]=new Node();  
       ca[j].Initial_Weight(nembrepoids);
         se.println("Node"+(j+1)+":");
       for(int l=0 ;l<nembrepoids;l++){
   se.println(ca[j].Weight_of_Node[l]);
}
    }
    se.close();
        }
    

    public void train(int nembreneuron ,int nembrepoids,double erreurm,int iterationmax,double v)throws IOException{

//test sara 
       
          int it =0 ;
         int[][] k =new int[50][50];
        int c =0 ;
       double err=0 ;
       
double y =0 ;//y =new double[50];int  rows_data=0;
	            int cols_data=0,rows_data=0;
        String ligne ;
        int a_cols=0,m_rows=0  ;
        double[][] H =new double[50][50];
          for(i=0;i<nembrepoids;i++){
    for(j=0;j<nembrepoids;j++){
    k[i][j]=0;
    H[i][j]=0 ;
    }
         } 
    
        File f=new File("data.txt");
         BufferedReader d=new BufferedReader(new FileReader(f));
         while(( ligne =d.readLine())!=null){
	 a_cols =0 ;
        
        //System.out.print("voila");
	           str=new StringTokenizer(ligne,"\t");
	           while(str.hasMoreTokens()){
	      //  System.out.print(H[a_cols][m_rows]);
                        H[m_rows][a_cols]=Double.valueOf(str.nextToken()).doubleValue();
	            
	            a_cols++;
                    // System.out.println(H[m_rows][a_cols]);
	           }
                     m_rows++;
	           //System.out.println("nombre ligne"+m_rows);
	        
	             rows_data=m_rows;
	            cols_data=a_cols;
	       }
         int ok =0,z=0 ;
         int  indice=0 ;
       
for( z=0;z<nembrepoids;z++){
   indice=z ;
    //System.out.println(indice);

for(int s=0;s<z;s++){
if(H[z][0]==H[s][0])
   indice=s ;
}
k[z][indice]=1;  
  //  System.out.println();
}



/*
for( z=0;z<nembrepoids;z++){
    for( int l=0;l<nembrepoids;l++){
        System.out.print(k[z][l]);
    }
    System.out.println();
}
*/















//r nombre des neuron de G
        //vb nombre des poides de neuron de G
     //k ma sorti de kohonen
        //vb le nombre des ligne
       
     //  System.out.println("debut de train");
       /*for(j=0;j<nembreneuron;j++){
               y[j]=0 ;
           }*/
       // System.out.println("voila trinng ");
        PrintWriter sortiey=null;
       sortiey =new PrintWriter(new FileWriter(filey),true);
       
        PrintWriter sortieDATA=null;
       sortieDATA =new PrintWriter(new FileWriter(fileDATA),true);
       // y[]=0 ;
       //read y'
        m_rows =0;
        a_cols=0;
        rows_data =0 ;
        cols_data =0 ;
       yd =new double[50];
      // String ligne ;
      
      sortie_data=new BufferedReader(new FileReader(new File("sortied.txt")));
	          while((ligne=sortie_data.readLine())!=null){
	           a_cols=0;
                   //str=new StringTokenizer(ligne," ");
	         //  while(str.hasMoreTokens()){
	           yd[m_rows]=Double.valueOf(ligne).doubleValue();
                      a_cols++;
	              m_rows++;
	            
	       }
                  rows_data=m_rows;
	          cols_data=a_cols; 
                   
                  /*  for(i =0;i<rows_data;i++){
                     System.out.println( yd[i]) ;
                  }*/
                
                  
                  
                  
                  
                  
                  
                    /*   for( int  p=0 ; p < nembreneuron ; p++){
                    for(int l=0 ;l<nembrepoids;l++)
                        ca[p].Weight_of_Node[l]=0.4 ;
                      }
                */
                  
                  
                  
                  
                   for(int  g=0;g<nembrepoids;g++){
                       /*  for (int i=0;i<nembrepoids;i++)
                  k[i]=0 ;
                k[g]=1 ;*/
                
                          /*  for(i =0;i<nembrepoids;i++){
                                 System.out.println( k[g][i]) ;
                  } */
                  
                  
                  
                  //initialisation des poids
            /*     for(j=0;j<nembreneuron;j++){
               y[j]=0 ;
           }  */
                  
          err=0 ;
          it=0 ;
        //  System.out.println("loooook");
       
       do {
          // err=0 ;
          vitesseApp= Vitesse_app(it,v,iterationmax);
          y =0 ;
               /*for(j=0;j<nembreneuron;j++){
               y[j]=0 ;
           }  */
              
           //e les neuron de grossberg
           //la modification des poids
          
     ca[0].Update_Weight_g(vitesseApp,k[g],yd,g,nembrepoids);
           
           
      //calcule des sorties     
      
        for(i=0;i<nembrepoids;i++)   {   
   y += k[g][i]*ca[0].Weight_of_Node[i];
  }
     err=yd[g]-Math.abs(y) ;
    err=  Math.abs(err);
       
 

  
  
         ++it  ;
         
            /*   for(i=0;i<nembrepoids;i++)
         err += yd[g]-ca[g].Weight_of_Node[i] ;
          err = err/nembrepoids;
        */
         //  for(i=0;i<nembreneuron;i++)
           //  ;
         /*   System.out.println("*************************************Resulta pendant l'apprentissage************************************");
          // for(i=0;i<rows_data;i++)
       //  System.out.println("sortie de grossberg  y : de ng"+j+" "+i+"  "+y[i]);
          // j=0 ;
         for(j=0;j<nembreneuron;j++)
  for(i=0;i<nembrepoids;i++)
      System.out.println("le poide de nouron cachee    "+ca[j].Weight_of_Node[i]);
           
      System.out.println("Iteration  :  "+it);
     
      System.out.println("Erreur Moyenne  :  "+err);
      
      System.out.println("la vitesse d'apprentissage "+ vitesseApp);
       // System.out.println("look");
  */
        
       }while( it < iterationmax  && err > erreurm );   
      
        
                   }
                   
                   
  //ecriture des sorties                 
                   for(j=0;j<nembrepoids;j++)
        { y=0 ;
        for(i=0;i<nembrepoids;i++)   { 
          //  System.out.println(ca[0].Weight_of_Node[i]+" "+k[j][i]);
   y += k[j][i]*ca[0].Weight_of_Node[i];
  }
         sortiey.print(y);
        
    sortiey.println();
 }
                   PrintWriter si=null;
       si =new PrintWriter(new FileWriter(INFO,true));
        si.println();
       si.print(err);
       si.print("\t");
       si.print(it);
       si.print("\t");
       si.print(vitesseApp);
       si.println();
       
       si.close();
        /*  for(j=0;j<neuroneCacher;j++){
            y[j]=0 ;
        for(i=0;i<vb;i++){PrintWriter si=null;
       si =new PrintWriter(new FileWriter(INFO),true);
       si.println(err);
       si.println(it);
       si.println(vitesseApp);
            
   y[j] += k[i]*ca[j].Weight_of_Node[i];
        }
            
        }*/   
                   
                   
               /*    for(j=0;j<nembreneuron;j++){ 
                       y=0 ;
        for(i=0;i<nembrepoids;i++)      
   y+= k[g][i]*ca[j].Weight_of_Node[i];
         System.out.println("la sortie");
         System.out.println(y);
                   }
                 */ 
       // sortiey.println();
      //  sortiey.print("lool");
    
 for(i=0;i<nembrepoids;i++){
     
            sortieDATA.print(ca[0].Weight_of_Node[i]);
    sortieDATA.println();
        }
        
 
    
 
    sortieDATA.close();  
    sortiey.close();
    }
    
  
    
     //fonction qui determine le taux d'apprentissage
         public double Vitesse_app(int current_iteration,double v,int h){
       
       
     // return  Start_Lerning_Rate*Math.exp(-((double)(current_iteration/Max_Iteration)));
     return  v*Math.exp(-((double)(current_iteration*Math.log(neuroneCacher))/h));
       }
}
