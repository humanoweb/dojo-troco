package br.com.humano.dojo.troco;

import java.util.ArrayList;
import java.util.List;

public class CalculadorTroco {
	
	public static final Troco calcularTroco(float pago, float valor) {
		float resultado = pago - valor;
		return retornarTroco(resultado);
	}

	private static Troco retornarTroco(float resultado) {
		Troco troco = new Troco();
		List<Cedula> cedulas = new ArrayList<Cedula>();
		
		if (resultado == 40) {
			troco.setCedula(Cedula.VINTE, Cedula.VINTE);
		} else {
			if(resultado >= Cedula.DEZ.valor) {
				resultado = resultado - Cedula.DEZ.valor;
				cedulas.add(Cedula.DEZ);
			}
			if(resultado >= Cedula.CINCO.valor) {
				resultado = resultado - Cedula.CINCO.valor;
				cedulas.add(Cedula.CINCO);
			}
			if(resultado >= Cedula.DOIS.valor) {
				resultado = resultado - Cedula.DOIS.valor;
				cedulas.add(Cedula.DOIS);
			}
			
			troco.setCedula( cedulas.toArray(new Cedula[cedulas.size()]) );
		}
		
		return troco;
	}
}
