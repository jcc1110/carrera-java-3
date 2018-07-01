/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cajero.models;

/**
 *
 * @author pc1
 */
public class Afiliaciones {
    private final int id;
    private int cuenta;
    private int destino;

    public Afiliaciones(int id,int cuenta,int destino) {
        this.id = id;
        this.cuenta=cuenta;
        this.destino=destino;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public int getDestino() {
        return destino;
    }

    public void setDestino(int destino) {
        this.destino = destino;
    }
    
    
}
