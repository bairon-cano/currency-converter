/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.converter.ui;

import com.converter.utils.UtilForms;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author 57315
 */
public class IndexForm extends javax.swing.JFrame {
    private final UtilForms util;
    /**
     * Creates new form Index
     */
    public IndexForm() {
        this.util = new UtilForms(this);
        initComponents();
        this.setLocationRelativeTo(null);
        util.setRoundedBorder();
        util.moveWindow();
    }
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit()
                                 .getImage(ClassLoader.getSystemResource("com/converter/images/convert-logo.png"));
        return retValue;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buttonTemperature = new javax.swing.JButton();
        buttonLength = new javax.swing.JButton();
        buttonAbout = new javax.swing.JButton();
        buttonCurrency = new javax.swing.JButton();
        buttonSpeed = new javax.swing.JButton();
        buttonTime = new javax.swing.JButton();
        buttonDataSize = new javax.swing.JButton();
        buttonExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 168, 198));
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(600, 600));

        jPanel1.setBackground(new java.awt.Color(11, 50, 127));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¡Welcome to your converter!");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("What do you want to convert?");

        buttonTemperature.setBackground(new java.awt.Color(51, 51, 51));
        buttonTemperature.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonTemperature.setForeground(new java.awt.Color(255, 255, 255));
        buttonTemperature.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/converter/images/temperature.png"))); // NOI18N
        buttonTemperature.setText("Temperature");
        buttonTemperature.setToolTipText("Temperature");
        buttonTemperature.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonTemperature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTemperatureActionPerformed(evt);
            }
        });

        buttonLength.setBackground(new java.awt.Color(51, 51, 51));
        buttonLength.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonLength.setForeground(new java.awt.Color(255, 255, 255));
        buttonLength.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/converter/images/length.png"))); // NOI18N
        buttonLength.setText("Length");
        buttonLength.setToolTipText("Length");
        buttonLength.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLengthActionPerformed(evt);
            }
        });

        buttonAbout.setBackground(new java.awt.Color(51, 51, 51));
        buttonAbout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonAbout.setForeground(new java.awt.Color(255, 255, 255));
        buttonAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/converter/images/about.png"))); // NOI18N
        buttonAbout.setText("About");
        buttonAbout.setToolTipText("About");
        buttonAbout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAboutActionPerformed(evt);
            }
        });

        buttonCurrency.setBackground(new java.awt.Color(51, 51, 51));
        buttonCurrency.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonCurrency.setForeground(new java.awt.Color(255, 255, 255));
        buttonCurrency.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/converter/images/currency.png"))); // NOI18N
        buttonCurrency.setText("Currency");
        buttonCurrency.setToolTipText("Currency");
        buttonCurrency.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonCurrency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCurrencyActionPerformed(evt);
            }
        });

        buttonSpeed.setBackground(new java.awt.Color(51, 51, 51));
        buttonSpeed.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonSpeed.setForeground(new java.awt.Color(255, 255, 255));
        buttonSpeed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/converter/images/speed.png"))); // NOI18N
        buttonSpeed.setText("Speed");
        buttonSpeed.setToolTipText("Speed");
        buttonSpeed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonSpeed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSpeedActionPerformed(evt);
            }
        });

        buttonTime.setBackground(new java.awt.Color(51, 51, 51));
        buttonTime.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonTime.setForeground(new java.awt.Color(255, 255, 255));
        buttonTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/converter/images/time.png"))); // NOI18N
        buttonTime.setText("Time");
        buttonTime.setToolTipText("Time");
        buttonTime.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTimeActionPerformed(evt);
            }
        });

        buttonDataSize.setBackground(new java.awt.Color(51, 51, 51));
        buttonDataSize.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonDataSize.setForeground(new java.awt.Color(255, 255, 255));
        buttonDataSize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/converter/images/byte.png"))); // NOI18N
        buttonDataSize.setText("Data");
        buttonDataSize.setToolTipText("Data Size");
        buttonDataSize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonDataSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDataSizeActionPerformed(evt);
            }
        });

        buttonExit.setBackground(new java.awt.Color(255, 255, 255));
        buttonExit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonExit.setForeground(new java.awt.Color(0, 0, 0));
        buttonExit.setText("X");
        buttonExit.setToolTipText("Exit");
        buttonExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonExit.setFocusable(false);
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonExit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(buttonCurrency)
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(buttonAbout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buttonDataSize, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buttonTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addComponent(buttonSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(buttonTime, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(220, 220, 220)
                                .addComponent(buttonLength, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(buttonExit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(12, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCurrency)
                    .addComponent(buttonTemperature)
                    .addComponent(buttonSpeed))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonDataSize)
                    .addComponent(buttonLength)
                    .addComponent(buttonTime))
                .addGap(30, 30, 30)
                .addComponent(buttonAbout)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAboutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAboutActionPerformed

    private void buttonSpeedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSpeedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSpeedActionPerformed

    private void buttonTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonTimeActionPerformed

    private void buttonDataSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDataSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonDataSizeActionPerformed

    private void buttonLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLengthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonLengthActionPerformed

    private void buttonCurrencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCurrencyActionPerformed
        ConversionForm currencyForm = new ConversionForm();
        currencyForm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonCurrencyActionPerformed

    private void buttonTemperatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTemperatureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonTemperatureActionPerformed

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        System.exit(0);//go out of the app.
    }//GEN-LAST:event_buttonExitActionPerformed

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
            java.util.logging.Logger.getLogger(IndexForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IndexForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IndexForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IndexForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new IndexForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAbout;
    private javax.swing.JButton buttonCurrency;
    private javax.swing.JButton buttonDataSize;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonLength;
    private javax.swing.JButton buttonSpeed;
    private javax.swing.JButton buttonTemperature;
    private javax.swing.JButton buttonTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}