package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import application.SistemaRestaurante;
import entities.Bebida;
import entities.Cliente;
import entities.Refeicao;
import enums.Carboidrato;
import enums.Proteina;
import enums.SaborBebida;
import enums.Tamanho;
import excecoes.ClienteInexistenteException;
import excecoes.PagamentoInvalidoException;
import excecoes.PedidoInexistenteException;

public class TesteSistemaRestaurante {
	
	private SistemaRestaurante sr;
	private Cliente c1;
	private Cliente c2;
	private Cliente c3;
	private Bebida bebida1;
	private Bebida bebida2;
	private Bebida bebida3;
	private Refeicao refeicao1;
	private Refeicao refeicao2;
	private Refeicao refeicao3;
	
	@Before
	public void setUp() {
		sr = new SistemaRestaurante();
		c1 = new Cliente(1);
		c2 = new Cliente(2);
		c3 = new Cliente(3);
		bebida1 = new Bebida(Tamanho.GRANDE, SaborBebida.COLA);
		refeicao1 = new Refeicao (Proteina.FRANGO, Carboidrato.ARROZ);
		bebida2 = new Bebida(Tamanho.MEDIO, SaborBebida.GUARANA);
		refeicao2 = new Refeicao (Proteina.LINGUICA, Carboidrato.FEIJAO);
		bebida3 = new Bebida(Tamanho.PEQUENO, SaborBebida.CACHACA);
		refeicao3 = new Refeicao (Proteina.MAMINHA, Carboidrato.BATATA);
	}
	
	@Test
	public void testAdicionarCliente() {
		sr.adicionarCliente(c1);
		assertEquals(1, sr.getClientes().size(),0);
		sr.adicionarCliente(c2);
		sr.adicionarCliente(c3);
		assertEquals(3, sr.getClientes().size(),0);
	}
	
	@Test
	public void testAdicionarPedido() throws ClienteInexistenteException {
		sr.adicionarCliente(c1);
		sr.adicionarPedidos(1, bebida1);
		sr.adicionarPedidos(1, bebida2);
		assertEquals(2, c1.getPedido().size(),0);
		sr.adicionarPedidos(1, refeicao2);
		sr.adicionarPedidos(1, refeicao3);
		assertEquals(4, c1.getPedido().size(),0);
	}
	
	@Test(expected = ClienteInexistenteException.class)
	public void testAdicionarPedidoExcecao() throws ClienteInexistenteException {
		sr.adicionarPedidos(1, bebida1);
	}
	
	@Test
	public void testRemoverPedido() throws ClienteInexistenteException, PedidoInexistenteException {
		sr.adicionarCliente(c1);
		sr.adicionarPedidos(1, bebida1);
		sr.adicionarPedidos(1, bebida2);
		assertEquals(2, c1.getPedido().size(),0);
		sr.removerPedido(1, bebida1);
		sr.removerPedido(1, bebida2);
		assertEquals(0, c1.getPedido().size(),0);
	}
	
	@Test(expected = PedidoInexistenteException.class)
	public void testRemoverPedidoExcecao() throws PedidoInexistenteException {
		sr.removerPedido(1, bebida1);
	}
	
	@Test
	public void testComputarPagamento() throws ClienteInexistenteException, PedidoInexistenteException {
		sr.adicionarCliente(c1);
		sr.adicionarPedidos(1, bebida1);
		sr.adicionarPedidos(1, refeicao3);
		assertEquals(21.8, sr.computarPagamento(1),0);
		sr.adicionarPedidos(1, bebida1);
		assertEquals(27.6, sr.computarPagamento(1),0);	
	}
	
	@Test
	public void testReceberPagamento() throws ClienteInexistenteException, PagamentoInvalidoException {
		sr.adicionarCliente(c1);
		sr.adicionarPedidos(1, bebida1);
		sr.adicionarPedidos(1, refeicao3);
		sr.receberPagamento(1, 50);
	}
	
	@Test (expected = PagamentoInvalidoException.class)
	public void testReceberPagamentoExcecao() throws ClienteInexistenteException, PagamentoInvalidoException {
		sr.adicionarCliente(c1);
		sr.adicionarPedidos(1, bebida1);
		sr.adicionarPedidos(1, refeicao3);
		sr.receberPagamento(1, 20);
	}
}
