import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Carro.promocao = false;
		
		Carro carro1 = new Carro("Palio", "Fiat", 35000);
		
		Carro carro2 = new Carro("Pálio", "Fiat", "PRATEADA", 
				2, false, false, false, false, 35000);
		
		Carro carro3 = new Carro("Civic", "Honda", "BRANCA", 
				4, true, true, true, true, 110000);
		
		Carro carro4 = new Carro("Corolla", "Toyota", "BRANCA", 
				2, true, true, true, false, 110000);
		
		Carro carro5 = new Carro();
		carro5.nome = "Gol";
		carro5.marca = "Volkswagen";
		carro5.cor = "BRANCA";
		carro5.portas = 4;
		carro5.vidroEletrico = true;
		carro5.arCondicionado = true;
		carro5.cambioAutomatico = true;
		carro5.direcaoEletrica = true;
		carro5.precoBase = 55000;
		//Showing vehicles' values without promotion
		System.out.println(carro1 + "\n");
		System.out.println(carro2 + "\n");
		System.out.println(carro3 + "\n");
		System.out.println(carro4 + "\n");
		System.out.println(carro5);
		//Showing vehicles' values with promotion
		Carro.promocao = true;
		System.out.println("--------------------------------");
		System.out.println("Valores com promoção:");
		System.out.println("");
		System.out.println(carro1 + "\n");
		System.out.println(carro2 + "\n");
		System.out.println(carro3 + "\n");
		System.out.println(carro4 + "\n");
		System.out.println(carro5);
	}

}
