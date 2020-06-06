package src;
import java.util.Arrays;

public class StringUtils {
	
	public static String formataAtributo (String atributo) {
		String[] words = atributo.split(" ");
		String output = "";
		for (int i = 0; i < words.length; i ++) {
			String initial = words[i].substring(0, 1);
			String finall = words[i].substring(1);
			if (i == 0) {
				output += initial.toLowerCase() + finall.toLowerCase();
			}
			else {
				output += initial.toUpperCase() + finall.toLowerCase();
			}
		}
		return output;
	}
	
	public static String formataMetodo(String metodo) {
		String[] words = metodo.split(" ");
		String output = "";
		for (int i = 0; i < words.length; i ++) {
			String initial = words[i].substring(0, 1);
			String finall = words[i].substring(1);
			if (i == 0) {
				output += initial.toLowerCase() + finall.toLowerCase();
			}
			else {
				output += initial.toUpperCase() + finall.toLowerCase();
			}
		}
		return output;
	}
	
	public static String formataClasse(String classe) {
		String[] words = classe.split(" ");
		String output = "";
		for (int i = 0; i < words.length; i ++) {
			String initial = words[i].substring(0, 1);
			String finall = words[i].substring(1);
			output += initial.toUpperCase() + finall.toLowerCase();
		}
		return output;
	}
	
	public static String ordenaStrings(String palavra1, String palavra2) {
		String[] words = new String[] {palavra1, palavra2};
		String output = "";
		Arrays.sort(words);
		output += words[0] + " e " + words[1];
		return output;
				
	}
	
	public static boolean ehPalindromo(String palavra) {
		StringBuilder word = new StringBuilder();
		StringBuilder newWord = new StringBuilder();
		word.append(palavra);
		newWord.append(palavra);
		newWord.reverse();
		
		if(isPal(word)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	private static boolean isPal(StringBuilder sb) {
		int l = 0, r = sb.length() - 1;
		while(l <= r) {
			if(sb.charAt(l) != sb.charAt(r)) return false;
			l++;
			r--;
		}
		return true;
	}
	
	public static String transformaParaCaixaAlta(String palavra) {
		String word = palavra.toUpperCase();
		return word;
	}
	
	public static int contaVogais(String frase) {
		int vogals = 0;
		for(int i = 0; i < frase.length(); i ++) {
			if((frase.charAt(i) == 'a') ||
					(frase.charAt(i) == 'e') ||
					(frase.charAt(i) == 'i') ||
					(frase.charAt(i) == 'o') ||
					(frase.charAt(i) == 'u') ||
					(frase.charAt(i) == 'A') ||
					(frase.charAt(i) == 'E') ||
					(frase.charAt(i) == 'I') ||
					(frase.charAt(i) == 'O') ||
					(frase.charAt(i) == 'U')) {
				vogals += 1;
			}
		}
		return vogals;
	}
	
	public static String removeEspacosSuperfluos(String frase) {
		return frase.trim();
	}
	
	public static int[] ocorrencias(String frase, String subPalavra) {
		boolean[] status = new boolean[frase.length()];
		int tam = 0;
		for(int i = 0; i < frase.length() - subPalavra.length(); i ++) {
			boolean ok = true;
			for(int j = i; j < i + subPalavra.length(); j++) {
				if(frase.charAt(j) != subPalavra.charAt(j - i)) ok = false;
			}
			status[i] = ok;
			if(ok) tam++;
		}
		
		int[] resposta = new int[tam];
		int p = 0;
		
		for(int i = 0; i < frase.length(); i++) {
			if(status[i]) {
				resposta[p] = i;
				p += 1;
			}
		}
		
		return resposta;
	}
	
	public static int binarioPraDecimal(String binario) {
		int decimal = 0;
		int aux = binario.length() - 1;
		int pot = 0;
		for(int i = aux; i >= 0; i --) {
			if(binario.charAt(i) == '1') {
				decimal += Math.pow(2.0, pot);
			}
			pot ++;
		}
		return decimal;
	}
	
	public static int getQtdadePalavras(String frase) {
		int qtt = 1;
		frase.trim();
		for(int i = 0; i < frase.length(); i ++) {
			if(frase.charAt(i) == ' ') {
				qtt += 1;
			}
		}
		return qtt;
	}
	
	public static int[] histogramaLetras(String texto) {
		int[] histograma = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		for(int i = 0; i < texto.length(); i ++) {
			if((texto.charAt(i) == 'A') || (texto.charAt(i) == 'a')) {
				histograma[0] += 1;
			}
			else if ((texto.charAt(i) == 'B') || (texto.charAt(i) == 'b')) {
				histograma[1] += 1;
			}
			else if ((texto.charAt(i) == 'C') || (texto.charAt(i) == 'c')) {
				histograma[2] += 1;
			}
			else if ((texto.charAt(i) == 'D') || (texto.charAt(i) == 'd')) {
				histograma[3] += 1;
			}
			else if ((texto.charAt(i) == 'E') || (texto.charAt(i) == 'e')) {
				histograma[4] += 1;
			}
			else if ((texto.charAt(i) == 'F') || (texto.charAt(i) == 'f')) {
				histograma[5] += 1;
			}
			else if ((texto.charAt(i) == 'G') || (texto.charAt(i) == 'g')) {
				histograma[6] += 1;
			}
			else if ((texto.charAt(i) == 'H') || (texto.charAt(i) == 'h')) {
				histograma[7] += 1;
			}
			else if ((texto.charAt(i) == 'I') || (texto.charAt(i) == 'i')) {
				histograma[8] += 1;
			}
			else if ((texto.charAt(i) == 'J') || (texto.charAt(i) == 'j')) {
				histograma[9] += 1;
			}
			else if ((texto.charAt(i) == 'K') || (texto.charAt(i) == 'k')) {
				histograma[10] += 1;
			}
			else if ((texto.charAt(i) == 'L') || (texto.charAt(i) == 'l')) {
				histograma[11] += 1;
			}
			else if ((texto.charAt(i) == 'M') || (texto.charAt(i) == 'm')) {
				histograma[12] += 1;
			}
			else if ((texto.charAt(i) == 'N') || (texto.charAt(i) == 'n')) {
				histograma[13] += 1;
			}
			else if ((texto.charAt(i) == 'O') || (texto.charAt(i) == 'o')) {
				histograma[14] += 1;
			}
			else if ((texto.charAt(i) == 'P') || (texto.charAt(i) == 'p')) {
				histograma[15] += 1;
			}
			else if ((texto.charAt(i) == 'Q') || (texto.charAt(i) == 'q')) {
				histograma[16] += 1;
			}
			else if ((texto.charAt(i) == 'R') || (texto.charAt(i) == 'r')) {
				histograma[17] += 1;
			}
			else if ((texto.charAt(i) == 'S') || (texto.charAt(i) == 's')) {
				histograma[18] += 1;
			}
			else if ((texto.charAt(i) == 'T') || (texto.charAt(i) == 't')) {
				histograma[19] += 1;
			}
			else if ((texto.charAt(i) == 'U') || (texto.charAt(i) == 'u')) {
				histograma[20] += 1;
			}
			else if ((texto.charAt(i) == 'V') || (texto.charAt(i) == 'v')) {
				histograma[21] += 1;
			}
			else if ((texto.charAt(i) == 'W') || (texto.charAt(i) == 'w')) {
				histograma[22] += 1;
			}
			else if ((texto.charAt(i) == 'X') || (texto.charAt(i) == 'x')) {
				histograma[23] += 1;
			}
			else if ((texto.charAt(i) == 'Y') || (texto.charAt(i) == 'y')) {
				histograma[24] += 1;
			}
			else if ((texto.charAt(i) == 'Z') || (texto.charAt(i) == 'z')) {
				histograma[25] += 1;
			}
		}
		return histograma;
	}
	
	public static String printArray (int[] vect) {
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
}
