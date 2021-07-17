
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
public class Carril {
    
    protected UUID carroId;
    protected UUID juegoId;
    protected Posicion posicion;
    protected Integer metros;
    protected Boolean desplazamientoFinal;
    
    public Carril(UUID carroId, UUID juegoId, Posicion posicion, Integer metros, Boolean desplazamientoFinal) {
        this.carroId = carroId;
        this.juegoId = juegoId;
        this.posicion = posicion;
        this.metros = metros;
        this.desplazamientoFinal = desplazamientoFinal;
    }

    public void alcanzarLaMeta() {
        if (posicionActual() >= posicionDeseada()) {
            desplazamientoFinal = true;
        }

    }

    public void moverCarro(Posicion posicion, Integer cantidad) {
        this.posicion = posicion;
        posicion.setActual(posicion.actual() + cantidad);
        alcanzarLaMeta();
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
