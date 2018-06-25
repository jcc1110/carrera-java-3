/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cajero.models;

import java.util.ArrayList;

/**
 * Clase que representa las cuentas
 * @author nellybett
 * @version 1.0.0
 */
public class Account {
    private final int id;
    private long saldo;
    private int personId;
    private String tipo;
    private ArrayList<Movement> movimientos;

    public Account(long saldo, int persona, String tipo,int id) {
        this.id=id;
        this.saldo = saldo;
        this.tipo = tipo;
        this.personId=persona;
    }

    //Getters y Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        
        this.tipo = tipo;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo, int id, int pid) {
        AccountDAOMySql accountModel=new AccountDAOMySql();
        accountModel.updateAccount(saldo,id,pid);
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public ArrayList<Movement> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(ArrayList<Movement> movimientos) {
        this.movimientos = movimientos;
    }
    
    
}
