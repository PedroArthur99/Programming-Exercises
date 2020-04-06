import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
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

		carro1.promocao = false;
		carro2.promocao = false;
		carro3.promocao = false;
		carro4.promocao = false;
		carro5.promocao = false;
		
		System.out.println("Showing vehicles without promotion: ");
		System.out.println(carro1 + "\n");
		System.out.println(carro2 + "\n");
		System.out.println(carro3 + "\n");
		System.out.println(carro4 + "\n");
		System.out.println(carro5 + "\n");
		
		carro1.promocao = true;
		carro2.promocao = true;
		carro3.promocao = true;
		carro4.promocao = true;
		carro5.promocao = true;
		
		System.out.println("------------------------------");
		System.out.println("Showing vehicles with promotion: ");
		System.out.println(carro1 + "\n");
		System.out.println(carro2 + "\n");
		System.out.println(carro3 + "\n");
		System.out.println(carro4 + "\n");
		System.out.println(carro5 + "\n");
	}

}
