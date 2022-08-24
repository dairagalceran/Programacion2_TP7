package tp7_ej2_Historiador;


public class MainHistoriador {
    
    public static void main(String[] args) {
        
        Historiador histo = new Historiador();
        Documento casaPapel = new Documento("La casa de papel", "Redeeo finales de las fábricas ye infrrque industrial.");
        Documento mujercitas = new Documento("Mujercitas", "Tenerr rimientobricas y infraestructura del parque industrial.");
        Documento laOdisea = new Documento("La Odisea", "Requerimiento finales de las fábricas yesica infraestructura del parque industrial.");

        histo.addDocumento(casaPapel);
        histo.addDocumento(mujercitas);
        histo.addDocumento(laOdisea);

        casaPapel.addPalabrasClaves("humor");
        casaPapel.addPalabrasClaves("accion");
        mujercitas.addPalabrasClaves("novela");
        mujercitas.addPalabrasClaves("hermanas");
        mujercitas.addPalabrasClaves("novela");
        laOdisea.addPalabrasClaves("accion");
        laOdisea.addPalabrasClaves("heroes");

        casaPapel.addAutores("Pete");
        casaPapel.addAutores("Jose");
        mujercitas.addAutores("Pablo");
        mujercitas.addAutores("Maria");
        laOdisea.addAutores("Pablo");
        laOdisea.addAutores("Ester");
        System.out.println(histo.toString());

        System.out.println("------tituloexacto--------");
        CondicionBusqueda titulo = new CondicionBusquedaExactaTitulo("Mujercitas");
        System.out.println(histo.buscarDocumentosPorCondicion(titulo));
        System.out.println("-------contenido-----------"   );
        CondicionBusqueda contenido = new CondicionBusquedaContenido("Tenerr");
        System.out.println(histo.buscarDocumentosPorCondicion(contenido));
        System.out.println("-------palabraclave----------");

        CondicionBusqueda palabraClave = new CondicionBusquedaPalabraClave("accion");
        System.out.println(histo.buscarDocumentosPorCondicion(palabraClave));
        System.out.println("--------autor---------");
        CondicionBusqueda autor = new CondicionBusquedaAutor("Jose");
        System.out.println(histo.buscarDocumentosPorCondicion(autor));
        System.out.println("-------AND--------------");
        CondicionBusqueda and = new CondicionBusquedaAND(palabraClave, autor);
        System.out.println(histo.buscarDocumentosPorCondicion(and));
        System.out.println("------OR---------");
        CondicionBusqueda or = new CondicionBusquedaOR(palabraClave , titulo);
        System.out.println(histo.buscarDocumentosPorCondicion(or));
        System.out.println("------Cantidad Palabras");
        CondicionBusqueda cant = new CondicionBusquedaCantidadPalabras(12);
        System.out.println(histo.buscarDocumentosPorCondicion(cant));

    }
}
