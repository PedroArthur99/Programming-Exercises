package app;

public class DataInvalidaException extends Exception{
	
	public DataInvalidaException(int dia, int mes, int ano) {
		super("Os par�metros fornecidos n�o representam uma data v�lida.\n"+
				"Tentativa de criacao da seguinte data: "+dia+"/"+mes+"/"+ano);		
	}

}