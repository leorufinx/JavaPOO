package pacote;

public class main {
public static void main(String[] args) {
	
	ControleRemoto c = new ControleRemoto();
	
	c.ligar();
	c.maisVolume();
	c.ligarMudo();
	c.play();
	c.desligarMudo();
	c.abrirMenu();
}
}
