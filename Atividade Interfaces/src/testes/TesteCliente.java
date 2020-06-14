package testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import entities.Bebida;
import entities.Cliente;
import entities.Refeicao;
import enums.Carboidrato;
import enums.Proteina;
import enums.SaborBebida;
import enums.Tamanho;

public class TesteCliente {
	private Cliente cliente;
	private Bebida bebida;
	private Refeicao refeicao;
	
	@Before
	public void setUp() {
		cliente = new Cliente(1);
		bebida = new Bebida(Tamanho.GRANDE, SaborBebida.COLA);
		refeicao = new Refeicao (Proteina.PICANHA, Carboidrato.PURE);
	}

	@Test 
	public void testAdicionarPedido() {
		cliente.adicionarPedido(bebida);
		cliente.adicionarPedido(refeicao);
		assertEquals(2, cliente.getPedido().size());
		cliente.adicionarPedido(bebida);
		cliente.adicionarPedido(refeicao);
		assertEquals(4, cliente.getPedido().size());
	}
	
	@Test 
	public void testRemoverPedido() {
		cliente.adicionarPedido(bebida);
		cliente.adicionarPedido(refeicao);
		assertEquals(2, cliente.getPedido().size());
		cliente.removerPedido(bebida);
		cliente.removerPedido(refeicao);
		assertEquals(0, cliente.getPedido().size());
	}
	
	@Test 
	public void testGetConta() {
		cliente.adicionarPedido(bebida);
		cliente.adicionarPedido(refeicao);
		assertEquals(27.3, cliente.getConta(),0);
	}
}
