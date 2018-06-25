/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cajero.models;


/**
 * Clase para crear los clientes a los que se asociaran cuentas
 * @author nellybett
 * @version 1.0.0
 */
public class Person {
    private String nombre;
    private final int id;
    private String password;
    private int cedula;
    private Account[] cuentas;

    public Person(int id) {
        this.id = id;
        
    }

    //Getters y setters
    public boolean getPerson(int id) {
        PersonDAOMySQL personModel=new PersonDAOMySQL();
        AccountDAOMySql accountModel=new AccountDAOMySql();
        String[] persona=new String[3];
        
        persona = personModel.getPerson(id);
        if(persona!=null){
            this.nombre=persona[0];
            this.cedula=Integer.parseInt(persona[1]);
            this.password=persona[2];
            this.cuentas=accountModel.getAccounts(id);
            return true;
            
        }else{
             this.password="";
            return false;
        }
        
        
    }

    public Account[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(Account[] cuentas) {
        this.cuentas = cuentas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getId() {
        return id;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        PersonDAOMySQL personModel=new PersonDAOMySQL();
        personModel.updatePassword(password, this.id);
        this.password = password;
    }
    
    
}
