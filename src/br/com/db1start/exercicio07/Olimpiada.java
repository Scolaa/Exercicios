package br.com.db1start.exercicio07;

public class Olimpiada {

	private Integer ano;

	private Pessoa pessoa;

	private Pais pais;

	private Modalidade modalidade;

	private Sede sede;

	public Olimpiada(Modalidade modalidade, Sede sede, Pessoa pessoa) {
		this.modalidade = modalidade;

		this.sede = sede;

		this.pessoa = pessoa;

	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Modalidade getModalidade() {
		return modalidade;
	}

	public void setModalidade(Modalidade modalidade) {
		this.modalidade = modalidade;
	}

	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}

}
