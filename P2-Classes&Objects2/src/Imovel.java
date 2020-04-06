public class Imovel {
	
	public String tipo;
	public String imobiliaria;
	public int pavimentos;
	public int pavimento;
	public int quartos;
	public int suites;
	public int banheiros;
	public int metrosQuadrados;
	public boolean elevador;
	public boolean piscina;
	public boolean quadra;
	
	public Imovel(String imobiliaria, int quartos, int suites, int banheiros,
			int metrosQuadrados, boolean piscina, boolean quadra, boolean elevador) {
		
		this.tipo = "CASA";
		this.imobiliaria = imobiliaria;
		this.quartos = quartos;
		this.suites = suites;
		this.banheiros = banheiros;
		this.metrosQuadrados = metrosQuadrados;
		this.piscina = piscina;
		this.quadra = quadra;
		this.elevador = elevador;
		this.pavimentos = 0;
		this.pavimento = 0;
				
	}
	
	public Imovel (String imobiliaria, int pavimentos, int pavimento, 
			int quartos, int suites, int banheiros, int metrosQuadrados,
			boolean elevador, boolean piscina, boolean quadra) {
		
		this.tipo = "APARTAMENTO";
		this.imobiliaria = imobiliaria;
		this.pavimentos = pavimentos;
		this.pavimento = pavimento;
		this.quartos = quartos;
		this.suites = suites;
		this.banheiros = banheiros;
		this.metrosQuadrados = metrosQuadrados;
		this.piscina = piscina;
		this.quadra = quadra;
		this.elevador = elevador;
	}
			
	public double calculaPreco() {
		double preco = 0;
		if (elevador == true)
			preco += 2500;
		
		if (piscina == true)
			preco += 2500;
		
		if (quadra == true)
			preco += 2500;
		
		preco += metrosQuadrados * 5000;
		
		
		if (tipo == "APARTAMENTO")
			if (pavimento >= 5)
				preco += (pavimento - 4) * 2000;
		
		return preco;
	}
	
	public String toString() {
		String aux;
		aux = "Tipo: " + this.tipo + "\nImobiliaria: " + this.imobiliaria + "\nPavimentos: " + this.pavimentos + "\nPavimento: " + this.pavimento 
				+ "\nQuartos: " + this.quartos + "\nSuites:  " + this.suites + "\nBanheiros :" + 
				this.banheiros + "\nMetros Quadrados:  " + this.metrosQuadrados + "\nElevador:  " + this.elevador + 
				"\nPiscina: " + this.piscina + "\nQuadra: " + this.quadra + "\nPreço Total: " + this.calculaPreco();
		return aux;
	}
	
}
