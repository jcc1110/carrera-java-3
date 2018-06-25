package com.controllers;
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

@Named(value = "ub")
@ApplicationScoped
public class UsuarioBean implements Serializable {
    // Atributos
    private static final long serialVersionUID = 1L;
    private String nombre;
    private String bienvenido;

    // Métodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getBienvenido() {
        this.bienvenido = "Bienvenido/a, " + this.getNombre();
        return this.bienvenido;
    }

    public void setBienvenido(String bienvenido) {
        this.bienvenido = bienvenido;
    }
}
