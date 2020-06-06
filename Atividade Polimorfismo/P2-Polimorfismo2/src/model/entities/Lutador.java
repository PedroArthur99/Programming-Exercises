package model.entities;

public class Lutador {
	
	protected String nome;
	protected int vida;
	
	public Lutador() {
	}
	
	public Lutador (String nome, int vida) {
		this.nome = nome;
		this.vida = vida;
	}

	public void socar(Lutador l) {
		l.vida -= 7;
	}
	
	public void chutar(Lutador l) {
		l.vida -= 5;
	}
	
	public void atirar(Lutador l) {
		l.vida -= 10;
	}
	
	public void lancarMagia(Lutador l) {
		l.vida -= 12;
	}
	
	public String getNome() {
		return nome;
	}

	public int getVida() {
		return vida;
	}
}
