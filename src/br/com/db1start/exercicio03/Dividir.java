package br.com.db1start.exercicio03;

public class Dividir implements OperacaoMatematica {

	@Override
	public Double calcular(Double primeiroValor, Double segundoValor) {
		return primeiroValor / segundoValor;
	}

}
