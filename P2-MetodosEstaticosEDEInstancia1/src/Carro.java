public class Carro {
	
	public String nome;
	public String marca;
	public String cor;
	public int portas;
	public boolean vidroEletrico;
	public boolean arCondicionado;
	public boolean cambioAutomatico;
	public boolean direcaoEletrica;
	public double precoBase;
	
	public static boolean promocao;
	
	public Carro (String nome, String marca, double precoBase) {
		this.nome = nome;
		this.marca = marca;
		this.cor = "BRANCA";
		this.portas = 2;
		this.vidroEletrico = false;
		this.arCondicionado = false;
		this.cambioAutomatico = false;
		this.direcaoEletrica = false;
		this.precoBase = precoBase;
	}
	
	public Carro (String nome, String marca, String cor,
			int portas, boolean vidroEletrico, boolean
			arCondicionado, boolean cambioAutomatico, boolean
			direcaoEletrica, double precoBase) {
		
		this.nome = nome;
		this.marca = marca;
		this.cor = cor;
		this.portas = portas;
		this.vidroEletrico = vidroEletrico;
		this.arCondicionado = arCondicionado;
		this.cambioAutomatico = cambioAutomatico;
		this.direcaoEletrica = direcaoEletrica;
		this.precoBase = precoBase;
	}
	
	public Carro () {
		
	}
	
	
	public double calculaPreco() {
		
		double precoinicial = 0;
		
		switch (cor) {
		case "BRANCA":
		case "AZUL":
		case "VERMELHA":
		case "PRETA":
			break;
		default:
			precoinicial += 1000; 
		}
		
		if (this.vidroEletrico == true) {
			precoinicial += 1250;
		}
		
		if (this.arCondicionado == true) {
			precoinicial += 1250;
		}
		
		if (this.cambioAutomatico == true) {
			precoinicial += 1250;
		}
		
		if (this.direcaoEletrica == true) {
			precoinicial += 1250;
		this.precoBase += precoinicial;
		}
		if (promocao == true) {
			precoBase -= precoBase * 10/100;
		}
		return this.precoBase;
	}
	
	public String toString() {
		String aux;
		aux = "Nome: " + nome 
				+ "\nMarca: " + marca
				+ "\nCor: " + cor
				+ "\nPortas: " + portas
				+ "\nVidro Elétrico: " + vidroEletrico
				+ "\nAr Condicionado: " + arCondicionado
				+ "\nCâmbio Automático: " + cambioAutomatico
				+"\nDireção Elétrica: " + direcaoEletrica
				+ "\nPreço Base: " + precoBase
				+"\nPreço Total: " + this.calculaPreco();
		
		return aux;
	}
	
	
	
	
	
	
	
	
	
	
	
}
