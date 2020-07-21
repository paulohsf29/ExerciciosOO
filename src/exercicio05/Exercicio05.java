package exercicio05;

public class Exercicio05 {

	public static void main(String[] args) {
		Caneta caneta = new Caneta("Plastico", "Tinta");
		Lapis lapis = new Lapis("Madeira","Grafite");
		PenaMosquito penaMosquito = new PenaMosquito("Metal","Nanquim");
		
		caneta.escrever();
		lapis.escrever();
		penaMosquito.escrever();
		
	}

}
