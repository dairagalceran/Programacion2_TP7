package tp7_ej2_Historiador;

public class CondicionBusquedaContenido extends CondicionBusqueda {

    private String contenidoBuscar;

        public CondicionBusquedaContenido(String contenidoBuscar){
            this.contenidoBuscar = contenidoBuscar;
        }

    @Override
    public boolean esCumplidaPor(Documento contenido){
        return  contenido.getContenido().contains(this.contenidoBuscar);
    }

}
