/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectoimc.main;

import com.proyectoimc.operations.CalculoIMC;
import com.proyectoimc.operations.Persona;
import com.proyectoimc.structures.DivisionCero;
import java.util.Scanner;

/**
 *
 * @author pc1
 * @version 1.0.0
 */
public class ProyectoIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean auxiliar=true;
        String aux;
        Persona persona=new Persona();
        Scanner scanner= new Scanner(System.in);
        CalculoIMC cimc=new CalculoIMC();
        cimc.setPersona(persona);
        
        while(auxiliar){
            
            System.out.println("Introduzca su nombre: ");
            persona.setNombre(scanner.next());
            System.out.println("Introduzca su apellido: ");
            persona.setApellido(scanner.next());
            System.out.println("Introduzca su cedula: ");
            persona.setId(scanner.nextInt());
            System.out.println("Introduzca su peso: ");
            persona.setPeso(scanner.nextDouble());
            System.out.println("Introduzca su altura: ");
            persona.setAltura(scanner.nextDouble());
        
            try{
                cimc.calcularIMC();
                System.out.println("Su Indice de Masa Corporal es: "+persona.getImc()+"\nEsta clasificado como: "+persona.getClasificacion());
                auxiliar=false;
            }catch(DivisionCero e){
                System.out.println("Altura 0, valor no valido");
            }catch(Exception e){
                System.out.println("Error");
            }
        
        }
        
    }
    
}
