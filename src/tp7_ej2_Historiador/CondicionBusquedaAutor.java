package tp7_ej2_Historiador;

public class CondicionBusquedaAutor extends CondicionBusqueda {

    private String autorBuscar;

    public CondicionBusquedaAutor(String autorBuscar){
        this.autorBuscar = autorBuscar;
    }

    @Override
    public boolean esCumplidaPor(Documento doc){
        return doc.getAutores().contains(autorBuscar);
        //this.autorBuscar.equals(doc.getAutores());
        }
    
}
