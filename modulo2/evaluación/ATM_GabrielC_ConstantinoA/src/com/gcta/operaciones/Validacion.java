package com.gcta.operaciones;
import com.gcta.bd.BaseDatos;
import com.gcta.bd.Usuario;
import javax.swing.JTextField;


/**
 * Clase de métodos que operan y válidan el programa.
 * @author Gabriel Costanza y Constantino Alves
 * @version 1.0.0
 */
public class Validacion {
    /**
     * Método Para válidar los datos ingresados.
     * @param tarjeta número de la cuenta.
     * @param clave clave de la cuenta.
     * @return 
     */
    public boolean validarUsuario(String tarjeta, String clave) {       
        // Instancia de las clases necesarias
        BaseDatos bd = new BaseDatos();
        Usuario usuario = new Usuario();
        
        // Estableciendo los valores
        usuario.setTarjeta(tarjeta);
        usuario.setClave(clave);
        
        // returnando el valor obtenido
        return bd.validar(usuario);        
    }
    /**
     * Método para consultar el saldo de la cuenta.
     * @param tarjeta número de la cuenta.
     * @return el estado del saldo.
     */
    public Double consultar(String tarjeta){
        Usuario usuario = new Usuario();
        BaseDatos con=new BaseDatos();
        usuario.setTarjeta(tarjeta);
        return con.consulta(usuario);
    }
    /**
     * Método para retirar dinero de la cuenta.
     * @param tarjeta número de la cuenta.
     * @param monto cantidad monetaria a retirar.
     * @return un dato booleano para verificar el uso del método.
     */
    public boolean retiro(String tarjeta, double monto){
        
        Usuario usuario = new Usuario();
        BaseDatos con=new BaseDatos();
        usuario.setTarjeta(tarjeta);
        return con.retiro(usuario, monto); 
    }
    /**
     * Método para depositar dinero en la cuenta.
     * @param tarjeta número de cuenta.
     * @param monto cantidad monetaria a depositar.
     * @return un dato booleano para verificar el uso del método.
     */
    public boolean deposito(String tarjeta, double monto){
        
        Usuario usuario = new Usuario();
        BaseDatos con=new BaseDatos();
        usuario.setTarjeta(tarjeta);
         return con.deposito(usuario, monto); 
    }
    
    /**
     * Método para cambiar la clave de ingreso.
     * @param tarjeta número de la cuenta.
     * @param clavenueva clave nueva.
     * @return un dato booleano para verificar el uso del método.
     */
    public boolean cambioclave(String tarjeta, String clavenueva){
      
        Usuario usuario=new Usuario();
        BaseDatos con=new BaseDatos();
        usuario.setTarjeta(tarjeta);
        return con.CambiarClave(usuario, clavenueva);
        
       
        
    }
    
    
    
    
}
