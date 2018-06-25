/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendapelicula;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pc11
 */
public class TiendaPelicula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);  
           String nombre;
           System.out.print("Introduzca su nombre: ");       
           nombre = sc.nextLine();  //leer un String
           System.out.println("Hola " + nombre + "!!!");
           System.out.print("desea ver la lista de peliculas disponibles? ");
           
   InputStreamReader isr;
isr = new InputStreamReader(System.in);
BufferedReader br;
br = new BufferedReader(isr);
int iOpcn= -1;

do{
try{

System.out.println ("Intoduzca una opción:");
System.out.println ("---------------------");
System.out.println ("1. listar pelicular 1");
System.out.println ("2. ingresar 2");
System.out.println ("3. actualizar 3");
System.out.println ("4. borrar 4");
System.out.println ("5. prueba salir");
iOpcn = Integer.parseInt( br.readLine());

switch (iOpcn)
{
case 1:
    List<String> arreglo = new ArrayList<>();
        
        // Agrego un elemento al arreglo
        arreglo.add("Vengadores: Infinity War");
        arreglo.add("The Florida Project");
        arreglo.add("Noche de juegos");
        arreglo.add("El taller de escritura");
        arreglo.add("Un lugar tranquilo");
        arreglo.add("La forma del agua");
        arreglo.add("Black Panther  ");
        arreglo.add("Deadpool 2 ");
        arreglo.add("Han Solo: Una historia ");
        arreglo.add("Jurassic World: El reino caído");
System.out.println ("prueba si pulsas 1");
break;
case 2:
System.out.println ("prueba si pulsas 2");

break;
case 3:
System.out.println ("prueba si pulsas 3");
break;
case 4:
System.out.println ("prueba si pulsas 4");
break;
case 5:
System.out.println ("prueba si pulsas 5");
break;

case 6:
System.out.println ("Adios");
break;
default:
System.out.println ("error");

}


} // fin del try
catch( Exception ex ){

System.out.println( "- Error! Numero incorrecto -");


} // fin del catch

}while (iOpcn!= 1);

  
     
       
        List<String> arreglo = new ArrayList<>();
        
        // Agrego un elemento al arreglo
        arreglo.add("Vengadores: Infinity War");
        arreglo.add("The Florida Project");
        arreglo.add("Noche de juegos");
        arreglo.add("El taller de escritura");
        arreglo.add("Un lugar tranquilo");
        arreglo.add("La forma del agua");
        arreglo.add("Black Panther  ");
        arreglo.add("Deadpool 2 ");
        arreglo.add("Han Solo: Una historia ");
        arreglo.add("Jurassic World: El reino caído");
         
        
        
        
        // Ordeno la nombres
        System.out.println("Las peliculas disponibles son:");
        arreglo.stream().sorted().forEach(System.out::println);
        System.out.println(""); 
       // Recorro y manipulo la nombres
        System.out.println("Manipula cada elemento");
        arreglo.stream().map(String::toUpperCase).forEach(System.out::println);
        System.out.println("");         
        
}
public static void Araylist(Collection coleccion) {
               
        // Programación funcional
        coleccion.forEach(elemento -> System.out.println(elemento.toString().toUpperCase()));
        coleccion.forEach(System.out::println);
        
       
      
  }
   
             
                   
}
