package enums;

public enum Carboidrato {
	FEIJAO(2),
	ARROZ(1.5),
	PURE(1.5),
	BATATA(1);
	
	private double preco;
	
	private Carboidrato(double preco) {
		this.preco = preco;
	}
	
	public double getPreco() {
		return preco;
	}
}
