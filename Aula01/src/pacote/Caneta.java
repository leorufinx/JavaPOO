package pacote;

public class Caneta {
	
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	void status() {
		System.out.println("cor: " + this.cor);
		System.out.println("modelo: " +this.modelo);
		System.out.println("ponta: " + this.ponta);
		System.out.println("carga " + this.carga);
		System.out.println("está tampada? " + this.tampada);
	}

	void rabiscar() {
		if(this.tampada == true) {
			System.out.println("ERRO! não posso rabiscar :( ");
		} else {
			System.out.println("Rabiscando...");
		}
	}

	void tampar() {
		this.tampada = true;
	}

	void destampar() {
		this.tampada = false;
	}
}
