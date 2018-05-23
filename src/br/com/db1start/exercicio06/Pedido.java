package br.com.db1start.exercicio06;

import java.util.Date;
import java.util.List;

public class Pedido {

	private List<Restaurante> restaurante;

	private Integer numero;

	private Integer numeroMesa;

	private Date dataPedido;

	public String cadastrarPedido() {
		return null;
	}

	public String fecharPedido() {
		return null;
	}

	public List<Restaurante> getRestaurante() {
		return restaurante;
	}

	public void setRestaurante(List<Restaurante> restaurante) {
		this.restaurante = restaurante;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getNumeroMesa() {
		return numeroMesa;
	}

	public void setNumeroMesa(Integer numeroMesa) {
		this.numeroMesa = numeroMesa;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

}
