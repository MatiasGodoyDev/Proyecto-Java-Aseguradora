package gui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import conectores.Conexion;
import java.sql.DriverManager;
import javax.swing.JLabel;


public class ElegirElPlan extends javax.swing.JFrame {
        Connection connection;
    
    public ElegirElPlan() {
        try {
            JLabel jLabel7 = new JLabel();
            jLabel7.setIcon(null);
        initComponents();
        txtBasicoMes.setEditable(false);
        txtAmplioAño.setEditable(false);
        txtAmplioPlusMes.setEditable(false);
        txtPremiumMes.setEditable(false);
        jTabbedPane1.setVisible(true);
        jTabbedPane1.setOpaque(false);
         connection = Conexion.obtenerConnection(); // Obtener la conexión aquí
         } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al conectar a la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        javax.swing.JPanel jPanel5 = new javax.swing.JPanel();
        javax.swing.JButton btnComprarAmplioMes = new javax.swing.JButton();
        javax.swing.JLabel jLabel8 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel9 = new javax.swing.JLabel();
        txtMonedaAmplioMes = new javax.swing.JTextField();
        cbMonedaAmplioMes = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabel20 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        javax.swing.JButton btnComprarAmplioAño = new javax.swing.JButton();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        txtAmplioAño = new javax.swing.JTextField();
        cbMonedaAmplioAño = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabel24 = new javax.swing.JLabel();
        javax.swing.JTabbedPane jTabbedPane2 = new javax.swing.JTabbedPane();
        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        javax.swing.JButton btnComprarBasicoMes = new javax.swing.JButton();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        txtBasicoMes = new javax.swing.JTextField();
        cbMonedaBasicoMes = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabel25 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel3 = new javax.swing.JPanel();
        javax.swing.JButton btnComprarBasicoAño = new javax.swing.JButton();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        txtBasicoAño = new javax.swing.JTextField();
        cbMonedaBasicoAño = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabel19 = new javax.swing.JLabel();
        javax.swing.JTabbedPane jTabbedPane3 = new javax.swing.JTabbedPane();
        javax.swing.JPanel jPanel6 = new javax.swing.JPanel();
        javax.swing.JButton btnComprarPremiumMes = new javax.swing.JButton();
        javax.swing.JLabel jLabel14 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel16 = new javax.swing.JLabel();
        txtPremiumMes = new javax.swing.JTextField();
        cbMonedaPremiumMes = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabel23 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel7 = new javax.swing.JPanel();
        javax.swing.JButton btnComprarPremiumAño = new javax.swing.JButton();
        javax.swing.JLabel jLabel15 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel17 = new javax.swing.JLabel();
        txtPremiumAño = new javax.swing.JTextField();
        cbMonedaPremiumAño = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabel26 = new javax.swing.JLabel();
        javax.swing.JTabbedPane jTabbedPane4 = new javax.swing.JTabbedPane();
        javax.swing.JPanel jPanel9 = new javax.swing.JPanel();
        javax.swing.JButton btnComprarAmplioPlusMes = new javax.swing.JButton();
        javax.swing.JLabel jLabel10 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel11 = new javax.swing.JLabel();
        txtAmplioPlusMes = new javax.swing.JTextField();
        cbMonedaAmplioPlusMes = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabel22 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel8 = new javax.swing.JPanel();
        javax.swing.JButton btnComprarAmplioPlusAño = new javax.swing.JButton();
        javax.swing.JLabel jLabel12 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel13 = new javax.swing.JLabel();
        txtAmplioPlusAño = new javax.swing.JTextField();
        cbMonedaAmplioPlusAño = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabel21 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(0, 0, 0));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnComprarAmplioMes.setText("COMPRAR");
        btnComprarAmplioMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarAmplioMesActionPerformed(evt);
            }
        });
        jPanel5.add(btnComprarAmplioMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Toyota icono Amplio.png"))); // NOI18N
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("SEGURO AMPLIO");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 180, 30));

        txtMonedaAmplioMes.setText("$62941,00");
        jPanel5.add(txtMonedaAmplioMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 90, 30));

        cbMonedaAmplioMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ARS", "USD" }));
        cbMonedaAmplioMes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMonedaAmplioMesItemStateChanged(evt);
            }
        });
        jPanel5.add(cbMonedaAmplioMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Tesla Video Ventana chica.gif"))); // NOI18N
        jLabel20.setText("jLabel20");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 340, 290));

        jTabbedPane1.addTab("MES", jPanel5);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnComprarAmplioAño.setText("COMPRAR");
        btnComprarAmplioAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarAmplioAñoActionPerformed(evt);
            }
        });
        jPanel4.add(btnComprarAmplioAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SEGURO AMPLIO");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 180, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Toyota icono Amplio.png"))); // NOI18N
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        txtAmplioAño.setText("$755292,00 ");
        jPanel4.add(txtAmplioAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 90, 30));

        cbMonedaAmplioAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ARS", "USD" }));
        cbMonedaAmplioAño.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMonedaAmplioAñoItemStateChanged(evt);
            }
        });
        jPanel4.add(cbMonedaAmplioAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Tesla Video Ventana chica.gif"))); // NOI18N
        jLabel24.setText("jLabel24");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 280));

        jTabbedPane1.addTab("AÑO", jPanel4);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 340, 310));

        jTabbedPane2.setBackground(new java.awt.Color(0, 0, 0));
        jTabbedPane2.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnComprarBasicoMes.setText("COMPRAR");
        btnComprarBasicoMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarBasicoMesActionPerformed(evt);
            }
        });
        jPanel2.add(btnComprarBasicoMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SEGURO BASICO");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 150, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fiat icono Basico.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        txtBasicoMes.setText("$38114,00");
        jPanel2.add(txtBasicoMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 90, 30));

        cbMonedaBasicoMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ARS", "USD" }));
        cbMonedaBasicoMes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMonedaBasicoMesItemStateChanged(evt);
            }
        });
        jPanel2.add(cbMonedaBasicoMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, -1, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Tesla Video Ventana chica.gif"))); // NOI18N
        jLabel25.setText("jLabel25");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 340, 290));

        jTabbedPane2.addTab("MES", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnComprarBasicoAño.setText("COMPRAR");
        btnComprarBasicoAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarBasicoAñoActionPerformed(evt);
            }
        });
        jPanel3.add(btnComprarBasicoAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SEGURO BASICO");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 160, 30));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fiat icono Basico.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        txtBasicoAño.setText("$457368,00 ");
        jPanel3.add(txtBasicoAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 90, 30));

        cbMonedaBasicoAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ARS", "USD" }));
        cbMonedaBasicoAño.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMonedaBasicoAñoItemStateChanged(evt);
            }
        });
        jPanel3.add(cbMonedaBasicoAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 60, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Tesla Video Ventana chica.gif"))); // NOI18N
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 280));

        jTabbedPane2.addTab("AÑO", jPanel3);

        jPanel1.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 340, 310));

        jTabbedPane3.setBackground(new java.awt.Color(0, 0, 0));
        jTabbedPane3.setForeground(new java.awt.Color(255, 255, 255));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnComprarPremiumMes.setText("COMPRAR");
        btnComprarPremiumMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarPremiumMesActionPerformed(evt);
            }
        });
        jPanel6.add(btnComprarPremiumMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, 30));

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("SEGURO PREMIUM");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 180, 30));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lamborghini icono Premium.png"))); // NOI18N
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        txtPremiumMes.setText("$174836,00");
        jPanel6.add(txtPremiumMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 90, 30));

        cbMonedaPremiumMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ARS", "USD" }));
        cbMonedaPremiumMes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMonedaPremiumMesItemStateChanged(evt);
            }
        });
        jPanel6.add(cbMonedaPremiumMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Tesla Video Ventana chica.gif"))); // NOI18N
        jLabel23.setText("jLabel23");
        jPanel6.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 290));

        jTabbedPane3.addTab("MES", jPanel6);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnComprarPremiumAño.setText("COMPRAR");
        btnComprarPremiumAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarPremiumAñoActionPerformed(evt);
            }
        });
        jPanel7.add(btnComprarPremiumAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, 30));

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("SEGURO PREMIUM");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 180, 30));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lamborghini icono Premium.png"))); // NOI18N
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        txtPremiumAño.setText("$2097032,00 ");
        jPanel7.add(txtPremiumAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 90, 30));

        cbMonedaPremiumAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ARS", "USD" }));
        cbMonedaPremiumAño.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMonedaPremiumAñoItemStateChanged(evt);
            }
        });
        jPanel7.add(cbMonedaPremiumAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Tesla Video Ventana chica.gif"))); // NOI18N
        jLabel26.setText("jLabel26");
        jPanel7.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 290));

        jTabbedPane3.addTab("AÑO", jPanel7);

        jPanel1.add(jTabbedPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, 340, 310));

        jTabbedPane4.setBackground(new java.awt.Color(0, 0, 0));
        jTabbedPane4.setForeground(new java.awt.Color(255, 255, 255));

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnComprarAmplioPlusMes.setText("COMPRAR");
        btnComprarAmplioPlusMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarAmplioPlusMesActionPerformed(evt);
            }
        });
        jPanel9.add(btnComprarAmplioPlusMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 193, -1, 30));

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("SEGURO AMPLIO PLUS");
        jPanel9.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 230, 30));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Bentley icono Amplio Plus.png"))); // NOI18N
        jPanel9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        txtAmplioPlusMes.setText("$104901,00");
        jPanel9.add(txtAmplioPlusMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 90, 30));

        cbMonedaAmplioPlusMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ARS", "USD" }));
        cbMonedaAmplioPlusMes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMonedaAmplioPlusMesItemStateChanged(evt);
            }
        });
        cbMonedaAmplioPlusMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMonedaAmplioPlusMesActionPerformed(evt);
            }
        });
        jPanel9.add(cbMonedaAmplioPlusMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Tesla Video Ventana chica.gif"))); // NOI18N
        jLabel22.setText("jLabel22");
        jPanel9.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 340, 300));

        jTabbedPane4.addTab("MES", jPanel9);

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnComprarAmplioPlusAño.setText("COMPRAR");
        btnComprarAmplioPlusAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarAmplioPlusAñoActionPerformed(evt);
            }
        });
        jPanel8.add(btnComprarAmplioPlusAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 193, -1, 30));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Bentley icono Amplio Plus.png"))); // NOI18N
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("SEGURO AMPLIO PLUS");
        jPanel8.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 230, 30));

        txtAmplioPlusAño.setText("$1258812,00");
        jPanel8.add(txtAmplioPlusAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 90, 30));

        cbMonedaAmplioPlusAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ARS", "USD" }));
        cbMonedaAmplioPlusAño.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMonedaAmplioPlusAñoItemStateChanged(evt);
            }
        });
        jPanel8.add(cbMonedaAmplioPlusAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Tesla Video Ventana chica.gif"))); // NOI18N
        jLabel21.setText("jLabel21");
        jPanel8.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 290));

        jTabbedPane4.addTab("AÑO", jPanel8);

        jPanel1.add(jTabbedPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 340, 310));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo de Pantalla.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnComprarAmplioMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarAmplioMesActionPerformed
        // TODO add your handling code here:
        PanelPrincipalClientes ppc = new PanelPrincipalClientes();
        ppc.setVisible(true);
        ppc.setLocationRelativeTo(null);
       ppc.setSize(1000, 700);
       ppc.setTitle("CLIENTES");
     try {
    String nombreSeguro = "AMPLIO"; // Define el nombre del seguro aquí
    
    String sql = "INSERT INTO seguros (nombredelseguro) VALUES (?)";
    PreparedStatement pstmt = connection.prepareStatement(sql);
    pstmt.setString(1, nombreSeguro); // Establece el valor del parámetro en el nombre del seguro
    
    int filasAfectadas = pstmt.executeUpdate();
    
    if (filasAfectadas > 0) {
        JOptionPane.showMessageDialog(this, "Compra Realizada Correctamente ,su recibo se enviara a su domicilio. .");
    } else {
        JOptionPane.showMessageDialog(this, "Error al ingresar el seguro en la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
    }
} catch (SQLException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Error al ingresar el seguro en la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
}
        dispose();
    }//GEN-LAST:event_btnComprarAmplioMesActionPerformed

    private void btnComprarBasicoAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarBasicoAñoActionPerformed
        // TODO add your handling code here:
       PanelPrincipalClientes ppc = new PanelPrincipalClientes();
        ppc.setVisible(true);
        ppc.setLocationRelativeTo(null);
       ppc.setSize(1000, 700);
       ppc.setTitle("CLIENTES");
        try {
    String nombreSeguro = "BASICO"; // Define el nombre del seguro aquí
    
    String sql = "INSERT INTO seguros (nombredelseguro) VALUES (?)";
    PreparedStatement pstmt = connection.prepareStatement(sql);
    pstmt.setString(1, nombreSeguro); // Establece el valor del parámetro en el nombre del seguro
    
    int filasAfectadas = pstmt.executeUpdate();
    
    if (filasAfectadas > 0) {
      dispose();
    } else {
        JOptionPane.showMessageDialog(this, "Error al ingresar el seguro en la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
    }
} catch (SQLException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Error al ingresar el seguro en la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
}
        dispose();
    }//GEN-LAST:event_btnComprarBasicoAñoActionPerformed

    private void btnComprarBasicoMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarBasicoMesActionPerformed
        // TODO add your handling code here:
        //codigo que la compra fue realizada 
       PanelPrincipalClientes ppc = new PanelPrincipalClientes();
        ppc.setVisible(true);
        ppc.setLocationRelativeTo(null);
       ppc.setSize(1000, 700);
       ppc.setTitle("CLIENTES");
        try {
    String nombreSeguro = "BASICO"; // Define el nombre del seguro aquí
    
    String sql = "INSERT INTO seguros (nombredelseguro) VALUES (?)";
    PreparedStatement pstmt = connection.prepareStatement(sql);
    pstmt.setString(1, nombreSeguro); // Establece el valor del parámetro en el nombre del seguro
    
    int filasAfectadas = pstmt.executeUpdate();
    
    if (filasAfectadas > 0) {
        JOptionPane.showMessageDialog(this, "Compra Realizada Correctamente ,su recibo se enviara a su domicilio. .");
    } else {
        JOptionPane.showMessageDialog(this, "Error al ingresar el seguro en la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
    }
} catch (SQLException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Error al ingresar el seguro en la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
}
        dispose();
    }//GEN-LAST:event_btnComprarBasicoMesActionPerformed

    private void btnComprarAmplioPlusMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarAmplioPlusMesActionPerformed
        // TODO add your handling code here:
        PanelPrincipalClientes ppc = new PanelPrincipalClientes();
        ppc.setVisible(true);
        ppc.setLocationRelativeTo(null);
       ppc.setSize(1000, 700);
       ppc.setTitle("CLIENTES");
        try {
    String nombreSeguro = "AMPLIO PLUS"; // Define el nombre del seguro aquí
    
    String sql = "INSERT INTO seguros (nombredelseguro) VALUES (?)";
    PreparedStatement pstmt = connection.prepareStatement(sql);
    pstmt.setString(1, nombreSeguro); // Establece el valor del parámetro en el nombre del seguro
    
    int filasAfectadas = pstmt.executeUpdate();
    
    if (filasAfectadas > 0) {
        JOptionPane.showMessageDialog(this, "Compra Realizada Correctamente ,su recibo se enviara a su domicilio. .");
    } else {
        JOptionPane.showMessageDialog(this, "Error al ingresar el seguro en la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
    }
} catch (SQLException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Error al ingresar el seguro en la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
}
        dispose();
    }//GEN-LAST:event_btnComprarAmplioPlusMesActionPerformed

    private void btnComprarPremiumMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarPremiumMesActionPerformed
        // TODO add your handling code here:
        PanelPrincipalClientes ppc = new PanelPrincipalClientes();
        ppc.setVisible(true);
        ppc.setLocationRelativeTo(null);
       ppc.setSize(1000, 700);
       ppc.setTitle("CLIENTES");
        try {
    String nombreSeguro = "PREMIUM"; // Define el nombre del seguro aquí
    
    String sql = "INSERT INTO seguros (nombredelseguro) VALUES (?)";
    PreparedStatement pstmt = connection.prepareStatement(sql);
    pstmt.setString(1, nombreSeguro); // Establece el valor del parámetro en el nombre del seguro
    
    int filasAfectadas = pstmt.executeUpdate();
    
    if (filasAfectadas > 0) {
        JOptionPane.showMessageDialog(this, "Compra Realizada Correctamente ,su recibo se enviara a su domicilio. .");
        
    } else {
        JOptionPane.showMessageDialog(this, "Error al ingresar el seguro en la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
    }
} catch (SQLException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Error al ingresar el seguro en la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
}
        dispose();
    }//GEN-LAST:event_btnComprarPremiumMesActionPerformed

    private void cbMonedaBasicoMesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMonedaBasicoMesItemStateChanged
        // TODO add your handling code here:
// Obtiene la opción seleccionada en el ComboBox
    String monedaSeleccionada = cbMonedaBasicoMes.getSelectedItem().toString();

    // Supongamos que el resultado en pesos argentinos es 47820
    double cantidadEnPesos = 38114.0;
    
    if (monedaSeleccionada.equals("ARS")) {
        txtBasicoMes.setText(String.format("$%.2f ", cantidadEnPesos));
    } else if (monedaSeleccionada.equals("USD")) {
        // Realiza la conversión a dólares
        double cantidadEnDolares = convertirPesosADolares(cantidadEnPesos);
        txtBasicoMes.setText(String.format("%.2f USD", cantidadEnDolares));
    }
    }//GEN-LAST:event_cbMonedaBasicoMesItemStateChanged

    private void cbMonedaBasicoAñoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMonedaBasicoAñoItemStateChanged
        // TODO add your handling code here:
        // Obtiene la opción seleccionada en el ComboBox
    String monedaSeleccionada = cbMonedaBasicoAño.getSelectedItem().toString();

    // Supongamos que el resultado en pesos argentinos es 47820
    double cantidadEnPesos = 457368.0;
    
    if (monedaSeleccionada.equals("ARS")) {
        txtBasicoAño.setText(String.format("$%.2f ", cantidadEnPesos));
    } else if (monedaSeleccionada.equals("USD")) {
        // Realiza la conversión a dólares
        double cantidadEnDolares = convertirPesosADolares(cantidadEnPesos);
        txtBasicoAño.setText(String.format("%.2f USD", cantidadEnDolares));
    }
 
    }//GEN-LAST:event_cbMonedaBasicoAñoItemStateChanged

    private void cbMonedaAmplioMesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMonedaAmplioMesItemStateChanged
        // TODO add your handling code here:
            // Obtiene la opción seleccionada en el ComboBox
    String monedaSeleccionada =    cbMonedaAmplioMes.getSelectedItem().toString();

    // Supongamos que el resultado en pesos argentinos es 47820
    double cantidadEnPesos = 62941.0;
    
    if (monedaSeleccionada.equals("ARS")) {
        txtMonedaAmplioMes.setText(String.format("$%.2f ", cantidadEnPesos));
    } else if (monedaSeleccionada.equals("USD")) {
        // Realiza la conversión a dólares
        double cantidadEnDolares = convertirPesosADolares(cantidadEnPesos);
        txtMonedaAmplioMes.setText(String.format("%.2f USD", cantidadEnDolares));
    }
 
    }//GEN-LAST:event_cbMonedaAmplioMesItemStateChanged

    private void cbMonedaAmplioAñoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMonedaAmplioAñoItemStateChanged
        // TODO add your handling code here:
            // Obtiene la opción seleccionada en el ComboBox
    String monedaSeleccionada = cbMonedaAmplioAño.getSelectedItem().toString();

    // Supongamos que el resultado en pesos argentinos es 47820
    double cantidadEnPesos = 755292.0;
    
    if (monedaSeleccionada.equals("ARS")) {
        txtAmplioAño.setText(String.format("$%.2f ", cantidadEnPesos));
    } else if (monedaSeleccionada.equals("USD")) {
        // Realiza la conversión a dólares
        double cantidadEnDolares = convertirPesosADolares(cantidadEnPesos);
        txtAmplioAño.setText(String.format("%.2f USD", cantidadEnDolares));
    }
 
    }//GEN-LAST:event_cbMonedaAmplioAñoItemStateChanged

    private void cbMonedaAmplioPlusMesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMonedaAmplioPlusMesItemStateChanged
        // TODO add your handling code here:
                   // Obtiene la opción seleccionada en el ComboBox
    String monedaSeleccionada = cbMonedaAmplioPlusMes.getSelectedItem().toString();

    // Supongamos que el resultado en pesos argentinos es 47820
    double cantidadEnPesos = 104901.0;
    
    if (monedaSeleccionada.equals("ARS")) {
        txtAmplioPlusMes.setText(String.format("$%.2f ", cantidadEnPesos));
    } else if (monedaSeleccionada.equals("USD")) {
        // Realiza la conversión a dólares
        double cantidadEnDolares = convertirPesosADolares(cantidadEnPesos);
        txtAmplioPlusMes.setText(String.format("%.2f USD", cantidadEnDolares));
    }
 
    }//GEN-LAST:event_cbMonedaAmplioPlusMesItemStateChanged

    private void cbMonedaAmplioPlusAñoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMonedaAmplioPlusAñoItemStateChanged
        // TODO add your handling code here:
                   // Obtiene la opción seleccionada en el ComboBox
    String monedaSeleccionada = cbMonedaAmplioPlusAño.getSelectedItem().toString();

    // Supongamos que el resultado en pesos argentinos es 47820
    double cantidadEnPesos = 1258812.0;
    
    if (monedaSeleccionada.equals("ARS")) {
        txtAmplioPlusAño.setText(String.format("$%.2f ", cantidadEnPesos));
    } else if (monedaSeleccionada.equals("USD")) {
        // Realiza la conversión a dólares
        double cantidadEnDolares = convertirPesosADolares(cantidadEnPesos);
        txtAmplioPlusAño.setText(String.format("%.2f USD", cantidadEnDolares));
    }
 
    }//GEN-LAST:event_cbMonedaAmplioPlusAñoItemStateChanged

    private void cbMonedaPremiumMesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMonedaPremiumMesItemStateChanged
        // TODO add your handling code here:
                   // Obtiene la opción seleccionada en el ComboBox
    String monedaSeleccionada = cbMonedaPremiumMes.getSelectedItem().toString();

    // Supongamos que el resultado en pesos argentinos es 47820
    double cantidadEnPesos = 174836.0;
    
    if (monedaSeleccionada.equals("ARS")) {
        txtPremiumMes.setText(String.format("$%.2f ", cantidadEnPesos));
    } else if (monedaSeleccionada.equals("USD")) {
        // Realiza la conversión a dólares
        double cantidadEnDolares = convertirPesosADolares(cantidadEnPesos);
        txtPremiumMes.setText(String.format("%.2f USD", cantidadEnDolares));
    }
 
    }//GEN-LAST:event_cbMonedaPremiumMesItemStateChanged

    private void cbMonedaPremiumAñoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMonedaPremiumAñoItemStateChanged
        // TODO add your handling code here:
                   // Obtiene la opción seleccionada en el ComboBox
    String monedaSeleccionada = cbMonedaPremiumAño.getSelectedItem().toString();

    // Supongamos que el resultado en pesos argentinos es 47820
    double cantidadEnPesos = 2097032.0;
    
    if (monedaSeleccionada.equals("ARS")) {
        txtPremiumAño.setText(String.format("$%.2f ", cantidadEnPesos));
    } else if (monedaSeleccionada.equals("USD")) {
        // Realiza la conversión a dólares
        double cantidadEnDolares = convertirPesosADolares(cantidadEnPesos);
        txtPremiumAño.setText(String.format("$%.2f USD", cantidadEnDolares));
    }
 
    }//GEN-LAST:event_cbMonedaPremiumAñoItemStateChanged

    private void btnComprarAmplioAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarAmplioAñoActionPerformed
        // TODO add your handling code here:
        
        PanelPrincipalClientes ppc = new PanelPrincipalClientes();
        ppc.setVisible(true);
        ppc.setLocationRelativeTo(null);
       ppc.setSize(1000, 700);
       ppc.setTitle("CLIENTES");
        try {
    String nombreSeguro = "AMPLIO"; // Define el nombre del seguro aquí
    
    String sql = "INSERT INTO seguros (nombredelseguro) VALUES (?)";
    PreparedStatement pstmt = connection.prepareStatement(sql);
    pstmt.setString(1, nombreSeguro); // Establece el valor del parámetro en el nombre del seguro
    
    int filasAfectadas = pstmt.executeUpdate();
    
    if (filasAfectadas > 0) {
     dispose();
    } else {
        JOptionPane.showMessageDialog(this, "Error al ingresar el seguro en la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
    }
} catch (SQLException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Error al ingresar el seguro en la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_btnComprarAmplioAñoActionPerformed

    private void btnComprarAmplioPlusAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarAmplioPlusAñoActionPerformed
        // TODO add your handling code here:
       
        PanelPrincipalClientes ppc = new PanelPrincipalClientes();
        ppc.setVisible(true);
        ppc.setLocationRelativeTo(null);
       ppc.setSize(1000, 700);
       ppc.setTitle("CLIENTES");
        try {
    String nombreSeguro = "AMPLIO PLUS"; // Define el nombre del seguro aquí
    
    String sql = "INSERT INTO seguros (nombredelseguro) VALUES (?)";
    PreparedStatement pstmt = connection.prepareStatement(sql);
    pstmt.setString(1, nombreSeguro); // Establece el valor del parámetro en el nombre del seguro
    
    int filasAfectadas = pstmt.executeUpdate();
    
    if (filasAfectadas > 0) {
 dispose();
    } else {
        JOptionPane.showMessageDialog(this, "Error al ingresar el seguro en la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
    }
} catch (SQLException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Error al ingresar el seguro en la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_btnComprarAmplioPlusAñoActionPerformed

    private void btnComprarPremiumAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarPremiumAñoActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this," Compra Realizada Correctamente ,su recibo se enviara a su domicilio. ");
        PanelPrincipalClientes ppc = new PanelPrincipalClientes();
        ppc.setVisible(true);
        ppc.setLocationRelativeTo(null);
       ppc.setSize(1000, 700);
       ppc.setTitle("CLIENTES");
        try {
    String nombreSeguro = "PREMIUM"; // Define el nombre del seguro aquí
    
    String sql = "INSERT INTO seguros (nombredelseguro) VALUES (?)";
    PreparedStatement pstmt = connection.prepareStatement(sql);
    pstmt.setString(1, nombreSeguro); // Establece el valor del parámetro en el nombre del seguro
    
    int filasAfectadas = pstmt.executeUpdate();
    
    if (filasAfectadas > 0) {
            dispose();
    } else {
        JOptionPane.showMessageDialog(this, "Error al ingresar el seguro en la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
    }
} catch (SQLException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Error al ingresar el seguro en la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
}
    
    }//GEN-LAST:event_btnComprarPremiumAñoActionPerformed

    private void cbMonedaAmplioPlusMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMonedaAmplioPlusMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMonedaAmplioPlusMesActionPerformed
private double convertirPesosADolares(double cantidadEnPesos) {
    // Tasa de cambio: 1 USD = 350 ARS
    double tasaCambio = 350.0;
    
    // Realizar la conversión
    double cantidadEnDolares = cantidadEnPesos / tasaCambio;
    
    return cantidadEnDolares;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbMonedaAmplioAño;
    private javax.swing.JComboBox<String> cbMonedaAmplioMes;
    private javax.swing.JComboBox<String> cbMonedaAmplioPlusAño;
    private javax.swing.JComboBox<String> cbMonedaAmplioPlusMes;
    private javax.swing.JComboBox<String> cbMonedaBasicoAño;
    private javax.swing.JComboBox<String> cbMonedaBasicoMes;
    private javax.swing.JComboBox<String> cbMonedaPremiumAño;
    private javax.swing.JComboBox<String> cbMonedaPremiumMes;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtAmplioAño;
    private javax.swing.JTextField txtAmplioPlusAño;
    private javax.swing.JTextField txtAmplioPlusMes;
    private javax.swing.JTextField txtBasicoAño;
    private javax.swing.JTextField txtBasicoMes;
    private javax.swing.JTextField txtMonedaAmplioMes;
    private javax.swing.JTextField txtPremiumAño;
    private javax.swing.JTextField txtPremiumMes;
    // End of variables declaration//GEN-END:variables
}
