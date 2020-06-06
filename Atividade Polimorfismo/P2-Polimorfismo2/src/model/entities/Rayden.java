package model.entities;

public class Rayden extends Lutador{
	
	public Rayden() {
		super();
	}
	
	public Rayden(String nome, int vida) {
		super(nome, vida);
	}
	
	@Override
	public void lancarMagia(Lutador i) {
		i.vida -= 21;
	}
}
