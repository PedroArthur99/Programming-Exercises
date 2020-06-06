import java.util.Locale;
import app.ArrayMathUtils; 

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		ArrayMathUtils myArray = new ArrayMathUtils();
		System.out.println("Função de calcular os divisores: ");
		System.out.println(myArray.printArray(myArray.calculaDivisores(12)));
		System.out.println("------------------------------------");
		
		double[] numeros = new double[] {14.2, 100.1, 0.3, 14.5, 123.2, 7.43};
		System.out.println("Função de Computar Maior: ");
		System.out.println(myArray.computaMaior(numeros));
		System.out.println("------------------------------------");
		
		System.out.println("Função de Computar Menor: ");
		System.out.println(myArray.computaMenor(numeros));
		System.out.println("------------------------------------");
		
		System.out.println("Função de Computar Média: ");
		System.out.printf("%.2f%n", myArray.computaMedia(numeros));
		System.out.println("------------------------------------");
		
		System.out.println("Função de Números Repetidos: ");
		System.out.println(myArray.temNumRepetido(numeros));
		System.out.println("------------------------------------");
		
		int[][] m1 = new int[][] {
			new int[] {5, 4}, 
			new int[] {0, 2}, 
			new int[] {1, -1}};
		int[][] m2 = new int[][] {
			new int[] {0, -2}, 
			new int[] {5, -3}, 
			new int[] {-1, 0}};
		
		System.out.println("Função de Somar Matrizes: ");
		int [][] soma = ArrayMathUtils.somaMatrizes(m1, m2);
		System.out.print(myArray.printArrayBidimensional(soma));
	
	}

}
