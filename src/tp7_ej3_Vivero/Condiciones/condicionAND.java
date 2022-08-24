package tp7_ej3_Vivero.Condiciones;
import tp7_ej3_Vivero.Ficha;

public class condicionAND  extends CondicionBusqueda{
    private CondicionBusqueda cond1;
    private CondicionBusqueda cond2;
    
    public condicionAND (CondicionBusqueda cond1, CondicionBusqueda cond2){
        this.cond1 = cond1;
        this.cond2 = cond2;
    }

    @Override
    public boolean esCumplidaPor(Ficha f){
        return this.cond1.esCumplidaPor(f) && this.cond2.esCumplidaPor(f);
    }
}
