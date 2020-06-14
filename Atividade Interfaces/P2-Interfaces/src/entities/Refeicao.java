package entities;

import enums.Carboidrato;
import enums.Proteina;
import interfaces.Item;

public class Refeicao implements Item{
	
	private Proteina proteina;
	private Carboidrato carboidrato;
	
	
	public Refeicao(Proteina proteina, Carboidrato carboidrato) {
		this.proteina = proteina;
		this.carboidrato = carboidrato;
	}

	public Proteina getProteina() {
		return proteina;
	}
	
	public Carboidrato getCarboidrato() {
		return carboidrato;
	}

	@Override
	public Double getPreco() {
		return proteina.getPreco() + carboidrato.getPreco();
	}

	@Override
	public String getDescricao() {
		String output = "";
		output += "REFEIÇÃO: \nPROTEÍNA: " + proteina + "\nCARBOIDRATO: " + carboidrato;
		return output;
	}
}
