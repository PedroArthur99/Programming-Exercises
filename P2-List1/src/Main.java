import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	
		List <Double> numbers = new ArrayList<Double>();
		numbers.add(12.4);
		numbers.add(43.1);
		numbers.add(4.3);
		numbers.add(54.0);
		numbers.add(6.7);
		
		System.out.println("Divisores: " + ListaMathUtils.calculaDivisores(12));
		System.out.println("Maior: " + ListaMathUtils.computaMaior(numbers));
		System.out.println("Menor: " + ListaMathUtils.computaMenor(numbers));
		System.out.println("Média: " + ListaMathUtils.computaMedia(numbers));
		System.out.println("A Lista tem números repetidos? " + ListaMathUtils.temNumRepetido(numbers));
			
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
