package br.com.humano.dojo.estatistica;

import java.util.Arrays;

import junit.framework.Assert;

import org.junit.Test;

public class EstatisticaTest {
	
	@Test
	public void testarValorMinimo5(){
		Assert.assertEquals(5, Estatisticas.getMenorValor(Arrays.asList(5, 20 , 17, 18, 13)));
	}
	
	@Test
	public void testarValorMinimo3(){
		Assert.assertEquals(3, Estatisticas.getMenorValor(Arrays.asList(5, 20 , 17, 18, 3)));
	}
	
	@Test
	public void testarValorMinimoMenos10(){
		Assert.assertEquals(-10, Estatisticas.getMenorValor(Arrays.asList(44, 250 , -6, 178, -10)));
	}
	
	
	@Test
	public void testarValorMaximo250(){
		Assert.assertEquals(250, Estatisticas.getMaiorValor(Arrays.asList(44, 250 , -6, 178, -10)));
	}
	
	
	@Test
	public void testarValorMaximo10(){
		Assert.assertEquals(10, Estatisticas.getMaiorValor(Arrays.asList(4, 5 , -6, -178, 10)));
	}
	
	@Test
	public void testarValorMaximoMenos1(){
		Assert.assertEquals(-1, Estatisticas.getMaiorValor(Arrays.asList(-4, -5 , -6, -17, -1)));
	}
	
	@Test
	public void testarNumeroElementos5(){
		Assert.assertEquals(5, Estatisticas.getNumeroDeElementos(Arrays.asList(-4, -5 , -6, -17, -1)));
	}
	
	@Test
	public void testarNumeroElementos10(){
		Assert.assertEquals(10, Estatisticas.getNumeroDeElementos(Arrays.asList(-4, -5 , -6, -17, -187, -4, -5 , -65, -17, -101)));
	}
	
	@Test
	public void testarMediaValores(){
		Assert.assertEquals(2D, Estatisticas.getMediaValores(Arrays.asList(1, 2, 3)));
	}
	
	@Test
	public void mediaDeveSer50(){
		Assert.assertEquals(50D, Estatisticas.getMediaValores(Arrays.asList(50, 100, 50 ,0)));
	}
	
	@Test
	public void mediaDeveSer5Negativo(){
		Assert.assertEquals(-5D, Estatisticas.getMediaValores(Arrays.asList(10, -20, -10 ,0)));
	}
	
	@Test
	public void mediaDeveSerZero(){
		Assert.assertEquals(0D, Estatisticas.getMediaValores(Arrays.asList(10, -10, -20, 20)));
	}
	

}