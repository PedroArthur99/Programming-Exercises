package exception;

public class MesInvalidoException extends Exception{
	
	public MesInvalidoException (int numero) {
		super("O n�mero do m�s deve estar contido no "
				+ "intervalo [1, 12]");
	}
		
}
