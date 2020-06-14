package enums;

public enum SaborBebida {
	COLA(3),
	GUARANA(3),
	REFRI_LARANJA(3),
	SUCO_LARANJA(5),
	SUCO_MARACUJA(5),
	CERVEJA(6),
	AGUA(2),
	CACHACA(5);
	
	private double preco;
	
	private SaborBebida(double preco) {
		this.preco = preco;
	}
	
	public double getPreco() {
		return preco;
	}

}
