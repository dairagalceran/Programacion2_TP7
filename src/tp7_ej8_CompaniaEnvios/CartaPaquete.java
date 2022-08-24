package tp7_ej8_CompaniaEnvios;

public class CartaPaquete  extends Envio{

    private Persona remitente;
    private Persona destinatario;
    private double peso;
    private boolean retiraSucursal;

    public CartaPaquete(String numTracking, Persona remitente, Persona destinatario, double peso, boolean retiraSucursal){
        super(numTracking);
        this.destinatario = destinatario;
        this.remitente = remitente;
        this.peso = peso;
        this.retiraSucursal= true;
    }

    public void setTracking(String n){
        super.setNumTracKing(n);
    }

    public boolean getRetiraSucursal(){
        return this.retiraSucursal;
    }

    public void setRetiraSucursal(boolean retiraEnSucursal){
        this.retiraSucursal = retiraEnSucursal;
    }
    
    @Override
    public Persona getDestinatario(){
        return this.destinatario;
    }

    @Override
    public Persona getRemitente(){
        return this.remitente;
    }

    @Override
    public double getPeso(){
        return this.peso;
    }

    @Override
    public String toString() {
       
        return "\nNúmero tracking: "+ super.getNumTracking()+"\nDestinatario: "+ this.getDestinatario()+ "\nRemitente: "+this.getRemitente()+ "\nPeso envio: "+this.getPeso();
    }
}

