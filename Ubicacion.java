public class Ubicacion {

    // Atributos
    
    private String localidad;
    private double precio; //En dólares
    private int espaciosDisp; //Espacios Disponibles

    //Métodos Auxiliares
        //Ir reduciendo la cantidad de espacios disponibles.
    public void disminuirEspacios(int cantBoletos) {
        espaciosDisp -= cantBoletos;
    }

    // Métodos

    public Ubicacion(String localidad, double precio, int espaciosDisp) {
        this.localidad = localidad;
        this.precio = precio;
        this.espaciosDisp = espaciosDisp;
    }

    //GET & SET
    public String getLocalidad() { return localidad; }
    public void setLocalidad(String localidad) { this.localidad = localidad; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public int getEspaciosDisp() { return espaciosDisp; }
    public void setEspaciosDisp(int espaciosDisp) { this.espaciosDisp = espaciosDisp; }
}
