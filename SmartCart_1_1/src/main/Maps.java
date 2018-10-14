/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import java.util.* ;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;




public class Maps {
    File file =new File("Node.txt");
     File donnee=new File("data.txt");
    double Learning_Rate=0;//taux d apprentissage
    Node Winnig_node;//le neurons vinqeur
    double erreur_Moyenne=99999;//erreur moyenne
    int Cont_Iteration=0;
    double NeighbourhoodRadius=0; //voisinage de rayon
    int dimMap;
    int Max_Iteration;
    double LEARNING_EREUR;//l'erreur d'apprentissage minimal
    double Start_Lerning_Rate; //le taux d aprentissage initial
    int Number_of_Node;
    Node []Winners=new Node[Number_of_Node];
    int Gridsize; //la taille de la reseaux 'grille'
    int size_of_inputVector_and_Weight; // la taiile de  la logeur  de matrice d entree
    Node []Map;
    int this_vector;
    
    
    
    /*Procédure qui permet de créer la carte auto organisatrice, dans
cette fonction aussi on fait l’initialisation des poids pour tous les
neurones*/

    public void Creat_Map(int col_mat,File Don,int a,int b,double c,double d) throws IOException{
         PrintWriter out=null;
    // out=new PrintWriter(new FileOutputStream(Node),true);

     out=new PrintWriter(new FileWriter(Don),true);
    
    //System.out.println("donne la dimension de la carte");
    dimMap=a;
    //System.out.println("donne le nombre d'iteration maximal");
    Max_Iteration=b;
    //System.out.println("donne l'erreur d'apprentissage minimal");
    LEARNING_EREUR=c;
   // System.out.println("donne le taux d'apprentissage initial");
    Start_Lerning_Rate=d;
    //System.out.println("donne la logeure de matrice d entree");
    size_of_inputVector_and_Weight=col_mat;
    Number_of_Node=dimMap*dimMap;
    Gridsize=dimMap/2;
    Map=new Node[Number_of_Node];
    for(int i=0;i<Number_of_Node;i++){Map[i]=new Node();}//reservation de la map[i]
    int k=0,j=0;
    for(int i=0;i<Number_of_Node;i++){
    
    Map[i].Initial_Weight(size_of_inputVector_and_Weight);//jkljkl
    out.println("Node"+(i+1)+":");
    for(int m=0;m<size_of_inputVector_and_Weight;m++){
        
       out.println(Map[i].Weight_of_Node[m]);

       }
    Map[i].Position(j,k);
    k++;
    if(k==dimMap){
    k=0;
    j++;}
    
    
    }
    
   }
    /* Procédure pour la normalisation, 
    Les valeurs en entrées devraient de moyenne pas 
    trop loin de zéro et de variance pas trop loin de 1.*/
    public void Normalisation(double[][]mat){
        
        for(int i=0;i<mat.length;i++){
            double som=0;
           for(int j=0;j<mat[i].length;j++){
         som+=Math.pow(mat[i][j],2);
           }
          
          for(int j=0;j<mat[i].length;j++){
           mat[i][j]=mat[i][j]/Math.sqrt(som);        }
        }
           
       
       }
      
       //fonction qui determine les neurones vanqueures
       public Node Winner_Node(double[]x){
          Node winner=new Node();
            double distanceInitial=55555;
         for(int i=0;i<Number_of_Node;i++){
         
         double distance=Map[i].euclidean(x, size_of_inputVector_and_Weight);
         if(distance<distanceInitial){
         distanceInitial=distance;
         
           winner=Map[i];              }
         
         }
       
       return winner;
       
       } 
       //Fonction qui calcule la distance entre les entrées et les différents Neurones.
        public  double euclidean2(double[]x,double[][]poids,int nb_col,int numligne){
//fonction qui permet de calculer la distance entre les neurones vanqueurs et les entrees des clients
            double distance=0;
       for(int i=0;i<nb_col;i++){
          
           distance+=Math.pow((x[i]-poids[numligne][i]),2);
       
          
       }
        return Math.sqrt(distance);
        
        }
         
       
       public int Winner_Node2(double[]x,double [][]poids,int nb_cols){

   //fonction pour l'apprentisssage
          int iter=0;
          // Node winner=new Node();
           double distanceInitial =55555;
         for(int i=0;i<poids.length;i++){
         
         double distance=euclidean2(x,poids,nb_cols,i);
         if(distance<distanceInitial){
         distanceInitial=distance;
         iter=i;
         //System.out.println(iter);
                        }
         }
       
       return iter;
       }
       //fonction qui determine'modifier' le taux d'apprentissage
         public double Lerning_Rate(int current_iteration){
       
       
     // return  Start_Lerning_Rate*Math.exp(-((double)(current_iteration/Max_Iteration)));
     return Start_Lerning_Rate*Math.exp(-((double)(current_iteration*Math.log(Gridsize))/Max_Iteration));
       }
       //fonction qui determine le rayon de voisinage
    public double Radius_of_Neighborhood(int iteration){   
       
        
        return Gridsize*Math.exp(-((double)(iteration*Math.log(Gridsize))/Max_Iteration));
       
   }
    
    //fonction qui permet de calculer l'influence de voisinage
    public double Neighbors_influ(double distance,double Radius){
    
         return Math.exp(-(double)distance/(2*Math.pow(Radius,2)));
    }
    
    //calculer la distance entre le vinquer et les neurons voisinage
    public double Distance_Node_with_Neighbors(Node winner,int i){
    
    
     double dist = Math.pow((winner.X_Node - Map[i].X_Node),2) + Math.pow((winner.Y_Node - Map[i].Y_Node),2);
    
     //return dist;
     return Math.sqrt(dist);
    }
   /* public void data(double[][]matrix_input,int nb_ligne,File Data) throws IOException{
       
        PrintWriter out=null;
        
     out=new PrintWriter(new FileWriter(Data),true);
         for(int i=0;i<nb_ligne;i++){
       for(int j=0;j<nb_ligne;j++){
       
           out.print(matrix_input[i][j]);}
       }
    
    }*/
    @SuppressWarnings("resource")
    // Fonction principale pour l’apprentissage.
   public void Train(double[][]matrix_input,int nb_ligne,int nb_cols,File Node) throws FileNotFoundException, IOException{ 
         Normalisation(matrix_input);
        //int nb_ligne=matrix_input.length;
        Node[]ner=new Node[nb_ligne];
        PrintWriter out=null;
        PrintWriter out1=null;
         PrintWriter open=null;
       // out=new PrintWriter(new FileOutputStream(Node),true);

        out=new PrintWriter(new FileWriter(Node),true);
        out1=new PrintWriter(new FileWriter(donnee),true);
       
        
        double distance=0;
    double infleunce=0;
    double[] input_vector=new double[size_of_inputVector_and_Weight];
    double erreur=0;
    int k=0;
    do{
      for(this_vector=0;this_vector<nb_ligne;this_vector++){
        for(int j=0;j<size_of_inputVector_and_Weight;j++) {input_vector[j]=matrix_input[this_vector][j];}
          Winnig_node=Winner_Node(input_vector);//determiner les neurons vanqueures
          ner[this_vector]=Winnig_node;
          erreur+=Winnig_node.euclidean( input_vector,size_of_inputVector_and_Weight);//la diference entre les poids et les entrÃ©es
         NeighbourhoodRadius=Radius_of_Neighborhood(Cont_Iteration);//rayon des voisins
        Learning_Rate=Lerning_Rate( Cont_Iteration);//calcul le taux d'apprentissage
      for(int i=0;i<Number_of_Node;i++){
      
      distance=Distance_Node_with_Neighbors(Winnig_node, i);//pour calculer la distance entre le neurone vanqueur et les autres neurones
      if(distance<Math.pow(NeighbourhoodRadius,2)){//si la distance entre le neurone vanqueur et les autres neurones inferieur a r*r on modifie les poids.
      
      infleunce=Neighbors_influ(distance,NeighbourhoodRadius);
      Map[i].Update_Weight( input_vector,Learning_Rate,infleunce,size_of_inputVector_and_Weight);
      
      }
                                         }
      ++Cont_Iteration;
      
      
      System.out.println("*************************************Resulta pendant l'apprentissage************************************");
      
      System.out.println("Iteration  :  "+Cont_Iteration);
      System.out.println("Taux d'apprentissage  :  "+Learning_Rate);
      System.out.println("Rayon  :  "+ NeighbourhoodRadius);
      System.out.println("Iteration  :  "+ this_vector);
      System.out.println("Winning Node  :  ("+Winnig_node.X_Node+","+Winnig_node.Y_Node+")");
      System.out.println("Erreur Moyenne  :  "+erreur_Moyenne);
    //  System.out.println("ROWS_DATA :  "+this_vector);

      
     }
    erreur_Moyenne = erreur/nb_ligne;
           erreur=0;
    }while(erreur_Moyenne > LEARNING_EREUR || Cont_Iteration == Max_Iteration);
    
      System.out.println("******************************************RESULTA FINAL*****************************************");
      System.out.println("iteration finale  :  "+Cont_Iteration);
      System.out.println("Taux d'apprentissage  :  "+Learning_Rate);
      System.out.println("Rayon  :  "+ NeighbourhoodRadius);
     // System.out.println("Iteration courante  :  "+ this_vector);
      System.out.println("Winning Node  :  ("+Winnig_node.X_Node+","+Winnig_node.Y_Node+")");
      System.out.println("Erreur Moyenne  :  "+erreur_Moyenne);
       String d=new String();
       // vainqueur v=new vainqueur();
      for(int i=0;i<this_vector;i++){
     /*    
        d+=("l'entrÃ©e "+(i+1)+" neurone van  : ( "+ner[i].X_Node+","+ner[i].Y_Node+")");
          d+=("\n");
          v.t.setText(d);
       */   //v.t.setText("\n");
       System.out.println("l'entrée "+(i+1)+" neurone van  : ( "+ner[i].X_Node+","+ner[i].Y_Node+")");
      
      }
      try {
           
             open = new PrintWriter(new FileWriter(new File("hamza.txt")    ));
        } catch (IOException ex) {
            Logger.getLogger(Apprentissage.class.getName()).log(Level.SEVERE, null, ex);
        }
      open.print(Cont_Iteration);
       open.println();
       open.print(erreur_Moyenne);
         open.println();
       
        open.print(Learning_Rate);
         open.println();
         open.close();
      /*
       for(int i=0;i<Number_of_Node;i++){
       
       System.out.println("Node:"+(i+1)+"_____------>("+Map[i].X_Node+","+Map[i].Y_Node+"):");
       for(int j=0;j<size_of_inputVector_and_Weight;j++){
       System.out.println(Map[i].Weight_of_Node[j]);
       
       
       }
       
       
       }
       
       System.out.println("**************************************LES DONNEES APRES LA NORMALISATION********************************");
       out.println();
       for(int i=0;i<nb_ligne;i++){
       for(int j=0;j<nb_cols;j++){
       
           System.out.print(matrix_input[i][j]);System.out.print("\t");}
       System.out.println("\n");
       }
       
       out.println();
       }
       out.println();
          out.println("**************************************LES RESULTA FINALS ********************************");
       
          out.print("la dimension de la carte:");out.print("\t");*/
         // out1.println("\t");out.println(dimMap);
      //  out.print("le nombre des entrÃ©es dans chaque vecteur:");out.print("\t");out.println(size_of_inputVector_and_Weight);
       //  out1.println(size_of_inputVector_and_Weight);
       //  out.print("iteration final(sortie):");out.print("\t");out.println(Cont_Iteration);
         //out1.println(Cont_Iteration);
       //  out.print("le nombre des vecteures:");out.print("\t");out.println(this_vector);
         //out.print("Erreur_Moyenne:");out.print("\t");
        // out.println(dimMap);
         //out.println(erreur_Moyenne);
         //out.print("le taux d'apprentissage:");out.print("\t");
         //out.println(Learning_Rate);
        // out.print("Rayon:");out.print("\t");out.println(NeighbourhoodRadius);
        // out1.println(NeighbourhoodRadius);
         for(int i=0;i<this_vector;i++){
      
    //  out.println("l'entrÃ©e "+(i+1)+"--------->neurone van  : ( "+ner[i].X_Node+","+ner[i].Y_Node+" )");
             out.print(ner[i].X_Node);out.print("\t");out.println(ner[i].Y_Node);
      //out1.print(ner[i].X_Node);out1.print("\t");out1.print(ner[i].Y_Node);out1.print("\t");
     // out.println("les poids de neuron vanqueur:");
      for(int j=0;j<size_of_inputVector_and_Weight;j++){
          out1.print(ner[i].Weight_of_Node[j]);out1.print("\t");
        //  out1.print(ner[i].Weight_of_Node[j]);
         //   out1.print("\t");  
         
          }
      out1.println();
      }
         
         
        /* out.println("**************************************LES POIDS FINALES DES NEURONES********************************");
         for(int i=0;i<Number_of_Node;i++){
         out.print("Node ");out.print((i+1)+" leur Position:");out.print("\t");out.println(Map[i].X_Node+","+Map[i].Y_Node);
         out.println("les poids :");
          for(int j=0;j<size_of_inputVector_and_Weight;j++){
          out.println(Map[i].Weight_of_Node[j]);

          }
         
         
         
         
         }*/
         out.close();
    }
   public int appretissage(double[][] data) throws IOException{
     
       Normalisation(data);
       String ligne2;
     int iter = 0;
     Node []ner=new Node[20];
     double [][]poids=new double[50][50];
     StringTokenizer st;
     BufferedReader sortie_poids=null;
          sortie_poids=new BufferedReader(new FileReader("data.txt"));
     Node  Winnig_node2 = null;
     double []input_vector = new double[50];
          int m=0,a=0,cols=0,rows=0,g=0;
           while((ligne2=sortie_poids.readLine())!=null){
              a=0;
              st=new StringTokenizer(ligne2,"\t");
              while(st.hasMoreTokens()){
              
              poids[m][a]=Double.valueOf(st.nextToken()).doubleValue();
            //  ner[m].Weight_of_Node[a]=poids[m][a];
              a++;
               
              }
             // g++;
             m++;
              rows=m;
              cols=a;
            
              
          }
           for(this_vector=0;this_vector<data.length;this_vector++){
        for(int j=0;j<cols;j++) {input_vector[j]=data[this_vector][j];}
          iter=Winner_Node2(input_vector, poids,cols);
          
               
           }



       // System.out.println("***************************le neurones vanqueur pour les entrees de client*************");
        //System.out.println("("+Winnig_node2.X_Node+","+Winnig_node2.Y_Node+")");
             // System.out.println(iter);
    System.out.println("le ID de la province cliqué:" );

    System.out.println(iter);
    return iter ;
   }

   
    
 
}
