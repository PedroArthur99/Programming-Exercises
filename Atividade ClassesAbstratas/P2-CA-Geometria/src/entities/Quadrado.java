package entities;

import enums.Cor;

public class Quadrado extends Quadrilatero{
	
	public Quadrado() {
		super();
	}
	
	public Quadrado(Cor cor, double lado1, double lado2, double lado3, double lado4) {
		super(cor, lado1, lado2, lado3, lado4);
	}

	@Override
	public double calculaArea() {
		double area = getLado1() * getLado2();
		return area;
	}

	@Override
	public double calculaPerimetro() {
		double perimetro = getLado1() * 4;
		return perimetro;
	}
}
