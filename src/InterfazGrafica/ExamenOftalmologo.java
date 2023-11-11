
package InterfazGrafica;

import java.awt.Color;
import javax.swing.SwingUtilities;


public class ExamenOftalmologo extends javax.swing.JPanel {

  
    public ExamenOftalmologo() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        S3 = new javax.swing.JLabel();
        S1 = new javax.swing.JLabel();
        S2 = new javax.swing.JLabel();
        AgudezaVisual = new javax.swing.JTextField();
        Estereopsis = new javax.swing.JTextField();
        PresionOcular = new javax.swing.JTextField();
        Refraccion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        S4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Resultados = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 21)); // NOI18N
        Titulo.setForeground(new java.awt.Color(51, 153, 255));
        Titulo.setText("Prueba de Oftalmología");
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 270, 30));

        S3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        S3.setText("Estereopsis");
        jPanel1.add(S3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        S1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        S1.setText("Presión ocular");
        jPanel1.add(S1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        S2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        S2.setText("Índice de refracción");
        jPanel1.add(S2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        AgudezaVisual.setForeground(new java.awt.Color(204, 204, 204));
        AgudezaVisual.setText(".../20");
        AgudezaVisual.setToolTipText("");
        AgudezaVisual.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        AgudezaVisual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgudezaVisualMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AgudezaVisualMousePressed(evt);
            }
        });
        AgudezaVisual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgudezaVisualActionPerformed(evt);
            }
        });
        jPanel1.add(AgudezaVisual, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 330, 30));

        Estereopsis.setForeground(new java.awt.Color(204, 204, 204));
        Estereopsis.setText("segundos de arco");
        Estereopsis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EstereopsisMousePressed(evt);
            }
        });
        Estereopsis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstereopsisActionPerformed(evt);
            }
        });
        jPanel1.add(Estereopsis, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 330, 30));

        PresionOcular.setForeground(new java.awt.Color(204, 204, 204));
        PresionOcular.setText("mmHG");
        PresionOcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PresionOcularMousePressed(evt);
            }
        });
        PresionOcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PresionOcularActionPerformed(evt);
            }
        });
        jPanel1.add(PresionOcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 330, 30));

        Refraccion.setForeground(new java.awt.Color(204, 204, 204));
        Refraccion.setText("1 - 1.5");
        Refraccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RefraccionMousePressed(evt);
            }
        });
        Refraccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefraccionActionPerformed(evt);
            }
        });
        jPanel1.add(Refraccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 330, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oftalmologo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 320, 350));

        S4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        S4.setText("Agudeza Visual");
        jPanel1.add(S4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 120, -1));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 840, 20));

        Resultados.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Resultados.setText("Resultados");
        Resultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultadosActionPerformed(evt);
            }
        });
        jPanel1.add(Resultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 120, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 400));
    }// </editor-fold>//GEN-END:initComponents

    private void AgudezaVisualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgudezaVisualMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AgudezaVisualMouseClicked

    private void AgudezaVisualMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgudezaVisualMousePressed
        if(AgudezaVisual.getText().equals("mmHG")){
            AgudezaVisual.setText("");
            AgudezaVisual.setForeground(Color.black);
        }
    }//GEN-LAST:event_AgudezaVisualMousePressed

    private void AgudezaVisualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgudezaVisualActionPerformed
        // TODO add your handling code h
    }//GEN-LAST:event_AgudezaVisualActionPerformed

    private void EstereopsisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EstereopsisMousePressed
        if(Estereopsis.getText().equals("ng/mL")){
            Estereopsis.setText("");
            Estereopsis.setForeground(Color.black);
        }
    }//GEN-LAST:event_EstereopsisMousePressed

    private void EstereopsisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstereopsisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EstereopsisActionPerformed

    private void PresionOcularMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PresionOcularMousePressed
        if(PresionOcular.getText().equals("mmHG")){
            PresionOcular.setText("");
            PresionOcular.setForeground(Color.black);
        }
    }//GEN-LAST:event_PresionOcularMousePressed

    private void PresionOcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PresionOcularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PresionOcularActionPerformed

    private void RefraccionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RefraccionMousePressed
        if(Refraccion.getText().equals("BPM")){
            Refraccion.setText("");
            Refraccion.setForeground(Color.black);
        }
    }//GEN-LAST:event_RefraccionMousePressed

    private void RefraccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefraccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RefraccionActionPerformed

    private void ResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultadosActionPerformed
        ResultadosMedicos result = new ResultadosMedicos();
        InicioDeExamen ini = (InicioDeExamen) SwingUtilities.getWindowAncestor(this);
        ini.dispose();
        result.setSize(840,510);
        result.setVisible(true); 
    }//GEN-LAST:event_ResultadosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AgudezaVisual;
    private javax.swing.JTextField Estereopsis;
    private javax.swing.JTextField PresionOcular;
    private javax.swing.JTextField Refraccion;
    public javax.swing.JButton Resultados;
    private javax.swing.JLabel S1;
    private javax.swing.JLabel S2;
    private javax.swing.JLabel S3;
    private javax.swing.JLabel S4;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
