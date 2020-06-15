package entities;

import enums.Cor;

public class Trapezio extends Quadrilatero{
	
	private double altura;
	
	public Trapezio() {
		super();
	}
	
	public Trapezio(Cor cor, double lado1, double lado2, double lado3, double lado4, double altura) {
		super(cor, lado1, lado2, lado3, lado4);
		this.altura = altura;
	}

	@Override
	public double calculaArea() {
//		LEVANDO EM CONSIDERAÇÃO QUE O LADO1 É A BASE MENOR E O LADO2 É A BASE MAIOR. 
		double area = 0;
		area = ((getLado1() + getLado2()) * this.altura) / 2;
		return area;
	}

	@Override
	public double calculaPerimetro() {
		double perimetro = getLado1() + getLado2() + getLado3() + getLado4();
		return perimetro;
	}

	public double getAltura() {
		return altura;
	}
	
}
