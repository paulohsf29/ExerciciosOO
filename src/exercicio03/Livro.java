package exercicio03;

public class Livro {
	private String titulo;
	private String autor;
	private int numeroDePaginas;
	
	public Livro(String titulo, String autor, int numeroDePaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.numeroDePaginas = numeroDePaginas;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void mostrarInfos() {
		System.out.println("Titulo: " +this.titulo);
		System.out.println("Autor: " + this.autor);
		System.out.println("Quantidade de páginas: " + this.numeroDePaginas);
		System.out.println("-----------------------");
	}
}
