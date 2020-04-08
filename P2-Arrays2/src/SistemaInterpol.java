public class SistemaInterpol {
	
	public String[] procurados;
	
	public void adicionarProcurados(String nomes) {
		procurados = nomes.split(" ");
	}
	
	public boolean ehProcurado(String nome) {
		boolean aux = false;
		for (int i = 0; i < procurados.length; i ++) {
			if (procurados[i].equals(nome)) {
				aux = true;
			}
		}
		return aux;
	}
}
