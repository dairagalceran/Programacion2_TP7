package tp7_ej7_SistemaArchivos;
import java.time.LocalDate;

public class Link  extends ElementoSistema{
    private ElementoSistema vinculo;
    public static final double TAMANIO_LINK = 1.0;

    public Link(ElementoSistema vinculo){
    super(vinculo.getNombre());
    this.vinculo = vinculo;
    }

    public String getVinculo() {
        return  "Acceso directo a "+vinculo.getNombre();
    }

    public void setVinculo(ElementoSistema vinculo) {
        this.vinculo = vinculo;
        setFechaModicacion(LocalDate.now());
    }

    @Override
    public double getTamanio(){
        return TAMANIO_LINK;
    }

    @Override
    public int cantidadArchivos(){
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        try{
            Link otro = (Link)obj;
            return (this.getVinculo().equals(otro.getVinculo()) &&
                    this.getNombre().equals(otro.getNombre()));
        }catch(Exception e){
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}