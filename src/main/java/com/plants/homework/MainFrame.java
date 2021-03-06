/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.plants.homework;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author USER-M
 */
public class MainFrame extends javax.swing.JFrame {
    
    private Plants myPlants= new Plants();

    private Plant tempStorage;
   
    
    private void enableButtons(){
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
    }
    private void disableButtons(){
         jButton3.setEnabled(false);
        jButton4.setEnabled(false);
    }
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        try{  myPlants.fileLoading();
        initComponents();
      disableButtons();}
        catch(Exception e)
      {JOptionPane.showMessageDialog(null, "Can not find the file please make sure that the file in HomeWork top level folder.");}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        plantName = new javax.swing.JTextField();
        plantID = new javax.swing.JTextField();
        plantSize = new javax.swing.JTextField();
        plantDate = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("P.name");

        jLabel2.setText("P.number");

        jLabel3.setText("P.size");

        jLabel4.setText("P.date");

        plantName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plantNameActionPerformed(evt);
            }
        });

        plantID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plantIDActionPerformed(evt);
            }
        });

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savePlant(evt);
            }
        });

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPlant(evt);
            }
        });

        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePlanet(evt);
            }
        });

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePlant(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(plantID)
                    .addComponent(plantName)
                    .addComponent(plantSize)
                    .addComponent(plantDate)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(plantName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(plantID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(plantSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(plantDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void plantNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plantNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plantNameActionPerformed

    private void plantIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plantIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plantIDActionPerformed

    private void updatePlanet(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePlanet
        // TODO add your handling code here:
        try{
        tempStorage.setName(plantName.getText());
        tempStorage.setID(Long.parseLong(plantID.getText()));
        tempStorage.setSize(Double.parseDouble(plantSize.getText()));
        tempStorage.setDate(plantDate.getText());
        
        myPlants.updateFile();
        disableButtons();
        tempStorage = null;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please Enter a valid data.");
        }
    }//GEN-LAST:event_updatePlanet

    private void savePlant(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savePlant
        // TODO add your handling code here:
        if(myPlants.notExist(plantID.getText().replaceAll(" ", "")))
        {myPlants.addPlant(plantName.getText().replaceAll(" ", ""),plantDate.getText().replaceAll(" ", ""),plantID.getText().replaceAll(" ", ""),plantSize.getText().replaceAll(" ", ""));
        }else{
        JOptionPane.showMessageDialog(null, "This number is already exist.");
        }
        
        myPlants.updateFile();
    }//GEN-LAST:event_savePlant

    private void searchPlant(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPlant
        // TODO add your handling code here:
        try{
        tempStorage =myPlants.search(
                plantName.getText().replaceAll(" ", "") , plantDate.getText().replaceAll(" ", "") ,plantID.getText().replaceAll(" ", ""),plantSize.getText().replaceAll(" ", "") 
        );
         if(tempStorage !=null){
             plantID.setText(String.valueOf(tempStorage.getID()) );
             plantName.setText(tempStorage.getName());
             plantDate.setText(tempStorage.getDate());
             plantSize.setText(String.valueOf(tempStorage.getSize()));
             
             
             enableButtons();
         }else{
            JOptionPane.showMessageDialog(null, "CAN NOT BE FOUNDED");
            disableButtons();
         }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please enter a valid data.");
        }
        
    }//GEN-LAST:event_searchPlant

    private void deletePlant(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePlant
     
        myPlants.remove(tempStorage);
        disableButtons();
        tempStorage = null;
        myPlants.updateFile();
        emptyTextfield();
    }//GEN-LAST:event_deletePlant
 
    private void emptyTextfield(){
        plantDate.setText("");
        plantID.setText("");
        plantName.setText("");
        plantSize.setText("");
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField plantDate;
    private javax.swing.JTextField plantID;
    private javax.swing.JTextField plantName;
    private javax.swing.JTextField plantSize;
    // End of variables declaration//GEN-END:variables
}
