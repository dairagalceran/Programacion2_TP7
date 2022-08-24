package tp7_ej2_Historiador;

public class CondicionBusquedaCantidadPalabras  extends CondicionBusqueda{
    private int cantPalabras;

    public CondicionBusquedaCantidadPalabras(int cantPalabras){
        this.cantPalabras = cantPalabras;
    }

    @Override
    public boolean esCumplidaPor(Documento doc){
        return  doc.contarPalabras() > this.cantPalabras;
    }

}
