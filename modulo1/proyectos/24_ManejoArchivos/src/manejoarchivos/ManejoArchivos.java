package manejoarchivos;
import static manejoarchivos.Archivos.crear;
import static manejoarchivos.Archivos.escribir;
import static manejoarchivos.Archivos.anexar;
import static manejoarchivos.Archivos.leer;

/**
 * Clase principal
 * @author Anthony Hurtado
 * @version 1.0.0
 */
public class ManejoArchivos {
    public static void main(String[] args) {
        // Ruta del archivo
        String ruta = "./log.txt";
        
        // Operaciones con el archivo
        crear(ruta);
        System.out.println("");
        
        escribir(ruta, "Contenido a escribir en el archivo");
        System.out.println("");
        
        leer(ruta);
        System.out.println("");
        
        anexar(ruta, "Anexando información al archivo");
        System.out.println("");
        
        leer(ruta);
        System.out.println("");
    }
}
