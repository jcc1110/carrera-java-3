/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cajero.models;

import com.cajero.interfaces.IAfiliacionesDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc1
 */
public class AfiliacionesDAOMySQL implements IAfiliacionesDAO{
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
    public Afiliaciones[] getAfiliations(int p) {
        Statement statement; 
        ResultSet result;
        Afiliaciones[] cuentas=null;
        
        
        try {
            connect();
     
            statement = this.con.createStatement();
            result=statement.executeQuery("SELECT * from Afiliacion WHERE cuenta ="+p);      
            int i=0;
            boolean aux=result.last();
            cuentas=new Afiliaciones[result.getRow()];
            result.beforeFirst();
            while(result.next()) {
                
                Afiliaciones auxiliar=new Afiliaciones(result.getInt("id"),result.getInt("cuenta"),result.getInt("destino"));
                cuentas[i]=auxiliar;
                System.out.println(cuentas[i].getCuenta());
                ++i;
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAOMySql.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cuentas;
    
    }

    @Override
    public void insertAccount() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteAccount() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
