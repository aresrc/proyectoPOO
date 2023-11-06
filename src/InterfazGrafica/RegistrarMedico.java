/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica;

import java.awt.Color;


public class RegistrarMedico extends javax.swing.JPanel {

    
    public RegistrarMedico() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        S3 = new javax.swing.JLabel();
        S1 = new javax.swing.JLabel();
        S2 = new javax.swing.JLabel();
        S4 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        DNI = new javax.swing.JTextField();
        Sexo = new javax.swing.JTextField();
        Edad = new javax.swing.JTextField();
        S10 = new javax.swing.JLabel();
        S11 = new javax.swing.JLabel();
        S12 = new javax.swing.JLabel();
        Nombre2 = new javax.swing.JTextField();
        Sexo2 = new javax.swing.JTextField();
        Edad2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        S3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        S3.setText("DNI");
        add(S3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        S1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        S1.setText("Nombre");
        add(S1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        S2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        S2.setText("Sexo");
        add(S2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        S4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        S4.setText("Edad");
        add(S4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        Nombre.setForeground(new java.awt.Color(204, 204, 204));
        Nombre.setText("nombre");
        Nombre.setToolTipText("");
        Nombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NombreMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NombreMousePressed(evt);
            }
        });
        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });
        add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 220, 30));

        DNI.setForeground(new java.awt.Color(204, 204, 204));
        DNI.setText("DNI");
        DNI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DNIMousePressed(evt);
            }
        });
        DNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNIActionPerformed(evt);
            }
        });
        add(DNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 220, 30));

        Sexo.setForeground(new java.awt.Color(204, 204, 204));
        Sexo.setText("F/M");
        Sexo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SexoMousePressed(evt);
            }
        });
        Sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SexoActionPerformed(evt);
            }
        });
        add(Sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 220, 30));

        Edad.setForeground(new java.awt.Color(204, 204, 204));
        Edad.setText("edad");
        Edad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EdadMousePressed(evt);
            }
        });
        Edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdadActionPerformed(evt);
            }
        });
        add(Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 220, 30));

        S10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        S10.setText("Código");
        add(S10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, -1, -1));

        S11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        S11.setText("Grado de formación");
        add(S11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, -1, -1));

        S12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        S12.setText("Años de experiencia");
        add(S12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));

        Nombre2.setForeground(new java.awt.Color(204, 204, 204));
        Nombre2.setText("cmp");
        Nombre2.setToolTipText("");
        Nombre2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Nombre2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Nombre2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Nombre2MousePressed(evt);
            }
        });
        Nombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nombre2ActionPerformed(evt);
            }
        });
        add(Nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 220, 30));

        Sexo2.setForeground(new java.awt.Color(204, 204, 204));
        Sexo2.setText("grado");
        Sexo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Sexo2MousePressed(evt);
            }
        });
        Sexo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sexo2ActionPerformed(evt);
            }
        });
        add(Sexo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 220, 30));

        Edad2.setForeground(new java.awt.Color(204, 204, 204));
        Edad2.setText("exp");
        Edad2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Edad2MousePressed(evt);
            }
        });
        Edad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edad2ActionPerformed(evt);
            }
        });
        add(Edad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 220, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 30, 400));

        jLabel1.setBackground(new java.awt.Color(255, 255, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 51));
        jLabel1.setText("Registro de Médico");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 33, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/medico.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 260, 400));
    }// </editor-fold>//GEN-END:initComponents

    private void NombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombreMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreMouseClicked

    private void NombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombreMousePressed
        if(Nombre.getText().equals("nombre")){
            Nombre.setText("");
            Nombre.setForeground(Color.black);
        }
    }//GEN-LAST:event_NombreMousePressed

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed

    }//GEN-LAST:event_NombreActionPerformed

    private void DNIMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DNIMousePressed
        if(DNI.getText().equals("DNI")){
            DNI.setText("");
            DNI.setForeground(Color.black);
        }
    }//GEN-LAST:event_DNIMousePressed

    private void DNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DNIActionPerformed

    private void SexoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SexoMousePressed
        if(Sexo.getText().equals("F/M")){
            Sexo.setText("");
            Sexo.setForeground(Color.black);
        }
    }//GEN-LAST:event_SexoMousePressed

    private void SexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SexoActionPerformed

    private void EdadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EdadMousePressed
        if(Edad.getText().equals("edad")){
            Edad.setText("");
            Edad.setForeground(Color.black);
        }
    }//GEN-LAST:event_EdadMousePressed

    private void EdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EdadActionPerformed

    private void Nombre2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nombre2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Nombre2MouseClicked

    private void Nombre2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nombre2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nombre2MousePressed

    private void Nombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nombre2ActionPerformed

    private void Sexo2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sexo2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Sexo2MousePressed

    private void Sexo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sexo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Sexo2ActionPerformed

    private void Edad2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Edad2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Edad2MousePressed

    private void Edad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edad2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Edad2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DNI;
    private javax.swing.JTextField Edad;
    private javax.swing.JTextField Edad2;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField Nombre2;
    private javax.swing.JLabel S1;
    private javax.swing.JLabel S10;
    private javax.swing.JLabel S11;
    private javax.swing.JLabel S12;
    private javax.swing.JLabel S2;
    private javax.swing.JLabel S3;
    private javax.swing.JLabel S4;
    private javax.swing.JTextField Sexo;
    private javax.swing.JTextField Sexo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
