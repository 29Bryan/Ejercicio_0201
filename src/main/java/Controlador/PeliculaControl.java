/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Pelicula;
import Modelo.Personaje;
import Servicio.PeliculaServicio;

import java.util.List;

/**
 *
 * @author PCG
 */
public class PeliculaControl {
    public PeliculaServicio peliculaServicio = new PeliculaServicio();
    
    public Pelicula crear(int c, String N, String D, String P, String G, int id, String nP, String aP, String lnP, String eP){
        var personaje = new Personaje(id, nP, aP, lnP, eP);
        var pelicula = new Pelicula(c, N, D, P, G, personaje);
        this.peliculaServicio.crear(pelicula); 
        return pelicula; 
    }
    
public Pelicula eliminar(int c) {
        return this.peliculaServicio.eliminar(c);
    }
    
    public Pelicula modificar(int c, Pelicula b) {
        return this.peliculaServicio.modificar(c,b);
    }
    
    public List<Pelicula> listar()
    {
        return this.peliculaServicio.listar();
    }
}