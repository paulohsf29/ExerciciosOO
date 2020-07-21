package exercicio05;

public class Caneta {
	private String ehFeitoDe;
	private String escreveCom;
	
	
	public Caneta(String ehFeitoDe, String escreveCom) {
		this.ehFeitoDe = ehFeitoDe;
		this.escreveCom = escreveCom;
		
	}
	
	public void escrever() {
		System.out.println("Escrevendo com:  " + this.escreveCom);
		System.out.println("------------");
	}
	
	
}
