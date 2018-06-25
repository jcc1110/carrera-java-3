package com.controlador;
   import java.util.List;
   import java.util.Scanner;
   import static com.controlador.Clear.ClearScreen;
/**
 * Metodos para operar la lista de peliculas.
 * @author Gabriel Costanza
 * @version 1.0.0
 */    
public class Controles {
    /**
     * Carga en memoria la lista incial.
     * @param lista se usa para cargar la lista principal.
     */   
    public static void Cargar(List lista) {
        
        lista.add("DEADPOOL 2");
        lista.add("INFINITY WAR");
        lista.add("BATMAN V SUPERMAN");
        lista.add("CAPITAN AMERICA");
        lista.add("CIVIL WAR");
        lista.add("SPIDERMAN HOMECOMING");
        lista.add("VENOM");
        lista.add("JUSTICE LEAGUE");
        lista.add("IRON MAN");
        lista.add("ANT-MAN");
        
    }
    /**
     * Se usa para mostrar en pantalla la lista enumerada.
     * @param lista Es la lista principal.
     */
    public static void Mostrar(List lista) {
        Integer contador = 1;//Contador para mostrar la lista
        ClearScreen();
        for(Object elemento : lista){
            System.out.println(contador+". "+elemento.toString());
            contador++;
            }
        contador = 1;
        System.out.println("");
        }
    /**
     * Método que te permite modificar los datos de la lista.
     * @param lista Es la lista principal.
     */
    public static void Editorlista(List lista) {
        Integer editor;//Variable numerica para ayudar al usuario a escoger de la lista
        String editado;//Nuevo dato string introducido por el usuario
        Scanner scan1=new Scanner(System.in);
        Scanner scan2=new Scanner(System.in);
        System.out.println("Ingrese el numero que desea editar:");
        editor=scan1.nextInt();
        System.out.println("Editando: ");
        editado=scan2.nextLine();
        lista.set(editor-1, editado.toUpperCase());
        ClearScreen();
        System.out.println("Editado con éxito.");
        
    }
    /**
    * Remueve de la lista principal.
    * @param lista Es la lista principal.
    */
    public static void Remover(List lista){
        Integer numeroR; // Variable numerica para remover un string de la lista
        Scanner scan=new Scanner(System.in);
        System.out.println("Remover: ");
        numeroR=scan.nextInt();
        lista.remove(numeroR-1);
        ClearScreen();
        System.out.println("Se removio exitosamente");
    }
    /**
    * Añade nuevos strings a la lista.
    * @param lista Es la lista principal.
    */
    public static void Añadir(List lista){
        Scanner scan=new Scanner(System.in);
        System.out.print("Añadir: ");
        lista.add(scan.nextLine().toUpperCase());
        ClearScreen();
        System.out.println("Se añadido con éxito.");
    }
    /**
     * Busca en la lista e imprime la verificacion.
     * @param lista Es la lista principal.
     */
    public static void Buscar(List lista){
        Scanner scan=new Scanner(System.in);
        String buscador; //Dato a buscar por el usuario.
        System.out.print("Buscar: ");
        buscador= scan.nextLine();
            if(lista.contains(buscador.toUpperCase())==true){ClearScreen();
               System.out.println(buscador+". Se encontró.");
            }else{ClearScreen(); 
                System.out.println("No se ha encontrado.");}
    
        
    }
}
