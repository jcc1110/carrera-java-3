package tienda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static tienda.Manejo.*;
/**
 * El proyecto lista las peliculas y las manipula segun la convenincia de usuario
 * @author Constantino alves
 * @version 1.0.0
 */
public class Tienda {
    /**
     * Metodo de arranque del programa 
     * @param args  
     */
    public static void main(String[] args) {
         List<String> lista = new ArrayList();
        int i; //Este contador es utilizado para seleccionar la opcion del menu
     Scanner scanint=new Scanner(System.in);
     precargar(lista);
     System.out.println("Bienvenido a nuestra tienda!");
        System.out.println("");
        System.out.println("");
        do {
        System.out.println("");
        System.out.println("");
        System.out.println("Que desea hacer?");
        System.out.println("");
        System.out.println("");
        System.out.println("1.Ver peliculas disponibles");
        System.out.println("2.Buscar pelicula");
        System.out.println("3.Agregar peliculas");
        System.out.println("4.Modificarlas");
        System.out.println("5.Eliminarlas");
        System.out.println("0.Salir del sistema");
        i=scanint.nextInt();
        System.out.println("");
        System.out.println("");
            switch(i){
                case 1:mostrar(lista);
               break;
            
                case 2:buscar(lista); 
                break;
        
            
                case 3: agregar(lista);
                break;
                case 4:System.out.println("");
                   mostrar(lista);
                   modificar(lista);
                break;
            
               case 5:eliminar(lista);
                break;
            }
        
        
        } while (i!=0);
        
    }
    
}