
package gui;
import conectores.Conexion;
import java.sql.Connection;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import repositorios.R_Registro;
import interfaces.I_Registro;
import java.sql.SQLException;
public class PanelRegistrarse extends javax.swing.JFrame {
     private R_Registro registroRepository;
         private Connection connection;

   public PanelRegistrarse() {
    initComponents();
    try {
        connection = Conexion.obtenerConnection(); // Obtener la conexión aquí
        registroRepository = new R_Registro(connection);
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al conectar a la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
    }
}



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtUsurname = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txtContraseña = new javax.swing.JPasswordField();
        btnBack = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("PERSONAL INFORMATION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, -1, 65));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono Tesla.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, -1, -1));

        email.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        email.setText("Email o Usuario");
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 259, -1, 29));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Repeat Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 338, -1, 29));

        nombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        nombre.setText("Nombre");
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 202, 68, 29));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("Repeat Usuario/Email");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 259, -1, 29));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setText("Password");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 338, 87, 29));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setText("Apellido");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 202, 87, 29));

        txtUsurname.setBackground(new java.awt.Color(0, 0, 0));
        txtUsurname.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtUsurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(709, 258, 156, 35));

        txtEmail.setBackground(new java.awt.Color(0, 0, 0));
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 258, 156, 35));

        txtApellido.setBackground(new java.awt.Color(0, 0, 0));
        txtApellido.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(709, 201, 156, 35));

        txtNombre.setBackground(new java.awt.Color(0, 0, 0));
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 156, 35));

        txtPassword.setBackground(new java.awt.Color(0, 0, 0));
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 335, 152, 38));

        txtContraseña.setBackground(new java.awt.Color(0, 0, 0));
        txtContraseña.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 340, 152, 38));

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 504, 109, 39));

        btnLogin.setBackground(new java.awt.Color(0, 0, 0));
        btnLogin.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 504, 109, 39));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 0, 0));
        jLabel11.setText("*");
        jLabel11.setToolTipText("Ingrese Nombre Completo");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 20, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 0, 0));
        jLabel12.setText("*");
        jLabel12.setToolTipText("Cree un usuario u Email para ingresar");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 20, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 0, 0));
        jLabel13.setText("*");
        jLabel13.setToolTipText("Ingrese una Contraseña");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 20, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 0, 0));
        jLabel14.setText("*");
        jLabel14.setToolTipText("Ingrese Apellido Completo");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, 20, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 0, 0));
        jLabel15.setText("*");
        jLabel15.setToolTipText("Cree un usuario u Email para ingresar ,recuerde que tiene que ser el mismo que el principio");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, 20, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 0, 0));
        jLabel16.setText("*");
        jLabel16.setToolTipText("Repita La misma Contraseña");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, 20, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo de Pantalla.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1000, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
String userEmail = txtEmail.getText();
        String userPassword = new String(txtPassword.getPassword());
        String userRepeatPassword = new String(txtContraseña.getPassword());
        String userNombre = txtNombre.getText();
        String userApellido = txtApellido.getText();
        String userUsurname = txtUsurname.getText();
        
        
        if (!userEmail.equals(userUsurname)) {
            JOptionPane.showMessageDialog(this,"El nombre de usuario no coincide","ERROR",JOptionPane.ERROR_MESSAGE);
            
        } else {
        }
        

        // Verificar que las contraseñas coinciden
        if (!userPassword.equals(userRepeatPassword)) {
            JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden", "Error", JOptionPane.ERROR_MESSAGE);
            return; // No hacemos nada si las contraseñas no coinciden
        }
        try {
    if (registroRepository.usuarioExistente(userUsurname)) {
        JOptionPane.showMessageDialog(this, "El usuario ya está registrado. Por favor, elija otro nombre de usuario", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
} catch (SQLException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Error al verificar la existencia del usuario en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
}
        


        // Insertar los datos en la base de datos utilizando el repositorio
        registroRepository.insertarRegistro(userEmail, userPassword, userNombre, userApellido, userUsurname);

        // Abre la ventana de DatosPersonales
        DatosPersonales dp = new DatosPersonales(txtNombre.getText(), txtApellido.getText());
        dp.setSize(1000, 700);
        dp.setVisible(true);
        dp.setLocationRelativeTo(null);
        dp.setTitle("DATOS PERSONALES");


    }//GEN-LAST:event_btnLoginActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsurname;
    // End of variables declaration//GEN-END:variables
}
