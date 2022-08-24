package tp7_ej2_Historiador;
import java.util.ArrayList;

public class Historiador {
    
    private ArrayList<Documento> documentos;

    public Historiador(){
        this.documentos = new ArrayList<>();
    }

    public void addDocumento(Documento doc){
        if(!documentos.contains(doc)){
            documentos.add(doc);
        }
    }

    public ArrayList<Documento>  buscarDocumentosPorCondicion(CondicionBusqueda condicion){
        ArrayList<Documento> documentosAux = new ArrayList<>();
        for(int i =0; i< this.documentos.size(); i ++){
            if(condicion.esCumplidaPor(documentos.get(i))){
                documentosAux.add(documentos.get(i));
            }
        }
        return documentosAux;
    }

}
