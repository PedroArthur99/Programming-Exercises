package entities;

import excecoes.SaldoInsuficienteException;
import excecoes.SenhaInvalidaException;

public class ContaPoupanca extends ContaBancaria{

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(String nome, String senha, Double saldo) {
		super(nome, senha, saldo);
	}

	@Override
	public void transferir(String senha, double valor, ContaBancaria conta)
			throws 	SaldoInsuficienteException, SenhaInvalidaException {
		if (!this.senha.equals(senha)) {
			throw new SenhaInvalidaException("Senha Incorreta!");
		}
		else {
			if (this.getSaldo() < (valor + 5)) {
				throw new SaldoInsuficienteException("Seu saldo é insuficiente!");
			}
			else {
				double balance = this.getSaldo() - (valor + 5);
				this.saldo = balance;
				double balance2 = conta.getSaldo() + valor;
				conta.saldo = balance2;
			}
		}
	}
}
