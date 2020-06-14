package excecoes;

public class PedidoInexistenteException extends Exception{
	
	private static final long serialVersionUID = 1L;
	
	public PedidoInexistenteException(String msg) {
		System.out.println(msg);
	}
}
