
package InterfazGrafica;


import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;


public class InicioDeExamen extends javax.swing.JFrame {
    
    public void MostrarPanel(JPanel p){
        p.setSize(840, 400);
        p.setLocation(0, 0);
        
        contenido.removeAll();
        contenido.add(p, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }
    //ExamenCardiologo card = new ExamenCardiologo();
    
    public InicioDeExamen() {
        initComponents();
       /* CardLayout cardLayout = new CardLayout();
        contenido.setLayout(cardLayout);
        contenido.add(card,"p1");*/
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenido = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        S3 = new javax.swing.JLabel();
        S2 = new javax.swing.JLabel();
        Alergia = new javax.swing.JTextField();
        Peso = new javax.swing.JTextField();
        S4 = new javax.swing.JLabel();
        S5 = new javax.swing.JLabel();
        Altura1 = new javax.swing.JTextField();
        Altura2 = new javax.swing.JTextField();
        btnSiguiente = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnsiguiente = new javax.swing.JButton();
        btnatras = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("contenedorprincipal"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contenido.setBackground(new java.awt.Color(255, 255, 255));
        contenido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 204, 255));
        jLabel1.setText("Información del paciente");
        contenido.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        S3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        S3.setText("Alergia");
        contenido.add(S3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        S2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        S2.setText("Peso");
        contenido.add(S2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        Alergia.setForeground(new java.awt.Color(204, 204, 204));
        Alergia.setText("...");
        Alergia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AlergiaMousePressed(evt);
            }
        });
        Alergia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlergiaActionPerformed(evt);
            }
        });
        contenido.add(Alergia, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 330, 30));

        Peso.setForeground(new java.awt.Color(204, 204, 204));
        Peso.setText("kg");
        Peso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PesoMousePressed(evt);
            }
        });
        Peso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesoActionPerformed(evt);
            }
        });
        contenido.add(Peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 330, 30));

        S4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        S4.setText("Altura");
        contenido.add(S4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        S5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        S5.setText("Grupo sanguíneo");
        contenido.add(S5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        Altura1.setForeground(new java.awt.Color(204, 204, 204));
        Altura1.setText("metros");
        Altura1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Altura1MousePressed(evt);
            }
        });
        Altura1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Altura1ActionPerformed(evt);
            }
        });
        contenido.add(Altura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 330, 30));

        Altura2.setForeground(new java.awt.Color(204, 204, 204));
        Altura2.setText("A B AB O");
        Altura2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Altura2MousePressed(evt);
            }
        });
        Altura2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Altura2ActionPerformed(evt);
            }
        });
        contenido.add(Altura2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 330, 30));

        btnSiguiente.setBackground(new java.awt.Color(0, 204, 51));
        btnSiguiente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        contenido.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, 130, 30));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        contenido.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 840, 10));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ListaInicial.jpg"))); // NOI18N
        contenido.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 320, 400));

        getContentPane().add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 840, 400));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setLayout(null);

        btnsiguiente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnsiguiente.setText("SIGUIENTE");
        btnsiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsiguienteActionPerformed(evt);
            }
        });
        jPanel2.add(btnsiguiente);
        btnsiguiente.setBounds(420, 0, 420, 50);

        btnatras.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnatras.setText("ATRAS");
        jPanel2.add(btnatras);
        btnatras.setBounds(0, 0, 420, 50);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 840, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Recopilación de observaciones");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 380, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AlergiaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlergiaMousePressed
        if(Alergia.getText().equals("ng/mL")){
            Alergia.setText("");
            Alergia.setForeground(Color.black);
        }
    }//GEN-LAST:event_AlergiaMousePressed

    private void AlergiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlergiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlergiaActionPerformed

    private void PesoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PesoMousePressed
        if(Peso.getText().equals("BPM")){
            Peso.setText("");
            Peso.setForeground(Color.black);
        }
    }//GEN-LAST:event_PesoMousePressed

    private void PesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesoActionPerformed

    }//GEN-LAST:event_PesoActionPerformed

    private void Altura1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Altura1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Altura1MousePressed

    private void Altura1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Altura1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Altura1ActionPerformed

    private void Altura2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Altura2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Altura2MousePressed

    private void Altura2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Altura2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Altura2ActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        ExamenCardiologo card = new ExamenCardiologo();
        MostrarPanel(card);
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnsiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsiguienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsiguienteActionPerformed

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
            java.util.logging.Logger.getLogger(InicioDeExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioDeExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioDeExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioDeExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioDeExamen().setVisible(true);
                
            }
            
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alergia;
    private javax.swing.JTextField Altura1;
    private javax.swing.JTextField Altura2;
    private javax.swing.JTextField Peso;
    private javax.swing.JLabel S2;
    private javax.swing.JLabel S3;
    private javax.swing.JLabel S4;
    private javax.swing.JLabel S5;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnatras;
    private javax.swing.JButton btnsiguiente;
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
