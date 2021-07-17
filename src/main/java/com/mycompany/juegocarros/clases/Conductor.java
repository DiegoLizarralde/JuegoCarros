package com.mycompany.juegocarros.clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diego
 */
public class Conductor extends Jugador {

    public Conductor(String nombre) {
        super(nombre, 0);
    }

    public Integer AdelantarDados(){
        return (int)(Math.random()* 6)+ 1;
    }
    
}
