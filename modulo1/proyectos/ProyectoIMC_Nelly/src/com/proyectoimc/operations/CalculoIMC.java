/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectoimc.operations;

import com.proyectoimc.structures.DivisionCero;
import com.proyectoimc.structures.I_Operations;

/**
 * Clase para los cálculos necesarios
 * @author pc1
 * @version 1.0.0
 */
public class CalculoIMC implements I_Operations {
    private Persona persona;

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public void calcularIMC() throws DivisionCero {
        
        double imc;
        if(this.persona.getAltura()==0)
            throw new DivisionCero("La division no se puede realizar. Altura = 0");
        
        imc=this.persona.getPeso()/Math.pow(this.persona.getAltura(), 2);
        persona.setImc(imc);
        persona.setClasificacion(imc);
       
    }

 
    
}
