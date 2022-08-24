package tp7_ej3_Vivero;
import java.util.ArrayList;
import tp7_ej3_Vivero.Condiciones.*;

public class Vivero {
    
    private ArrayList <Ficha> plantas;
    private String nombre;
    
    public  Vivero(String nombre){
        this.nombre = nombre;
        this.plantas = new ArrayList<>();
    }

    public ArrayList<Ficha> getPlantas() {
        return new ArrayList<Ficha>();
    }

    public void  addFicha(Ficha planta){
        if(!plantas.contains(planta)){
            plantas.add(planta);
        }
    }
    
    public ArrayList<Ficha> buscarPor(CondicionBusqueda cc){
        ArrayList<Ficha> salida = new ArrayList<>();
        for(int i =0; i< plantas.size(); i++){
            if(cc.esCumplidaPor(plantas.get(i))){
                salida.add(plantas.get(i));
            }
        }
        return salida;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
