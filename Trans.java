/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package bioproject;
import Translation.Translation;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hyperlink
 */
public class Trans extends javax.swing.JFrame  {
    Translation t1 = new Translation();
     File f = new File("Myfile.txt");
    String dna,com,rna;
    String f1,f2,f3,f4,f5,f6;

    /**
     * Creates new form Trans
     */
    public Trans() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea9 = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea10 = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea11 = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea12 = new javax.swing.JTextArea();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextArea13 = new javax.swing.JTextArea();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTextArea14 = new javax.swing.JTextArea();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTextArea15 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("DNA is");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 75, 38));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("RNA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 56, 25));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextArea2AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 1160, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Complement");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextArea3AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane3.setViewportView(jTextArea3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 1130, 40));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextArea1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 1160, 40));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("5'3' Frame 1");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 70, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("5'3' Frame 2");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 70, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("5'3' Frame 3");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("3'5' Frame 1");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 70, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("3'5' Frame 2");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setText("3'5' Frame 3");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, -1, -1));

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jTextArea4.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextArea4AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane4.setViewportView(jTextArea4);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 570, 40));

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jTextArea5.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextArea5AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane5.setViewportView(jTextArea5);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 570, 40));

        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);
        jTextArea6.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextArea6AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane6.setViewportView(jTextArea6);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 570, 40));

        jTextArea7.setColumns(20);
        jTextArea7.setRows(5);
        jTextArea7.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextArea7AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane7.setViewportView(jTextArea7);

        getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 570, 40));

        jTextArea8.setColumns(20);
        jTextArea8.setRows(5);
        jTextArea8.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextArea8AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane8.setViewportView(jTextArea8);

        getContentPane().add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 570, 40));

        jTextArea9.setColumns(20);
        jTextArea9.setRows(5);
        jTextArea9.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextArea9AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane9.setViewportView(jTextArea9);

        getContentPane().add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, 570, 40));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("ORFs");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 230, 80, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("PROTEINS");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 100, 30));

        jTextArea10.setColumns(20);
        jTextArea10.setRows(5);
        jTextArea10.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextArea10AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane10.setViewportView(jTextArea10);

        getContentPane().add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 270, 570, 40));

        jTextArea11.setColumns(20);
        jTextArea11.setRows(5);
        jTextArea11.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextArea11AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane11.setViewportView(jTextArea11);

        getContentPane().add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 320, 570, 40));

        jTextArea12.setColumns(20);
        jTextArea12.setRows(5);
        jTextArea12.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextArea12AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane12.setViewportView(jTextArea12);

        getContentPane().add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 370, 570, 40));

        jTextArea13.setColumns(20);
        jTextArea13.setRows(5);
        jTextArea13.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextArea13AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane13.setViewportView(jTextArea13);

        getContentPane().add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 440, 570, 40));

        jTextArea14.setColumns(20);
        jTextArea14.setRows(5);
        jTextArea14.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextArea14AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane14.setViewportView(jTextArea14);

        getContentPane().add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 490, 570, 40));

        jTextArea15.setColumns(20);
        jTextArea15.setRows(5);
        jTextArea15.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextArea15AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane15.setViewportView(jTextArea15);

        getContentPane().add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 540, 570, 40));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 10, -1, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 255, 0));
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        pack();
    }// </editor-fold>                        

    private void jTextArea1AncestorAdded(javax.swing.event.AncestorEvent evt) {                                         
        // TODO add your handling code here:
        //t1.getDNA()
       
        try {
            Scanner in = new Scanner(f);
            while(in.hasNext()){
                dna = in.next();
                com = in.next();
                rna = in.next();
                f1 = in.next();
                f2 = in.next();
                f3 = in.next();
                f4 = in.next();
                f5 = in.next();
                f6 = in.next();
            }
            in.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Trans.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jTextArea1.setText(dna);
    }                                        

    private void jTextArea2AncestorAdded(javax.swing.event.AncestorEvent evt) {                                         
        // TODO add your handling code here:
           try {
            Scanner in = new Scanner(f);
            while(in.hasNext()){
                dna = in.next();
                com = in.next();
                rna = in.next();
                f1 = in.next();
                f2 = in.next();
                f3 = in.next();
                f4 = in.next();
                f5 = in.next();
                f6 = in.next();
            }
            in.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Trans.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jTextArea2.setText(rna);
        
    }                                        

    private void jTextArea3AncestorAdded(javax.swing.event.AncestorEvent evt) {                                         
        // TODO add your handling code here:
           try {
            Scanner in = new Scanner(f);
            while(in.hasNext()){
                dna = in.next();
                com = in.next();
                rna = in.next();
                f1 = in.next();
                f2 = in.next();
                f3 = in.next();
                f4 = in.next();
                f5 = in.next();
                f6 = in.next();
            }
            in.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Trans.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jTextArea3.setText(com);
    }                                        

    private void jTextArea4AncestorAdded(javax.swing.event.AncestorEvent evt) {                                         
        // TODO add your handling code here:
            try {
            Scanner in = new Scanner(f);
            while(in.hasNext()){
                dna = in.next();
                com = in.next();
                rna = in.next();
                f1 = in.next();
                f2 = in.next();
                f3 = in.next();
                f4 = in.next();
                f5 = in.next();
                f6 = in.next();
            }
            in.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Trans.class.getName()).log(Level.SEVERE, null, ex);
        }
           f1 = f1.replace('T', 'U');
           String p1= translation(f1);
       jTextArea4.setText(p1);
    }                                        

    private void jTextArea5AncestorAdded(javax.swing.event.AncestorEvent evt) {                                         
        // TODO add your handling code here:

           f2 = f2.replace('T', 'U');
           String p2= translation(f2);
       jTextArea5.setText(p2);  
    }                                        

    private void jTextArea7AncestorAdded(javax.swing.event.AncestorEvent evt) {                                         
        // TODO add your handling code here:
    
           f3 = f3.replace('T', 'U');
           String p3= translation(f3);
       jTextArea7.setText(p3);
    }                                        

    private void jTextArea8AncestorAdded(javax.swing.event.AncestorEvent evt) {                                         
        // TODO add your handling code here:
   
           String p4= translation(f4);
       jTextArea8.setText(p4);
    }                                        

    private void jTextArea6AncestorAdded(javax.swing.event.AncestorEvent evt) {                                         
        // TODO add your handling code here:
       
          
           String p5= translation(f5);
       jTextArea6.setText(p5);
    }                                        

    private void jTextArea9AncestorAdded(javax.swing.event.AncestorEvent evt) {                                         
        // TODO add your handling code here:
     
           String p6= translation(f6);
       jTextArea9.setText(p6);
    }                                        

    private void jTextArea10AncestorAdded(javax.swing.event.AncestorEvent evt) {                                          
        // TODO add your handling code here:
        
                jTextArea10.setText(f1);
                
    }                                         

    private void jTextArea11AncestorAdded(javax.swing.event.AncestorEvent evt) {                                          
        // TODO add your handling code here:
      
                jTextArea11.setText(f2);
        
    }                                         

    private void jTextArea12AncestorAdded(javax.swing.event.AncestorEvent evt) {                                          
        // TODO add your handling code here:
    
                jTextArea12.setText(f3);
    }                                         

    private void jTextArea13AncestorAdded(javax.swing.event.AncestorEvent evt) {                                          
        // TODO add your handling code here:
     
                jTextArea13.setText(f4);
    }                                         

    private void jTextArea14AncestorAdded(javax.swing.event.AncestorEvent evt) {                                          
        // TODO add your handling code here:
    
                jTextArea14.setText(f5);
    }                                         

    private void jTextArea15AncestorAdded(javax.swing.event.AncestorEvent evt) {                                          
        // TODO add your handling code here:
    
                jTextArea15.setText(f6);
    }                                         

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        System.exit(0);
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        setVisible(false);
    new Home().setVisible(true);
    }                                        

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
            java.util.logging.Logger.getLogger(Trans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Trans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Trans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Trans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Trans().setVisible(true);
            }
        });
    }

 public static String translation(String sequence){
char[] s = new char[sequence.length()];
String pro="";

for (int j= 0; j < sequence.length(); j++) {
            s[j] = sequence.charAt(j);
        }
for(int i=0;i<=sequence.length();i=i+3){
    if(i+3>sequence.length()){break;}
	//First Base U
	if(s[i]=='U'){
	    if(s[i+1]=='U'){
		    if(s[i+2]=='U'|| s[i+2]=='C'){
                        pro = pro +"F";
			}
            else if(s[i+2]=='A'|| s[i+2]=='G'){
                pro = pro +"L";
			
            }
		}

	    else if(s[i+1]=='C'){
	    	if(s[i+2]=='U'|| s[i+2]=='C' || s[i+2]=='A' || s[i+2]=='G'){
                     pro = pro +"S";
	    	
                }
		}
		else if(s[i+1]=='A'){
	        if(s[i+2]=='U'|| s[i+2]=='C'){
                     pro = pro +"Y";
	        }
	        else if(s[i+2]=='A' || s[i+2]=='G'){
                     pro = pro +"*";
	         }	
			}
		else if(s[i+1]=='G'){
	        if(s[i+2]=='U'|| s[i+2]=='C'){
	         pro = pro +"C";}
	        else if(s[i+2]=='A' || s[i+2]=='G'){
                     pro = pro +"*";
	         
                }
                
			}
               
		}
	//First Base C
	else if(s[i]=='C'){
	    if(s[i+1]=='U'){
		    if(s[i+2]=='U'|| s[i+2]=='C'||s[i+2]=='A'|| s[i+2]=='G'){
                         pro = pro +"L";
			
                    }	
	    }
	    else if(s[i+1]=='C'){
		    if(s[i+2]=='U'|| s[i+2]=='C'||s[i+2]=='A'|| s[i+2]=='G'){
                         pro = pro +"P";
			
                    }	
	    }
	    else if(s[i+1]=='A'){
	    	if(s[i+2]=='U'|| s[i+2]=='C'){
                     pro = pro +"H";
	    	
                }
	    	else if(s[i+2]=='A' || s[i+2]=='G'){
                     pro = pro +"Q";
	    	
                }
		}
		
		else if(s[i+1]=='G'){
		    if(s[i+2]=='U'|| s[i+2]=='C'||s[i+2]=='A'|| s[i+2]=='G'){
                         pro = pro +"R";

                    }			

        }
    }
        //First Base A
	else if(s[i]=='A'){
	    if(s[i+1]=='U'){
		    if(s[i+2]=='U'|| s[i+2]=='C'||s[i+2]=='A' ){
                         pro = pro +"I";
			
                    }	
		    else if(s[i+2]=='G'){
                         pro = pro +"M";
			
                    }
	    }
	    else if(s[i+1]=='C'){
	    	if(s[i+2]=='U'|| s[i+2]=='C'||s[i+2]=='A'|| s[i+2]=='G'){
                     pro = pro +"T";
	    	
                }

		}
		
		else if(s[i+1]=='A'){
		    if(s[i+2]=='U'|| s[i+2]=='C'){
                         pro = pro +"N";
	    	
                    }
	    	else if(s[i+2]=='A' || s[i+2]=='G'){
                     pro = pro +"K";
	    
                }		

        }
        else if(s[i+1]=='G'){
		    if(s[i+2]=='U'|| s[i+2]=='C'){
                         pro = pro +"S";
	    	
                    }
	    	else if(s[i+2]=='A' || s[i+2]=='G'){
                     pro = pro +"R";
	    	
                }		

        }
    }
        //First Base G
	else if(s[i]=='G'){
	    if(s[i+1]=='U'){
	    if(s[i+2]=='U'|| s[i+2]=='C'||s[i+2]=='A'|| s[i+2]=='G'){
                 pro = pro +"V";
	    
            }
	    }
	    else if(s[i+1]=='C'){
	    	if(s[i+2]=='U'|| s[i+2]=='C'||s[i+2]=='A'|| s[i+2]=='G'){
                     pro = pro +"A";
	    
                }

		}
		else if(s[i+1]=='A'){
		    if(s[i+2]=='U'|| s[i+2]=='C'){
                         pro = pro +"D";
	    
                    }
	    	else if(s[i+2]=='A' || s[i+2]=='G'){
                     pro = pro +"E";
	    
                }		

        }
        else if(s[i+1]=='G'){
		    if(s[i+2]=='U'|| s[i+2]=='C'||s[i+2]=='A'|| s[i+2]=='G'){
                         pro = pro +"G";
	    	
                    }	

        }
	}
	
	
	
}//FOR LOOP
return pro;
}
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea10;
    private javax.swing.JTextArea jTextArea11;
    private javax.swing.JTextArea jTextArea12;
    private javax.swing.JTextArea jTextArea13;
    private javax.swing.JTextArea jTextArea14;
    private javax.swing.JTextArea jTextArea15;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextArea jTextArea9;
    // End of variables declaration                   
}