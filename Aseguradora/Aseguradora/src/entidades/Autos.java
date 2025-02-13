package entidades;

public class Autos {
    
    
    private String Marca;
    private String modelo;
    private int año;
    private String Vin;//identificacion Vehicular
    private String matricula;
    private double valorauto;
    
     public Autos() {
    }
     

    public Autos(String Marca, String modelo, int año, String Vin, String matricula, double valorauto) {
        this.setMarca(Marca);
        this.setModelo(modelo);
        this.setAño(año);
        this.setVin(Vin);
        this.setMatricula(matricula);
        this.setValorauto(valorauto);
       
    }

    public double getValorauto() {
        return valorauto;
    }

    public final void setValorauto(double valorauto) {
        this.valorauto = valorauto;
    }


    public String getMatricula() {
        return matricula;
    }

    public final void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public String getVin() {
        return Vin;
    }

    public final void setVin(String Vin) {
        this.Vin = Vin;
    }
    
    public int getAño() {
        return año;
    }

    public final  void setAño(int año) {
        this.año = año;
    }


    public String getModelo() {
        return modelo;
    }

    public final void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public String getMarca() {
        return Marca;
    }

    public final  void setMarca(String Marca) {
        this.Marca = Marca;
    }

    
}
