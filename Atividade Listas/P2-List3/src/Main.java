
public class Main {

	public static void main(String[] args) {
		
		LojaDeCarro loja = new LojaDeCarro();
		Carro carro1 = new Carro(2020, "Palio", "Fiat", 35000);
		Carro carro2 = new Carro(2021, "Pálio", "Fiat", "PRATEADA", 2, false, false, false, false, 35000);
		Carro carro3 = new Carro(2022, "Civic", "Honda", "BRANCA", 4, true, true, true, true, 110000);
		Carro carro4 = new Carro(2023, "Corolla", "Toyota", "BRANCA", 2, true, true, true, false, 110000);
		Carro carro5 = new Carro();
		carro5.id = 2024;
		carro5.nome = "Gol";
		carro5.marca = "Volkswagen";
		carro5.cor = "BRANCA";
		carro5.portas = 4;
		carro5.vidroEletrico = true;
		carro5.arCondicionado = true;
		carro5.cambioAutomatico = true;
		carro5.direcaoEletrica = true;
		carro5.precoBase = 55000;
		loja.adicionarCarro(carro1);
		loja.adicionarCarro(carro2);
		loja.adicionarCarro(carro3);
		loja.adicionarCarro(carro4);
		loja.adicionarCarro(carro5);
		
		
		//Daqui em diante, pode ficar um pouco confuso, 
		//mas são aepnas testes da classe LojaDeCarro
		//Se preferir, pode comentar as linhas para fazer
		//um teste por vez.
		
		loja.exibirCarrosDisponiveis();
		loja.venderCarro(2020);
		loja.venderCarro(2024);
		loja.exibirCarrosDisponiveis();
		System.out.println(loja.carrosVendidos);
		System.out.println(loja.carrosDisponiveis);
		System.out.println(carro3.calculaPreco());
		loja.adicionarPromocao(2022);
		System.out.println(carro3.calculaPreco());
		System.out.println(loja.computaApuradoDasVendas());
		System.out.println(loja.carrosVendidos);
		loja.limparVendidos();
		System.out.println(loja.carrosVendidos);
		
	}

}
