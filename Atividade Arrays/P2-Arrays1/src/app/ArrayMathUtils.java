package app;

public class ArrayMathUtils {
	public int[] calculaDivisores(int num) {
		int[] vect = new int[num];
		for (int divisor = 1; divisor < num; divisor ++) {
			if (num % divisor == 0){
				vect[divisor] = divisor;
			}
		}
		int cont = 0;
		for (int j = 0; j < vect.length; j ++ ) {
			if (vect[j] != 0) {
				cont +=1;
			}
		}
		int[] newVect = new int[cont];
		int k = 0;
		for (int i = 0; i < num; i ++) {
			if (vect[i] != 0) {
				newVect[k] = vect[i];
				k += 1;
			}
		}
		return newVect;
	}
	
	public double computaMaior(double[] numeros) {
		double cont = numeros[0];
		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] >= cont) {
				cont = numeros[i];
			}
		}
		return cont;
	}
	
	public double computaMenor(double[] numeros) {
		double cont = numeros[0];
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] <= cont) {
				cont = numeros[i];
			}
		}
		return cont;
	}
	public double computaMedia(double[] numeros) {
		double cont = 0;
		for (int i = 0; i < numeros.length; i++) {
			cont += numeros[i];
			}
		double media = cont / numeros.length;
		return media;
	}

	public boolean temNumRepetido(double[] numeros) {
		boolean temRep = false;
		for(int k = 0; k < numeros.length; k ++) {
			for (int j = k+1; j < numeros.length; j ++) {
				if (numeros[j] == numeros[k]) {
					temRep = true;
				}
			}
		}
		return temRep;
	}
	
	public static int[][] somaMatrizes(int[][] m1, int[][] m2) {
		int[][] vect = new int[m1.length][];
		
		for (int linha = 0; linha < vect.length; linha ++) {
			int qtdColunas = m1[linha].length;
			vect[linha] = new int [qtdColunas];
			for (int coluna = 0; coluna < qtdColunas; coluna ++) {
				vect[linha][coluna] = m1[linha][coluna] + m2[linha][coluna];
			}
		}
		return vect;
	}
	
	public String printArray(int[] vect) {
		String aux = "[";
		int i = 0;
		while (i < (vect.length)) {
			if (i == (vect.length - 1)) {
				aux += Integer.toString(vect[i]) + "]";
			}
			else {
				aux += Integer.toString(vect[i]) + ", ";
			}
			i += 1;
		}
		return aux;
	}
	
	public String printArrayBidimensional(int[][] vect) {
		String aux = "";
		for (int i = 0; i < vect.length; i ++) {
			for (int j = 0; j < vect[i].length; j ++) {
				aux += (vect[i][j] + " ");
			}
			aux += "\n";
		}
		return aux;
	}
}
