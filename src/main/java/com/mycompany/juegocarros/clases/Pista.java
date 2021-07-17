package com.mycompany.juegocarros.clases;


import com.mycompany.juegocarros.clases.Carril;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diego
 */
public class Pista {

    private Integer kilometros;
    private Integer numeroDeCarriles;
    private List<Carril> Carriles;


    public Pista(Integer kilometros, Integer numeroDeCarriles, List<Carril> carriles) {
        this.kilometros = kilometros;
        this.numeroDeCarriles = numeroDeCarriles;
        this.Carriles = carriles;
    }

    public List<Carril> getCarriles() {
        return Carriles;
    }
    public Integer kilometros() {
        return kilometros;
    }

    public Integer numeroDeCarriles() {
        return numeroDeCarriles;
    }
}
