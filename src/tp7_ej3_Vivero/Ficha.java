package tp7_ej3_Vivero;

import java.util.ArrayList;

public class Ficha {
    private String nombre;
    private ArrayList<String> nombresVulgares;
    private String clasificacionSuperior;
    private String clase;
    private String familia;
    private String ubicacion;
    private int riego;
    private int sol;
    public static final int MAX_VALOR =10;
    public static final int MIN_VALOR = 1;
    private static final int VALOR_ERROR = -1;

    public Ficha (String nombre,String clasificacionSuperior,String clase , String familia , String ubicacion){
        this.nombre = nombre;
        this.clasificacionSuperior = clasificacionSuperior;
        this.clase = clase;
        this.familia = familia;
        this.ubicacion = ubicacion;        
        this.nombresVulgares = new ArrayList<>();
    }

    public void addPalabrasVulgares(String vulgar){
        if(!nombresVulgares.contains(vulgar))
            nombresVulgares.add(vulgar);
    }
    
    public int getRiego() {
        return riego;
    }

    public void setRiego(int riego) {
        if((riego >= MIN_VALOR) && (riego <= MAX_VALOR)){
            this.riego = riego;
        }else{
            this.riego = VALOR_ERROR;
        }
    }
    public int getSol() {
        return sol;
    }
    public void setSol(int sol) {
        if((sol >= MIN_VALOR) && (sol <= MAX_VALOR)){
            this.sol = sol;
        }else{
            this.sol = VALOR_ERROR;
        }
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getClasificacionSuperior() {
        return clasificacionSuperior;
    }
    public void setClasificacionSuperior(String clasificacionSuperior) {
        this.clasificacionSuperior = clasificacionSuperior;
    }
    public String getClase() {
        return clase;
    }
    public void setClase(String clase) {
        this.clase = clase;
    }
    public String getFamilia() {
        return familia;
    }
    public void setFamilia(String familia) {
        this.familia = familia;
    }
public String getUbicacion() {
    return ubicacion;
}
public void setUbicacion(String ubicacion) {
    this.ubicacion = ubicacion;
}

    public ArrayList<String> getNombresVulgares() {
        return new ArrayList<>(nombresVulgares);
    }
    @Override
    public  String toString(){
        return  "\nNombre cientifico: " + this.getNombre()+ "\tClase: " +this.getClase()+
                "\nNombres vulgares: "+this.getNombresVulgares()+"\tClasificacion superior: "+this.getClasificacionSuperior()+
                "\nFamilia: "+this.getFamilia()+ "\t Planta de "+ this.getUbicacion()+
                "\nSol: "+this.getSol()+"\tRiego: "+this.getRiego()+"; \n";
    }
}
