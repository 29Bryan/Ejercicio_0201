/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Vista;

import Controlador.PeliculaControl;
import Modelo.Pelicula;
import Modelo.Personaje;

/**
 *
 * @author PCG
 */
public class Ejercicio_0201 {

    public static void main(String[] args) {
        var peliculaControl = new PeliculaControl(); 
        peliculaControl.crear(10, "Rapidos y Furiosos", "Justin Lin", "Universal Studios", "Accion", 
                345, "Mark", "Sinclair ", "California", "1,82 m");
        peliculaControl.crear(6, "Mision Imposible", "Christopher McQuarrie", "Bad Robot Productions", 
                "Accion", 984, "Tom", "Cruise", "Nueva York", "1,7 m");
        peliculaControl.crear(7, "Piratas del Caribe", "Joachim Ronning", "The Walt Disney Company",
                "Accion", 842, "Johnny", "Depp", "Kentucky", "1,78 m");
        peliculaControl.crear(5, "Indiana Jones", "James Mangold", " Lucasfilm", "Accion", 512, "Harrison", 
                "Ford", "Illinois", "1,85 m"); 
        
        for (Pelicula b: peliculaControl.listar())
            System.out.println(b.toString());
        
        peliculaControl.eliminar(7);
        System.out.println("Listado Eliminando el codigo 7");
        for (Pelicula b: peliculaControl.listar())
            System.out.println(b.toString());
        var nuevoPersonaje = new Personaje(648, "Jason", "Statham", "Shirebrook", "1,78 m"); 
        var nuevaPelicula = new Pelicula(3, "El Transportador", "Louis Leterrier", "Universal Studios", 
                "Accion", nuevoPersonaje); 
        peliculaControl.modificar(3, nuevaPelicula); 
        
        System.out.println("Listado Modificando el codigo 3");
        for (Pelicula b: peliculaControl.listar())
            System.out.println(b.toString());
    }
}
