package model.entities;

public class Cavalo extends Animal{
	
	public Cavalo () {
		super();
	}
	
	public Cavalo (String nome, Integer idade) {
		super(nome, idade);
	}
	
	public void correr() {
		System.out.print("Cavalo trotando");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Innnririririri");
	}
}
