package exercicio04;

public class Cliente extends Pessoa {
	private String cpf;
	
	public Cliente(String nome, int idade, String cidadeDeNascimento, String cpf) {
		super(nome, idade, cidadeDeNascimento);
		this.cpf = cpf;
		
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void exibirDados() {
		System.out.println("Nome: "+ this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Cidade de Nascimento: " + this.cidadeDeNascimento);
		System.out.println("CPF: " + this.cpf);
		System.out.println("-------------------");
	}
	
}
