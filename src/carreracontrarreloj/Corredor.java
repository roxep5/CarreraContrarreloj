/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreracontrarreloj;

/**
 *
 * @author Piña
 */
public class Corredor implements Comparable<Corredor>{
    private int dorsal;
    private String nombre;
    private String nacionalidad;
    private int tiempo;
    private String equipo;

    public Corredor(int dorsal, String nombre, String nacionalidad) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public Corredor(int dorsal, int tiempo) {
        this.dorsal = dorsal;
        this.tiempo = tiempo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
    
    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Corredor(int dorsal, String nombre, String nacionalidad, String equipo, int tiempo) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.tiempo = tiempo;
        this.equipo = equipo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    //esto sirve para ordenar de menor a mayor heredando de comparable corredor luego se usa en collection.sort
    public int compareTo(Corredor o) {
        return this.tiempo-o.tiempo;
    }

    
}
