package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import entities.ContaCorrente;
import excecoes.SaldoInsuficienteException;
import excecoes.SenhaInvalidaException;

public class TesteContaCorrente {
	 
	ContaCorrente c1;
	ContaCorrente c2;
	
	@Before
	public void setUp() {
		c1 = new ContaCorrente("Pedro Arthur", "123456", 1500.0);
		c2 = new ContaCorrente("Daniel Carvalho", "987654", 20000.0);
	}
	@Test
	public void testTransferir() throws SaldoInsuficienteException, SenhaInvalidaException {
		c1.transferir("123456", 500.0, c2);
		assertEquals(998.75, c1.getSaldo(),0);
		assertEquals(20500.0, c2.getSaldo(),0);
		c2.transferir("987654", 6000.0, c1);
		assertEquals(6998.75, c1.getSaldo(),0);
		assertEquals(14485.0, c2.getSaldo(),0);
	}

	@Test (expected = SaldoInsuficienteException.class)
	public void testTransferirSaldoInsuficienteException() throws SaldoInsuficienteException, SenhaInvalidaException {
		c1.transferir("123456", 999999.0, c2);
		c2.transferir("987654", 999999.0, c1);
	}
	
	@Test (expected = SenhaInvalidaException.class)
	public void testTransferirSenhaInvalidaException() throws SaldoInsuficienteException, SenhaInvalidaException {
		c1.transferir("19898189119", 20.0, c2);
		c2.transferir("acadcc488ac", 30.0, c1);
	}
}
