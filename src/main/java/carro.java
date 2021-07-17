
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
public class carro {

    protected conductor conductor;
    protected Integer distancia;
    protected Color color;
    protected Juego juegoId;

    public carro(conductor conductor, Integer distancia, Color color, Juego juegoId) {
        this.conductor = conductor;
        this.distancia = distancia;
        this.color = color;
        this.juegoId = juegoId;
    }

    public void setDistancia(Integer distancia) {
        this.distancia = distancia;
    }

    public Integer getDistancia() {
        return distancia;
    }

    public Color getColor() {
        return color;
    }

    public Juego getJuegoId() {
        return juegoId;
    }
    
    
}
