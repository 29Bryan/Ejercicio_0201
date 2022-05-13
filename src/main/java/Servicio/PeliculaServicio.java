/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Pelicula;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PCG
 */
public class PeliculaServicio implements IPeliculaServicio{
    public final List<Pelicula> peliculaList = new ArrayList<>();
    
    
    public Pelicula crear(Pelicula b) {
        this.peliculaList.add(b);
        return b;
    }

    
    public Pelicula modificar(int c, Pelicula b) {
        this.peliculaList.set(this.buscarPosicion(c), b);
        return b;
    }

    
    public Pelicula eliminar(int c) {
        var carrera = this.peliculaList.get(this.buscarPosicion(c));
        this.peliculaList.remove(this.buscarPosicion(c));
        return carrera;
    }


    public List<Pelicula> listar() {
        return this.peliculaList;
    }

    
    public int buscarPosicion(int c) {
        var posicion=-1;
        var i=0;
        for(var auxCarrera:this.peliculaList){
            if(auxCarrera.getCodigo()==c){
                posicion =i;
                break;
            }
            i++;
        }
        return posicion;
    }
}
