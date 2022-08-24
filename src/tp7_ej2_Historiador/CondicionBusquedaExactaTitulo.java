package tp7_ej2_Historiador;

public class CondicionBusquedaExactaTitulo  extends CondicionBusqueda{
    
    private String titulo;

    public CondicionBusquedaExactaTitulo(String titulo){
        this.titulo = titulo;
    }

    @Override
    public boolean esCumplidaPor(Documento doc){
        return this.titulo.equals(doc.getTitulo());
    }



}
