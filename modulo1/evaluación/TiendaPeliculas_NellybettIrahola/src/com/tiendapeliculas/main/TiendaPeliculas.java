/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiendapeliculas.main;
import com.tiendapeliculas.implement.Pelicula;
import com.tiendapeliculas.implement.TiendaDVD;
import java.util.Scanner;
/**
 * Clase principal, contiene el main
 * @author Nelly
 * @version 1.0.0
 */
public class TiendaPeliculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaracion de variables
        TiendaDVD tiendaP=new TiendaDVD("Chacao","MiTiendita");
        tiendaP.setPeliculas();
        Scanner scanner=new Scanner(System.in);
        Scanner scanner1=new Scanner(System.in);
        int operation;
        String name;
        String auxiliarS;
        int operacion;
        boolean auxiliarB=true;
        
        //Menu inicial para el usuario
        while(auxiliarB){
            System.out.println("Bienvenido a MiTiendita. Introduzca el numero de operacion que desea realizar: \n1.Listar peliculas disponibles\n2.Buscar peliculas\n3.Agregar peliculas\n4.Modificar peliculas\n5.Eliminar peliculas\n6.Salir\n");
            operation=scanner.nextInt();
        
            switch(operation){
            case 1:
                tiendaP.listarPeliculas();
                break;
            case 2:
                System.out.println("Introduzca el nombre de la pelicula que desea buscar: ");
                name=scanner1.nextLine();
                tiendaP.buscarPelicula(name);
                break;
            case 3:
                System.out.println("Introduzca los datos de la pelicula usando / ej:Pelicula/Autor/Tema/Resumen");
                name=scanner1.nextLine();
                String[]auxiliar=name.split("/");
                Pelicula pAuxiliar=new Pelicula(auxiliar[0],auxiliar[1],auxiliar[2],auxiliar[3]);
                tiendaP.anadirPelicula(pAuxiliar);
                break;
            case 4:
                System.out.println("Introduzca el nombre de la pelicula que desea modificar:");
                name=scanner1.nextLine();
                System.out.println("Introduzca el numero del dato de la pelicula que desea modificar \n1.Nombre\n2.Autor\n3.Tema\n4.Resumen ");
                operacion=scanner.nextInt();
                System.out.println("Introduzca el nuevo valor:");
                String valor=scanner1.nextLine();
                tiendaP.modificarPelicula(name, operacion, valor);
                break;
            case 5:
                System.out.println("Introduzca el nombre de la pelicula que desea eliminar:");
                name=scanner1.nextLine();
                tiendaP.eliminarPelicula(name);
                break;
            case 6:
                auxiliarB=false;
                break;
            default:
                break;
               
                
            }
        }
        
    }
    
}
