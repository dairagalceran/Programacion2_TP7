package tp7_ej3_Vivero.Condiciones;

import tp7_ej3_Vivero.Ficha;

public class CondicionNombreVulgar extends CondicionBusqueda{

    private String nombreVulgar;

    public CondicionNombreVulgar(String nombreVulgar){
        this.nombreVulgar = nombreVulgar;
    }
    
    @Override
    public boolean esCumplidaPor(Ficha f){
        return f.getNombresVulgares().contains(nombreVulgar);
    }
}
