/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectoimc.operations;

/**
 *
 * @author pc1
 */
public class Persona {
    private double peso;
    private double altura;
    private double imc;
    private String nombre;
    private String apellido;
    private int id;
    private String clasificacion;
    
    
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(double imc) {
        if(imc < 18.5){
            this.clasificacion = "Bajo peso";
        } else if(imc>=18.5 && imc<=24.9){
            this.clasificacion = "Normal";
        } else if(imc>=25 && imc<=29.9){
            this.clasificacion = "Sobrepeso";
        } else if(imc>=30 && imc<=34.9){
            this.clasificacion = "Obesidad 1";
        } else if(imc>=35 && imc<=39.9){
            this.clasificacion = "Obesidad II";
        } else if(imc>=40 && imc<=49.9){
            this.clasificacion = "Obesidad III";
        } else if(imc>=50){
            this.clasificacion = "Obesidad IV";
        }
            
    }
    
    
}
