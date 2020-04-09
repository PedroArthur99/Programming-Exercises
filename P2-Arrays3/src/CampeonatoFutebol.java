public class CampeonatoFutebol {
	
	public String[] times;
	
	public void adicionarTimes(String times) {
		this.times = times.split(" ");
	}
	
	public String[] criarCampeonato() {
		int aux = (times.length - 1) * 2;
		String jogo = "";
		String[] jogos = new String[aux];
		int indiceJogos = 0;
		for (int i = 0; i < times.length; i ++) {
			for (int j = i + 1; j < times.length; j ++) {
				jogo =times[i] + " x " + times[j] + "\n";
				jogos[indiceJogos] = jogo;
				indiceJogos += 1;
			}
		}
		return jogos;
	}
	
	public String printArray(String[] vect) {
		String aux = "";
		int i = 0;
		while (i < (vect.length)) {
			if (i == (vect.length - 1)) {
				aux += vect[i] + "";
			}
			else {
				aux += vect[i] + "";
			}
			i += 1;
		}
		return aux;
	}
}
