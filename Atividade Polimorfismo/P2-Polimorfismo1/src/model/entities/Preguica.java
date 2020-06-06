package model.entities;

public class Preguica extends Animal{
	
	public Preguica () {
		super();
	}
	
	public Preguica (String nome, Integer idade) {
		super(nome, idade);
	}
	
	public void escalarArvore() {
		System.out.print("N�o");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("ZZzzzzZZZZzzzz");
	}
}
