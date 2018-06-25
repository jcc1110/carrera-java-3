package com.principal;
    import java.util.Scanner;
    import java.util.ArrayList;
    import java.util.List;
    import static com.controlador.Controles.Cargar;
    import static com.controlador.Clear.ClearScreen;
    import static com.controlador.Controles.Editorlista;
    import static com.controlador.Controles.Mostrar;
    import static com.controlador.Controles.Remover;
    import static com.controlador.Controles.Añadir;
    import static com.controlador.Controles.Buscar;
/**
 * Clase principal
 * @author Gabriel Costanza.
 * @version 1.0.0
 */
public class Principal {
    /**
     * Método de arranque principal del programa.
     * @param args 
     */
    public static void main(String[] args) {
        List<String> lista=new ArrayList<>();
        ClearScreen(); //Metodo para limpiar pantalla.
        Cargar(lista);
        Scanner scan=new Scanner(System.in);//Instancia del scanner para nextLine
        Scanner scan2=new Scanner(System.in);//Instancia 2 del scanner para nextLine
        Integer i; // While del menu principal
        Integer j; // While del menu editor       
        Integer contador = 1; //Contador para mostrar la lista
        System.out.println("Bienvenido al catalogo de peliculas.");
        do{
        System.out.println("¿Que desea hacer?");
        System.out.println("");
        System.out.println("1.Ver catalogo.");
        System.out.println("2.Editar.");
        System.out.println("3.salir");
        System.out.println("Indique la opcion deseada con el numero correspondiente.");
        i=scan.nextInt();
        System.out.println("");
        switch(i){
            case 1: 
                    do{
                    Mostrar(lista);                    
                    System.out.println("1.Buscar.");
                    System.out.println("2.Volver al menú.");
                    System.out.println("3.Salir.");
                    j=scan.nextInt();
                    System.out.println("");
                    switch(j){
                        case 1: 
                            Buscar(lista);
                    }}while(j>1);break;
            case 2:  
         
                     do{
                         System.out.println("1.Ver");
                         System.out.println("2.Añadir");
                         System.out.println("3.Remover");
                         System.out.println("4.Editar");
                         System.out.println("5.Volver");
                         j=scan.nextInt();
                         System.out.println("");
                         switch(j){
                             case 1:
                                 Mostrar(lista);break;
                             case 2:
                                 Añadir(lista);break;
                             case 3: 
                                 Remover(lista);break;
                             case 4:
                                 Editorlista(lista);break;
                         }
                            
                     
                         }while (j!= 5);
                     }
        
          
        }while(i != 3);
     }
}