/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cajero.interfaces;

import com.cajero.models.Account;
import com.cajero.models.Afiliaciones;
import java.sql.SQLException;

/**
 *
 * @author pc1
 */
public interface IAfiliacionesDAO {
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
    public abstract Afiliaciones[] getAfiliations(int p);
    
    
    //Metodos no implementados
    public abstract void insertAccount() throws SQLException;
    public abstract void deleteAccount() throws SQLException;
    
}
