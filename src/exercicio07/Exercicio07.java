package exercicio07;

public class Exercicio07 {

	public static void main(String[] args) {
		Veiculo veiculo1 = new Veiculo("Lamborghini", 4, 40,10);
		Veiculo veiculo2 = new Veiculo("Kawasaki Ninja", 2, 25,15);
		
		veiculo1.abastecer(40);
		veiculo1.exibirAutonomia();
		
		veiculo2.abastecer(20);
		veiculo2.exibirAutonomia();
		

	}

}
