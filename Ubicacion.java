public class Ubicacion {

    // Atributos
    
    private String localidad;
    private double precio;
    private int espaciosDisp; //Espacios Disponibles

    // Métodos

    public Ubicacion(String localidad, double precio, int espaciosDisp) {
        this.localidad = localidad;
        this.precio = precio;
        this.espaciosDisp = espaciosDisp;
    }

    //GET & SET
    public String getLocalidad() {
        return localidad;
    }
    public double getPrecio() {
        return precio;
    }

    public int getEspaciosDisp() {
        return espaciosDisp;
    }
}
