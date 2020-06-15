package entities;

import excecoes.SaldoInsuficienteException;
import excecoes.SenhaInvalidaException;

public abstract class ContaBancaria {
	
	protected String nome;
	protected String senha;
	protected Double saldo;
	
	public ContaBancaria() {
	}

	public ContaBancaria(String nome, String senha, Double saldo) {
		this.nome = nome;
		this.senha = senha;
		this.saldo = saldo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public Double getSaldo() {
		return this.saldo;
	}
	
	public abstract void transferir(String senha, double valor, ContaBancaria conta) throws SaldoInsuficienteException, SenhaInvalidaException;
	
}
