package model.entities;

public class Jax extends Lutador{
	
	public Jax() {
		super();
	}
	
	public Jax(String nome, int vida) {
		super(nome, vida);
	}
	
	@Override
	public void socar(Lutador i) {
		i.vida -= 17;
	}
}
