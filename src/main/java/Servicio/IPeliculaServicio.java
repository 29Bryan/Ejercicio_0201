/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import Modelo.Pelicula;
import java.util.List;

/**
 *
 * @author PCG
 */
public interface IPeliculaServicio {
    public Pelicula crear(Pelicula b);
    public Pelicula modificar(int c, Pelicula b);
    public Pelicula eliminar(int c);
    public List<Pelicula> listar();
    public int buscarPosicion(int c);
}
