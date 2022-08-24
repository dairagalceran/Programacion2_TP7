package ordenamiento.condiciones;

import ordenamiento.Persona;

public class ConMenorEdad extends Condicion {
 
	 int valor;
	 
	 
	public boolean cumple(Persona p) {
		
		return p.getEdad() < valor;
	}


	public ConMenorEdad(int valor) {
		super();
		this.valor = valor;
	}

}
