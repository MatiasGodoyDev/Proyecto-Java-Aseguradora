package gui;

import javax.swing.JOptionPane;
public class PanelPrincipalSeguros extends javax.swing.JFrame {

    public PanelPrincipalSeguros() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JButton btnSalir = new javax.swing.JButton();
        javax.swing.JButton btnBasico = new javax.swing.JButton();
        javax.swing.JButton btnAmplioPlus = new javax.swing.JButton();
        javax.swing.JButton btnAmplio = new javax.swing.JButton();
        javax.swing.JButton btnPremium = new javax.swing.JButton();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("SEGUROS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 0, 191, 41));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 47, -1, -1));

        btnSalir.setBackground(new java.awt.Color(0, 0, 0));
        btnSalir.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("EXIT");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 550, 116, 49));

        btnBasico.setBackground(new java.awt.Color(0, 0, 0));
        btnBasico.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnBasico.setForeground(new java.awt.Color(255, 255, 255));
        btnBasico.setText("BASICO");
        btnBasico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBasicoActionPerformed(evt);
            }
        });
        jPanel1.add(btnBasico, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 220, 116, 49));

        btnAmplioPlus.setBackground(new java.awt.Color(0, 0, 0));
        btnAmplioPlus.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnAmplioPlus.setForeground(new java.awt.Color(255, 255, 255));
        btnAmplioPlus.setText("AMPLIO PLUS");
        btnAmplioPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAmplioPlusActionPerformed(evt);
            }
        });
        jPanel1.add(btnAmplioPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 150, 49));

        btnAmplio.setBackground(new java.awt.Color(0, 0, 0));
        btnAmplio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnAmplio.setForeground(new java.awt.Color(255, 255, 255));
        btnAmplio.setText("AMPLIO");
        btnAmplio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAmplioActionPerformed(evt);
            }
        });
        jPanel1.add(btnAmplio, new org.netbeans.lib.awtextra.AbsoluteConstraints(665, 220, 116, 49));

        btnPremium.setBackground(new java.awt.Color(0, 0, 0));
        btnPremium.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnPremium.setForeground(new java.awt.Color(255, 255, 255));
        btnPremium.setText("PREMIUM");
        btnPremium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPremiumActionPerformed(evt);
            }
        });
        jPanel1.add(btnPremium, new org.netbeans.lib.awtextra.AbsoluteConstraints(665, 440, 116, 49));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo de Pantalla.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBasicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBasicoActionPerformed
        // TODO add your handling code here:
         String explicacion = " Basico : Aquí se ofrecen las mismas coberturas que el de Responsabilidad Civil, sin embargo, incluye beneficios adicionales:\n"
            + "- Robo total del auto.\n"
            + "- Auxilio vial si se te poncha una llanta, necesitas gasolina o una grúa.";

    JOptionPane.showMessageDialog(this, explicacion, "Explicación - Plan Básico", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnBasicoActionPerformed

    private void btnAmplioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmplioActionPerformed
        // TODO add your handling code here:
        String amplia = "Amplia: Engloba las protecciones de los seguros de responsabilidad civil y cobertura limitada, ademas de daños a tu auto como resultado de un accidente. ";
    JOptionPane.showMessageDialog(this, amplia, "Explicación - Plan Amplio", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnAmplioActionPerformed

    private void btnAmplioPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmplioPlusActionPerformed
        // TODO add your handling code here:
        String ampliaPlus = "Amplio Plus: Este paquete incluye todos los beneficios mencionados anteriormente y auxilio vial ilimitado, daños por terceros sin seguro, afectaciones a tus llantas e incluye auto sustituto en caso de que el tuyo quede inutilizado por reparaciones. ";
    JOptionPane.showMessageDialog(this, ampliaPlus, "Explicación - Plan Amplio", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnAmplioPlusActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnPremiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPremiumActionPerformed
        // TODO add your handling code here:
         String aaa = "Premium: Las coberturas de este seguro son oblsigatorias para todos los autos por ley. Asimismo, ante cualquier siniestro, el seguro de daños a +terceros cubre los siguientes aspectos:\n" +"Daños provocados a los autos o pertenencias de terceras personas (casa, auto o negocio).\n" +"Daños fisicos o fallecimiento de otras personas.\n" +"Asistencia legal.\n" +"Reparaciones a los autos de otras personas en caso de que tengas un accidente mientras manejas un carro que no sea el tuyo.\n" +"Servicios medicos para ti y las personas viajando en tu auto en caso de accidente.";
        JOptionPane.showMessageDialog(this,aaa,"Explicacion - Plan Premium",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnPremiumActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
