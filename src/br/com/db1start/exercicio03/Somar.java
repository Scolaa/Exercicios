package br.com.db1start.exercicio03;

public class Somar implements OperacaoMatematica {

	@Override
	public Double calcular(Double primeiroValor, Double segundoValor) {
		return primeiroValor + segundoValor;
	}

}
