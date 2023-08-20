public class Comprador {
    //Atributos
    private String nombre;
    private String dpi;
    private int cantBoletos;
    private double presupuesto;



    // Método Constructor
    public Comprador(String nombre, String dpi, int cantBoletos, double presupuesto) {
        this.nombre = nombre;
        this.dpi = dpi;
        this.cantBoletos = cantBoletos;
        this.presupuesto = presupuesto;
    }

    public void restarBoletosComprados(int cantidad) {
        cantBoletos -= cantidad;
    }

    //Métodos Get & Set

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDpi() { return dpi; }
    public void setDpi(String dpi) { this.dpi = dpi; }

    public int getCantBoletos() { return cantBoletos; }
    public void setCantBoletos(int cantBoletos) { this.cantBoletos = cantBoletos; }

    public double getPresupuesto() { return presupuesto; }
    public void setPresupuesto(double presupuesto) { this.presupuesto = presupuesto; }
    
}
