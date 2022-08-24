package tp7_ej3_Vivero.Condiciones;
import tp7_ej3_Vivero.Ficha;


public class CondicionNombreCientifico extends CondicionBusqueda {
    private String nombre;

    public CondicionNombreCientifico(String nombre){
        this.nombre = nombre;
    }

    @Override
    public boolean esCumplidaPor(Ficha f){
        return f.getNombre().contains(nombre);
    }

}
