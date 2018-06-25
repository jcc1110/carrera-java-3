/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiendapeliculas.implement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Clase para manejar el archivo de datos
 * @author Nelly
 * @version 1.0.0
 */
public class FileManage {
    /**
     * Funcion utilizada para rearmar la lista de peliculas a partir de un archivo
     * @param ruta
     * @return 
     */
    public static ArrayList<String> leerLista(String ruta){
        ArrayList<String> lista=new ArrayList<>();
        try{
            String linea;
            File archivo=new File(ruta);
            BufferedReader lector=new BufferedReader(new FileReader(archivo));
            linea=lector.readLine();
            
            while(linea!=null){
                lista.add(linea);
                linea=lector.readLine();
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return lista;
    }
    
    /**
     * Funcion utilizada para modificar,eliminar, agregar elementos del archivo
     * @param nuevaLinea
     * @param posicion
     * @param ruta 
     */
    public static void ingresar(String nuevaLinea, int posicion, String ruta){
    FileWriter fichero = null;
    PrintWriter escritor = null;
    int aux=0;
    try {
        ArrayList lista = leerLista(ruta);
        fichero = new FileWriter(ruta);
        escritor = new PrintWriter(fichero);
        escritor.flush();
        
        
        for(int x = 0; x < lista.size(); x++){
            
            
            //Valor para Agregar
            if(posicion==-1 && aux==0){
                escritor.write(nuevaLinea);
                escritor.println();
                aux=2;
            }
            
            //Valor para eliminar
            if(nuevaLinea.equals("xx")){
                aux=2;
            }
            
            
            //Funcionamiento de modificar
            if(posicion==x){
               if(aux==0){
                escritor.write(nuevaLinea);
                escritor.println();
           
               }       
            }else{
                escritor.write((String) lista.get(x));
                escritor.println();
                
                 
            }
             
            
         }
        escritor.close();
    } catch (Exception e) {
        System.out.println(e.getMessage());
    } finally {
        if(fichero != null){
            try {
                fichero.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    }
}
    
    

