/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiendapeliculas.implement;

/**
 * Clase para crear peliculas con sus datos
 * @author Nelly
 * @version 1.0.0
 */


public class Pelicula {
    private String nombre;
    private String author;
    private String tema;
    private String resumen;

    public Pelicula(String nombre, String author, String tema, String resumen) {
        this.nombre = nombre;
        this.author = author;
        this.tema = tema;
        this.resumen = resumen;
    }
    
    
//Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }
}
