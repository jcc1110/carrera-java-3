/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cajero.models;

import com.cajero.interfaces.IPersonDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * Implementacion con MySQL de los metodos de la interfaz de manejo de datos de Persona
 * @author nellybett
 * @version 1.0.0
 */
public class PersonDAOMySQL implements IPersonDAO{

    private Connection con;

    @Override
    public void connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/banco", "root", "");
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("No logre conectarme");
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
    public void insertPerson() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updatePerson() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletePerson() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String[] getPerson(int id, String id_cuenta) {
        Statement statement; 
        ResultSet result;
        String[] datos=new String[7];
        System.err.println(id);
        
        try {
            connect();
            statement = this.con.createStatement();
            if(id_cuenta.equals("I")){
                result=statement.executeQuery("SELECT * from persona where id ="+id);
                System.out.println("---Entre a persona");
            }else{
                System.out.println("------Entre a obtener destinatario");
                result=statement.executeQuery("SELECT * from persona where cuenta ="+id);
            }
            
            if (result.next()==true){
                System.out.println(result.getString("nombre"));
                datos[0]=result.getString("nombre");
                datos[1]=Integer.toString(result.getInt("cedula"));
                datos[2]=result.getString("password");
                datos[3]=result.getString("apellido");
                datos[4]=result.getString("correo");
                datos[5]=result.getString("cuenta");
                datos[6]=result.getString("saldo");
            }else{
                datos=null;
            }
            
                 
            }catch (SQLException ex) {
                
            System.out.println("No logre obtener la persona");
        }
        
        return datos;
    }

    Account[] getAccounts() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updatePassword(String password, int id) {
         Statement statement; 
        int number;
        
        try {
            connect();
     
            statement = this.con.createStatement();
            
            number=statement.executeUpdate("UPDATE persona set password='"
          +password+"' WHERE id="+id);      
            
        
        } catch (SQLException ex) {
            System.out.println("No pude actualizar la contraseña");
        }
    }
    
    public void updateSaldo(long saldo, int id,String origen) {
         Statement statement; 
        int number;
        
        try {
            connect();
     
            statement = this.con.createStatement();
            if(origen.equals("O")){
                number=statement.executeUpdate("UPDATE persona set saldo="
          +saldo+" WHERE id="+id);      
            
            }else{
                number=statement.executeUpdate("UPDATE persona set saldo="
          +saldo+" WHERE cuenta="+id);      
            
            }
            
            System.out.println("--------"+saldo);
        
        } catch (SQLException ex) {
            System.out.println("No pude actualizar el saldo");
        }
    }
        
    public void updateCorreo(String correo, int id) {
         Statement statement; 
        int number;
        
        try {
            connect();
     
            statement = this.con.createStatement();
            
            number=statement.executeUpdate("UPDATE persona set correo='"
          +correo+"' WHERE id="+id);      
            
        
        } catch (SQLException ex) {
            System.out.println("No pude actualizar el correo");
        }
    }
    
}
