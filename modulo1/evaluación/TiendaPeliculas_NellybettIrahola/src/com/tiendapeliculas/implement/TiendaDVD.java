/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiendapeliculas.implement;
import com.tiendapeliculas.structures.Tienda;
import java.util.ArrayList;
import static com.tiendapeliculas.implement.FileManage.leerLista;
import static com.tiendapeliculas.implement.FileManage.ingresar;
/**
 *Clase que implementa tienda, esta dedicada a vender DVD
 * @author Nelly
 * @version 1.0.0
 */
public class TiendaDVD implements Tienda{
    private String location;
    private String name;
    private ArrayList<Pelicula> peliculas;
    private String ruta="./peliculas"; //Representa la ruta en la que esta el archivo

    public TiendaDVD(String location, String name) {
        this.location = location;
        this.name = name;
        this.peliculas=new ArrayList<>();
    }
    
    
    /**
     * Utilizado para Añadir pelicula, se modifica en el archivo
     * @param p 
     */
    @Override
    public void anadirPelicula(Pelicula p) {
        ingresar(p.getNombre()+"/"+p.getAuthor()+"/"+p.getTema()+"/"+p.getTema(), -1, this.ruta);
        setPeliculas();
    }
    
    /**
     * Utilizado para eliminar pelicula, se modifica en el archivo
     * @param name 
     */
    @Override
    public void eliminarPelicula(String name) {
        int aux=0;
        int aux1=1;
       
        for(Pelicula p:this.peliculas){
            if(p.getNombre().equals(name)){
                aux1=aux;
            }
            ++aux;
        }
        ingresar("xx", aux1, this.ruta);
        setPeliculas();
        
    }
    
    /**
     * Se modifica un valor de la pelicula en el archivo, el tema/nombre/resumen/autor
     * @param name
     * @param elemento
     * @param valor 
     */
    @Override
    public void modificarPelicula(String name,int elemento, String valor) {
        int aux=0;
        int auxiliar=0;
        
        for(Pelicula p:this.peliculas){
            if(p.getNombre().equals(name)){
                
                switch(elemento){
                    case 1:
                        ingresar(valor+"/"+p.getAuthor()+"/"+p.getTema()+"/"+p.getResumen(), aux, this.ruta);
                        break;
                    case 2:
                        ingresar(p.getNombre()+"/"+valor+"/"+p.getTema()+"/"+p.getResumen(), aux, this.ruta);
                        break;
                    case 3:
                        ingresar(p.getNombre()+"/"+p.getAuthor()+"/"+valor+"/"+p.getResumen(), aux, this.ruta);
                        break;
                    case 4:
                        ingresar(p.getNombre()+"/"+p.getAuthor()+"/"+p.getTema()+"/"+valor, aux, this.ruta);
                        break;
                }
                auxiliar=2;
            }
            ++aux;
        }
        setPeliculas();
        if (auxiliar==0)System.out.println("No se encontro la pelicula");
    }

    /**
     * Se utiliza para listar las peliculas disponibles en tiempo de ejecucion
     */
    @Override
    public void listarPeliculas() {
        int aux=1;
        for(Pelicula p:this.peliculas){
            System.out.println(aux+". Nombre: "+p.getNombre()+", Autor: "+p.getAuthor()+", Tema: "+p.getTema()+", Resumen: "+p.getResumen()+"\n");
            ++aux;
        }
        
    }

    /**
     * Permite presentar los datos de una pelicula utilizando el nombre
     * @param name 
     */
    @Override
    public void buscarPelicula(String name) {
       int aux=0;
        
        for(Pelicula p:this.peliculas){
        
            if(p.getNombre().equals(name)){
                
                System.out.println("Nombre: "+p.getNombre()+"\nAutor: "+p.getAuthor()+"\nTema: "+p.getTema()+"\nResumen: "+p.getResumen()+"\n");
                aux=2;
            }
        }
        if (aux==0)System.out.println("No se encontro la pelicula");
    }
    
    // Getters y Setters
    
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas() {
        int aux=0;   
        this.peliculas.clear();
        ArrayList<String> listaLeida=leerLista(this.ruta);
        while(aux<listaLeida.size()){
            String[] auxiliar= listaLeida.get(aux).split("/");
            Pelicula p=new Pelicula(auxiliar[0], auxiliar[1], auxiliar[2], auxiliar[3]);
            this.peliculas.add(p);
            ++aux;
        }
    }
}
