/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diego
 */
public class podio {
    
    private jugador primerLugar;
    private jugador segundoLugar;
    private jugador tercerLugar;

    public podio() {
    }

    public void asignarPrimerLugar(jugador jugador) {
        this.primerLugar = jugador;
    }

    public void asignarSegundoLugar(jugador jugador) {
        this.segundoLugar = jugador;
    }

    public void asignarTercerLugar(jugador jugador) {
        this.tercerLugar = jugador;
    }

    
    public jugador primerLugar() {
        return primerLugar;
    }

    
    public jugador segundoLugar() {
        return segundoLugar;
    }

    
    public jugador tercerLugar() {
        return tercerLugar;
    }

    
}
