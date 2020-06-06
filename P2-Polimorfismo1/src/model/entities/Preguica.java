package model.entities;

public class Preguica extends Animal{
	
	public Preguica () {
		super();
	}
	
	public Preguica (String nome, Integer idade) {
		super(nome, idade);
	}
	
	public void escalarArvore() {
		System.out.print("Não");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("ZZzzzzZZZZzzzz");
	}
}
