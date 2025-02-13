package gui;

import conectores.Conexion;
import java.sql.Connection;
import javax.swing.JOptionPane;
import repositorios.R_Autos;
import repositorios.R_Clientes;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DatosVehiculares extends javax.swing.JFrame {
 private R_Clientes clientesRepository;
 private Connection connection;
 private final R_Autos autosRepository;
    public DatosVehiculares() {
        initComponents();
        // Configura la conexión a la base de datos aquí (asegúrate de que sea válida)
    try {
         connection = Conexion.obtenerConnection(); // Obtener la conexión aquí
         } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al conectar a la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
    }
this.clientesRepository = new R_Clientes(this.connection);
    this.autosRepository = new R_Autos(this.connection);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JButton jButton2 = new javax.swing.JButton();
        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
        txtVin = new javax.swing.JTextField();
        txtAuto = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtAño = new javax.swing.JTextField();
        txtMatricula = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        ComboBox = new javax.swing.JComboBox<>();
        javax.swing.JButton btnLogin = new javax.swing.JButton();
        javax.swing.JButton btnBack = new javax.swing.JButton();
        javax.swing.JLabel jLabel9 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel11 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel12 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel13 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel14 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel15 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel16 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel8 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("DATOS VEHICULARES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 6, 413, 64));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Valor");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 50, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Auto");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 66, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Modelo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 244, 66, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setText("Año");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 66, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("VIN");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, 40, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setText("Matricula");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 234, 86, -1));

        txtVin.setBackground(new java.awt.Color(0, 0, 0));
        txtVin.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtVin, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, 121, 33));

        txtAuto.setBackground(new java.awt.Color(0, 0, 0));
        txtAuto.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 136, 121, 33));

        txtModelo.setBackground(new java.awt.Color(0, 0, 0));
        txtModelo.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 242, 121, 33));

        txtAño.setBackground(new java.awt.Color(0, 0, 0));
        txtAño.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 360, 121, 33));

        txtMatricula.setBackground(new java.awt.Color(0, 0, 0));
        txtMatricula.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 232, 121, 33));

        txtValor.setBackground(new java.awt.Color(0, 0, 0));
        txtValor.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 136, 121, 33));

        ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ARS", "EU" }));
        ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(782, 141, -1, -1));

        btnLogin.setBackground(new java.awt.Color(0, 0, 0));
        btnLogin.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 570, 110, 41));

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 570, 110, 41));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono Tesla.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, -10, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 0, 0));
        jLabel11.setText("*");
        jLabel11.setToolTipText("Marca Del Auto");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 20, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 0, 0));
        jLabel12.setText("*");
        jLabel12.setToolTipText("Modelo Del Auto");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 20, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 0, 0));
        jLabel13.setText("*");
        jLabel13.setToolTipText(" Matricula del auto");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 20, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 0, 0));
        jLabel14.setText("*");
        jLabel14.setToolTipText("Identificacion del Vehiculo  Opcional");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, 20, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 0, 0));
        jLabel15.setText("*");
        jLabel15.setToolTipText("Año del Auto");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 20, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 0, 0));
        jLabel16.setText("*");
        jLabel16.setToolTipText("Los Precios son en Dolares");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 20, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo de Pantalla.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

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

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
          String auto=txtAuto.getText();
        String año=txtAño.getText();
        String matricula=txtMatricula.getText();
        String modelo=txtModelo.getText();
        String valor=txtValor.getText();
        String vin=txtVin.getText();
        if (auto.isEmpty() || año.isEmpty() || matricula.isEmpty() || modelo.isEmpty() || valor.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
        if (matricula.length()==6) {
            
        } else {
            JOptionPane.showMessageDialog(this, "Matricula tiene que tener 6 caracteres","ERROR",JOptionPane.ERROR_MESSAGE);
        return;
        }

        

R_Autos autosRepository = new R_Autos(connection); // Asegúrate de que 'connection' esté configurada correctamente
autosRepository.agregarAuto(auto, modelo, Integer.parseInt(año), vin, matricula, Double.parseDouble(valor));

// Show a success message
JOptionPane.showMessageDialog(this, "Registro agregado con éxito.");
        ElegirElPlan ep = new ElegirElPlan();
        ep.setVisible(true);
        ep.setLocationRelativeTo(null);
        ep.setSize(1000, 700);
        ep.setTitle("PLANES SEGUROS");
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxActionPerformed
        // TODO add your handling code here:
            
    String MonedaCambio = ComboBox.getSelectedItem().toString();
    String cantidadpunt=txtValor.getText().replace(",",".");
    txtValor.setText(cantidadpunt);
    double cantidad = Double.parseDouble(cantidadpunt);
    
    
    double cantidadEnDolares = convertirAMonedaUSD(cantidad, MonedaCambio);
    
   
    txtValor.setText(String.format("%.2f",cantidadEnDolares));
    String cantidadEnDolaress=txtValor.getText().replace(",", ".");
    txtValor.setText(cantidadEnDolaress);
    

        
    }//GEN-LAST:event_ComboBoxActionPerformed

   
private double convertirAMonedaUSD(double cantidad, String monedaOrigen) {
    
    double tasaARSaUSD =0.0029; 
    double tasaEURaUSD = 1.07;  
    
    
    switch (monedaOrigen) {
        case "ARS":
            return cantidad * tasaARSaUSD;
        case "EU":
            return cantidad * tasaEURaUSD;
        
        default:
            return cantidad; 
    }
}

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox;
    private javax.swing.JTextField txtAuto;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtValor;
    private javax.swing.JTextField txtVin;
    // End of variables declaration//GEN-END:variables
}
