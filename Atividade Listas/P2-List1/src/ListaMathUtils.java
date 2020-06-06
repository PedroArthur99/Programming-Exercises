import java.util.ArrayList;
import java.util.List;

public class ListaMathUtils {
	
	public static List calculaDivisores (int num) {
		List<Integer>lista = new ArrayList<Integer>();
		for(int i = 1; i < num; i ++) {
			if (num % i == 0)
				lista.add(i);
		}
		return lista;
	}
	
	public static double computaMaior(List numeros) {
		double aux = (double) numeros.get(0);
		for(int i = 0; i < numeros.size(); i ++) {
			if((double) numeros.get(i) >= aux) {
				aux = (double) numeros.get(i);
			}
		}
		return aux;
	}
	
	public static double computaMenor(List numeros) {
		double aux = (double) numeros.get(0);
		for(int i = 0; i < numeros.size(); i ++) {
			if((double) numeros.get(i) < aux) {
				aux = (double) numeros.get(i);
			}
		}
		return aux;
	}
	
	public static double computaMedia(List numeros) {
		double soma = 0;
		for(int i = 0; i < numeros.size(); i ++) {
			soma += (double) numeros.get(i);
		}
		double media = (soma / numeros.size());
		return media;
	}
	
	public static boolean temNumRepetido(List numeros) {
		boolean output = false;
		for (int i = 0; i < numeros.size(); i ++) {
			for (int j = (i + 1); j < numeros.size(); j ++) {
				if(((double)numeros.get(i)) == ((double)numeros.get(j))) {
					output = true;
				}
			}
			
		}
		return output;
	}
	
	

	
}
