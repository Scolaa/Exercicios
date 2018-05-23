package br.com.db1start.exercicio03.Test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1start.exercicio03.Dividir;
import br.com.db1start.exercicio03.Multiplicar;
import br.com.db1start.exercicio03.OperacaoMatematica;
import br.com.db1start.exercicio03.Somar;
import br.com.db1start.exercicio03.Subtrair;

public class OperadorTest {

	@Test 
	public void calcularTest(){
		OperacaoMatematica operacao = new Somar();
		Assert.assertTrue(22 == operacao.calcular(20d, 2d));
		
		operacao = new Subtrair();
		Assert.assertTrue(18 == operacao.calcular(20d, 2d));
		
		operacao = new Multiplicar();
		Assert.assertTrue(40 == operacao.calcular(20d, 2d));
		
		operacao = new Dividir();
		Assert.assertTrue(10 == operacao.calcular(20d, 2d));
	}
}
