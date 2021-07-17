package com.mycompany.juegocarros.clases;


import java.util.UUID;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diego
 */
public class Jugador {
    
    private String nombre;
    private Integer puntos;

    public Jugador(String nombre, Integer puntos) {
        this.nombre = nombre;
        this.puntos = puntos;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }
    
    
    
}
