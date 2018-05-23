package br.com.db1start.exercicio08;

import java.util.List;

public class Conta {

	private Pessoa pessoa;

	private Agencia agencia;

	private Integer numero;

	private Integer digitoVerificador;

	public String calcularDigitoVerificador() {
		return null;
	}

	public Boolean validarDigitoVerificador() {
		return null;
	}

	public Conta(Agencia agencia, Pessoa pessoa) {
		this.agencia = agencia;

		this.pessoa = pessoa;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getDigitoVerificador() {
		return digitoVerificador;
	}

	public void setDigitoVerificador(Integer digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}

}
