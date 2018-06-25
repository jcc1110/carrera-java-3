/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cajero.views;

import com.cajero.controllers.LoginController;

/**
 * Vista que contiene el menu de operaciones
 * @author nellybett
 * @version 1.0.0
 */
public class Operaciones extends javax.swing.JFrame {

    /**
     * Creates new form Operaciones
     * @param persona
     */
    public Operaciones(LoginController persona) {
        initComponents();
        this.controller=persona;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButtonResumen = new javax.swing.JButton();
        jButtonRetiro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonDeposito = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Cambio de Clave");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonResumen.setText("Resumen");
        jButtonResumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResumenActionPerformed(evt);
            }
        });

        jButtonRetiro.setText("Retiro");
        jButtonRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRetiroActionPerformed(evt);
            }
        });

        jLabel1.setText("OPERACIONES");

        jButtonDeposito.setText("Deposito");
        jButtonDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDepositoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel1)
                .addGap(0, 164, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(jButtonDeposito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRetiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonResumen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jButtonResumen)
                .addGap(18, 18, 18)
                .addComponent(jButtonRetiro)
                .addGap(18, 18, 18)
                .addComponent(jButtonDeposito)
                .addGap(12, 12, 12)
                .addComponent(jButton1)
                .addGap(0, 68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonResumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResumenActionPerformed
        // TODO add your handling code here:
        
        Resumen summary=new Resumen(this.controller);
        this.dispose();
        summary.setVisible(true);
    }//GEN-LAST:event_jButtonResumenActionPerformed

    private void jButtonRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetiroActionPerformed
        // TODO add your handling code here:
        Retiro retirar=new Retiro(this.controller);
        this.dispose();
        retirar.setVisible(true);
    }//GEN-LAST:event_jButtonRetiroActionPerformed

    private void jButtonDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDepositoActionPerformed
        // TODO add your handling code here:
        Deposito deposit=new Deposito(this.controller);
        this.dispose();
        deposit.setVisible(true);
    }//GEN-LAST:event_jButtonDepositoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CambioClave passwordChange=new CambioClave(this.controller);
        this.dispose();
        passwordChange.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

 private LoginController controller;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonDeposito;
    private javax.swing.JButton jButtonResumen;
    private javax.swing.JButton jButtonRetiro;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
