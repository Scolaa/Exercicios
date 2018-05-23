package br.com.db1start.exercicio06;

import java.util.Date;
import java.util.List;

public class Restaurante {

	private String nome;

	private Boolean serveAlmoco;

	private Boolean serveJanta;

	private Boolean serveCafeDaManha;

	private Endereco endereco;

	public Date gerarRelatorioFaturamento() {
		return null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getServeAlmoco() {
		return serveAlmoco;
	}

	public void setServeAlmoco(Boolean serveAlmoco) {
		this.serveAlmoco = serveAlmoco;
	}

	public Boolean getServeJanta() {
		return serveJanta;
	}

	public void setServeJanta(Boolean serveJanta) {
		this.serveJanta = serveJanta;
	}

	public Boolean getServeCafeDaManha() {
		return serveCafeDaManha;
	}

	public void setServeCafeDaManha(Boolean serveCafeDaManha) {
		this.serveCafeDaManha = serveCafeDaManha;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
