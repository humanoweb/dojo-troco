package br.com.humano.dojo.troco;

public enum Cedula {
	
	CEM(100), CINQUENTA(50), VINTE(20), DEZ(10), CINCO(5), DOIS(2);
	
	public final float valor;
	
	private Cedula(float valor){
		this.valor = valor;
	}
}
