package tp7_ej3_Vivero.Condiciones;
import tp7_ej3_Vivero.Ficha;

public class CondicionRiegoInferior extends CondicionBusqueda {
    private int  riego;

    public CondicionRiegoInferior(int riego){
        this.riego = riego;
    }

    @Override
    public boolean esCumplidaPor(Ficha f){
        return f.getRiego() < riego;
    }
}
