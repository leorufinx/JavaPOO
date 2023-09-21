package pacote;

import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;

	public void marcarLuta(Lutador l1, Lutador l2) {

		if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;

		} else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}

	public void lutar() {
		if (this.aprovada) {
			this.desafiado.apresentar();
			this.desafiante.apresentar();

			Random random = new Random();
			int vencedor = random.nextInt(3);

			switch (vencedor) {

			case 0:
				System.out.println("Empatou");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
			case 1: 
				System.out.println( this.desafiado.getNome()+ "Ganhou!");
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
			case 3: 
				System.out.println(this.desafiante.getNome() +"Ganhou!");
				this.desafiante.ganharLuta();
				this.desafiado.perderLuta();
				break;
			}

		} else {
			System.out.println("A luta não pode acontecer");
		}
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

}
