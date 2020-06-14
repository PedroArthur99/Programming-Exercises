package entities;

import java.util.ArrayList;
import java.util.List;

import enums.Carboidrato;
import enums.Proteina;
import enums.SaborBebida;
import enums.Tamanho;
import interfaces.Item;

public class Cardapio {
	
	private List<Refeicao> refeicao;
	private List<Bebida> bebida;
	private List<Item> cardapio;
	
	public Cardapio(){

        this.refeicao = new ArrayList<Refeicao>();
        this.bebida = new ArrayList<Bebida>();

        this.bebida.add(new Bebida(Tamanho.GRANDE, SaborBebida.CERVEJA));
        this.bebida.add(new Bebida(Tamanho.PEQUENO, SaborBebida.COLA));
        this.bebida.add(new Bebida(Tamanho.GRANDE, SaborBebida.COLA));
        this.bebida.add(new Bebida(Tamanho.MEDIO, SaborBebida.COLA));
        this.bebida.add(new Bebida(Tamanho.PEQUENO, SaborBebida.COLA));
        this.bebida.add(new Bebida(Tamanho.GRANDE, SaborBebida.GUARANA));
        this.bebida.add(new Bebida(Tamanho.MEDIO, SaborBebida.GUARANA));
        this.bebida.add(new Bebida(Tamanho.PEQUENO, SaborBebida.GUARANA));
        this.bebida.add(new Bebida(Tamanho.GRANDE, SaborBebida.SUCO_LARANJA));
        this.bebida.add(new Bebida(Tamanho.GRANDE, SaborBebida.AGUA));
        this.bebida.add(new Bebida(Tamanho.GRANDE, SaborBebida.SUCO_MARACUJA));
        this.bebida.add(new Bebida(Tamanho.GRANDE, SaborBebida.CACHACA));
        this.refeicao.add(new Refeicao(Proteina.FRANGO,Carboidrato.ARROZ));
        this.refeicao.add(new Refeicao(Proteina.FRANGO,Carboidrato.ARROZ));
        this.refeicao.add(new Refeicao(Proteina.LINGUICA,Carboidrato.FEIJAO));
        this.refeicao.add(new Refeicao(Proteina.PICANHA,Carboidrato.PURE));
        this.refeicao.add(new Refeicao(Proteina.PICANHA,Carboidrato.ARROZ));

        this.cardapio = new ArrayList<Item>();
        this.cardapio.addAll(bebida);
        this.cardapio.addAll(refeicao);
    }
	public List getRefeicao() {
		return refeicao;
	}
	
	public List getBebida() {
		return bebida;
	}
	
	public List getCardapio() {
		return cardapio;
	}
}
