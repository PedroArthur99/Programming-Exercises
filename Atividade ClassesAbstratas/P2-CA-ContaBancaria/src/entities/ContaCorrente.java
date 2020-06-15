package entities;

import excecoes.SaldoInsuficienteException;
import excecoes.SenhaInvalidaException;

public class ContaCorrente extends ContaBancaria{
	
	public ContaCorrente() {
		super();
	}

	public ContaCorrente(String nome, String senha, Double saldo) {
		super(nome, senha, saldo);
	}

	@Override
	public void transferir(String senha, double valor, ContaBancaria conta)
			throws SaldoInsuficienteException, SenhaInvalidaException {
		if (!this.senha.equals(senha)) {
			throw new SenhaInvalidaException("Senha Incorreta!");
		}
		else {
			if (valor < 5000) {
				if (this.getSaldo() < (valor + (valor *0.0025))) {
					throw new SaldoInsuficienteException("Saldo Insuficiente!");
				}
				else {
					double balance = this.getSaldo() - (valor + (valor * 0.0025));
					this.saldo = balance;
					double balance2 = conta.getSaldo() + valor;
					conta.saldo = balance2;
				}
			}
			else {
				if (this.getSaldo() < (valor + 15)) {
					throw new SaldoInsuficienteException("Saldo Insuficiente!");
				}
				else {
					double balance = this.getSaldo() - (valor + 15);
					this.saldo = balance;
					double balance2 = conta.getSaldo() + valor;
					conta.saldo = balance2;
				}
			}
		}
	}
}
