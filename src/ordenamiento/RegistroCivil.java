package ordenamiento;



public class RegistroCivil {

	Condicion aceptacion;
	ArrayList<Persona> elementos;
	
	public RegistroCivil() {
		elementos = new ArrayList<Persona>();
	}
	
	public void addPersona(Persona p) {
		if (aceptacion.cumple(p))
				elementos.add(p);
	}
	
	public ArrayList<Persona> getPersonas(){
	//	ArrayList<Persona> salida = new ArrayList<Persona>(elementos);
	//	ArrayList<Persona> salida = (ArrayList<Persona> ) elementos.clone();
		ArrayList<Persona> salida = new ArrayList<Persona>();
		salida.addAll(elementos);
		Collections.sort(salida);
		return salida;
		
	}
	public ArrayList<Persona> getPersonasInversa(){
	//	ArrayList<Persona> salida = new ArrayList<Persona>(elementos);
	//	ArrayList<Persona> salida = (ArrayList<Persona> ) elementos.clone();
		ArrayList<Persona> salida = new ArrayList<Persona>();
		salida.addAll(elementos);
		Collections.sort(salida,Collections.reverseOrder());
		
		return salida;
		
	}
	
	
 @Override
	public String toString() {
		return elementos.toString();
	}
	
	public ArrayList<Persona> getPersonas(Comparator<Persona> com){
		ArrayList<Persona> salida = new ArrayList<Persona>();
		salida.addAll(elementos);
		Collections.sort(salida,com);
		return salida;
		
	}
	
	
	public ArrayList<Persona> buscarPersonas(Condicion cc){
		ArrayList<Persona> salida = new ArrayList<Persona>();
		for(int i = 0; i<elementos.size();i ++) {
			Persona p1 = elementos.get(i);
			if (cc.cumple(p1)) {
				salida.add(p1);
			}
		}
		return salida;
		
	}
	
	public ArrayList<Persona> buscarPersonas(Condicion cc, Comparator<Persona> orden){
		ArrayList<Persona> salida = this.buscarPersonas(cc);
		Collections.sort(salida, orden);
		return salida;
	}
}
