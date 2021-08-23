/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proje;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Party_Selection extends javax.swing.JFrame {
    private String partyName;
     public static ArrayList<String> candidates = new ArrayList<>();
     public static  ArrayList<String> secim = new ArrayList<>();
     public static  ArrayList<Integer> tut= new ArrayList<>();
    public static  ArrayList<String> list= new ArrayList<>();
    public static ArrayList<String> partya = new ArrayList<>();

    
    
    /**
     * Creates new form Party_Selection
     */
    public Party_Selection() {

        
        
        initComponents();
        
        a();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Party Selection");
        
    }
    public void a(){
        jRadioButton1.setActionCommand("A");
        jRadioButton2.setActionCommand("B");
        jRadioButton3.setActionCommand("C");
        jRadioButton4.setActionCommand("D");
        jRadioButton5.setActionCommand("E");
        jRadioButton6.setActionCommand("F");
        jRadioButton7.setActionCommand("G");
        jRadioButton8.setActionCommand("H");
        jRadioButton9.setActionCommand("I");
        jRadioButton10.setActionCommand("J");
        jRadioButton11.setActionCommand("K");
        jRadioButton12.setActionCommand("L");  
        jRadioButton13.setActionCommand("NONE");
    }
    public void b(ArrayList<String> partya,String partyName)throws FileNotFoundException, ParseException, IOException{
        
        try{
         File file=new File("fileName.txt");
         FileWriter f=new FileWriter("Degerler.txt",true);
         f.write(System.getProperty("line.separator"));

         if(!file.exists()){
             file.createNewFile();
             
         }
        secim.add("A partisine 1 oy");

         readFile(candidates , "candidates.txt");
    
            System.out.println("Done");
            
         if(partyName=="A"){
             
           for (int i = 0; i < 28; i++) {
            partya.add(candidates.get(i));
        }  
           list.add("A");
           f.write("a");
           
           
         }
         if(partyName=="B"){
           for (int i = 28; i < 56; i++) {
            partya.add(candidates.get(i));
        }
           f.write("b");
           System.out.println("Done");
         }
         if(partyName=="C"){
           for (int i = 56; i < 84; i++) {
            partya.add(candidates.get(i));
        }
           f.write("c");
         }
           
         if(partyName=="D"){
           for (int i = 84; i < 112; i++) {
            partya.add(candidates.get(i));
               
        }f.write("d");
         }
         if(partyName=="E"){
           for (int i = 112; i < 140; i++) {
            partya.add(candidates.get(i));
        }f.write("e");
         }
         if(partyName=="F"){
           for (int i = 140; i < 168; i++) {
            partya.add(candidates.get(i));
        }f.write("f");
         }
         if(partyName=="G"){
           for (int i = 168; i < 196; i++) {
            partya.add(candidates.get(i));
        }f.write("g");
         }
           
         if(partyName=="H"){
           for (int i = 196; i < 224; i++) {
            partya.add(candidates.get(i));
        }f.write("h");
         }
          if(partyName=="I"){
           for (int i = 224; i < 252; i++) {
            partya.add(candidates.get(i));
        }f.write("ı");
         }
         if(partyName=="J"){
           for (int i = 252; i < 280; i++) {
            partya.add(candidates.get(i));
        }f.write("j");
         }
         if(partyName=="K"){
           for (int i = 280; i < 308; i++) {
            partya.add(candidates.get(i));
        }f.write("k");
         }
           
         if(partyName=="L"){
           for (int i = 308; i < 336; i++) {
            partya.add(candidates.get(i));
        }f.write("l");
         }
         if(partyName=="NONE"){
             for(int i=0;i<336;i++){
                 partya.add(candidates.get(i));
             }
             
         }
         //pw.println(secim);
         //pw1.print(tut);
         
          f.close();
          //pw.close();
        }
        catch(IOException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error while creating");
        }
         
          
    }
         
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    ArrayList<String> party1 = new ArrayList<>();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("A");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("B");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("C");

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("D");

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("E");

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setText("F");

        buttonGroup1.add(jRadioButton7);
        jRadioButton7.setText("G");

        buttonGroup1.add(jRadioButton8);
        jRadioButton8.setText("H");

        buttonGroup1.add(jRadioButton9);
        jRadioButton9.setText("I");

        buttonGroup1.add(jRadioButton10);
        jRadioButton10.setText("J");

        buttonGroup1.add(jRadioButton11);
        jRadioButton11.setText("K");

        buttonGroup1.add(jRadioButton12);
        jRadioButton12.setText("L");

        buttonGroup1.add(jRadioButton13);
        jRadioButton13.setText("None");

        jButton1.setText("Continue");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Which party will you vote for?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton13)
                        .addGap(119, 119, 119)
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton5)
                            .addComponent(jRadioButton6)
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton7)
                            .addComponent(jRadioButton8)
                            .addComponent(jRadioButton9)
                            .addComponent(jRadioButton10)
                            .addComponent(jRadioButton11)
                            .addComponent(jRadioButton12))
                        .addGap(125, 125, 125))))
            .addGroup(layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 153, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton5)
                            .addComponent(jRadioButton11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton6)
                            .addComponent(jRadioButton12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton13)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        partyName=buttonGroup1.getSelection().getActionCommand();
        System.out.println(partyName); 
        
        
        try {
            b(partya,partyName);
        } catch (ParseException ex) {
            Logger.getLogger(Party_Selection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Party_Selection.class.getName()).log(Level.SEVERE, null, ex);
        }
     
        if(partyName!="NONE"){
                setVisible(false);
                Candidate tp =new Candidate(partyName,partya);
                tp.setVisible(true);
        }
        else{
            PartyIndependent obj5 = null; 
            try {
                obj5 = new  PartyIndependent(partyName,partya);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Party_Selection.class.getName()).log(Level.SEVERE, null, ex);
            }
            obj5.setVisible(true);
            
        }
        
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
                        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Party_Selection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Party_Selection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Party_Selection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Party_Selection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Party_Selection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    // End of variables declaration//GEN-END:variables

    private void readFile(ArrayList<String> candidates, String candidatestxt) throws FileNotFoundException {
        List<String> candidateList = new ArrayList<>(1000);
        Scanner fileInput = new Scanner(new File(candidatestxt));
        while (fileInput.hasNextLine()) {
            candidateList.add(fileInput.nextLine());
        }
        candidates.addAll(candidateList);
    }
    
    private void readFile1(ArrayList<Integer> candidates, String candidatestxt) throws FileNotFoundException {
        List<Integer> candidateList = new ArrayList<>(1000);
        Scanner fileInput = new Scanner(new File(candidatestxt));
        while (fileInput.hasNextLine()) {
            candidateList.add(fileInput.nextInt());
        }
        candidates.addAll(candidateList);
    }

   


}
