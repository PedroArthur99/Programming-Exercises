package excecoes;

public class SaldoInsuficienteException extends Exception{
	
	private static final long serialVersionUID = 1L;
	
	public SaldoInsuficienteException(String msg) {
		System.out.println(msg);
	}
}
