package br.com.db1start.exercicio03;

public class Multiplicar implements OperacaoMatematica {

	@Override
	public Double calcular(Double primeiroValor, Double segundoValor) {
		return primeiroValor * segundoValor;
	}

}
