public class Boleto {
    private int numTicket, numA, numB;

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
