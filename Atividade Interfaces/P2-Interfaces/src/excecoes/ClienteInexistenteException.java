package excecoes;

public class ClienteInexistenteException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public ClienteInexistenteException(String msg) {
		System.out.println(msg);
	}

}
