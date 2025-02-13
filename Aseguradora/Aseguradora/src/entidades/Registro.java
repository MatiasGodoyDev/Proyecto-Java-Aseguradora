package entidades;
import java.util.ArrayList; // Importa ArrayList para manejar una lista de clientes

public class Registro {
    private String email;
    private String password;
    private String nombre;
    private String apellido;
    private String contrasena;
    private String usurname;
    private int id;

    public Registro(String email, String password, String nombre, String apellido, String contrasena, String usurname, int id) {
        this.email = email;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contrasena = contrasena;
        this.usurname = usurname;
        this.id = id;
    }
    
    

    // Agrega una lista de clientes para mantener el registro
    private ArrayList<Clientes> listaClientes = new ArrayList<>();

    // Resto de los métodos y propiedades de la clase

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

  

    public String getUsurname() {
        return usurname;
    }

    public final void setUsurname(String usurname) {
        this.usurname = usurname;
    }

    public String getContraseña() {
        return contrasena;
    }

    public final void setContraseña(String contraseña) {
        this.contrasena = contraseña;
    }

    public String getApellido() {
        return apellido;
    }

    public final void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public final void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Registro() {
    }



    public String getPassword() {
        return password;
    }

    public final void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public final void setEmail(String email) {
        this.email = email;
    }

   
}
