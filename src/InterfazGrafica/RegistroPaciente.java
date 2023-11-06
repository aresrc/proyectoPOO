

package InterfazGrafica;

import Pacientes.Paciente;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import static InterfazGrafica.Pantalla.*;
import javax.swing.SwingUtilities;

public class RegistroPaciente extends javax.swing.JPanel {
    Pantalla p;
    
    public RegistroPaciente() {
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
     
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenido = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        S3 = new javax.swing.JLabel();
        S1 = new javax.swing.JLabel();
        S2 = new javax.swing.JLabel();
        S4 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        DNI = new javax.swing.JTextField();
        Sexo = new javax.swing.JTextField();
        Edad = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contenido.setBackground(new java.awt.Color(255, 255, 255));
        contenido.setName("contenido"); // NOI18N
        contenido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 51));
        jLabel1.setText("Registro de Pacientes");
        contenido.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 33, -1, -1));

        S3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        S3.setText("DNI");
        contenido.add(S3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        S1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        S1.setText("Nombre");
        contenido.add(S1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        S2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        S2.setText("Sexo");
        contenido.add(S2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        S4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        S4.setText("Edad");
        contenido.add(S4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

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
        contenido.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 330, 30));

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
        contenido.add(DNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 330, 30));

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
        contenido.add(Sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 330, 30));

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
        contenido.add(Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 330, 30));

        jButton1.setText("Iniciar Examen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        contenido.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/paciente.png"))); // NOI18N
        contenido.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 4, 310, 400));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        contenido.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 840, 10));

        add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 400));
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        InicioDeExamen ini = new InicioDeExamen();
        Pantalla p = (Pantalla) SwingUtilities.getWindowAncestor(this);
        p.dispose();
        ini.setVisible(true);       
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DNI;
    private javax.swing.JTextField Edad;
    private javax.swing.JTextField Nombre;
    private javax.swing.JLabel S1;
    private javax.swing.JLabel S2;
    private javax.swing.JLabel S3;
    private javax.swing.JLabel S4;
    private javax.swing.JTextField Sexo;
    private javax.swing.JPanel contenido;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
