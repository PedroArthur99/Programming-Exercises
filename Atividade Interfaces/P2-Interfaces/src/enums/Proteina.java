package enums;

public enum Proteina {	
	PICANHA(20),
	MAMINHA(15),
	FRANGO(15),
	LINGUICA(10);
	
	private double preco;
	
	private Proteina(double preco) {
		this.preco = preco;
	}
	
	public double getPreco() {
		return preco;
	}
}
