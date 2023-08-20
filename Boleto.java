import java.util.Random;
class Boleto {
    private int numTicket, numA, numB;
    private Ubicacion localidad;

    public Boleto() {
            
        
            Random random = new Random();
            numTicket = random.nextInt(28000) + 1; //Generación del ticket de 1 a 28,000
            numA = random.nextInt(15000) + 1; // Número aleatorio A
            numB = random.nextInt(15000) + 1; // Número aleatorio B
            localidad = null;
            }

            public boolean validarAptoCompra() {
                return (numTicket + numA + numB) % 2 == 1;
            }
        
            public void asignarUbicacion(Ubicacion localidad) {
                this.localidad = localidad;
            }

    // Método Constructor
    public Boleto(int numTicket, int numA, int numB){
        this.numTicket = numTicket;
        this.numA = numA;
        this.numB = numB;  
        
    }

    //m. get & set
    public int getNumTicket() { return numTicket; }
	public void setNumTicket(int numTicket){ this.numTicket = numTicket; }

    public int getNumA() { return numA; }
	public void setNumA(int numA){ this.numA = numA; }
    
    public int getNumB() { return numB; }
	public void setNumB(int numB){ this.numB = numB; }
}
