/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cajero.interfaces;

import com.cajero.models.Account;
import java.sql.SQLException;

/**
 * Interfaz generica para manejo de datos de Cuenta
 * @author nellybett
 * @version 1.0.0
 */
public interface IAccountDAO {

    /**
     * Metodo para realizar la conexion a la base de datos
     */
    public abstract void connect();
     /**
     * Metodo para desconectarse de la base de datos
     */
    public abstract void disconnect();
    
    /**
     * Metodo para obtener las cuentas asociadas a una persona
     * @param p
     * @return 
     */
    public abstract Account[] getAccounts(int p);
    
    /**
     * Metodo para actualizar el saldo de una cuenta
     * @param saldo
     * @param id
     * @param pid 
     */
    public abstract void updateAccount(long saldo, int id, int pid);
    
    //Metodos no implementados
    public abstract void insertAccount() throws SQLException;
    public abstract void deleteAccount() throws SQLException;
    
    
    
}
