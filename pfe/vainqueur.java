/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.*;
/**
 *
 * @author pc
 */
public class vainqueur extends JFrame{
    Panneau P= new Panneau();
    JTextField van=new JTextField("");
    JPanel p=new JPanel();
    JTextArea t=new JTextArea();
    JScrollPane scroll = new JScrollPane(t);
    
    JLabel l=new JLabel();
   JButton b=new JButton("afficher les vaiqueur");
   JButton b1=new JButton("affichee les neurons");
    public vainqueur() throws FileNotFoundException, IOException{
        this.setTitle("vainqueur");
        this.setSize(700,500);
        this.setVisible(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setContentPane(p);
        P.setLayout(new BoxLayout(P, BoxLayout.Y_AXIS));
        Font police =new Font("Arial",Font.BOLD,16);
        P.add(l);
        l.setText("voila les neurons vainqueur");
        l.setFont(police);
        P.add(t);
        P.add(b);
        
        int i =0,j=0,m[][] = null,p,k;
        String l,d = null;
        StringTokenizer str ;
        
b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 
//To change body of generated methods, choose Tools | Templates.
     try{
         
         File fichier=new File("sortied.txt");
     
	FileReader F=new FileReader(fichier);
	BufferedReader L=new BufferedReader(F);
	String ligne;
        String chaine="";
        while ((ligne=L.readLine())!=null){
            chaine+=ligne+"\n";
        }
        
              File fi=new File("sortiegross.txt");
     
	FileReader F1=new FileReader(fi);
	BufferedReader L1=new BufferedReader(F1);
	String ligne1;
        
        while ((ligne1=L1.readLine())!=null){
            chaine+=ligne1+"\n";
        }
        
        t.setText(chaine);
       
        
        L.close(); 		}		
		catch (Exception et){
			System.out.println(et.toString());
		}
        
            }
        });
  
        
        this.setContentPane(P);
}
        
        
     /*   b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // t.setText("vooila les neurons vainqueur");
       }
        });
    
        p.add(b1);
        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               
            }
        });
*/
             }

    

