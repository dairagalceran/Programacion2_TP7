package tp7_ej8_CompaniaEnvios;

public abstract  class Envio{
    
    private String numTracking;
   

    public Envio(String numTracking){
        this.numTracking = numTracking;    
    }

    public String getNumTracking(){
        return this.numTracking;
    }

    public void setNumTracKing(String n){
        this.numTracking = n;
    }
    
    //public boolean retiraEnSucursal(Persona p);

    public abstract  Persona getDestinatario();

    public  abstract Persona getRemitente();

    public abstract double getPeso();

    @Override
    public String toString(){
        return "Numero tracking: "+ this.getNumTracking();
    }

}
