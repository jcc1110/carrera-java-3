package com.gcta.vistas;
import com.gcta.bd.BaseDatos;
import com.gcta.bd.Usuario;
import com.gcta.operaciones.Validacion;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Frame visual del programa.
 * @author Gabriel Costanza y Constantino Alves.
 * @version 1.0.0
 */
public class FramePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FramePrincipal
     */
    public FramePrincipal() {
        initComponents();
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
        tarjetatext = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        contratext = new javax.swing.JTextField();
        Botonentrar = new javax.swing.JButton();
        BotonSalida = new javax.swing.JButton();
        Opcilabel = new javax.swing.JLabel();
        ConsultaBoton = new javax.swing.JButton();
        RetiroBoton = new javax.swing.JButton();
        DepositoBoton = new javax.swing.JButton();
        ClaveBoton = new javax.swing.JButton();
        login = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cajero Automatico");

        jLabel1.setText("Tarjeta:");

        jLabel2.setText("Contraseña:");

        Botonentrar.setBackground(new java.awt.Color(102, 255, 102));
        Botonentrar.setText("Entrar");
        Botonentrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonentrarActionPerformed(evt);
            }
        });

        BotonSalida.setBackground(new java.awt.Color(255, 51, 51));
        BotonSalida.setText("Salida");
        BotonSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalidaActionPerformed(evt);
            }
        });

        Opcilabel.setText("Opciones:");

        ConsultaBoton.setText("Consulta");
        ConsultaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaBotonActionPerformed(evt);
            }
        });

        RetiroBoton.setText("Retiro");
        RetiroBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetiroBotonActionPerformed(evt);
            }
        });

        DepositoBoton.setText("Depósito");
        DepositoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositoBotonActionPerformed(evt);
            }
        });

        ClaveBoton.setText("Cambiar Clave");
        ClaveBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClaveBotonActionPerformed(evt);
            }
        });

        login.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tarjetatext, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(contratext, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Botonentrar))
                            .addComponent(login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(BotonSalida)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Opcilabel)
                            .addComponent(ConsultaBoton))
                        .addGap(18, 18, 18)
                        .addComponent(RetiroBoton)
                        .addGap(18, 18, 18)
                        .addComponent(DepositoBoton)
                        .addGap(18, 18, 18)
                        .addComponent(ClaveBoton)
                        .addGap(40, 40, 40))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tarjetatext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(contratext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botonentrar)
                    .addComponent(BotonSalida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Opcilabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConsultaBoton)
                    .addComponent(RetiroBoton)
                    .addComponent(ClaveBoton)
                    .addComponent(DepositoBoton))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Método de acción del boton para loguear.
     * @param evt 
     */
    private void BotonentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonentrarActionPerformed
       Validacion va=new Validacion(); 
        if (va.validarUsuario(this.tarjetatext.getText(), this.contratext.getText())){
            login.setText("Sesión iniciada con exito.");
            
            
        }
        else {
            login.setText("Entrada inválida.");
        }
    }//GEN-LAST:event_BotonentrarActionPerformed
    /**
     * Método de acción del boton de log out.
     * @param evt 
     */
    private void BotonSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalidaActionPerformed
        JOptionPane.showMessageDialog(
                BotonSalida, 
                "La sesión se ha cerrado con éxito.",
                "Información", 
                JOptionPane.INFORMATION_MESSAGE);
            login.setText("");
            Validacion va=new Validacion();
            this.tarjetatext.setText("");
            this.contratext.setText("");
            va.validarUsuario(this.tarjetatext.getText(), this.contratext.getText());
                
    }//GEN-LAST:event_BotonSalidaActionPerformed
    /**
     * Método de acción del boton de consulta.
     * @param evt 
     */
    private void ConsultaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaBotonActionPerformed
        Validacion con=new Validacion();   
        JOptionPane.showMessageDialog(null, "Saldo disponible:"+ con.consultar(this.tarjetatext.getText()) );               
    }//GEN-LAST:event_ConsultaBotonActionPerformed
    /**
     * Método de acción del boton retiro.
     * @param evt 
     */
    private void RetiroBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetiroBotonActionPerformed
       Validacion con=new Validacion();
        String recoger;
        recoger = JOptionPane.showInputDialog(RetiroBoton, "inserte el monto a retirar");
        System.out.println(recoger);
      if (!recoger.isEmpty() && recoger!=null){
         double monto = Double.parseDouble(recoger);  
        login.setText("El retiro fue realizado con éxito.");
        con.retiro(this.tarjetatext.getText(),monto ); 
      }               
    }//GEN-LAST:event_RetiroBotonActionPerformed
    /**
     * Método de acción del boton depósito.
     * @param evt 
     */
    private void DepositoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositoBotonActionPerformed
        Validacion con=new Validacion();
        String recoger;
               recoger = JOptionPane.showInputDialog(DepositoBoton, "inserte el monto a retirar");   
               double monto = Double.parseDouble(recoger);  
               login.setText("El depósito fue realizado con éxito.");
               con.deposito(this.tarjetatext.getText(),monto );
    }//GEN-LAST:event_DepositoBotonActionPerformed
    /**
     * Método de acción del boton Cambiar clave.
     * @param evt 
     */
    private void ClaveBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClaveBotonActionPerformed
        Validacion con=new Validacion();
        String clavenueva;
        clavenueva = JOptionPane.showInputDialog(ClaveBoton, "Introduzca la nueva clave");
               con.cambioclave(this.tarjetatext.getText(), clavenueva);
            if (con.cambioclave(this.tarjetatext.getText(), clavenueva) == true){
              login.setText("El cambio de clave fue realizado con éxito.");                                 
            }
            else {
               JOptionPane.showMessageDialog(
                ClaveBoton, 
                "No se pudo efectuar el cambio de clave.", 
                "ERROR", 
                JOptionPane.ERROR_MESSAGE); 
            }
                
    }//GEN-LAST:event_ClaveBotonActionPerformed

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
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FramePrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonSalida;
    private javax.swing.JButton Botonentrar;
    private javax.swing.JButton ClaveBoton;
    private javax.swing.JButton ConsultaBoton;
    private javax.swing.JButton DepositoBoton;
    private javax.swing.JLabel Opcilabel;
    private javax.swing.JButton RetiroBoton;
    private javax.swing.JTextField contratext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel login;
    private javax.swing.JTextField tarjetatext;
    // End of variables declaration//GEN-END:variables
}
