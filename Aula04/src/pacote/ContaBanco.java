package pacote;

public class ContaBanco {

	public int numConta;
	protected String tipo;
	private String dono;
	private float saldoConta;
	private boolean status;
	
	public void estadoAtual () {
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldoConta());
		System.out.println("Status: " +this.getStatus());
	}

	public ContaBanco() {

		this.setStatus(false);
		this.setSaldoConta(0);
	}

	public void abrirConta(String t) {

		this.setTipo(t);
		this.setStatus(true);

		if ("CC".equals(t)) {
			this.setSaldoConta(50);
		} else if ("CP".equals(t)) {
			this.setSaldoConta(150);
		}
		System.out.println("Conta aberta!");
	}

	public void fecharConta() {
		if (this.getSaldoConta() > 0) {
			System.out.println("Conta com dinheiro, não pode ser fechada");
		} else if (this.getSaldoConta() < 0) {
			System.out.println("Conta em débito, não pode ser fechada");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}
	}

	public void depositar(float v) {
		if (this.getStatus()) {
			this.setSaldoConta(getSaldoConta() + v);
			System.out.println("Valor depositado com sucesso!");
		} else {
			System.out.println("Impossivel depositar em conta fechada");
		}
	}

	public void sacar(float v) {
		if (this.getStatus()) {
			if (v >= this.getSaldoConta()) {
				System.out.println("valor indisponível");
			} else if (v <= this.getSaldoConta()) {
				this.setSaldoConta(getSaldoConta() - v);
				System.out.println("Valor sacado com sucesso!");
			} else {
				System.out.println("Impossivel de sacar de uma conta fechada!");
			}
		}
	}

	public void mensalidade() {
		int v = 0;
		if (this.getTipo() == "CC") {
			v = 12;
		} else if (this.getTipo() == "CP"){ 
			v = 20;
		}
		if (this.getStatus()) {
			this.setSaldoConta(this.getSaldoConta() - v);
			System.out.println("Mensalidade paga com sucesso");
		} else {
			System.out.println("Impossivel pagar com uma conta fechada");
		}
		}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(float saldoConta) {
		this.saldoConta = saldoConta;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
