package manejoarchivos;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Clase para manejo de archivos
 * @author Anthony Hurtado
 * @version 1.0.0
 */
public class Archivos {
    // Crear un arhivo
    public static void crear(String ruta) {
        try {
            // Instancio mi clase
            File archivo = new File(ruta);
            
            // Utilizo el objeto PrintWriter y FileWriter
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            
            // Cierro la conexión
            salida.close();
            
            // Imprimo un mensaje
            System.out.println("El archivo se ha creado correctamente.");
        } catch (IOException ex) {
            // Capturando la excepción
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    // Escribir dentro de un archivo
    public static void escribir(String ruta, String texto) {
        try {
            // Instancio mi clase
            File archivo = new File(ruta);
            
            // Se utiliza el objeto PrintWriter y FileWriter
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            
            // Escribo por primera vez en el archivo
            salida.println(texto);
            salida.println("Fin de escritura");
            
            // Cierro la conexión
            salida.close();
            
            // Imprimo un mensaje
            System.out.println("Se ha escrito correctamente al archivo.");
        } catch (IOException ex) {
            // Capturando la excepción
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    // Leer la información de un archivo
    public static void leer(String ruta) {
        try {
            // Instancio mi clase
            File archivo = new File(ruta);
            
            // Se utiliza el objeto BufferedRead y FileReader
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            
            // Leo la información del archivo
            String lectura;
            lectura = entrada.readLine();
            while (lectura != null) {
                System.out.println("Lectura: " + lectura);
                lectura = entrada.readLine();
            }
            
            // Cierro la conexión
            entrada.close();
            
            // Imprimo un mensaje
            System.out.println("Se ha leido el archivo correctamente.");
        } catch (IOException ex) {
            // Capturando la excepción
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    // Agregar información al archivo
    public static void anexar(String ruta, String texto) {
        try {
            // Instancio mi clase
            File archivo = new File(ruta);
            
            // Se utiliza el objeto PrintWriter y FileWriter
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            
            // Añado la información necesaria
            salida.println(texto);
            salida.println("Fin de anexar");
            
            // Cierro la conexión
            salida.close();
            
            // Imprimo un mensaje
            System.out.println("Se ha anexado información correctamente");
        } catch (IOException ex) {
            // Capturando la excepción
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
