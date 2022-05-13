/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author PCG
 */
public class Personaje {
    private int id;
    private String nombre;
    private String apellido;
    private String lugarNacimiento;
    private String estatura;

    public Personaje(int id, String nombre, String apellido, String lugarNacimiento, String estatura) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.lugarNacimiento = lugarNacimiento;
        this.estatura = estatura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getEstatura() {
        return estatura;
    }

    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return "Personaje{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", lugarNacimiento=" + lugarNacimiento + ", estatura=" + estatura + '}';
    }   
}
