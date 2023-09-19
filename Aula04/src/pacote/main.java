package pacote;

public class main {
	public static void main(String[] args) {
		ContaBanco p1 = new ContaBanco();
		
		p1.setDono("Leo");
		p1.setNumConta(1);
		p1.setSaldoConta(300.1f);
		p1.setTipo("CC");
		p1.setStatus(true);
		
		p1.depositar(5000);
		p1.sacar(3000);
		
		p1.estadoAtual();
		
	}
}
