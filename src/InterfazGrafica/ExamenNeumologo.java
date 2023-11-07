


package InterfazGrafica;

import java.awt.Color;


public class ExamenNeumologo extends javax.swing.JPanel {

  
    public ExamenNeumologo() {
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
        jPanel1 = new javax.swing.JPanel();
        panel1 = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        BPM1 = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contenido.setBackground(new java.awt.Color(255, 255, 255));
        contenido.setName("contenido"); // NOI18N
        contenido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 21)); // NOI18N
        Titulo.setForeground(new java.awt.Color(51, 204, 255));
        Titulo.setText("Prueba de Neumología");
        contenido.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 240, 30));

        S3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        S3.setText("Presencia de sangre oxigenada");
        contenido.add(S3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        S1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        S1.setText("Capacidad pulmonar y el flujo de aire");
        contenido.add(S1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        S2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        S2.setText("Presión sanguínea");
        contenido.add(S2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Porcentaje de hemoglobina saturada en oxígeno");
        contenido.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Volumen espiratorio forzado en un segundo");
        contenido.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Capacidad vital forzada");
        contenido.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Presión de oxígeno en la sangre arterial");
        contenido.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        Sistolica.setForeground(new java.awt.Color(204, 204, 204));
        Sistolica.setText(" %");
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
        contenido.add(Sistolica, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 330, 30));

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
        contenido.add(Troponina, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 330, 30));

        Diastolica.setForeground(new java.awt.Color(204, 204, 204));
        Diastolica.setText("%");
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
        contenido.add(Diastolica, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 330, 30));

        BPM.setForeground(new java.awt.Color(204, 204, 204));
        BPM.setText("mmHg");
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
        contenido.add(BPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 330, 30));

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        contenido.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 840, 10));
        contenido.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, -1, -1));
        contenido.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 160, -1, -1));
        contenido.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/neumologologo.jpg"))); // NOI18N
        contenido.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Presión de dióxido de carbono en la sangre arterial");
        contenido.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        BPM1.setForeground(new java.awt.Color(204, 204, 204));
        BPM1.setText("mmHg");
        BPM1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BPM1MousePressed(evt);
            }
        });
        BPM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPM1ActionPerformed(evt);
            }
        });
        contenido.add(BPM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 330, 30));

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

    private void BPM1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BPM1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BPM1MousePressed

    private void BPM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPM1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BPM1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BPM;
    private javax.swing.JTextField BPM1;
    private javax.swing.JTextField Diastolica;
    private javax.swing.JLabel S1;
    private javax.swing.JLabel S2;
    private javax.swing.JLabel S3;
    private javax.swing.JTextField Sistolica;
    private javax.swing.JLabel Titulo;
    private javax.swing.JTextField Troponina;
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
