package enums;

public enum Tamanho {
	PEQUENO(0),
	MEDIO(2),
	GRANDE(2.8);
	
	private double preco;
	
	private Tamanho(double preco) {
		this.preco = preco;
	}
	
	public double getPreco() {
		return preco;
	}
}
