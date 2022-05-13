/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author PCG
 */
public class Pelicula {
    private int codigo;
    private String nombre;
    private String director;
    private String produccion;
    private String genero;
    private Personaje unPersonaje;

    public Pelicula(int codigo, String nombre, String director, String produccion, String genero, Personaje unPersonaje) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.director = director;
        this.produccion = produccion;
        this.genero = genero;
        this.unPersonaje = unPersonaje;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProduccion() {
        return produccion;
    }

    public void setProduccion(String produccion) {
        this.produccion = produccion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Personaje getUnPersonaje() {
        return unPersonaje;
    }

    public void setUnPersonaje(Personaje unPersonaje) {
        this.unPersonaje = unPersonaje;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "codigo=" + codigo + ", nombre=" + nombre + ", director=" + director + ", produccion=" + produccion + ", genero=" + genero + ", unPersonaje=" + unPersonaje + '}';
    }
}
