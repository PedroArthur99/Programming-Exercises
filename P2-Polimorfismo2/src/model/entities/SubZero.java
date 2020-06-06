package model.entities;

public class SubZero extends Lutador{
	
	public SubZero() {
		super();
	}
	
	public SubZero(String nome, int vida) {
		super(nome, vida);
	}
	
	@Override
	public void lancarMagia(Lutador i) {
		i.vida -= 20;
	}
}
