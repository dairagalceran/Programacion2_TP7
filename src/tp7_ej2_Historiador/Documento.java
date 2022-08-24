package tp7_ej2_Historiador;

import java.util.ArrayList;

public class Documento{

    private String titulo;
    private ArrayList<String> autores;
    private String contenido;
    private ArrayList<String> palabrasClaves;

    public Documento(String titulo,String contenido){
        this.titulo = titulo;
        this.autores = new ArrayList<>();
        this.contenido= contenido;
        this.palabrasClaves = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public ArrayList<String> getAutores() {
        return autores;
    }
    public ArrayList<String> getPalabrasClaves(){
        return palabrasClaves;
    }

    public void addAutores(String autorNuevo){
        if(!autores.contains(autorNuevo)){
            autores.add(autorNuevo);
        }
    }

    public void addPalabrasClaves(String palabraClave){
        if(!palabrasClaves.contains(palabraClave)){
            palabrasClaves.add(palabraClave);
        }
    }
    
    public int  contarPalabras(){
        int palabrasTitulo = titulo.split(" ").length;
        int palabrasContenido = contenido.split(" ").length;
        return palabrasTitulo + palabrasContenido;
    }

    @Override
    public boolean equals(Object obj){
        try{
            Documento doc = (Documento)obj;
            return this.titulo.equals(doc.getTitulo());
        }
        catch(Exception e){
                return false;
        }
    }
    
    @Override
    public String toString(){

        return "Documento: \n[ titulo: "+getTitulo()+
                "\t\nAutores: " + getAutores()+
                "\t\ncontenido: "+ getContenido()+
                "\t\npalabras claves " + getPalabrasClaves()+
                "t\nAuteores: "+ getAutores()+
                " ]; ";
    }

}