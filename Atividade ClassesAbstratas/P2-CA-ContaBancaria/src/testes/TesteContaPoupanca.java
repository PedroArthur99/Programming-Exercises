package testes;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import entities.ContaPoupanca;
import excecoes.SaldoInsuficienteException;
import excecoes.SenhaInvalidaException;

public class TesteContaPoupanca {
	
	ContaPoupanca c1;
	ContaPoupanca c2;
	
	@Before
	public void setUp() {
		c1 = new ContaPoupanca("Pedro Arthur", "123456", 50.0);
		c2 = new ContaPoupanca("Daniel Carvalho", "987654", 200.0);
	}
	@Test
	public void testTransferir() throws SaldoInsuficienteException, SenhaInvalidaException {
		c1.transferir("123456", 30.0, c2);
		assertEquals(15.0, c1.getSaldo(),0);
		assertEquals(230.0, c2.getSaldo(),0);
		c2.transferir("987654", 150, c1);
		assertEquals(165.0, c1.getSaldo(),0);
		assertEquals(75.0, c2.getSaldo(),0);
	}

	@Test (expected = SaldoInsuficienteException.class)
	public void testTransferirSaldoInsuficienteException() throws SaldoInsuficienteException, SenhaInvalidaException {
		c1.transferir("123456", 65.0, c2);
		c2.transferir("987654", 800.0, c1);
	}
	
	@Test (expected = SenhaInvalidaException.class)
	public void testTransferirSenhaInvalidaException() throws SaldoInsuficienteException, SenhaInvalidaException {
		c1.transferir("19898189119", 20.0, c2);
		c2.transferir("acadcc488ac", 30.0, c1);
	}
}
