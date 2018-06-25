/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiendapeliculas.structures;

import com.tiendapeliculas.implement.Pelicula;


/**
 * Interfaz para la implementacion de diferentes tiendas
 * @author Nelly
 */
public interface Tienda {
    
    public abstract void anadirPelicula(Pelicula p);
    public abstract void eliminarPelicula(String name);
    public abstract void modificarPelicula(String name,int elemento, String valor);
    public abstract void listarPeliculas();
    public abstract void buscarPelicula(String name);
    
}
