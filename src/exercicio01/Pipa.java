package exercicio01;

public class Pipa {
	private String modelo;
	private double metrosRabiola;
	private String cor;
	
	
	public Pipa(String modelo, double metrosRabiola, String cor) {
		this.modelo = modelo;
		this.metrosRabiola = metrosRabiola;
		this.cor = cor;
	}
	
	// GET/SET modelo
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	// GET/SET tamanhoRabiola
	public double getmetrosRabiola() {
		return metrosRabiola;
	}
	public void setmetrosRabiola(double metrosRabiola) {
		this.metrosRabiola = metrosRabiola;
	}
	// GET/SET cor
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void desbicar() {
		System.out.println("Desbicando");
	}
	
	public void descarregar(boolean darLinha) {
		if(darLinha) {
			System.out.println("Aumentar distância");
		}
	}
	
	public void relar(boolean linhaComCerol) {
		if(linhaComCerol) {
			System.out.println("Reeeeeeeeelo, bota outra");
		}else {
			System.out.println("Mandadooooooo, cooorre");
		}
	}

}
