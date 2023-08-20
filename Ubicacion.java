public class Ubicacion {

    // Atributos
    
    private String localidad;
    private double precio; //En dólares
    private int espaciosDisp; //Espacios Disponibles

    //Métodos Auxiliares
        //Ir reduciendo la cantidad de espacios disponibles.
    public void disminuirEspacios(int cantidad) {
        espaciosDisp -= cantidad;
    }

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
