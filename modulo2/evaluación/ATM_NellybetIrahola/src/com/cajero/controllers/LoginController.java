/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cajero.controllers;

import com.cajero.models.Account;
import static com.cajero.models.FileManagement.ingresar;

import com.cajero.models.MovementDAOMySQL;
import com.cajero.models.Person;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Clase que funciona como Controlador para permitir las operaciones del usuario
 * @author nellybett
 * @version 1.0.0
 */

public class LoginController {

    private Person p;

    /**
     * Metodo utilizado para realizar el login
     * @param tarjeta
     * @param password
     * @return 
     */
    public boolean login(String tarjeta, String password){
        Person user=new Person(Integer.parseInt(tarjeta));
       
        boolean aux=user.getPerson(Integer.parseInt(tarjeta));
        
        if(user.getPassword().equals(password)&& aux==true){
            this.p=user;
            ingresar("Intento de login de la tarjeta:"+tarjeta);
            return true;
        }else{
           
            return false;
        }
        
        
    }

    //Getter y Setter
    
    public Person getP() {
        return p;
    }

    public void setP(Person p) {
        this.p = p;
    }

    /**
     * Metodo que registra los movimientos realizados por la persona (depositos y retiros)
     * @param cuenta
     * @param saldo
     * @param tipo
     * @return 
     */
    public boolean mover(String cuenta, String saldo, String tipo) {
        int i=0;
        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("dd LLLL yyyy");
        LocalDate hoy=LocalDate.now();
        
        Account[] recorrer=this.p.getCuentas();
        Account[] nuevasCuentas=new Account[this.p.getCuentas().length];
        MovementDAOMySQL movementModel=new MovementDAOMySQL();
        for(Account item:recorrer){
      
           if(Integer.toString(item.getId()).equals(cuenta)){
               if(tipo.equals("D")){
                   
                   movementModel.insertMovement("Deposito",Long.parseLong(saldo),hoy.format(formatter),item.getId());
                   item.setSaldo(item.getSaldo()+Long.parseLong(saldo),item.getId(),p.getId());  
                   ingresar("Intento de deposito de la tarjeta:"+p.getId()+"\n Monto: "+saldo);
               }
               if(tipo.equals("R")){
                   if(Long.parseLong(saldo)<item.getSaldo()){
                       item.setSaldo(item.getSaldo()-Long.parseLong(saldo), item.getId(),p.getId());
                       movementModel.insertMovement("Retiro",Long.parseLong(saldo),hoy.format(formatter),item.getId());
                   }else{
                       return false;
                   }
                   
                   ingresar("Intento de retiro de la tarjeta:"+p.getId()+"\n Monto: "+saldo);
               }
             
           }
           nuevasCuentas[i]=item;
         
           ++i;
        }
     
        this.p.setCuentas(nuevasCuentas);
        return true;
      
    }

    /**
     * Metodo que realiza el cambio de clave
     * @param original
     * @return 
     */
    public boolean cambiarClave(String original) {
        this.getP().setPassword(original);
        ingresar("Cambio de contraseña de la cuenta"+this.getP().getId());
        return true;
    }
    
    
}
