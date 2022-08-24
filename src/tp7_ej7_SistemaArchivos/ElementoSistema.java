package tp7_ej7_SistemaArchivos;
import java.time.LocalDate;

public abstract  class ElementoSistema {
    private String nombre;
    private LocalDate fechaCreacion;
    private LocalDate fechaModicacion;

    public ElementoSistema(String nombre){
        this.nombre = nombre;
        this.fechaCreacion = LocalDate.now();
        this.fechaModicacion = LocalDate.now();
    }

  
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
        this.fechaModicacion = LocalDate.now();
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion= LocalDate.now();
    }
    
    public LocalDate getFechaModicacion() {
        return fechaModicacion;
    }

    public void setFechaModicacion(LocalDate fechaModicacion) {
        this.fechaModicacion = fechaModicacion;
    }

    public abstract double getTamanio();
    public abstract int cantidadArchivos();

    @Override
    public String toString() {
        return super.toString();
    }
    
}


