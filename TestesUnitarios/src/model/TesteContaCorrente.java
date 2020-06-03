package model;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteContaCorrente {
	
	private ContaCorrente c;
	private ContaCorrente c2;
	
	@Before
	public void setUp() throws ValorInvalidoException {
		c = new ContaCorrente(500, 100, "Pedro");
		c2 = new ContaCorrente(500, 101, "Arthur");
		c.depositar(1000);
	}
	
	@Test (expected=ValorInvalidoException.class)
	public void testDepositarException() throws ValorInvalidoException {
		c.depositar(850);
		assertEquals(1850, c.getSaldo(),0);
		c.depositar(-10);
		assertEquals(1840, c.getSaldo(),0);
	}
	
	@Test
	public void testDebitar() throws ValorInvalidoException{
		c.debitar(450);
		assertEquals(550, c.getSaldo(),0);
		c.debitar(600);
		assertEquals(-50, c.getSaldo(),0);
	}
	
	@Test
	public void testTransferir(){
		c.transferir(500, c2);
		assertEquals(500, c.getSaldo(),0);
		assertEquals(500, c2.getSaldo(),0);
	}
	
	@Test
	public void testVerificaRetirada(){
		assertTrue(c.verificaRetirada(500));
		assertTrue(c.verificaRetirada(100));
	}
	
}
