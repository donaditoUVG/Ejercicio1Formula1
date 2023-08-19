public class Comprador {
    
    private String nombre;
    private int dpi;
    private int cantBoletos;
    private double presupuesto;

    public Comprador(String nombre, int dpi, int cantBoletos, double presupuesto) {
        this.nombre = nombre;
        this.dpi = dpi;
        this.cantBoletos = cantBoletos;
        this.presupuesto = presupuesto;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getDpi() { return dpi; }
    public void setDpi(int dpi) { this.dpi = dpi; }

    public int getCantBoletos() { return cantBoletos; }
    public void setCantBoletos(int cantBoletos) { this.cantBoletos = cantBoletos; }

    public double getPresupuesto() { return presupuesto; }
    public void setPresupuesto(double presupuesto) { this.presupuesto = presupuesto; }
    
}
