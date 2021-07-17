
import java.awt.Color;
import java.util.Scanner;
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
public class Carrera {
    
        UUID id;
        int cantidadJugadores;
        String nombreJugador;

        Juego nuevoJuego = new Juego();
        //System.out.println("Iniciando un nuevo juego ...");

        /*Scanner in = new Scanner(System.in);        
        System.out.println("¿Cuántos jugadores desea crear?");
         while(!in.hasNextInt()) in.next();         
        cantidadJugadores = in.nextInt();
        */
        
        /*for (int i = 0; i < cantidadJugadores; i++) {
            id = UUID.randomUUID();
            jugador jugadorId = new jugador(id);
            nombreJugador = "jugador" + (i + 1);
            nombre nombre = new nombre(nombreJugador);
            nuevoJuego.crearJugador(jugadorId, nombre, Color.yellow);
        }*/
}
