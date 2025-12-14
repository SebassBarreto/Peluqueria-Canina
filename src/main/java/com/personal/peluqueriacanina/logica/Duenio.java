package com.personal.peluqueriacanina.logica;

/**
 * @file Duenio.java
 * @brief clase dueño segregacion de clases
 *
 * @version 1.0
 * @date 13/12/2025
 * 
 * @author Sebastian Barreto
 */

public class Duenio {
    
    private int id_duenio;
    private String nombre;
    private String celDuenio;

    public Duenio() {
    }

    public Duenio(int id_duenio, String nombre, String celDuenio) {
        this.id_duenio = id_duenio;
        this.nombre = nombre;
        this.celDuenio = celDuenio;
    }

    public int getId_duenio() {
        return id_duenio;
    }

    public void setId_duenio(int id_duenio) {
        this.id_duenio = id_duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelDuenio() {
        return celDuenio;
    }

    public void setCelDuenio(String celDuenio) {
        this.celDuenio = celDuenio;
    }
    
}
