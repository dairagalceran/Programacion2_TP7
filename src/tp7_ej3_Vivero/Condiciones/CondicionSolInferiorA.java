package tp7_ej3_Vivero.Condiciones;
import tp7_ej3_Vivero.Ficha;

public class CondicionSolInferiorA extends CondicionBusqueda{
    private int  sol;

    public CondicionSolInferiorA(int sol){
        this.sol = sol;
    }

    @Override
    public boolean esCumplidaPor(Ficha f){
        return f.getSol() < sol;
    }
}
