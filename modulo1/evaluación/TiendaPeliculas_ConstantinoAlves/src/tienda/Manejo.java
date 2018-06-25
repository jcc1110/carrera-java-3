package tienda;


import java.util.List;
import java.util.Scanner;

 /**
 * En esta clase se guardan el conjunto de operaciones que manipulan la lista inicial
 * @author Constantino alves
 * @version 1.0.0
 */
public class Manejo {
    
    /**
     * Carga el listado inicial de peliculas
     * @param lista Contiene siempre la lista de peliculas
     */
    public static void precargar(List lista){
      
     int j=1; //Contador utilizado para contabiliar cada pelicul incluida en l lista
        
        
      lista.add("QUIERO MATAR A MI JEFE");
      lista.add("PULP FICTION");  
      lista.add("BSTARDOS SIN GLORIA");
      lista.add("KILL BILL VOL.1");  
      lista.add("KILL BILL VOL.2");
      lista.add("LOVE, SIMON");
      lista.add("CLOSER");
      lista.add("THE SHAPE OF WATER");
            } 
    
    /**
     * Muestra en pantalla la lista de peliculas inicial
     * @param lista Contiene siempre la lista de peliculas
     */
    public static void mostrar(List lista){
     int j=1;
     
        for(Object elemento : lista) {
         System.out.println(j + elemento.toString().toUpperCase());
         j++;
        }
     j=1; 
     lista= null;  
        
    }
    
    /**
     * Agrega nuevos titulo a la lista depliclas
     * @param lista Contiene siempre la lista de peliculas
     */
    public static void agregar(List lista){
      Scanner scanstring=new Scanner(System.in);  
        
        System.out.println("Cual pelicula desea añadir?");
       
        lista.add(scanstring.nextLine().toUpperCase());
    } 
    
    /**
     * Modifica el titulo de una pelicula
     * @param lista Contiene siempre la lista de peliculas 
     */
    public static void modificar(List lista){
        Scanner scan = new Scanner (System.in);
        System.out.println("");
        System.out.print("Inserte el numero de la pelicula que desea modificar: "); 
        int scanint = scan.nextInt();
        System.out.println("");
        System.out.println("Inserta el titulo modificado: ");
        String scanstring= scan.next();
        lista.set(scanint-1, scanstring);
    }
    
    /**}
     * Busca si la palabra indicada pertence al titulo de una de las peliculas listadas
     * @param lista Contiene siempre la lista de peliculas 
     */
    public static void buscar(List lista){
        int j=0;    
     Scanner sc=new Scanner (System.in);
        System.out.println("");
        System.out.println("Inserta la palabra por la cual iniciar la buqueda: ");
        String scanstring= sc.next();
        String  busqueda = scanstring.toUpperCase();
        System.out.println("");
        
        
        for (Object elemento : lista) {
            
            if (elemento.toString().contains(busqueda) == true) {
                System.out.println(elemento.toString());
             j++;
            } 
         
           
        }
         if(j==0){
              System.out.println("No se encontró el resulado.");
         }  
    }
    
    /**
     * Elimina una pelicula de listado 
     * @param lista Contiene siempre la lista de peliculas
     */
    public static void eliminar(List lista){
        Scanner scan = new Scanner (System.in);
        System.out.println("");
        System.out.println("");
        System.out.print("Inserte el numero de la pelicula que desea eliminar:"); 
        int scanint = scan.nextInt();
        lista.remove(scanint-1);
        
    
    
    }
}






        
 
