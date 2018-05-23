package br.com.db1start.exercicio08;

import java.util.Date;
import java.util.List;

public class Banco {

	private List<Conta> conta;

	private String nome;

	private Date dataFundacao;

	private String publico;

	public Boolean isPublico() {
		return null;
	}

	public List<Conta> getConta() {
		return conta;
	}

	public void setConta(List<Conta> conta) {
		this.conta = conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	}

	public String getPublico() {
		return publico;
	}

	public void setPublico(String publico) {
		this.publico = publico;
	}

}
