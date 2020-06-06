package model.entities;

public class NightWolf extends Lutador{
	
	public NightWolf() {
		super();
	}
	
	public NightWolf(String nome, int vida) {
		super(nome, vida);
	}
	
	@Override
	public void atirar(Lutador i) {
		i.vida -= 15;
	}
	
	@Override
	public void lancarMagia(Lutador i) {
		i.vida -= 18;
	}
}
