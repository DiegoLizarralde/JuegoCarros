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
public class Posicion {

    private Integer actual;
    private Integer meta;

    public Integer actual() {
        return actual;
    }

    public Integer meta() {
        return meta;
    }

    public void setActual(Integer actual) {
        this.actual = actual;
    }

    public Posicion(Integer actual, Integer meta) {
        this.actual = actual;
        this.meta = meta;
    }

}
