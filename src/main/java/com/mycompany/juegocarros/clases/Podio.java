package com.mycompany.juegocarros.clases;


import com.mycompany.juegocarros.clases.Jugador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diego
 */
public class Podio {
    
    private Jugador primerLugar;
    private Jugador segundoLugar;
    private Jugador tercerLugar;

    public Podio() {
    }

    @Override
    public String toString() {
        return "Podio " +
                "primerLugar = " + primerLugar.getNombre() +
                ", segundoLugar = " + segundoLugar.getNombre() +
                ", tercerLugar = " + tercerLugar.getNombre() ;
    }

    public void asignarPrimerLugar(Jugador jugador) {
        this.primerLugar = jugador;
    }

    public void asignarSegundoLugar(Jugador jugador) {
        this.segundoLugar = jugador;
    }

    public void asignarTercerLugar(Jugador jugador) {
        this.tercerLugar = jugador;
    }

    
    public Jugador primerLugar() {
        return primerLugar;
    }

    
    public Jugador segundoLugar() {
        return segundoLugar;
    }

    
    public Jugador tercerLugar() {
        return tercerLugar;
    }

    
}
