package repositorios;

import conectores.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class R_Clientes {
    private Connection connection;

    public R_Clientes() {
    }

    public R_Clientes(Connection connection) {
        this.connection = connection;
    }

    public void agregarCliente(String nombre, String apellido, String fechaDeNacimiento, String direccion, String nroContacto, String dni, String nrocontactoaux) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            // Obtener una conexión a la base de datos utilizando la clase Conexion
            conn = Conexion.obtenerConnection();

            // Crear una sentencia SQL de inserción sin la columna 'id'
            String sql = "INSERT INTO Clientes (nombre, apellido, FechaDeNacimiento, direccion, nrocontacto, dni, nrocontactoaux) VALUES (?, ?, ?, ?, ?, ?, ?)";
            pstmt = conn.prepareStatement(sql);

            // Establecer los valores de los parámetros
            pstmt.setString(1, nombre);
            pstmt.setString(2, apellido);
            pstmt.setString(3, fechaDeNacimiento);
            pstmt.setString(4, direccion);
            pstmt.setString(5, nroContacto);
            pstmt.setString(6, dni);
            pstmt.setString(7, nrocontactoaux);

            // Ejecutar la sentencia SQL de inserción
            pstmt.executeUpdate();

            System.out.println("Cliente agregado con éxito.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error al agregar el cliente a la base de datos.");
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
