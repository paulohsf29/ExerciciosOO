package exercicio04;

public class Funcionario extends Pessoa {
	private int numeroDaMatricula;
	
	public Funcionario(String nome, int idade,String cidadeDeNascimento, int numeroDaMatricula) {
		super(nome, idade, cidadeDeNascimento);
		this.numeroDaMatricula = numeroDaMatricula;
	}

	public int getNumeroDaMatricula() {
		return numeroDaMatricula;
	}

	public void setNumeroDaMatricula(int numeroDaMatricula) {
		this.numeroDaMatricula = numeroDaMatricula;
	}
	
	public void exibirDados() {
		System.out.println("Nome: "+ this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Cidade de Nascimento: " + this.cidadeDeNascimento);
		System.out.println("Numero da Matricula: " + this.numeroDaMatricula);
		System.out.println("-------------------");
	}
	
}
