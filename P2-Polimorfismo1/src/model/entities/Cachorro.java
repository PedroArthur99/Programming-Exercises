package model.entities;

public class Cachorro extends Animal{
	
	public Cachorro () {
		super();
	}
	
	public Cachorro (String nome, Integer idade) {
		super(nome, idade);
	}
	
	public void correr() {
		System.out.print("Cachorro correndo");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Au au");
	}
}
