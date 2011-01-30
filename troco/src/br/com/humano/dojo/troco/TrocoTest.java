package br.com.humano.dojo.troco;

import org.junit.Assert;
import org.junit.Test;

public class TrocoTest {
	
	//total = 60 e pago = 100; troco = 2 de 20
	
	
	@Test
	public void deveRetornarDuasCedulasVinte() {
		Troco troco = new Troco();
		troco.setCedula(Cedula.VINTE, Cedula.VINTE);
		
		Troco retornado = CalculadorTroco.calcularTroco(100, 60);
		
		Assert.assertEquals(2, retornado.getCedula().length);
		for (int i = 0; i < retornado.cedula.length; i++) {
			Assert.assertEquals(retornado.cedula[i], Cedula.VINTE);
		}
		Assert.assertEquals(troco.getValorTotal(), retornado.getValorTotal());
	}
	
	@Test
	public void deveRetornarUmaCedulasDez(){
		Troco troco = new Troco();
		troco.setCedula(Cedula.DEZ);
		
		Troco retornado = CalculadorTroco.calcularTroco(20, 10);

		Assert.assertEquals(1, retornado.getCedula().length);
		for (int i = 0; i < retornado.cedula.length; i++) {
			Assert.assertEquals(retornado.cedula[i], Cedula.DEZ);
		}
		Assert.assertEquals(troco.getValorTotal(), retornado.getValorTotal());
	}
	
	@Test
	public void deveRetornarUmaCedulasCincoOutraDois() {
		Troco troco = new Troco();
		troco.setCedula(Cedula.CINCO, Cedula.DOIS);

		Troco retornado = CalculadorTroco.calcularTroco(10, 3);

		Assert.assertEquals(2, retornado.getCedula().length);
		Assert.assertEquals(retornado.cedula[0], Cedula.CINCO);
		Assert.assertEquals(retornado.cedula[1], Cedula.DOIS);
		Assert.assertEquals(troco.getValorTotal(), retornado.getValorTotal());
	}
}
