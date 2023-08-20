import java.util.Random;

class Boleto {

    private int numTicket, numA, numB;
    private String localidad;

    Random random = new Random();

    // Método Constructor
    public Boleto(int numTicket, int numA, int numB, String localidad){
        this.numTicket = numTicket;
        this.numA = numA;
        this.numB = numB;  
        this.localidad = localidad;
    }

    //m. get & set
    public int getNumTicket() { return numTicket; }
	public void setNumTicket(int numTicket){ this.numTicket = numTicket; }

    public int getNumA() { return numA; }
	public void setNumA(int numA){ this.numA = numA; }
    
    public int getNumB() { return numB; }
	public void setNumB(int numB){ this.numB = numB; }

    public String getLocalidad() { return localidad; }
    public void setLocalidad(String localidad) { this.localidad = localidad; }

    //m. de acción
    public boolean validarAptoCompra() {
        numTicket = random.nextInt(28000) + 1;
        numA = random.nextInt(15000) + 1;
        numB = random.nextInt(15000) + 1;
        return (numTicket + numA + numB) % 2 == 1;
    }

    public String validarEspacio(Comprador comprador1, Ubicacion[] localidades) {
        String cadena = "";
            if(comprador1.getCantBoletos() > localidades[0].getEspaciosDisp()) {
                cadena = cadena + "No hay suficientes espacios disponibles en esta localidad.";
            }
        return cadena;
    }
}
