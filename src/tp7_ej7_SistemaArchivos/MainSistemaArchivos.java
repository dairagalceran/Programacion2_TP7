package tp7_ej7_SistemaArchivos;

public class MainSistemaArchivos {
    public static void main(String[] args) {

        Carpeta raiz = new Carpeta("/");

        Carpeta sistemas = new Carpeta("Sistemas");
        Carpeta anio1 = new Carpeta("1er anio");
        Carpeta anio2 = new Carpeta("2do anio");
        Carpeta anio3 = new Carpeta("3er anio");
        Carpeta poo = new Carpeta("POO");
        Carpeta fotos = new Carpeta("Fotos");
        Carpeta mascotas = new Carpeta("Mascotas");
        Carpeta paisajes = new Carpeta("Paisajes");


        raiz.addElemento(sistemas);
        raiz.addElemento(fotos);

        sistemas.addElemento(anio1);
        sistemas.addElemento(anio2);
        sistemas.addElemento(anio3);
        
        anio3.addElemento(poo);

        fotos.addElemento(mascotas);
        fotos.addElemento(paisajes);

        System.out.println("La cantidad total de archivos es "+raiz.cantidadArchivos());

        


        Archivo parcialPOO = new Archivo("parcial", "doc", 50.5);
        Archivo recuPOO = new Archivo("recuperatorio", "pdf", 150.5);
        Archivo prefiPOO = new Archivo("prefinal", "doc", 20.0);
        poo.addElemento(parcialPOO);
        poo.addElemento(recuPOO);
        poo.addElemento(prefiPOO);
        Archivo correlativas = new Archivo("correlativas", "xls", 120.0);
        sistemas.addElemento(correlativas);

        System.out.println("-----Cantidad archivos--------");
        System.out.println("La cantidad total de archivos es "+raiz.cantidadArchivos());
        System.out.println("--------------");
        System.out.println(poo.getFechaCreacion());
        System.out.println(poo.getTamanio());
        System.out.println(poo.getFechaModicacion());
        System.out.println("-----tamanio--------");
        System.out.println("Tamanio de raiz  es "+raiz.getTamanio());
        System.out.println("--------------");
        System.out.println("------------");
        System.out.println("Tamanio de poo  es "+poo.getTamanio());
        System.out.println("--------------");
        System.out.println(parcialPOO.getNombre());
        System.out.println("-------compresion archivo o carpeta");
        Comprimido zip = new Comprimido("zip", 0.3);
        System.out.println("Archivo  prefiPOO tamanio  "+ prefiPOO.getTamanio());
        System.out.println("Archivo comprimido prefiPOO "+ zip.getTamanio(prefiPOO));
        System.out.println("-----Acceso directo---------");
        Link acceso = new Link(sistemas);
        raiz.addElemento(acceso);
        System.out.println("Acceso directo a "+ raiz);

    }
}
