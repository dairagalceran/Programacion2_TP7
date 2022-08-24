package ordenamiento;

import java.util.ArrayList;
import ordenamiento.condiciones.CAnd;
import ordenamiento.condiciones.ConMenorEdad;
import ordenamiento.condiciones.CondiNombre;
import ordenamiento.condiciones.Condicion;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p1 = new Persona("a","za",0);
		Persona p2 = new Persona("a1","b",2);
		Persona p3 = new Persona("a1","b",-1);
		Persona p4 = new Persona("a1","b",3);
		Persona p5 = new Persona("a4","e",1);
		RegistroCivil rg = new RegistroCivil();
		rg.addPersona(p1);
		rg.addPersona(p2);
		rg.addPersona(p3);
		rg.addPersona(p4);
		rg.addPersona(p5);
		
		
		System.out.println("----- resgistro------");
		System.out.println(rg);
		CompNombre cnn = new CompNombre();
		ComApellido cna = new ComApellido();
		CompDoble cd = new CompDoble(cnn, cna);
		CompEdad cee = new CompEdad();
		CompDoble cd2 = new CompDoble(cd, cee);
		
		ArrayList<Persona> ordenados = rg.getPersonas(cd2);
		System.out.println("-----Ordenados por nombre apellido y edad");
		
		System.out.println(ordenados);
		
		System.out.println("-------registro -------");
		System.out.println(rg);
		
		
		Condicion conNom = new CondiNombre("a1");
		Condicion conEdad = new ConMenorEdad(5);
		CAnd cor = new CAnd(conNom, conEdad);
		
		ArrayList<Persona> buscados = rg.buscarPersonas(cor,cd2);
		
		System.out.println(buscados);
		
	}

}
