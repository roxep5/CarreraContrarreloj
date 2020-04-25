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
public class Corredor {
    private int dorsal;
    private String nombre;
    private String nacionalidad;

    public Corredor(int dorsal, String nombre, String nacionalidad) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    
}
