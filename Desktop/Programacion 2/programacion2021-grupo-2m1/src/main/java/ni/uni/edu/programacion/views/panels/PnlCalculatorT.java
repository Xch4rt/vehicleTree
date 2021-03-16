/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.uni.edu.programacion.views.panels;

import javax.swing.JButton;
import javax.swing.JTextField;
/**
 *
 * @author Pablo
 */
public class PnlCalculatorT extends javax.swing.JPanel {

    /**
     * Creates new form PnlCalculatorT
     */
    public PnlCalculatorT() {
        initComponents();
    }
    // generamos getters n setter de los txt field de input y output
    // asi mismo de los buttons 
    public JButton getBtnCel() {
        return btnCel;
    }

    public void setBtnCel(JButton btnCel) {
        this.btnCel = btnCel;
    }

    public JButton getBtnFah() {
        return btnFah;
    }

    public void setBtnFah(JButton btnFah) {
        this.btnFah = btnFah;
    }

    public JButton getBtnNew() {
        return btnNew;
    }

    public void setBtnNew(JButton btnNew) {
        this.btnNew = btnNew;
    }

    public JTextField getTxtField() {
        return txtField;
    }

    public void setTxtField(JTextField txtField) {
        this.txtField = txtField;
    }

    public JTextField getTxtResult() {
        return txtResult;
    }

    public void setTxtResult(JTextField txtResult) {
        this.txtResult = txtResult;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        btnFah = new javax.swing.JButton();
        btnCel = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtResult = new javax.swing.JTextField();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        btnFah.setText("Fahrenheit");
        jPanel1.add(btnFah);

        btnCel.setText("Celcius");
        jPanel1.add(btnCel);

        btnNew.setText("Nuevo");
        jPanel1.add(btnNew);

        add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Temperatura Inicial");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(jLabel1, gridBagConstraints);

        txtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(txtField, gridBagConstraints);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Resultado");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(jLabel3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(txtResult, gridBagConstraints);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCel;
    private javax.swing.JButton btnFah;
    private javax.swing.JButton btnNew;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtField;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables
}
