/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cajero.models;
import java.time.LocalDate;

/**
 * Clase que indica los movimientos asociados a una cuenta
 * @author nellybett
 * @version 1.0.0
 */
public class Movement {
    private final int id;
    private String tipo;
    private int cuenta;
    private long valor;
    private final LocalDate fecha;

    public Movement(int id,String tipo, int cuenta, long valor) {
        this.tipo = tipo;
        this.id=id;
        this.cuenta = cuenta;
        this.valor = valor;
        this.fecha=LocalDate.now();
      
    }

    //Getters y Setters
    public long getValor() {
        return valor;
    }

    public void setValor(long valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }
    
    public int getId() {
        return id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    
    
    
}
