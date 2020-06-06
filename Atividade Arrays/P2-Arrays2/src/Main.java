
public class Main {

	public static void main(String[] args) {
		
		SistemaInterpol case1 = new SistemaInterpol();
		
		case1.adicionarProcurados("Eduardo Arthur Rodolfo Miguel");
		
		System.out.println(case1.ehProcurado("Antonio"));
		System.out.println(case1.ehProcurado("Rodolfo"));
		System.out.println(case1.ehProcurado("Eduardo"));
		}
}
