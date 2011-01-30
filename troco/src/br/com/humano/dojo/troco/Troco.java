package br.com.humano.dojo.troco;

import java.util.Arrays;


public class Troco {
	
	Moeda[] moeda;
	Cedula[] cedula;
	
	public Moeda[] getMoeda() {
		return moeda;
	}
	
	public void setMoeda(Moeda... moeda) {
		this.moeda = moeda;
	}
	
	public Cedula[] getCedula() {
		return cedula;
	}
	
	public void setCedula(Cedula... cedula) {
		this.cedula = cedula;
	}

	public float getValorTotal(){
		float valor = 0;
		for (Cedula cedulaTemp : cedula) {
			valor+=cedulaTemp.valor;
		}
		return valor;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(cedula);
		result = prime * result + Arrays.hashCode(moeda);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Troco other = (Troco) obj;
		if (!Arrays.equals(cedula, other.cedula))
			return false;
		if (!Arrays.equals(moeda, other.moeda))
			return false;
		return true;
	}
	
}
