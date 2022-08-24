package tp7_ej2_Historiador;

public class CondicionBusquedaPalabraClave extends CondicionBusqueda{

    private String palabraClave;

    public CondicionBusquedaPalabraClave(String palabraClave){
        this.palabraClave = palabraClave;
    }

    @Override
    public boolean esCumplidaPor(Documento doc){
        return  doc.getPalabrasClaves().contains(palabraClave);
        //this.palabraClave.equals(doc.getPalabrasClaves());
    }
}
