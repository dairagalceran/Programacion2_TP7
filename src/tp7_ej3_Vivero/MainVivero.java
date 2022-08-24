package tp7_ej3_Vivero;

import tp7_ej3_Vivero.Condiciones.CondicionBusqueda;
import tp7_ej3_Vivero.Condiciones.CondicionNombreCientifico;
import tp7_ej3_Vivero.Condiciones.CondicionRiegoInferior;
import tp7_ej3_Vivero.Condiciones.CondicionSolSuperiorA;
import tp7_ej3_Vivero.Condiciones.condicionAND;




public class MainVivero {
    public static void main(String[] args) {
        Vivero flor = new Vivero("flor");

        Ficha f1 = new Ficha("rosa", "etiledium estrilosa", "rosasea", "rosema","interior");
        Ficha f2 = new Ficha("Epurtrinm aureum", "redsee melosa", "destr", "rema", "exterior");
        Ficha f3 = new Ficha("lirium airosa", "lilaseun edsea", "lilasea", "troema", "interior");

        f1.setRiego(3);
        f1.setSol(6);
        f1.addPalabrasVulgares("rosa");
        f1.addPalabrasVulgares("sepa");
        flor.addFicha(f1);

        
        f2.setRiego(7);
        f2.setSol(2);
        flor.addFicha(f2);
        
        f3.setRiego(2);
        f3.setSol(6);
        flor.addFicha(f3);
        


        CondicionBusqueda cond = new CondicionNombreCientifico("aureum");
        CondicionBusqueda riegoInf = new CondicionRiegoInferior(5);
        CondicionBusqueda solSup = new CondicionSolSuperiorA(4);
        CondicionBusqueda and = new condicionAND(riegoInf, solSup);

    System.out.println(flor);
    System.out.println("-------- busqueda---------");
    System.out.println(flor.buscarPor(cond));
    System.out.println("-------- busqueda--AND-------");
    System.out.println(flor.buscarPor(and));

    }

    
}
