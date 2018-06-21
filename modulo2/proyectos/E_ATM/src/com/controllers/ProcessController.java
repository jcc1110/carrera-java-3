package com.controllers;
import com.models.DataAccess;
import com.models.User;
import com.structures.I_ATM;

public class ProcessController implements I_ATM {
    @Override
    public boolean validarUsuario(String tarjeta, String clave) {       
        // Instancia de las clases necesarias
        DataAccess bd = new DataAccess();
        User usuario = new User();
        
        // Estableciendo los valores
        usuario.setTarjeta(tarjeta);
        usuario.setClave(clave);
        
        // returnando el valor obtenido
        return bd.validar(usuario);        
    }
}
