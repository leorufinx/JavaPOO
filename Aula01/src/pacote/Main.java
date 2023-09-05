package pacote;

public class Main {
	public static void main(String[] args) {
		
		Caneta c1 = new Caneta();
		Caneta c2 = new Caneta();
		
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.carga = 1;
		c1.modelo = "bic";
		
		c1.tampar();
		c1.rabiscar();
		//c1.status();
		
		
		c2.modelo = "faber Castel";
		c2.cor = "Preta";
		c2.rabiscar();
		c2.status();
		
	}
}
