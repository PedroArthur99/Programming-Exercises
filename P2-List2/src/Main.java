
public class Main {

	public static void main(String[] args) {
		
		SistemaInterpol sistema = new SistemaInterpol();
		
		sistema.adicionarProcurado("Eduardo");
		sistema.adicionarProcurado("Andre");
		sistema.adicionarProcurado("Maria");
		sistema.adicionarProcurado("Sara");
		
		System.out.println(sistema.ehProcurado("Eduardo"));
		System.out.println(sistema.ehProcurado("Rodolfo"));
		System.out.println(sistema.ehProcurado("Andre"));
		System.out.println(sistema.ehProcurado("Maria"));
		System.out.println(sistema.ehProcurado("Sara"));
		System.out.println(sistema.ehProcurado("Falcao"));

	}

}
