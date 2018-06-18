package principal;
import externo.Persona;
import static externo.Persona.despedir;

public class Paquetes {
    public static void main(String[] args) {
        // Instanciando la clase Paquetes
        Persona per = new Persona();
        
        // Uso del método normal
        per.saludar();
        System.out.println("");
        
        // Uso del método estático
        Persona.despedir();
        System.out.println("");
        
        // Uso del método estático importado
        despedir();
    }
}
