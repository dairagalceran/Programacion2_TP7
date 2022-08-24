package tp7_ej7_SistemaArchivos;
import java.time.LocalDate;

public class Archivo  extends ElementoSistema{
   
    private double tamanio;
    private String extension;

    public Archivo(String nombre, String extension, double tamanio){
        super(nombre);
        this.tamanio = tamanio;
        this.extension = extension;
    }

    @Override
    public int cantidadArchivos(){
        return 1;
    }
    @Override
    public double getTamanio() {
        return tamanio;
    }
    public String getExtension() {
        return extension;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
        this.setFechaModicacion(LocalDate.now());
    }

    
}
