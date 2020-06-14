package excecoes;

public class PagamentoInvalidoException extends Exception{
	
	private static final long serialVersionUID = 1L;
	
	public PagamentoInvalidoException(String msg) {
		System.out.println(msg);
	}
}
