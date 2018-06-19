/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectoimc.structures;

import com.proyectoimc.operations.Persona;

/**
 * Interfaz para mis metodos de calculo IMC
 * @author pc1
 * @version 1.0.0
 */
public interface I_Operations {
    
   /**
    * Calcula el IMC 
     * @throws com.proyectoimc.structures.DivisionCero 
    */
    public abstract void calcularIMC() throws DivisionCero;
  
    
}
