package entities;

import enums.Cor;

public class Retangulo extends Quadrilatero{
	
	public Retangulo() {
		super();
	}
	
	public Retangulo(Cor cor, double lado1, double lado2, double lado3, double lado4) {
		super(cor, lado1, lado2, lado3, lado4);
	}
	
	@Override
	public double calculaArea() {
		double area = 0;
		if(getLado1() == getLado2()) {
			area = getLado1() * getLado3();
		}
		else 
			area = getLado1() * getLado2();
		return area;
	}

	@Override
	public double calculaPerimetro() {
		double perimetro = 0;
		perimetro += getLado1() + getLado2() + getLado3() + getLado4();
		return perimetro;
	}
}
