/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfe;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author simo
 */
public class vainceur extends javax.swing.JFrame {

    /**
     * Creates new form vainceur
     */
    double [][]DATA =new double[100][100] ;
    double a=0,b=0,d=0,f=0,g=0,h=0,m=0,n=0,o=0,p=0,q=0,r=0,s=0,t=0,u=0 ;
    public vainceur() {
        initComponents();
            this.setLocationRelativeTo(null);
            this.setResizable(false);
            try
		{
			Image iconAcc=ImageIO.read(new File("icon.png"));
			this.setIconImage(iconAcc);
		}catch(IOException e)
		{
			e.printStackTrace();
		}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jTextArea4.setForeground(new java.awt.Color(0, 0, 255));
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\simo\\Desktop\\graphe 3.png")); // NOI18N
        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(791, 500));

        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Afficher");
        jButton1.setActionCommand("Afficher le resultat");
        jButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(350, 440, 150, 20);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\simo\\Desktop\\graphe 3.png")); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(4, 4, 520, 410);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Les Sorties");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(180, 0, 210, 40);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Le resultat");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 250, 200, 30);

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("L'erreur");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 280, 70, 40);

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("L'iteration");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(40, 310, 90, 20);

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Taux D'apprentissage");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(40, 330, 150, 20);

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(0, 0, 204));
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(330, 50, 100, 190);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Les Vainceur");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(330, 10, 150, 30);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("test");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(510, 440, 140, 20);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Routeur");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(660, 440, 120, 20);

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(0, 0, 255));
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(180, 50, 110, 190);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Les Sortie Desire");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 0, 210, 40);

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("00");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(200, 290, 160, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("00");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(200, 330, 210, 20);

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("00");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(200, 310, 170, 20);

        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jTextArea5.setForeground(new java.awt.Color(0, 0, 204));
        jTextArea5.setRows(5);
        jScrollPane1.setViewportView(jTextArea5);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 50, 130, 190);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Kohonen");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(210, 260, 90, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Grossberg");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(210, 364, 110, 20);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("L'erreur");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(40, 390, 90, 20);

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("00");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(200, 390, 150, 20);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("L'etiration");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(40, 410, 100, 30);

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("00");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(200, 410, 160, 20);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Vitesse d'apprentissage");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(40, 430, 150, 30);

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("00");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(200, 430, 150, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\simo\\Documents\\NetBeansProjects\\Pfe\\Article-Deep-learning.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(791, 500));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -30, 870, 560);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 791, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 this.jLabel7.setVisible(false);
        try{
         
         File fichier=new File("sortied.txt");
     
	FileReader F=new FileReader(fichier);
	BufferedReader L=new BufferedReader(F);
	String ligne;
        String chaine="";
        while ((ligne=L.readLine())!=null){
            chaine+=ligne+"\n";
        }
        
         this.jTextArea5.setText("\n");
        this.jTextArea5.setText(this.jTextArea5.getText()+chaine);
        chaine="";
        
             	
    // p1.setVisible(true);
     }		
		catch (Exception et){
			System.out.println(et.toString());
		}
          File fi=new File("sortiegross.txt");
    try{  
        this.jTextArea3.setText("");
	FileReader F1;
        
            F1 = new FileReader(fi);
         
        
	BufferedReader L1=new BufferedReader(F1);
	String chaine = "",ligne1="";
        
        while ((ligne1=L1.readLine())!=null){
            chaine+=ligne1+"\n";
        }
         this.jTextArea3.setText("\n");
        this.jTextArea3.setText(this.jTextArea3.getText()+chaine);
        //t2.setText(chaine);
       
        
        L1.close(); 	
    }  catch (Exception et){
			System.out.println(et.toString());
		}
     
     String ligne,chaine = null;
     int a_cols=0 ,m_rows = 0,rows_data=0,cols_data=0;
     StringTokenizer str ;
     String H[][]=new String[4][4];
    try{  
	
        File f=new File("INFO.txt");
         BufferedReader d=new BufferedReader(new FileReader(f));
         while(( ligne =d.readLine())!=null){
	 a_cols =0 ;
        
        //System.out.print("voila");
	           str=new StringTokenizer(ligne,"\t");
	           while(str.hasMoreTokens()){
	      //  System.out.print(H[a_cols][m_rows]);
                        H[m_rows][a_cols]=str.nextToken();
	            
	            a_cols++;
                    // System.out.println(H[m_rows][a_cols]);
	           }
                     m_rows++;
	           //System.out.println("nombre ligne"+m_rows);
	        
	             rows_data=m_rows;
	            cols_data=a_cols;
	       }   
       chaine+=ligne+"\n" ;
        
       
        //pour kohonen
       this.jLabel12.setText(H[0][0]);
       this.jLabel13.setText(H[0][1]);
       this.jLabel14.setText(H[0][2]);
//pour grosssberg
        System.out.println(H[1][1]);
         this.jLabel17.setText(H[2][0]);
       this.jLabel19.setText(H[2][1]);
       this.jLabel21.setText(H[2][2]);
// this.jTextArea1.setText(this.jTextArea1.getText()+chaine);
        /* String t[] = null ;
        int i =0 ;
          StringTokenizer st3 ;
      BufferedReader  sortie_data=new BufferedReader(new FileReader("INFO.txt"));
	          while((ligne1=sortie_data.readLine())!=null){
	           
                    st3 = new StringTokenizer(ligne1,"\n");
	           while(st3.hasMoreTokens()){
	           
	           t[i]=st3.nextToken() ;
	           i++ ;
	           
	           }
	           
	          
	       }
                
         this.jLabel6.setText(t[0]);
        this.jLabel7.setText(t[1]);
        this.jLabel8.setText(t[2]); */
        d.close(); 	
    }  catch (Exception et){
			System.out.println(et.toString());
		}
    
    try{
         
         File fichier=new File("Node.txt");
     
	FileReader F=new FileReader(fichier);
	BufferedReader L=new BufferedReader(F);
	
       
        while ((ligne=L.readLine())!=null){
            chaine+=ligne+"\n";
        }
        this.jTextArea2.setText("\n");
        this.jTextArea2.setText(this.jTextArea2.getText()+chaine);
        chaine="";
        
           
       
        
        L.close(); 	
    // p1.setVisible(true);
     }		
		catch (Exception et){
			System.out.println(et.toString());
		}
    
    
    //enregestre saliar net et le max mensuel
    
            
        
          // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
      test1 yt =new test1();
      this.setVisible(false);
      yt.setVisible(true);
              
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
          appren p =new appren();
        this.setVisible(false);
        p.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    // End of variables declaration//GEN-END:variables

    private String Stringval(double H) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
