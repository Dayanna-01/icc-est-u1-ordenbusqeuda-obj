package views;

import models.Persona;

public class ViewConsole {
    public void printPersona(Persona[] personas) {
        for (Persona p : personas) {
            System.out.println(p); 
        }
    }
}
