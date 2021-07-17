package com.mycompany.juegocarros.clases;


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
public class Juego {
    
    private Pista pista;
    private List<Jugador> ListaJugadores;
    private Podio podio;
    private Boolean terminado;

    public Juego(Pista pista, List<Jugador> ListaJugadores) {
        this.pista = pista;
        this.ListaJugadores = ListaJugadores;
        this.terminado = Boolean.FALSE;
    }

    public Boolean getTerminado() {
        return terminado;
    }

    public void setTerminado(Boolean terminado) {
        this.terminado = terminado;
    }

    public Pista getPista() {
        return pista;
    }

    public List<Jugador> getListaJugadores() {
        return ListaJugadores;
    }

    public void setListaJugadores(List<Jugador> listaJugadores) {
        ListaJugadores = listaJugadores;
    }

    public Podio getPodio() {
        return podio;
    }

    public void setPodio(Podio podio) {
        this.podio = podio;
    }

    public void setPista(Pista pista) {
        this.pista = pista;
    }

}
