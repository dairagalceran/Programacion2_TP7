package tp7_ej5_Futbol5;
import java.util.ArrayList;

public class Club  {

    private String nombre;    
    private ArrayList<Socio> socios;
   // private ArrayList<Alquiler> alquilerCanchas;

    public Club (String nombre){
        this.nombre = nombre;
        this.socios = new ArrayList<>();
       // this.alquilerCanchas = new ArrayList<>();
    }

    /*public void addAlquilerCancha(Alquiler alq){
        if(!alquilerCanchas.contains(alq)){
            alquilerCanchas.add(alq);
        }
    }*/

    public void addSocio(Socio clNuevo){
        if(!socios.contains(clNuevo))
        socios.add(clNuevo);    
    }

    public ArrayList<Socio> getSocio(){
        return new ArrayList <Socio>(socios) ;
    }


    /*public ArrayList<Socio> ordenar(Comparator orden){
        ArrayList sociosOrdenados = getSocio();
        Collections.sort(sociosOrdenados , orden);
    }*/
    
    /*public ArrayList<String> canchaXAlquilada(int id){
        ArrayList<Socio> sociosAux = new ArrayList<>();
        for(int i =0; socios.size()>i; i++){
            if(socios.get(i).){
                sociosAux.add(alquilerCanchas.get(i).getSocioAlquila().getNombre());
            }
        }
        return sociosAux;
    }
    */

    
    public ArrayList<Socio> buscarSociosQueCumplan(CondicionBusqueda condicion){
        ArrayList<Socio> auxSocio = new ArrayList<>();
        for(int i =0; i<socios.size(); i++){
            Socio sc = socios.get(i);
            if(condicion.esCumplidaPor(sc)){
                auxSocio.add(sc);
            }
        }
        return auxSocio;
    }
    
    @Override
    public String toString(){
        return this.toString();
    }
   

}
