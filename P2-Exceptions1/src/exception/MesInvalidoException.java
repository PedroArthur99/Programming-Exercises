package exception;

public class MesInvalidoException extends Exception{
	
	public MesInvalidoException (int numero) {
		super("O número do mês deve estar contido no "
				+ "intervalo [1, 12]");
	}
		
}
