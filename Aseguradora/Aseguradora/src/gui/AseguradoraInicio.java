package gui;
public class AseguradoraInicio extends javax.swing.JFrame {

    public AseguradoraInicio() {
       
        initComponents();
         this.setLocationRelativeTo(this);
         this.setSize(1000, 700);
         this.setTitle("ASEGURADORA POO");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JButton btnClientes = new javax.swing.JButton();
        javax.swing.JButton btnSeguros = new javax.swing.JButton();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnClientes.setBackground(new java.awt.Color(0, 0, 0));
        btnClientes.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnClientes.setText("CLIENTES");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        jPanel1.add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, -1));

        btnSeguros.setBackground(new java.awt.Color(0, 0, 0));
        btnSeguros.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        btnSeguros.setForeground(new java.awt.Color(255, 255, 255));
        btnSeguros.setText("SEGUROS");
        btnSeguros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSegurosActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeguros, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono Tesla.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 140, 100));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo de Pantalla.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSegurosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSegurosActionPerformed
        // TODO add your handling code here:
        PanelPrincipalSeguros pps = new PanelPrincipalSeguros();
        pps.setSize(1000, 700);
        pps.setVisible(true);
        pps.setLocationRelativeTo(null);
        pps.setTitle("EXPLICACION SEGUROS POO");
        
    }//GEN-LAST:event_btnSegurosActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        // TODO add your handling code here:
        PanelPrincipalClientes ppc = new PanelPrincipalClientes();
        ppc.setSize(1000, 700);
        ppc.setVisible(true);
        ppc.setLocationRelativeTo(null);
        ppc.setTitle("CLIENTES");
        dispose();
    }//GEN-LAST:event_btnClientesActionPerformed

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
            java.util.logging.Logger.getLogger(AseguradoraInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AseguradoraInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AseguradoraInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AseguradoraInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AseguradoraInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
