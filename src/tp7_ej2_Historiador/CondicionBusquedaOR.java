package tp7_ej2_Historiador;

public class CondicionBusquedaOR extends CondicionBusqueda{ 

    private CondicionBusqueda cond1;
    private CondicionBusqueda cond2;

    public CondicionBusquedaOR(CondicionBusqueda cond1 , CondicionBusqueda cond2){
        this.cond1 = cond1;
        this.cond2 = cond2;
    }


    @Override
    public boolean esCumplidaPor(Documento doc){
        return this.cond1.esCumplidaPor(doc) || this.cond2.esCumplidaPor(doc);
    }
}