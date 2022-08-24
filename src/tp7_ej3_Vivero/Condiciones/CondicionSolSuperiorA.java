package tp7_ej3_Vivero.Condiciones;
import tp7_ej3_Vivero.Ficha;

public class CondicionSolSuperiorA extends CondicionBusqueda{
    private int  sol;

    public CondicionSolSuperiorA(int sol){
        this.sol = sol;
    }

    @Override
    public boolean esCumplidaPor(Ficha f){
        return f.getSol() > sol;
    }
}
