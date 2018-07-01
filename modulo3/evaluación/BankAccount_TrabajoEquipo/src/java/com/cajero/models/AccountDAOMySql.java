/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cajero.models;

import com.cajero.interfaces.IAccountDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Implementacion con MySQL de los metodos de la interfaz de manejo de datos de Cuenta
 * @author nellybett
 * @version 1.0.0
 */
public class AccountDAOMySql implements IAccountDAO {

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
    public void insertAccount() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateAccount(long saldo,int id, int pid){
        Statement statement; 
        int number;
        
        try {
            connect();
     
            statement = this.con.createStatement();
            number=statement.executeUpdate("UPDATE Account set saldo="
          +saldo+" WHERE id="+id+" AND personid="+pid);      
            
        
        } catch (SQLException ex) {
            System.out.println("No pude actualizar el saldo");
        }
    }

    @Override
    public void deleteAccount() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Account[] getAccounts(int p){
        Statement statement; 
        ResultSet result;
        Account[] cuentas=null;
        
        
        try {
            connect();
     
            statement = this.con.createStatement();
            result=statement.executeQuery("SELECT * from cuenta WHERE personId ="+p);      
            int i=0;
            boolean aux=result.last();
            cuentas=new Account[result.getRow()];
            result.beforeFirst();
            while(result.next()) {
                
                Account auxiliar=new Account((long)(result.getFloat("saldo")),p, result.getString("tipo"),result.getInt("id"));
                cuentas[i]=auxiliar;
                System.out.println(cuentas[i].getSaldo());
                ++i;
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAOMySql.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(cuentas[0]);
        return cuentas;
    }
    
}
