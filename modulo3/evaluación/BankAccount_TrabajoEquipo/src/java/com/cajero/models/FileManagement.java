/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cajero.models;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * Clase para la escritura en archivo de un log de operaciones
 * @author nellybett
 * @version 1.0.0
 */
public class FileManagement {
    
    
    /**
     * Metodo que agrega una operacion al archivo
     * @param nuevaLinea 
     */
    public static void ingresar(String nuevaLinea){
    FileWriter fichero = null;
    String ruta="./log";
    PrintWriter escritor = null;
    int aux=0;
        try {
       
            fichero = new FileWriter(ruta,true);
            escritor = new PrintWriter(fichero);
        
            escritor.write(nuevaLinea);
            escritor.println();
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
