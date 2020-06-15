package entities;

import enums.SaborBebida;
import enums.Tamanho;
import interfaces.Item;
import interfaces.Item;

public class Bebida implements Item{
		
	private Tamanho tamanho;
	private SaborBebida sabor;
	
	public Bebida(Tamanho tamanho, SaborBebida sabor) {
		this.tamanho = tamanho;
		this.sabor = sabor;
	}

	@Override
	public Double getPreco() {
		return tamanho.getPreco() + sabor.getPreco();
	}

	@Override
	public String getDescricao() {
		String output = "BEBIDA: \nTAMANHO: " + tamanho + "\nSABOR: " + sabor;
		return output;
	}

	public Tamanho getTamanho() {
		return tamanho;
	}

	public SaborBebida getSabor() {
		return sabor;
	}
	
}
