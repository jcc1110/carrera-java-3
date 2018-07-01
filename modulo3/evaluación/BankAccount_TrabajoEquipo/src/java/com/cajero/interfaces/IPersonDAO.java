/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cajero.interfaces;

import java.sql.SQLException;

/**
 * Interfaz para manejo de datos de usuario
 * @author nellybett
 */
public interface IPersonDAO {
    /**
     * Metodo para realizar la conexion a la base de datos
     */
    public abstract void connect();
    /**
     * Metodo para desconectarse de la base de datos
     */
    public abstract void disconnect();
    /**
     * Metodo para obtener los datos de una persona a partir de un id
     * @param id
     * @return 
     */
    public abstract String[] getPerson(int id, String cuenta_id);
    
    //Metodos no implementados
    public abstract void insertPerson() throws SQLException;
    public abstract void updatePerson() throws SQLException;
    public abstract void deletePerson() throws SQLException;
    
    
    
}
