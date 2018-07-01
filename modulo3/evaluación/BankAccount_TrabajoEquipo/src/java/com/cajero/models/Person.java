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
    private int id;
    private String password;
    private int cedula;
    private int cuenta;
    private long saldo;
    private Afiliaciones[] afiliaciones;
    private String correo;
    private String apellido;

    public Person(int id) {
        this.id = id;
        
    }
    
    public Person(int cuenta,String id_cuenta){
        this.cuenta=cuenta;
    }

    //Getters y setters
    public boolean getPerson(int id, String id_cuenta) {
        PersonDAOMySQL personModel=new PersonDAOMySQL();
        AfiliacionesDAOMySQL afiliacionesModel=new AfiliacionesDAOMySQL();
        String[] persona=null;
        
        persona = personModel.getPerson(id, id_cuenta);
        if(persona!=null){
            
            this.nombre=persona[0];
            this.cedula=Integer.parseInt(persona[1]);
            this.password=persona[2];
            this.cuenta=Integer.parseInt(persona[5]);
            this.afiliaciones=afiliacionesModel.getAfiliations(id);
            this.apellido=persona[3];
            this.correo=persona[4];
            this.saldo=Long.parseLong(persona[6]);
            return true;
            
        }else{
             this.password="";
            return false;
        }
        
        
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setPassword(String password) {
        PersonDAOMySQL personModel=new PersonDAOMySQL();
        personModel.updatePassword(password, this.id);
        this.password = password;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Afiliaciones[] getAfiliaciones() {
        return afiliaciones;
    }

    public void setAfiliaciones(Afiliaciones[] afiliaciones) {
        this.afiliaciones = afiliaciones;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo, int id, String origen) {
        PersonDAOMySQL aux=new PersonDAOMySQL();
        aux.updateSaldo(saldo, id, origen);
        this.saldo = saldo;
    }
    
    
}
