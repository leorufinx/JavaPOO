package pacote;

public class Caneta {
	
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	protected boolean tampada;
	
	public void status() {
		System.out.println("cor: " + this.cor);
		System.out.println("modelo: " +this.modelo);
		System.out.println("ponta: " + this.ponta);
		System.out.println("carga " + this.carga);
		System.out.println("está tampada? " + this.tampada);
	}

	public void rabiscar() {
		if(this.tampada == true) {
			System.out.println("ERRO! não posso rabiscar :( ");
		} else {
			System.out.println("Rabiscando...");
		}
	}

	protected void tampar() {
		this.tampada = true;
	}

	protected void destampar() {
		this.tampada = false;
	}
}
