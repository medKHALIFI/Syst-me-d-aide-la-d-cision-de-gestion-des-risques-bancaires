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
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author simo
 */
public class test1 extends javax.swing.JFrame {

    /**
     * Creates new form test1
     */
    public test1() {
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

        jPanel1 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField12 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(791, 500));

        jPanel1.setLayout(null);

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 255));
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(170, 100, 120, 21);

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(0, 0, 255));
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField5);
        jTextField5.setBounds(170, 190, 120, 21);

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 0, 255));
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(170, 130, 120, 21);

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 0, 255));
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(170, 160, 120, 20);

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(0, 0, 255));
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField6);
        jTextField6.setBounds(170, 220, 120, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 204, 255));
        jLabel10.setText("Region");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 240, 60, 40);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Afficher");
        jButton1.setAutoscrolls(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(370, 440, 100, 25);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Le Test de risque");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 10, 350, 60);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 204, 255));
        jLabel5.setText("Corps");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 120, 60, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 204, 255));
        jLabel4.setText("Cadre");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 150, 80, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 204, 255));
        jLabel8.setText("Grad");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 180, 90, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 204, 255));
        jLabel7.setText("Categorie");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 90, 90, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 204, 255));
        jLabel9.setText("Echelle");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 210, 100, 40);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("Créditeur");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 290, 80, 20);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 255));
        jLabel15.setText("Crédit Demandé ");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(10, 310, 130, 40);

        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(0, 0, 255));
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField8);
        jTextField8.setBounds(170, 290, 200, 21);

        jTextField10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(0, 0, 255));
        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField10KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField10);
        jTextField10.setBounds(170, 320, 200, 21);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("Mensuel");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 350, 110, 20);

        jTextField1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 255));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(170, 350, 200, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 255));
        jLabel12.setText("Salaire Nette");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(10, 380, 120, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 255));
        jLabel13.setText("Max Mensuel");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(10, 410, 90, 20);

        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(0, 0, 255));
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField9);
        jTextField9.setBounds(170, 410, 200, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 255));
        jLabel14.setText("LE RESTE");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(520, 90, 90, 20);

        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(0, 0, 255));
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField7);
        jTextField7.setBounds(170, 250, 120, 21);

        jTextField11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(0, 0, 255));
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jTextField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField11KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField11);
        jTextField11.setBounds(170, 380, 200, 20);

        jToggleButton1.setBackground(new java.awt.Color(0, 0, 0));
        jToggleButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setText("Retoure");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1);
        jToggleButton1.setBounds(590, 440, 90, 25);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Quitte");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(690, 440, 90, 23);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Montant");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(480, 440, 100, 25);

        jTextField12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(jTextField12);
        jTextField12.setBounds(170, 70, 120, 21);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 204, 255));
        jLabel2.setText("Age");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 64, 90, 20);

        jLabel1.setForeground(new java.awt.Color(153, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\simo\\Documents\\NetBeansProjects\\Pfe\\Article-Deep-learning.jpg")); // NOI18N
        jLabel1.setText("Nom");
        jLabel1.setPreferredSize(new java.awt.Dimension(791, 500));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 791, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 791, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          // TODO add your handling code here:
          int m=0,a=0,cols=0,rows=0,g=0;
        int  iter=0;
        double []poids=new double[50];
        for(int i=0;i<50;i++)
            poids[i]=0 ;
        Node n =new Node();
        double h =Double.valueOf(this.jTextField2.getText());
        
         double b =Double.valueOf(this.jTextField3.getText());
          double c =Double.valueOf(this.jTextField4.getText());
          double d =Double.valueOf(this.jTextField5.getText());
          double e =Double.valueOf(this.jTextField6.getText());
           double f =Double.valueOf(this.jTextField7.getText());
          
         double[][] matr={{h,b,c,d,e,f}};
	    		    try {
                                Maps M =new Maps();
                                 iter=M.appretissage(matr);
                               System.out.println(iter);
                     
        File fi=new File("sortiegross.txt");
	FileReader F1;
        
            F1 = new FileReader(fi);
         
        
	String ligne2;
     
	
     
     StringTokenizer st;
     BufferedReader sortie_poids=null;
          sortie_poids=new BufferedReader(new FileReader("sortiegross.txt"));
		
           while((ligne2=sortie_poids.readLine())!=null){
              a=0;
              st=new StringTokenizer(ligne2," ");
           
              
              poids[m]=Double.valueOf(st.nextToken()).doubleValue();
            //  ner[m].Weight_of_Node[a]=poids[m][a];
             
               
              
             // g++;
             m++;
              rows=m;
              cols=a;
            
              
          }
    
                               
                               
                               
					} catch (IOException e1) {
						e1.printStackTrace();
					}
        String chaine="ff";
        chaine = chaine.valueOf(poids[iter]) ;
        this.jTextField1.setText(chaine);
      System.out.print(poids[iter] );
      
        double traite = Double.valueOf(this.jTextField1.getText()).doubleValue();
      double debit= Double.valueOf(this.jTextField8.getText()).doubleValue();
      double cridit=(traite*debit)/100 ;
        System.out.println("le cridiet"+cridit);
      double vv =(traite*100)/45 ;
      this.jTextField11.setText(String.valueOf(vv));
      double total  =  traite-cridit ;
      this.jTextField9.setText(String.valueOf(total) );
     //double  pourcantage= (debit*100)/total ;
     // this.jTextField10.setText(String.valueOf(pourcantage));
     
 
     //le test de risque 
     double s =Double.valueOf(this.jTextField10.getText()).doubleValue();
      s=(traite*s)/100 ;
        System.out.println(s);
     double zz  =  (total-s) ;
        System.out.println(zz);
        if(zz>=0){
       JOptionPane.showMessageDialog(null, " personne admissible ", "Risque",
    						JOptionPane.INFORMATION_MESSAGE);
        }else{
       JOptionPane.showMessageDialog(null, " personne risqué ", "Risque",
    						JOptionPane.INFORMATION_MESSAGE);
        }
        
        PrintWriter si=null;
        try {
            si =new PrintWriter(new FileWriter(new File("montant.txt")));
        } catch (IOException ex) {
            Logger.getLogger(test1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       si.print(this.jTextField1.getText());
       si.print("\t");
       si.print(this.jTextField11.getText());
       si.print("\t");
       si.print(this.jTextField9.getText());
        si.print("\t");
       si.print(this.jTextField12.getText());
       si.println();
       
       si.close();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        vainceur P=new vainceur();

        this.setVisible(false);
        P.setVisible(true);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
if((evt.getKeyChar()<'0')||(evt.getKeyChar()>'9'))
						if(evt.getKeyChar()!='.')
							 evt.setKeyChar((char)0);        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
if((evt.getKeyChar()<'0')||(evt.getKeyChar()>'9'))
						if(evt.getKeyChar()!='.')
							 evt.setKeyChar((char)0);          // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
if((evt.getKeyChar()<'0')||(evt.getKeyChar()>'9'))
						if(evt.getKeyChar()!='.')
							 evt.setKeyChar((char)0);          // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
if((evt.getKeyChar()<'0')||(evt.getKeyChar()>'9'))
						if(evt.getKeyChar()!='.')
							 evt.setKeyChar((char)0);          // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
if((evt.getKeyChar()<'0')||(evt.getKeyChar()>'9'))
						if(evt.getKeyChar()!='.')
							 evt.setKeyChar((char)0);          // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyTyped
if((evt.getKeyChar()<'0')||(evt.getKeyChar()>'9'))
						if(evt.getKeyChar()!='.')
							 evt.setKeyChar((char)0);          // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7KeyTyped

    private void jTextField8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyTyped
if((evt.getKeyChar()<'0')||(evt.getKeyChar()>'9'))
						if(evt.getKeyChar()!='.')
							 evt.setKeyChar((char)0);          // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8KeyTyped

    private void jTextField10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyTyped
if((evt.getKeyChar()<'0')||(evt.getKeyChar()>'9'))
						if(evt.getKeyChar()!='.')
							 evt.setKeyChar((char)0);          // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10KeyTyped

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped

						
							 evt.setKeyChar((char)0);          // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyTyped
evt.setKeyChar((char)0);          // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11KeyTyped

    private void jTextField9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyTyped
evt.setKeyChar((char)0);          // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9KeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
  Montaux m=new Montaux();
  this.setVisible(false);
        m.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(test1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(test1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(test1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(test1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new test1().setVisible(true);
            }
        });
    }

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
