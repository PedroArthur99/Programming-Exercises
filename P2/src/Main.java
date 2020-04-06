import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Imovel casa1 = new Imovel("IMOBILIARIA FALCÃO", 3, 1, 2, 120, true, 
				false, false);
		Imovel ap1 = new Imovel("IMOBILIARIA FALCÃO", 15, 8, 3, 2, 3, 82,
				false, false, true);
		Imovel casa2 = new Imovel ("IMOBILIARIA ALTAMAN", 4, 2, 3, 240, true,
				true, true);
		Imovel casa3 = new Imovel("IMOBILIARIA LEBLON", 6, 3, 5, 540, true, 
				true, true);
		Imovel ap2 = new Imovel("IMOBILIARIA ALTO BRANCO", 3, 2, 2, 1, 2, 60,
				false, false, false);
				
		System.out.println(casa1 + System.lineSeparator());
		System.out.println(ap1 + System.lineSeparator());
		System.out.println(casa2 + System.lineSeparator());
		System.out.println(casa3 + System.lineSeparator());
		System.out.println(ap2);
		
		
		
	}

}
