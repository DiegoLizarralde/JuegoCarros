package com.mycompany.juegocarros.clases;


import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *  
 * @author diego
 */
public class Carro {

    protected Conductor conductor;
    protected Integer distancia;

    public Conductor getConductor() {
        return conductor;
    }

    public Carro(Conductor conductor, Integer distancia ) {
        this.conductor = conductor;
        this.distancia = distancia;
    }

    public void setDistancia(Integer distancia) {
        this.distancia = distancia;
    }

    public Integer getDistancia() {
        return distancia;
    }



    
}
