package tp7_ej5_Futbol5;
import java.time.LocalDate;

public class MainClubFutbol5 {
    
    public static void main(String[] args) {
        
        Club club = new Club("club");

        Socio s1 = new Socio("Pablo", "Del Potro", LocalDate.of(1990,04,30));
        Socio s2 = new Socio("esteban", "esteberena", LocalDate.of(1966,03,29));
        Socio s3 = new Socio("sara", "descarte", LocalDate.of(2009,03,29));
        Socio s4 = new Socio("Jose", "Carta", LocalDate.of(1995,04,18));
        Socio s5 = new Socio("Mariana", "Ampera", LocalDate.of(1999,11,7));
        Socio s6 = new Socio("Vanesa", "Pertry", LocalDate.of(2004,02,2));


        club.addSocio(s1);
        club.addSocio(s2);
        club.addSocio(s3);
        club.addSocio(s5);
        club.addSocio(s5);
        club.addSocio(s6);

        System.out.println("Edad socio2: "+s2.calcularEdad());
        System.out.println("___-- edad s2_________");
        System.out.println("edad socio 1 "+s1.getEdad());
        System.out.println("Socio 3: " + s3);
        System.out.println("------------Alquileres-----------");
        System.out.println();
        Alquiler alq1 = new Alquiler( 12, LocalDate.of(2022,06,03), 300.0);
        Alquiler alq2 = new Alquiler( 4, LocalDate.of(2022,05,03), 550.0);
        Alquiler alq3 = new Alquiler(4, LocalDate.of(2022,03,11), 1300.0);
        Alquiler alq5 = new Alquiler( 3, LocalDate.of(2022,06,23), 400.0);
        Alquiler alq4 = new Alquiler(5, LocalDate.of(2022,06,19), 520.0);

        s1.addAlquiler(alq1);
        s3.addAlquiler(alq2);
        s2.addAlquiler(alq3);
        s4.addAlquiler(alq3);
        s5.addAlquiler(alq4);
        s6.addAlquiler(alq1);
        s5.addAlquiler(alq5);
        s4.addAlquiler(alq1);
        s4.addAlquiler(alq5);
        
        System.out.println("alquiler 2: "+alq2.getIdCancha());
        
        System.out.println();
        System.out.println("------ todos los socios");
        System.out.println(club.getSocio());

        System.out.println("------------buscar mayor edad------");
        CondicionBusqueda porEdad = new CondicionBusquedaEdadMayorA(12);
        System.out.println(club.buscarSociosQueCumplan(porEdad));
        
        System.out.println();
        s1.setUltimaCuotaPaga(true);
        s2.setUltimaCuotaPaga(false);

        CondicionBusqueda cuotaPaga = new CondicionBusquedaCuotaPaga(false);
        System.out.println(" Socio que no esta al dia "+ club.buscarSociosQueCumplan(cuotaPaga));
        System.out.println();

        System.out.println("-----alquiler cancha Nº -----");
        CondicionBusqueda numCancha = new CondicionBusquedaCancha(4);
        System.out.println(club.buscarSociosQueCumplan(numCancha));
        System.out.println();

        System.out.println("--------------AND----");

        CondicionBusqueda and = new CondicionBusquedaAND( cuotaPaga , porEdad );
        System.out.println(club.buscarSociosQueCumplan(and));
        System.out.println();

        System.out.println("--------- pago mayor a $ ______");
        CondicionBusqueda pagoMayor = new CondicionBusquedaPagoMayorA(500);
        System.out.println(club.buscarSociosQueCumplan(pagoMayor));
    }
}