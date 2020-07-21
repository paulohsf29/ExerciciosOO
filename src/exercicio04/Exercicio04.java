package exercicio04;

public class Exercicio04 {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Paulo Henrique", 23, "São Paulo", "111.111.111-22");
		Funcionario funcionario = new Funcionario("Isabelo Farias", 32, "Taboão da Serra", 345);
		
		cliente.exibirDados();
		funcionario.exibirDados();
	}

}
