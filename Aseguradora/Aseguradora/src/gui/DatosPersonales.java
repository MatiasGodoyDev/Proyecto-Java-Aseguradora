package gui;

import entidades.Clientes;
import entidades.Registro;
import conectores.Conexion;
import java.sql.Connection; // Importa las clases relacionadas con JDBC para manejar la base de datos
import javax.swing.JOptionPane;
import repositorios.R_Clientes;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class DatosPersonales extends javax.swing.JFrame {
    
     private String nombreDesdeRegistro;
    private String apellidos;
     private R_Clientes clientesRepository; 
 public DatosPersonales(String nombre , String apellido) {
        initComponents();
    clientesRepository = new R_Clientes();
    // Utiliza los valores de nombre y apellido desde PanelRegistrarse
    this.nombreDesdeRegistro = nombre;
    this.apellidos = apellido;

    // Llena los campos de nombre y apellido con los valores recibidos
    txtNombre.setText(nombreDesdeRegistro);
    txtApellido.setText(apellidos);
    txtNombre.setEditable(false);
    txtApellido.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel8 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel9 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel10 = new javax.swing.JLabel();
        txtNumAux = new javax.swing.JTextField();
        txtDoc = new javax.swing.JTextField();
        txtFechaDeNacimiento = new javax.swing.JTextField();
        txtNum = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        javax.swing.JComboBox<String> jComboBox1 = new javax.swing.JComboBox<>();
        javax.swing.JButton btnLogin = new javax.swing.JButton();
        javax.swing.JButton btnBack = new javax.swing.JButton();
        javax.swing.JLabel jLabel14 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel15 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel16 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel17 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel18 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel19 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel20 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel21 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("PERSONAL INFORMATION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 480, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono Tesla.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Apellido");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 70, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Tipo De Doc");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 110, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setText("Nombre");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 70, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("Fecha de nacimiento");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 170, 30));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setText("Direccion");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 90, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setText("Numero");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 70, 30));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setText("Numero Auxiliar");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 130, 30));

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel10.setText("NUMERO DE DOC");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, 160, 30));

        txtNumAux.setBackground(new java.awt.Color(0, 0, 0));
        txtNumAux.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtNumAux, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, 130, 30));

        txtDoc.setBackground(new java.awt.Color(0, 0, 0));
        txtDoc.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 450, 130, 30));

        txtFechaDeNacimiento.setBackground(new java.awt.Color(0, 0, 0));
        txtFechaDeNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtFechaDeNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 130, 30));

        txtNum.setBackground(new java.awt.Color(0, 0, 0));
        txtNum.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 130, 30));

        txtNombre.setBackground(new java.awt.Color(0, 0, 0));
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 130, 30));

        txtApellido.setBackground(new java.awt.Color(0, 0, 0));
        txtApellido.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 170, 30));

        txtDireccion.setBackground(new java.awt.Color(0, 0, 0));
        txtDireccion.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 160, 30));

        jComboBox1.setBackground(new java.awt.Color(0, 0, 0));
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "Libreta Civica", "Libreta de Enrolamiento", "Pasaporte" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, 140, 30));

        btnLogin.setBackground(new java.awt.Color(0, 0, 0));
        btnLogin.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 560, 110, 30));

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 553, 110, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 0, 0));
        jLabel14.setText("*");
        jLabel14.setToolTipText("Nombre Completo");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 20, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 0, 0));
        jLabel15.setText("*");
        jLabel15.setToolTipText("La fecha de nacimiento solo se tomara con año/mes/ dia ");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 20, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 0, 0));
        jLabel16.setText("*");
        jLabel16.setToolTipText("Numero Telefonico");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 20, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 0, 0));
        jLabel17.setText("*");
        jLabel17.setToolTipText("Numero de hogar o Familiar");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 20, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 0, 0));
        jLabel18.setText("*");
        jLabel18.setToolTipText("Apellido");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 20, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 0, 0));
        jLabel19.setText("*");
        jLabel19.setToolTipText("Direccion de domicilio con numero");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 20, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(153, 0, 0));
        jLabel20.setText("*");
        jLabel20.setToolTipText("Tipo de documento que posee");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, 20, 30));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(153, 0, 0));
        jLabel21.setText("*");
        jLabel21.setToolTipText("Ingrese su numero de documento");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 450, 20, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo de Pantalla.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

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

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        // Obtiene los datos ingresados por el usuario
     String Nombre = txtNombre.getText();
    String Apellido = txtApellido.getText();
    String Direccion = txtDireccion.getText();
    String Dni = txtDoc.getText();
    String Fechadenacimiento = txtFechaDeNacimiento.getText();
    String numero = txtNum.getText();
    String numeroaux = txtNumAux.getText();

    if (Nombre.isEmpty() || Apellido.isEmpty() || Direccion.isEmpty() || Dni.isEmpty() || Fechadenacimiento.isEmpty() || numero.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    
        if (Dni.length()<=8) {
            
        } else {
            JOptionPane.showMessageDialog(this,"El DNI debe tener al menos 8 caracteres ","ERROR",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (numero.length() <=11) {
            
        } else {
            JOptionPane.showMessageDialog(this, "El numero debe tener 11 caracteres.","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (numeroaux.length()<=11) {
            
            
        }else{
            JOptionPane.showMessageDialog(this, "El numero debe tener 11 caracteres.","ERROR",JOptionPane.ERROR_MESSAGE);
            return;
        }
          
        
    
   

     // Utiliza la instancia de R_Clientes  para agregar el cliente
    clientesRepository.agregarCliente(Nombre, Apellido, Fechadenacimiento, Direccion, numero, numeroaux, Dni);

    // Llama al método para agregar el cliente a la base de datos
    JOptionPane.showMessageDialog(this, "Registro agregado con éxito.");

    // Abre la ventana de DatosPersonales u realiza otra acción necesaria
        DatosVehiculares dv = new DatosVehiculares();
        dv.setSize(1000, 700);
        dv.setVisible(true);
        dv.setLocationRelativeTo(null);
        dv.setTitle("DATOS VEHICULARES");
       
    }//GEN-LAST:event_btnLoginActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDoc;
    private javax.swing.JTextField txtFechaDeNacimiento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtNumAux;
    // End of variables declaration//GEN-END:variables

}
