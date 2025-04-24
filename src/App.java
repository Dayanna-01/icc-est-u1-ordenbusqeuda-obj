import controllers.PersonaController;
import models.Direccion;
import models.Persona;
import views.ViewConsole;

public class App {
    public static void main(String[] args) {
        Persona[] personas = new Persona[5];

        // Crear direcciones y personas
        personas[0] = new Persona("Maria", 30, new Direccion("Calle 2", 23, 56));
        personas[1] = new Persona("Pedro", 35, new Direccion("Calle 3", 34, 67));
        personas[2] = new Persona("Ana", 28, new Direccion("Calle 4", 45, 78));
        personas[3] = new Persona("Juan", 25, new Direccion("Calle 1", 12, 45));
        personas[4] = new Persona("Luis", 40, new Direccion("Calle 5", 56, 89));

        // Crear controlador y vista
        ViewConsole vC = new ViewConsole();
        PersonaController pC = new PersonaController();

        // Mostrar personas antes de ordenar
        System.out.println("======Antes de ordenar:");
        vC.printPersona(personas);
 
        // Ordenar por código de dirección
        pC.sortByDireccionCodigo(personas);
 
        // Mostrar personas después de ordenar
        System.out.println("\n======Después de ordenar por código de dirección:");
        vC.printPersona(personas);

        System.out.println();
        System.out.println("Personas con el codigo 89: ");
        Persona personaB = pC.findPersonaByCodigoDireccion(personas, 89);
        if(personaB == null){
            System.out.println("No existe la persona");
            System.out.println();
        } else {
            System.out.println("Se encontro la persona");
            System.out.println(personaB);
        }
    }
}
