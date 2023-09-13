package pacote;

public class Caneta {

	private boolean tampada;
	private String modelo;
	private float ponta;
	private String cor;

	public  Caneta(String m, String c, float p) {
		this.modelo = m;
		this.cor = c;
		this.ponta = p;
		this.tampar();
	}		

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String m) {
		this.modelo = m;
	}

	public Float getPonta() {
		return this.ponta;
	}

	public void setPonta(Float p) {
		this.ponta = p;
	}

	public String getCor() {
		return this.cor;
	}

	public void setCor(String c) {
		this.cor = c;
	}

	public Boolean getTampada() {
		return this.tampada;
	}

	public void setTampada(boolean t) {
		this.tampada = t;
	}

	public void tampar() {
		this.tampada = true;
	}

	public void destampar() {
		this.tampada = false;
	}

	public void status() {
		System.out.println("SOBRE A CANETA");
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Ponta: " + this.getPonta());
		System.out.println("Cor: " + this.getCor());
		System.out.println("Está tampada?: " + this.getTampada());
	}
}
