package tp7_ej2_Historiador;

public class CondicionBusquedaNOT {
    private CondicionBusqueda cond1;

    public CondicionBusquedaNOT (CondicionBusqueda cond1){
        this.cond1 = cond1;
    }

    public boolean esCumplidaPor(Documento doc){
        return !this.cond1.esCumplidaPor(doc);
    }
}
