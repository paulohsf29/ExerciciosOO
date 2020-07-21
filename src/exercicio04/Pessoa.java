package exercicio04;

public class Pessoa {
	protected String nome;
	protected int idade;
	protected String cidadeDeNascimento;
	
	public Pessoa(String nome, int idade, String cidadeDeNascimento) {
		this.nome = nome;
		this.idade = idade;
		this.cidadeDeNascimento = cidadeDeNascimento;
	}
	
	public void exibirDados() {
		System.out.println("Nome: "+ this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Cidade de Nascimento: " + this.cidadeDeNascimento);
		System.out.println("-------------------");
	}
	
}
