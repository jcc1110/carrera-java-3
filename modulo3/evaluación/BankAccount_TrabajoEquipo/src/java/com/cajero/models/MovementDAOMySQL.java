/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cajero.models;

import com.cajero.interfaces.IMovementDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * Implementacion con MySQL de los metodos de la interfaz de manejo de datos de Movimiento
 * @author nellybett
 * @version 1.0.0
 */
public class MovementDAOMySQL implements IMovementDAO {

    private Connection con;

    @Override
    public void connect(){
    try {
            Class.forName("com.mysql.jdbc.Driver");
            this.con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/banco", "root", "");
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void disconnect(){
        if (con != null) {
        
            try {
                con.close();
            }catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }


    @Override
    public void insertMovement(String tipo, long valor, String fecha,int cuenta,int destino){
        Statement statement; 
        int number;
        
        try {
            connect();
     
            statement = this.con.createStatement();
            number=statement.executeUpdate("INSERT INTO movimiento (tipo, descripcion, valor, fecha, cuenta, destino) "
          +"VALUES ('"+tipo+"','Transferencia',"+valor+",'"+fecha+"',"+cuenta+","+destino+")");      
           
    
        
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void updateMovement() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteMovement() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getMovement() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
