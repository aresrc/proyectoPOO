


package InterfazGrafica;

import java.awt.BorderLayout;
import javax.swing.JPanel;


public class Pantalla extends javax.swing.JFrame {

   
    public Pantalla() {
        initComponents();
        
    }
    
    public void MostrarPanel(JPanel p){
        p.setSize(840, 400);
        p.setLocation(0, 0);
        
        contenido.removeAll();
        contenido.add(p, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnInforme = new javax.swing.JButton();
        btnRegistroPaciente = new javax.swing.JButton();
        btnListaMedicos = new javax.swing.JButton();
        btnListaPacientes = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        contenido = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Examen médico general");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        btnInforme.setBackground(new java.awt.Color(204, 255, 204));
        btnInforme.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnInforme.setText("Informe de Citas");
        btnInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformeActionPerformed(evt);
            }
        });
        jPanel1.add(btnInforme, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 260, 80));

        btnRegistroPaciente.setBackground(new java.awt.Color(204, 255, 204));
        btnRegistroPaciente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRegistroPaciente.setText("Registrar Paciente");
        btnRegistroPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroPacienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistroPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 260, 80));

        btnListaMedicos.setBackground(new java.awt.Color(204, 255, 204));
        btnListaMedicos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnListaMedicos.setText("Lista de Médicos");
        btnListaMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaMedicosActionPerformed(evt);
            }
        });
        jPanel1.add(btnListaMedicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 260, 80));

        btnListaPacientes.setBackground(new java.awt.Color(204, 255, 204));
        btnListaPacientes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnListaPacientes.setText("Lista de Pacientes");
        btnListaPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaPacientesActionPerformed(evt);
            }
        });
        jPanel1.add(btnListaPacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 260, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pantalla.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, 490, 500));

        contenido.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jPanel1.add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 840, 400));

        jPanel2.setBackground(new java.awt.Color(102, 255, 204));
        jPanel2.setForeground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setForeground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 1100, 30));

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Registrar Médico");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 260, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnListaMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaMedicosActionPerformed
        ListaMedicos lmed = new ListaMedicos();
        MostrarPanel(lmed);
    }//GEN-LAST:event_btnListaMedicosActionPerformed

    private void btnListaPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaPacientesActionPerformed
        ListaPacientes lp = new ListaPacientes();
        MostrarPanel(lp);
    }//GEN-LAST:event_btnListaPacientesActionPerformed

    private void btnInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformeActionPerformed
        InformeCitas inf = new InformeCitas();
        MostrarPanel(inf);
    }//GEN-LAST:event_btnInformeActionPerformed

    private void btnRegistroPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroPacienteActionPerformed
        RegistroPaciente reg = new RegistroPaciente();
        MostrarPanel(reg);
    }//GEN-LAST:event_btnRegistroPacienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInforme;
    private javax.swing.JButton btnListaMedicos;
    private javax.swing.JButton btnListaPacientes;
    private javax.swing.JButton btnRegistroPaciente;
    private javax.swing.JPanel contenido;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
