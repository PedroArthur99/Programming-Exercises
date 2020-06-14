package entities;

import java.util.ArrayList;
import java.util.List;

import interfaces.Item;

public class Cliente {
	
	private int mesa;
	private List<Item> pedido;
	
	public Cliente (int mesa) {
		this.mesa = mesa;
		pedido = new ArrayList<Item>();
	}
	
	public int getMesa() {
		return mesa;
	}
	
	public List<Item> getPedido() {
		return pedido;
	}
		
	public void adicionarPedido(Item item) {
		pedido.add(item);
	}
	
	public void removerPedido(Item item) {
		pedido.remove(item);
	}
	
	public double getConta() {
		double conta = 0;
		for (Item i : pedido) {
			conta += i.getPreco();
		}
		return conta;
	}

}
