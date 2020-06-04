package app;

public class DataInvalidaException extends Exception{
	
	public DataInvalidaException(int dia, int mes, int ano) {
		super("Os parâmetros fornecidos não representam uma data válida.\n"+
				"Tentativa de criacao da seguinte data: "+dia+"/"+mes+"/"+ano);		
	}

}