package paquetesimports;
import com.oracle.externo.Persona;
import static com.oracle.externo.Persona.despedir;

public class PaquetesImports {
    public static void main(String[] args) {
        // Instanciando la clase Paquetes
        Persona per = new Persona();
        
        // Uso del método normal
        per.saludar();
        
        // Uso del método estático
        Persona.despedir();
        
        // Uso del método estático importado
        despedir();
    }
}
