/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.converter.ui;

import com.converter.classes.Converter;
import com.converter.classes.ImpossibleConversion;
import com.converter.utils.UtilForms;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author 57315
 */
public class ConversionForm extends javax.swing.JFrame {

    private final UtilForms util = new UtilForms(this);
    private Converter converter;

    /**
     * Creates new form ConversionForm
     */
    public ConversionForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        util.setRoundedBorder();
        util.moveWindow();
        this.converter = null;
    }
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit()
                                 .getImage(ClassLoader.getSystemResource("com/converter/images/convert-logo.png"));
        return retValue;
    }

    // method to fill the data
    private void fillData() {
        labelTitle.setText(this.converter.getNameConverter());
        for (String item : this.converter.addListItems()) {
            cmbxToConvert.addItem(item);
            cmbxToBeConverted.addItem(item);
        }
    }

    //method to clean the data
    private void cleanData() {
        inputToConvert.setText("");
        cmbxToConvert.removeAllItems();
        cmbxToBeConverted.removeAllItems();
    }

    //public method to set the data
    public void setConversionData(Converter converter) {
        this.converter = converter;
        fillData();
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
        labelTitle = new javax.swing.JLabel();
        buttonExit = new javax.swing.JButton();
        inputToConvert = new javax.swing.JTextField();
        cmbxToConvert = new javax.swing.JComboBox<>();
        cmbxToBeConverted = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        buttonConvert = new javax.swing.JButton();
        buttonBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPaneResult = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(41, 60, 82));

        labelTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(255, 255, 255));
        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

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

        cmbxToConvert.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select..." }));
        cmbxToConvert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cmbxToBeConverted.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select..." }));
        cmbxToBeConverted.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("TO");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Type your value:");

        buttonConvert.setBackground(new java.awt.Color(51, 51, 51));
        buttonConvert.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonConvert.setForeground(new java.awt.Color(255, 255, 255));
        buttonConvert.setText("Convert");
        buttonConvert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConvertActionPerformed(evt);
            }
        });

        buttonBack.setBackground(new java.awt.Color(255, 255, 255));
        buttonBack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonBack.setForeground(new java.awt.Color(0, 0, 0));
        buttonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/converter/images/arrow.png"))); // NOI18N
        buttonBack.setToolTipText("Get back");
        buttonBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonBack.setFocusable(false);
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });

        txtPaneResult.setEditable(false);
        txtPaneResult.setBackground(new java.awt.Color(255, 255, 255));
        txtPaneResult.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        txtPaneResult.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(txtPaneResult);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Output:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("The outcome is an approximate value*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(buttonExit)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(inputToConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbxToConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbxToBeConverted, 0, 166, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(141, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbxToBeConverted, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputToConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbxToConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addComponent(buttonConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(87, 87, 87)
                    .addComponent(jLabel4)
                    .addContainerGap(285, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        System.exit(0);//go out of the app.
    }//GEN-LAST:event_buttonExitActionPerformed

    private void buttonConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConvertActionPerformed
        //condition to validate if the input is empty
        if (inputToConvert.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "You have to type a value!",
                    "¡Empty Field!", JOptionPane.WARNING_MESSAGE);
            //Displays a warning message.
            inputToConvert.requestFocusInWindow(); //Focus is brought to the text field
            return; //exits the method.
        }

        if ((cmbxToConvert.getSelectedIndex()) == 0 || cmbxToBeConverted.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "You have to select a value!",
                    "¡Unselected!", JOptionPane.WARNING_MESSAGE);
            if (cmbxToConvert.getSelectedIndex() == 0) {
                cmbxToConvert.requestFocusInWindow(); 
            } else {
                cmbxToBeConverted.requestFocusInWindow();
            }
            return;
        }

        try {
            double valueToConvert = Double.parseDouble(inputToConvert.getText()); //get input value
            double result = this.converter.calculateValue(valueToConvert,
                    cmbxToConvert.getSelectedItem().toString(),
                    cmbxToBeConverted.getSelectedItem().toString());
            String message = Double.toString(valueToConvert) + " " + cmbxToConvert.getSelectedItem() + " are "
                    + Double.toString(result) + " " + cmbxToBeConverted.getSelectedItem();
            txtPaneResult.setText(message);
        } catch (ImpossibleConversion ex) {
            this.txtPaneResult.setText(ex.getMessage());
        }
    }//GEN-LAST:event_buttonConvertActionPerformed

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        IndexForm indexForm = new IndexForm();
        cleanData();
        indexForm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonBackActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonConvert;
    private javax.swing.JButton buttonExit;
    private javax.swing.JComboBox<String> cmbxToBeConverted;
    private javax.swing.JComboBox<String> cmbxToConvert;
    private javax.swing.JTextField inputToConvert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JTextPane txtPaneResult;
    // End of variables declaration//GEN-END:variables
}
