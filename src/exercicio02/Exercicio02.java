package exercicio02;

public class Exercicio02 {

	public static void main(String[] args) {
		Triangulo triangulo1 = new Triangulo(2, 4);
		Triangulo triangulo2 = new Triangulo(3, 20);
		Triangulo triangulo3 = new Triangulo(30, 7);
		
		System.out.println(triangulo1.calcularBase());
		System.out.println(triangulo2.calcularBase());
		System.out.println(triangulo3.calcularBase());
	}

}
