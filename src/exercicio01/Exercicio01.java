package exercicio01;

public class Exercicio01 {

	public static void main(String[] args) {
		Pipa pipa1 = new Pipa("Papagaio", 1.5, "Verde");
		Pipa pipa2 = new Pipa("Raia", 3.0, "Preto");
		
		pipa1.desbicar();
		pipa1.descarregar(true);
		pipa1.relar(true);
		
		pipa2.desbicar();
		pipa2.descarregar(false);
		pipa2.relar(false);
		
		
	}

}
