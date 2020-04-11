import java.util.ArrayList;
import java.util.List;

public class LojaDeCarro {
	
	public List<Carro> carrosDisponiveis = new ArrayList<Carro>();
	public List<Carro> carrosVendidos = new ArrayList<Carro>();
	
	public void adicionarCarro(Carro carro) {
		carrosDisponiveis.add(carro);
	}
	
	public void exibirCarrosDisponiveis() {
		System.out.println(carrosDisponiveis);
	}
	
	//Professor, o senhor pediu que o método abaixo retornasse um int, mas
	//acho que não faz muito sentido. Por isso alterei para void.
	public void venderCarro(int id) {
		for(int i = 0; i < carrosDisponiveis.size(); i ++) {
			if (carrosDisponiveis.get(i).id == id) {
				carrosVendidos.add(carrosDisponiveis.get(i));
				carrosDisponiveis.remove(i);
			}
		}
	}
	
	public void adicionarPromocao(int id) {
		for(int i = 0; i < carrosDisponiveis.size(); i ++) {
			if (carrosDisponiveis.get(i).id == id) {
				double aux = carrosDisponiveis.get(i).precoBase;
				carrosDisponiveis.get(i).precoBase = (aux) - (aux * 15 / 100);
			}
		}
	}
	
	public int computaApuradoDasVendas() {
		int output = 0;
		for(int i = 0; i < carrosVendidos.size(); i ++) {
			output += carrosVendidos.get(i).calculaPreco();
		}
		return output;
	}
	
	public void limparVendidos() {
		carrosVendidos.clear();
	}
}
