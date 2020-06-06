package model.entities;

public class LiuKang extends Lutador{
	
	public LiuKang() {
		super();
	}
	
	public LiuKang(String nome, int vida) {
		super(nome, vida);
	}
	
	@Override
	public void chutar(Lutador i) {
		i.vida -= 14;
	}
	
	@Override
	public void lancarMagia(Lutador i) {
		i.vida -= 20;
	}

}
