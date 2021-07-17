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
public class Carril {
    protected Carro carro;
    protected Posicion posicion;
    protected Integer metros;
    protected Boolean desplazamientoFinal;
    
    public Carril(Carro carro , Posicion posicion, Integer metros, Boolean desplazamientoFinal) {
        this.carro = carro;
        this.posicion = posicion;
        this.metros = metros;
        this.desplazamientoFinal = desplazamientoFinal;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setDesplazamientoFinal(Boolean desplazamientoFinal) {
        this.desplazamientoFinal = desplazamientoFinal;
    }

    public void alcanzarLaMeta() {
        if (posicionActual() >= posicionDeseada()) {
            desplazamientoFinal = Boolean.TRUE;
        }

    }

    public void moverCarro(Integer Avance) {
        this.carro.setDistancia(this.carro.getDistancia()+ Avance);
    }

    public Integer metros() {
        return metros;
    }

    public Posicion posicion() {
        return posicion;
    }

    public Integer posicionActual() {
        return posicion.actual();
    }

    public Integer posicionDeseada() {
        return posicion.meta();
    }

    public Boolean desplazamientoFinal() {

        return desplazamientoFinal;

    }

    
}
