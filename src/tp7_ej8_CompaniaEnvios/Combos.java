package tp7_ej8_CompaniaEnvios;
import java.util.ArrayList;


public class Combos extends Envio{

    private ArrayList<Envio> combos;


    public Combos(String numTracking){
        super(numTracking);
        this.combos = new ArrayList<>();
    }

    public void setNumTracking(String numTrackingNuevo){
        super.setNumTracKing(numTrackingNuevo);
        for(int i = 0; i < combos.size(); i++){
            combos.get(i).setNumTracKing(numTrackingNuevo);
        }
    }

    public void addEnvios(Envio nuevoEnvio){
        Persona dest = this.getDestinatario();
        if(dest == null){
            combos.add(nuevoEnvio);
            nuevoEnvio.setNumTracKing(this.getNumTracking());   
        }else{
            if(dest.equals(nuevoEnvio.getDestinatario()))
            combos.add(nuevoEnvio);
            nuevoEnvio.setNumTracKing(this.getNumTracking());
        }
    }

    @Override
    public Persona getDestinatario(){
        if(combos.size()>0)
        return combos.get(0).getDestinatario();
        else
        return null;
    }
    @Override
    public Persona getRemitente(){
        if(combos.size()>0)
        return combos.get(0).getRemitente();
        else
        return null;
    }

    @Override
    public double getPeso(){

        double peso = 0.0;
        for(int i =0; i < combos.size(); i++){
            peso += combos.get(i).getPeso(); 
        }
        return peso;
    }
    
    @Override
    public String toString() {
        return "\nNúmero tracking: "+ super.getNumTracking()+"\nDestinatario: "+ this.getDestinatario()+ "\nREmitente: "+this.getRemitente()+ "\nPeso envio: "+this.getPeso();
    }
}
