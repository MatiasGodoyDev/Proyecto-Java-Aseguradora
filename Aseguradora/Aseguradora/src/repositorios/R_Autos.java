package repositorios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class R_Autos {
    private Connection connection;
    

    public R_Autos(Connection connection) {
        this.connection = connection;
    }
    

    public void agregarAuto(String marca, String modelo, int año, String vin, String matricula, double valorAuto) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            // Obtener una conexión a la base de datos (ya se proporciona en el constructor)
            conn = connection;

            // Crear una sentencia SQL de inserción
            String sql = "INSERT INTO autos (marca, modelo, ano, vin, matricula, valor) VALUES (?, ?, ?, ?, ?, ?)";
            pstmt = conn.prepareStatement(sql);

            // Establecer los valores de los parámetros
            pstmt.setString(1, marca);
            pstmt.setString(2, modelo);
            pstmt.setInt(3, año);
            pstmt.setString(4, vin);
            pstmt.setString(5, matricula);
            pstmt.setDouble(6, valorAuto);

            // Ejecutar la sentencia SQL de inserción
            pstmt.executeUpdate();

            System.out.println("Auto agregado con éxito.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error al agregar el auto a la base de datos.");
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
