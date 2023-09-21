package pacote;

public class main {
	public static void main(String[] args) {

		Lutador l[] = new Lutador[6];
		l[0] = new Lutador("leo", "brasil", 31, 1.75f , 111.9f ,11,2,1);
		l[1] = new Lutador("Pedro", "brasil", 33, 1.20f, 100.0f, 12, 2, 3);
		l[2] = new Lutador("Lucas", "China", 12, 1.90f , 99.9f ,3,6,1);
		l[3] = new Lutador("Joao", "Paquistão", 21, 1.80f, 70.0f, 3, 4, 4);
		l[4] = new Lutador("Cleber", "USA", 44, 1.55f , 85.9f ,2,2,5);
		
		Luta luta = new Luta();
		luta.marcarLuta(l[0], l[1]);
		luta.lutar();
	}
}
