package com.gcta.bd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * Clase que se encarga de conectar a la base de datos.
 * @author Gabriel Costanza y Constantino Alves.
 * @version 1.0.0
 */
public class BaseDatos {
    // Atributo
    Connection con;
    /**
     * Método que conecta a la base de datos.
     */
    public void connectToDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/atm", "root", "root");
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
    /**
     * Método que válida los datos ingresados comparando con la base de datos.
     * @param usuario datos del usuario.
     * @return un dato booleano para verificar el uso del método.
     */    
    public boolean validar(Usuario usuario) {
        boolean result = false;
        String sql;
        
        try {
            this.connectToDB();            
            Statement sta = this.con.createStatement();
            sql = "SELECT * FROM usuario WHERE tarjeta='"+ usuario.getTarjeta() +"' AND clave='"+ usuario.getClave() +"'";
            
            ResultSet rs = sta.executeQuery(sql);                        
            while(rs.next()) {
                result = (rs.getString("tarjeta").equals(usuario.getTarjeta()) && rs.getString("clave").equals(usuario.getClave()));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return result;
        
    }
    /**
     * Método que extrae el saldo para mostrar al usuario.
     * @param usuario datos del usuario.
     * @return El saldo.
     */
    public Double consulta(Usuario usuario){
        boolean result= false;
        String sql;
        Double Monto = (null);
        try {
            this.connectToDB();            
            Statement sta = this.con.createStatement();
            sql = "SELECT saldo FROM usuario WHERE tarjeta='"+ usuario.getTarjeta()  +"'";
            
            ResultSet rs = sta.executeQuery(sql);                        
            while(rs.next()) {
                
                Monto=rs.getDouble("saldo");
                
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } return Monto;  
    }
    /**
     * Método que se encarga de restar a la base de datos el monto retirado.
     * @param usuario datos del usuario.
     * @param monto monto a restar de la base de datos.
     * @return un dato booleano para verificar el uso del método.
     */
    public boolean retiro(Usuario usuario, Double monto){
        int resultado= 0 ;
        boolean result= false;
        String sql = null;
        
        try {
            this.connectToDB();            
            Statement sta = this.con.createStatement();
            sql = "SELECT saldo FROM usuario WHERE tarjeta='"+ usuario.getTarjeta()  +"'";
            
            ResultSet rs = sta.executeQuery(sql);                        
            while(rs.next()) {
              
                sql = "UPDATE usuario SET saldo = saldo -" + monto + " WHERE tarjeta='" + usuario.getTarjeta()+ "'";
                Statement update = this.con.prepareStatement(sql);
                update.executeUpdate(sql);
            }
            
        if(resultado == 1){
                result = true;
                        }
            else {
                result= false;
            }
        }catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
       
        return result;
    }
    /**
     * Método que se encarga de sumar a la base de datos un valor.
     * @param usuario datos del usuario.
     * @param monto monto a sumar.
     * @return un dato booleano para verificar el uso del método.
     */ 
    public boolean deposito(Usuario usuario, Double monto){
        int resultado = 0;
        boolean result= false;
        String sql = null;
        
        try {
            this.connectToDB();            
            Statement sta = this.con.createStatement();
            sql = "SELECT saldo FROM usuario WHERE tarjeta='"+ usuario.getTarjeta()  +"'";
            
            ResultSet rs = sta.executeQuery(sql);                        
            while(rs.next()) {
              
                sql = "UPDATE usuario SET saldo = saldo +" + monto + " WHERE tarjeta='" + usuario.getTarjeta()+ "'";
                Statement update = this.con.prepareStatement(sql);
                 resultado = update.executeUpdate(sql); 
          
            
                
            }
            if(resultado == 1){
                result = true;
            }
            else {
                result= false;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return result;
    }
    /**
     * Método para cambiar la clave de acceso en la base de datos.
     * @param usuario datos del usuario.
     * @param clavenueva nueva clave.
     * @return un dato booleano para verificar el uso del método.
     */
    public boolean CambiarClave(Usuario usuario, String clavenueva){
        boolean result= false;
        int resultado = 0;
        String sql = null; 
        
        try {
            this.connectToDB();            
            Statement sta = this.con.createStatement();
            sql = "SELECT * FROM usuario WHERE tarjeta='"+ usuario.getTarjeta() +"'";
            
            ResultSet rs = sta.executeQuery(sql);                        
            while(rs.next()) {
              
                sql = "UPDATE usuario SET clave = '" + clavenueva + "' WHERE tarjeta='" + usuario.getTarjeta()+ "'";
                Statement update = this.con.createStatement();
                resultado = update.executeUpdate(sql);           
                
            }
            
            if(resultado == 1){
                result = true;
            }
            else {
                result= false;             
            }
            
        } catch (SQLException ex) {
                System.out.println(ex.getMessage());
        } return result;
    }  
        
}