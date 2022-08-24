package tp7_ej7_SistemaArchivos;

import java.util.ArrayList;

public class  Carpeta  extends ElementoSistema{
    
    private ArrayList<ElementoSistema> elementos;
    
    public Carpeta (String nombre ){
        super(nombre);
        this.elementos = new ArrayList<>();
    }

    public void addElemento(ElementoSistema el){
        if(!elementos.contains(el))
        elementos.add(el);
    }

    public void eliminarElemento(ElementoSistema el){
        elementos.remove(el);
    }

    @Override
    public int cantidadArchivos(){
        int cant = 0;
        for (int i=0; i < elementos.size();i++ ){
            ElementoSistema elAux = elementos.get(i);
            cant += elAux.cantidadArchivos();
        }
        return cant;
    }

    @Override
    public double getTamanio(){
        double cant =0.0;
        for(int i =0; i < elementos.size(); i++){
            ElementoSistema elAux = elementos.get(i);
            cant += elAux.getTamanio();
        }
        return cant;
    }
}
