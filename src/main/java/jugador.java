
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
public class jugador {
    
    private UUID id_jugador;
    private String nombre;
    private Integer puntos;

    public jugador(UUID id_jugador) {
        this.id_jugador = id_jugador;
    }

    public void setId_jugador(UUID id_jugador) {
        this.id_jugador = id_jugador;
    }

    public UUID getId_jugador() {
        return id_jugador;
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
