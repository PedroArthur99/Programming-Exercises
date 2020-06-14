package application;

import java.util.ArrayList;
import java.util.List;

import entities.Cliente;
import excecoes.ClienteInexistenteException;
import excecoes.PagamentoInvalidoException;
import excecoes.PedidoInexistenteException;
import interfaces.Item;

public class SistemaRestaurante {
	List<Cliente> clientes;
	List<Item> pedidos;
	
	public SistemaRestaurante() {
		clientes = new ArrayList<Cliente>();
		pedidos  = new ArrayList<Item>();
	}
	
	public void adicionarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void adicionarPedidos (int mesa, Item item) throws ClienteInexistenteException {
		boolean clienteExistente = false;
		
		for(int i = 0; i < clientes.size(); i ++) {
			if (clientes.get(i).getMesa() == mesa) {
				clienteExistente = true;
				clientes.get(i).adicionarPedido(item);
			}
		}
		if (clienteExistente == false) {
			throw new ClienteInexistenteException("Esse cliente não existe!!!");
		}
	}
	
	public void removerPedido (int mesa, Item item) throws PedidoInexistenteException {
		boolean pedidoExistente = false;
		for(int i = 0; i < clientes.size(); i ++) {
			if (clientes.get(i).getMesa() == mesa) {
				clientes.get(i).removerPedido(item);
				pedidoExistente = true;
			}
		}
		if (pedidoExistente == false) {
			throw new PedidoInexistenteException("Esse pedido não existe!!!");
		}
	}
	
	public double computarPagamento(int mesa) {
		double conta = 0;
        for (Cliente c : clientes) {
            if(c.getMesa() == mesa) {
                conta+= c.getConta();
            }
        }
        return conta;
	}

	public void receberPagamento (int mesa, double pagamento) throws PagamentoInvalidoException{
		double conta = computarPagamento(mesa);
		System.out.println("Quanto você quer pagar? Faltam " + conta);
		if (conta > pagamento) {
			throw new PagamentoInvalidoException("Valor insuficiente para processar o pagamento. Vou devolver seu dinheiro e "
					+ "você ainda deve um total de " + conta);
		}
		else if(conta < pagamento){
			double troco = pagamento - conta;
			System.out.println("Muito obrigado! Seu troco é " + troco);
			
		}
		else {
			System.out.println("Muito obrigado!");
		}
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public List<Item> getPedidos() {
		return pedidos;
	}
	
	
}