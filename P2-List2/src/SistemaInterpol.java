import java.util.ArrayList;
import java.util.List;

public class SistemaInterpol {
	
	private List<String> procurados = new ArrayList<String>();
	
	
	public void adicionarProcurado(String nome) {
		procurados.add(nome);
	}
	
	public boolean ehProcurado(String nome) {
		boolean output = false;
		for(int i = 0; i < procurados.size(); i ++) {
			if (nome ==(String) procurados.get(i)) {
				output = true;
			}
		}
		return output;
	}
}
