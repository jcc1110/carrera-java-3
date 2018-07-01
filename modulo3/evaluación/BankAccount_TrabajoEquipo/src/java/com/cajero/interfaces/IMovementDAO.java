/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cajero.interfaces;

import java.sql.SQLException;

/**
 * Interfaz para manejo de datos de los movimientos
 * @author nellybett
 * @version 1.0.0
 */
public interface IMovementDAO {
    
    /**
     * Metodo para realizar la conexion a la base de datos
     */
    public abstract void connect() throws SQLException;
    /**
     * Metodo para desconectarse de la base de datos
     */
    public abstract void disconnect() throws SQLException;
    public abstract void insertMovement(String tipo,long saldo,String fecha,int cuenta,int destino);
    
    //Metodos no implementados
    public abstract void updateMovement() throws SQLException;
    public abstract void deleteMovement() throws SQLException;
    public abstract void getMovement() throws SQLException;
    
}
