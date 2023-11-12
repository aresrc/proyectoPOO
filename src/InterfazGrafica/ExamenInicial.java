


package InterfazGrafica;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

public class ExamenInicial extends javax.swing.JPanel {

    public ExamenInicial() {
        initComponents();
    }
    
    public void MostrarPanel(JPanel p){
        p.setSize(840, 400);
        p.setLocation(0, 0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        S3 = new javax.swing.JLabel();
        S2 = new javax.swing.JLabel();
        Alergia = new javax.swing.JTextField();
        Peso = new javax.swing.JTextField();
        S4 = new javax.swing.JLabel();
        S5 = new javax.swing.JLabel();
        Altura = new javax.swing.JTextField();
        gruposanguineo = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setName("contenido"); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 204, 255));
        jLabel1.setText("Información del paciente");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        S3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        S3.setText("Alergia");
        add(S3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        S2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        S2.setText("Peso");
        add(S2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

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
        add(Alergia, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 330, 30));

        Peso.setForeground(new java.awt.Color(204, 204, 204));
        Peso.setText("kg");
        Peso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PesoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PesoMousePressed(evt);
            }
        });
        Peso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesoActionPerformed(evt);
            }
        });
        add(Peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 330, 30));

        S4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        S4.setText("Altura");
        add(S4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        S5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        S5.setText("Grupo sanguíneo");
        add(S5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        Altura.setForeground(new java.awt.Color(204, 204, 204));
        Altura.setText("metros");
        Altura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AlturaMousePressed(evt);
            }
        });
        Altura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlturaActionPerformed(evt);
            }
        });
        add(Altura, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 330, 30));

        gruposanguineo.setForeground(new java.awt.Color(204, 204, 204));
        gruposanguineo.setText("A B AB O");
        gruposanguineo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                gruposanguineoMousePressed(evt);
            }
        });
        gruposanguineo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gruposanguineoActionPerformed(evt);
            }
        });
        add(gruposanguineo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 330, 30));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setForeground(new java.awt.Color(0, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 840, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ListaInicial.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 320, 400));
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

    private void AlturaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlturaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlturaMousePressed

    private void AlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlturaActionPerformed

    private void gruposanguineoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gruposanguineoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_gruposanguineoMousePressed

    private void gruposanguineoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gruposanguineoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gruposanguineoActionPerformed

    private void PesoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PesoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PesoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alergia;
    public javax.swing.JTextField Altura;
    public javax.swing.JTextField Peso;
    private javax.swing.JLabel S2;
    private javax.swing.JLabel S3;
    private javax.swing.JLabel S4;
    private javax.swing.JLabel S5;
    private javax.swing.JTextField gruposanguineo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
