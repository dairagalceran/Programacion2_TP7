package tp7_ej7_SistemaArchivos;

public class Comprimido extends Carpeta{
    private double tasaCompresion;

    public Comprimido(String nombre, double tasaCompresion){
        super(nombre);
        this.tasaCompresion = tasaCompresion;
    }

    public double getTasaCompresion() {
        return this.tasaCompresion;
    }

    public double getTamanio(ElementoSistema el){
        return el.getTamanio()* this.getTasaCompresion();
    }
    
    public void setTasaCompresion(double tasaCompresion) {
        this.tasaCompresion = tasaCompresion;
    }

    public boolean equals(Object obj){
        try{
            Comprimido otro = (Comprimido)obj;
            return this.getNombre().equals(otro.getNombre()) ;
        }catch(Exception e){
            return false;
        }
    }

    @Override
    public String toString() {
        return "Tasa compresion "+ (this.getTasaCompresion()*100) + " %,  "+ super.toString();
    }
}
