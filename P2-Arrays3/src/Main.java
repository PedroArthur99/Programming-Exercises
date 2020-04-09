
public class Main {

	public static void main(String[] args) {
		
		CampeonatoFutebol paraibano = new CampeonatoFutebol();
		paraibano.adicionarTimes("Campinense Treze Botafogo Atletico");
		System.out.println(paraibano.printArray(paraibano.criarCampeonato()));
	}

}
