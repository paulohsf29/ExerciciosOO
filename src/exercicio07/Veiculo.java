package exercicio07;

public class Veiculo {
	private String nome;
	private int numRodas;
	private double capacidadeTanqueLitros;
	private double consumoKmLitros;
	
	public Veiculo(String nome,int numRodas, double capacidadeTanqueLitros, double consumoKmLitros) {
		this.nome = nome;
		this.numRodas = numRodas;
		this.capacidadeTanqueLitros = capacidadeTanqueLitros;
		this.consumoKmLitros = consumoKmLitros;
		
	}
	
	public boolean abastecer(double qtdAbastecida) {
		if(qtdAbastecida <= this.capacidadeTanqueLitros) {
			System.out.println("Abastecendo " + qtdAbastecida + " Litros");
			return true;
		}else {
			System.out.println("Abasteça apenas a quantidade maxima");
			return false;
		}
	}
	
	public void exibirAutonomia() {
		double consumo = this.capacidadeTanqueLitros * this.consumoKmLitros;
		System.out.println("O veículo pode percorrer " + consumo +" km com o tanque cheio");
	}
}
