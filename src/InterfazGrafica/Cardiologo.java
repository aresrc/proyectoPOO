


package InterfazGrafica;

import java.awt.Color;


public class Cardiologo extends javax.swing.JPanel {

  
    public Cardiologo() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenido = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        S3 = new javax.swing.JLabel();
        S1 = new javax.swing.JLabel();
        S2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Sistolica = new javax.swing.JTextField();
        Troponina = new javax.swing.JTextField();
        Diastolica = new javax.swing.JTextField();
        BPM = new javax.swing.JTextField();
        btnSiguiente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contenido.setBackground(new java.awt.Color(255, 255, 255));
        contenido.setName("contenido"); // NOI18N
        contenido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 21)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 102, 102));
        Titulo.setText("Prueba de Cardiología");
        contenido.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 240, 30));

        S3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        S3.setText("Riesgo cardíaco");
        contenido.add(S3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        S1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        S1.setText("Presión arterial");
        contenido.add(S1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        S2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        S2.setText("Prueba de esfuerzo");
        contenido.add(S2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nivel de troponina");
        contenido.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Presión arterial sistólica");
        contenido.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Presión arterial diastólica");
        contenido.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Frecuencia cardíaca");
        contenido.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        Sistolica.setForeground(new java.awt.Color(204, 204, 204));
        Sistolica.setText("mmHG");
        Sistolica.setToolTipText("");
        Sistolica.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Sistolica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SistolicaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SistolicaMousePressed(evt);
            }
        });
        Sistolica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SistolicaActionPerformed(evt);
            }
        });
        contenido.add(Sistolica, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 330, 30));

        Troponina.setForeground(new java.awt.Color(204, 204, 204));
        Troponina.setText("ng/mL");
        Troponina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TroponinaMousePressed(evt);
            }
        });
        Troponina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TroponinaActionPerformed(evt);
            }
        });
        contenido.add(Troponina, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 330, 30));

        Diastolica.setForeground(new java.awt.Color(204, 204, 204));
        Diastolica.setText("mmHG");
        Diastolica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DiastolicaMousePressed(evt);
            }
        });
        Diastolica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiastolicaActionPerformed(evt);
            }
        });
        contenido.add(Diastolica, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 330, 30));

        BPM.setForeground(new java.awt.Color(204, 204, 204));
        BPM.setText("BPM");
        BPM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BPMMousePressed(evt);
            }
        });
        BPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPMActionPerformed(evt);
            }
        });
        contenido.add(BPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 330, 30));

        btnSiguiente.setBackground(new java.awt.Color(0, 204, 51));
        btnSiguiente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        contenido.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, 130, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cardiologists.jpg"))); // NOI18N
        contenido.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 310, 400));

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        contenido.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 840, 10));

        add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 400));
    }// </editor-fold>//GEN-END:initComponents

    private void SistolicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SistolicaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SistolicaMouseClicked

    private void SistolicaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SistolicaMousePressed
        if(Sistolica.getText().equals("mmHG")){
            Sistolica.setText("");
            Sistolica.setForeground(Color.black);
        }
    }//GEN-LAST:event_SistolicaMousePressed

    private void SistolicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SistolicaActionPerformed
        // TODO add your handling code h
    }//GEN-LAST:event_SistolicaActionPerformed

    private void TroponinaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TroponinaMousePressed
        if(Troponina.getText().equals("ng/mL")){
            Troponina.setText("");
            Troponina.setForeground(Color.black);
        }
    }//GEN-LAST:event_TroponinaMousePressed

    private void TroponinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TroponinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TroponinaActionPerformed

    private void DiastolicaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DiastolicaMousePressed
        if(Diastolica.getText().equals("mmHG")){
            Diastolica.setText("");
            Diastolica.setForeground(Color.black);
        }
    }//GEN-LAST:event_DiastolicaMousePressed

    private void DiastolicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiastolicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiastolicaActionPerformed

    private void BPMMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BPMMousePressed
        if(BPM.getText().equals("BPM")){
            BPM.setText("");
            BPM.setForeground(Color.black);
        }
    }//GEN-LAST:event_BPMMousePressed

    private void BPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BPMActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSiguienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BPM;
    private javax.swing.JTextField Diastolica;
    private javax.swing.JLabel S1;
    private javax.swing.JLabel S2;
    private javax.swing.JLabel S3;
    private javax.swing.JTextField Sistolica;
    private javax.swing.JLabel Titulo;
    private javax.swing.JTextField Troponina;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
