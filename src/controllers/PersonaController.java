package controllers;
import models.Persona;
public class PersonaController {

    //Metodo seleccion
    public void sortByDireccionCodigo(Persona[] personas) {
        for (int i = 0; i < personas.length; i++) {
            int index=i;
            for (int j =i+1; j<personas.length; j++){
                if (personas[j].getCodigoDireccion() > personas[index].getCodigoDireccion()) {
                    index=j;
                }
                if(index!=i){
                    Persona temp=personas[index];
                    personas[index]=personas[i];
                    personas[i]=temp;
                }
            }
        }
    }

    public Persona findPersonaByCodigoDireccion(Persona[] personas, int codigo) {
        int bajo = 0;
        int alto = personas.length - 1;
    
        while (bajo <= alto) {
            int center = (bajo + alto) / 2;
            int valorCentral = personas[center].getCodigoDireccion();
    
            if (valorCentral == codigo) {
                return personas[center];
            } else if (valorCentral > codigo) {
                // Ir hacia la derecha si está ordenado de mayor a menor
                bajo = center + 1;
            } else {
                // Ir hacia la izquierda
                alto = center - 1;
            }
        }
    
        return null; // No encontrado
    }
    

}
