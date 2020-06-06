package model.entities;

public class Sonia extends Lutador{
	
	public Sonia() {
		super();
	}
	
	public Sonia(String nome, int vida) {
		super(nome, vida);
	}
	
	@Override
	public void chutar(Lutador i) {
		i.vida -= 13;
	}
	
	@Override
	public void socar(Lutador i) {
		i.vida -= 15;
	}
}
