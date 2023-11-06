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
        codigo = new javax.swing.JTextField();
        grado = new javax.swing.JTextField();
        exp = new javax.swing.JTextField();
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

        codigo.setForeground(new java.awt.Color(204, 204, 204));
        codigo.setText("cmp");
        codigo.setToolTipText("");
        codigo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        codigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                codigoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                codigoMousePressed(evt);
            }
        });
        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });
        add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 220, 30));

        grado.setForeground(new java.awt.Color(204, 204, 204));
        grado.setText("grado");
        grado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                gradoMousePressed(evt);
            }
        });
        grado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradoActionPerformed(evt);
            }
        });
        add(grado, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 220, 30));

        exp.setForeground(new java.awt.Color(204, 204, 204));
        exp.setText("exp");
        exp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                expMousePressed(evt);
            }
        });
        exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expActionPerformed(evt);
            }
        });
        add(exp, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 220, 30));

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
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 250, 400));
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

    private void codigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codigoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoMouseClicked

    private void codigoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codigoMousePressed
        if(codigo.getText().equals("cmp")){
            codigo.setText("");
            codigo.setForeground(Color.black);
        }
    }//GEN-LAST:event_codigoMousePressed

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoActionPerformed

    private void gradoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradoMousePressed
        if(grado.getText().equals("grado")){
            grado.setText("");
            grado.setForeground(Color.black);
        }
    }//GEN-LAST:event_gradoMousePressed

    private void gradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gradoActionPerformed

    private void expMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_expMousePressed
        if(exp.getText().equals("exp")){
            exp.setText("");
            exp.setForeground(Color.black);
        }
    }//GEN-LAST:event_expMousePressed

    private void expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_expActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DNI;
    private javax.swing.JTextField Edad;
    private javax.swing.JTextField Nombre;
    private javax.swing.JLabel S1;
    private javax.swing.JLabel S10;
    private javax.swing.JLabel S11;
    private javax.swing.JLabel S12;
    private javax.swing.JLabel S2;
    private javax.swing.JLabel S3;
    private javax.swing.JLabel S4;
    private javax.swing.JTextField Sexo;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField exp;
    private javax.swing.JTextField grado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
