package entidades;

public class Clientes {
    
    private String nombre;
    private String apellido;
    private String FechaDeNacimiento;
    private String direccion;
    private String nrocontacto;
    private String dni;
    private int id;
    
    private String nrocontactoaux;

    


    public Clientes() {
    }

    public Clientes(String nombre, String apellido, String FechaDeNacimiento, String direccion, String nrocontacto, String dni,int id,String nrocontactoaux) {
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setFechaDeNacimiento(FechaDeNacimiento);
        this.setDireccion(direccion);
        this.setNrocontacto(nrocontacto);
        this.setDni(dni);
        this.setId(id);
        this.setNrocontactoaux(nrocontactoaux);
    }
    public String getNrocontactoaux() {
        return nrocontactoaux;
    }

    public final void setNrocontactoaux(String nrocontactoaux) {
        this.nrocontactoaux = nrocontactoaux;
    }

    public int getId() {
        return id;
    }

    public final  void setId(int id) {
        this.id = id;
    }
       

    public String getDni() {
        return dni;
    }

    public final  void setDni(String dni) {
        this.dni = dni;
    }


    public String getNrocontacto() {
        return nrocontacto;
    }

    public final void setNrocontacto(String nrocontacto) {
        this.nrocontacto = nrocontacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public final void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public String getFechaDeNacimiento() {
        return FechaDeNacimiento;
    }

    public final void setFechaDeNacimiento(String FechaDeNacimiento) {
        this.FechaDeNacimiento = FechaDeNacimiento;
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
    

    
}
