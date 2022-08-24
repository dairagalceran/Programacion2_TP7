package tp7_ej8_CompaniaEnvios;

public class MainEnvios {
    public static void main(String[] args) {


        Persona dest1 = new Persona("daira", "cachari", "SAn Martin 621");
        Persona dest2 = new Persona("mauri", "azul", "SAn Martin 21");
        Persona rem1 = new Persona("micaele", "Pilar", "España  1221");
        Persona rem2 = new Persona("chili", "las flores", "Hornos  1221");

        
        CartaPaquete envio1 = new CartaPaquete("CD3e4333arg",rem1, dest2, 623, true);
        CartaPaquete envio2 = new CartaPaquete("C9292arg",rem2, dest2, 623, true);
        System.out.println(envio1);

        Combos combo1 = new Combos("32de444");
        combo1.addEnvios(envio1);
        combo1.addEnvios(envio2);
        System.out.println("---------------");
        System.out.println(combo1);
        System.out.println("------------ agrego combo2-------");

        Combos combo2 = new Combos("3422RED");

        CartaPaquete envio3 = new CartaPaquete("Ar3e4333arg",rem1, dest2, 223, false);
        CartaPaquete envio4 = new CartaPaquete("C9292arg",rem2, dest2, 400.4, true);
        combo2.addEnvios(envio4);
        combo2.addEnvios(envio3);
        System.out.println(combo2);
        System.out.println("---------------");
        combo2.addEnvios(combo1);
        System.out.println(combo2);
    }
}
