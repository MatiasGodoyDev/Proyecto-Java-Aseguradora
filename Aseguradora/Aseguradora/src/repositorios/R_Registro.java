package repositorios;
import conectores.Conexion;
import interfaces.I_Registro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class R_Registro{

    private Connection connection;

    public R_Registro(Connection connection) {
        this.connection = connection;
    }

    public void insertarRegistro(String email, String password, String nombre, String apellido, String usurname) {
    try {
        String query = "INSERT INTO registro (email, password, nombre, apellido, usurname) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, email);
        preparedStatement.setString(2, password);
        preparedStatement.setString(3, nombre);
        preparedStatement.setString(4, apellido);
        preparedStatement.setString(5, usurname);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
public boolean consultarRegistro(String usurname, String password) {
    Conexion db = new Conexion();
    
    try {
        Connection cn = db.obtenerConnection();
        PreparedStatement pst = cn.prepareStatement("SELECT usurname, password FROM registro WHERE usurname = ?");
        pst.setString(1, usurname); // Filtrar por el nombre de usuario
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            String passCorrecto = rs.getString("password");
            
            if (password.equals(passCorrecto)) {
                JOptionPane.showMessageDialog(null, "Login correcto Bienvenido " + usurname);
                return true; // Retorna true si el inicio de sesión es exitoso
            }
        }

        JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
        return false; // Retorna false si el inicio de sesión no es exitoso

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error " + e);
        return false; // Retorna false en caso de error
    }
}

    public boolean usuarioExistente(String username) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet resultSet = null;

        try {
            String query = "SELECT COUNT(*) FROM registro WHERE email = ?";
            stmt = connection.prepareStatement(query);
            stmt.setString(1, username);

            resultSet = stmt.executeQuery();

            // Si hay al menos un resultado, significa que el usuario ya existe
            return resultSet.next() && resultSet.getInt(1) > 0;
        } finally {
            // Cerrar recursos
            if (resultSet != null) {
                resultSet.close();
            }
            if (stmt != null) {
                stmt.close();
            }
        }
    }
}