/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfe;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author simo
 */
public class appren extends javax.swing.JFrame {
Kohonen ts =new Kohonen();
double[] table=new double[100];
    /**
     * Creates new form appren
     */
    public appren() {
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
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(791, 500));

        jPanel1.setLayout(null);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Apprentissage");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(160, 435, 140, 25);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Annuler");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(310, 435, 140, 25);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Quitter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(610, 435, 140, 25);

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 0, 204));
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(170, 220, 130, 20);

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 0, 204));
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(170, 190, 130, 20);

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 204));
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(170, 160, 130, 20);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 255));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(170, 130, 130, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Erreue_Moyene");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 210, 140, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Taux_d'apprentissage");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 180, 210, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Itération");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 150, 190, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Taille");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 120, 110, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText(" Apprentissage");
        jLabel2.setAutoscrolls(true);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(230, 20, 190, 29);

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Routeur");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(460, 435, 130, 25);

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(0, 51, 255));
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField5);
        jTextField5.setBounds(170, 330, 130, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Iteration maximal");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 320, 140, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Vitesse d'apprentissage");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 350, 180, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("L'erreur");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 370, 140, 50);

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(0, 0, 255));
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField6);
        jTextField6.setBounds(170, 360, 130, 20);

        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(0, 0, 255));
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField7);
        jTextField7.setBounds(170, 390, 130, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 255, 255));
        jLabel10.setText("Grossberg");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(30, 280, 110, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 255, 255));
        jLabel11.setText("Kohonen");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(30, 90, 130, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\simo\\Documents\\NetBeansProjects\\Pfe\\Article-Deep-learning.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(791, 500));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 790, 490);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 791, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 
        
          int dim=0,itermax=0;
                double errmoy,tauxappr;
                dim=Integer.valueOf(this.jTextField1.getText());
                itermax=Integer.valueOf(this.jTextField2.getText());
                
                errmoy = Double.valueOf(this.jTextField4.getText());
                tauxappr = Double.valueOf(this.jTextField3.getText());
        if(dim==0){
    				JOptionPane.showMessageDialog(null, "La carte n\'est pas encore créée !\nDimension = 0", "Apprentissage",
    						JOptionPane.INFORMATION_MESSAGE);
    				
    			}else{
    				if(itermax==0 && errmoy==0 && tauxappr==0){
    					JOptionPane.showMessageDialog(null, "La carte n\'est pas encore initialisée !"
    							+ "\nIl faut initialiser :\n      - Iteration Maximale"
    							+ "\n      - Erreur moyenne"
    							+ "\n      - Taux d\'apprentissage", "Apprentissage",
	    						JOptionPane.INFORMATION_MESSAGE);
	    				
    				}else{
                                    
                              
        try {
              
                if(tauxappr>2.0){
    	        					tauxappr=2.0;
    	        				}
               /* System.out.println(dim);
                System.out.println(itermax);
                System.out.println(errmoy);
                System.out.println(tauxappr);
                */
                 
                
              
                 
                  this.setVisible(false); 
                ts.Tm(table,dim,itermax,errmoy,tauxappr);
               // TRININGG G =new TRININGG();
                //  new vainqueur();
                try {
    	    					Thread.sleep(200);
    	    				} catch (InterruptedException e) {
    	    					e.printStackTrace();
    	    					}
    	        			for(int l=0;l<ts.n/2;l++){
                                        
                                        }
                 Gross g=new Gross();
                  
               
             //  a.setVisible(false);
                //  g.setVisible(true);
 }   catch (IOException ex) {
                Logger.getLogger(appren.class.getName()).log(Level.SEVERE, null, ex);
            }   
                                }
  try {
              itermax=Integer.valueOf(this.jTextField5.getText());
                
                 errmoy = Double.valueOf(this.jTextField7.getText());
                double vappr = Double.valueOf(this.jTextField6.getText());
                 if(vappr>2.0){
    	        					vappr=2.0;
    	        				}
            TRININGG l =new TRININGG(errmoy,itermax,vappr);
           vainceur v =new vainceur(); 
            this.setVisible(false);
            v.setVisible(true);
            // TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(Gross.class.getName()).log(Level.SEVERE, null, ex);
        }
  JOptionPane.showMessageDialog(null, "L\'apprentissage est bien  fait !", "Apprentissage",
    	    						JOptionPane.INFORMATION_MESSAGE);
        }
        
        
   try {
							Thread.sleep(700);
						} catch (InterruptedException g1) {
							g1.printStackTrace();
						}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.jTextField1.setText("");

          this.jTextField2.setText("");
          this.jTextField3.setText("");
          this.jTextField4.setText("");
                  // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        app p =new app();
        this.setVisible(false);
        p.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
if((evt.getKeyChar()<'0')||(evt.getKeyChar()>'9'))
						if(evt.getKeyChar()!='.')
							 evt.setKeyChar((char)0);         // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
if((evt.getKeyChar()<'0')||(evt.getKeyChar()>'9'))
						if(evt.getKeyChar()!='.')
							 evt.setKeyChar((char)0);         // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
if((evt.getKeyChar()<'0')||(evt.getKeyChar()>'9'))
						if(evt.getKeyChar()!='.')
							 evt.setKeyChar((char)0);         // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
if((evt.getKeyChar()<'0')||(evt.getKeyChar()>'9'))
						if(evt.getKeyChar()!='.')
							 evt.setKeyChar((char)0);         // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
if((evt.getKeyChar()<'0')||(evt.getKeyChar()>'9'))
						if(evt.getKeyChar()!='.')
							 evt.setKeyChar((char)0);         // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
if((evt.getKeyChar()<'0')||(evt.getKeyChar()>'9'))
						if(evt.getKeyChar()!='.')
							 evt.setKeyChar((char)0);         // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyTyped
if((evt.getKeyChar()<'0')||(evt.getKeyChar()>'9'))
						if(evt.getKeyChar()!='.')
							 evt.setKeyChar((char)0);         // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7KeyTyped

    
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
