package src;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(StringUtils.formataAtributo("QuantIdade dDe numEros"));
		System.out.println(StringUtils.formataMetodo("get quantidade de questoes"));
		System.out.println(StringUtils.formataClasse("formatador de identificadores"));
		System.out.println(StringUtils.ordenaStrings("Fiat", "Chevrolet"));
		System.out.println(StringUtils.ehPalindromo("arara"));
		System.out.println(StringUtils.transformaParaCaixaAlta("PhUlaNo dEtHal"));
		System.out.println(StringUtils.contaVogais("CACHORRO"));
		System.out.println(StringUtils.removeEspacosSuperfluos(" Hay que endurecerse, pero sin perder la ternura jamás "));
		System.out.println(StringUtils.printArray(StringUtils.ocorrencias("O doce perguntou para o doce, qual o doce mais doce?", "doce")));
		System.out.println(StringUtils.binarioPraDecimal("101110010"));
		System.out.println(StringUtils.getQtdadePalavras("programar é muito fácil"));
		System.out.println(StringUtils.printArray(StringUtils.histogramaLetras("the quick brown fox jumps over the lazy dog")));
	}

}
