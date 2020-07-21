package exercicio03;

public class exercicio03 {

	public static void main(String[] args) {
		Livro livro1 = new Livro("A volta dos que não foram", "Paulo Henrique", 2);
		Livro livro2 = new Livro("A trança do rei careca", "Henrique Paulo", 352);
		Livro livro3 = new Livro("Entendendo as mulheres, vol 1/1000", "Desconhecido", 23573);
	
		livro1.mostrarInfos();
		livro2.mostrarInfos();
		livro3.mostrarInfos();
	}

}
