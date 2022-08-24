package ordenamiento.condiciones;

import java.util.ArrayList;

import ordenamiento.Persona;

public class CondicionHijoNombre extends Condicion {

	Condicion sobreHijo;
	public boolean cumple(Persona p) {
		
	 return p.tenesUnHijo(sobreHijo);
		
		
	}

}
