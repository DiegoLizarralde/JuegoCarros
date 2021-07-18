

import com.mycompany.juegocarros.clases.*;
import com.mycompany.juegocarros.datos.BD;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
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

        private static final Integer TAMAÑO_PISTA =  1000;

        public static void main(String[] args) {


            List<Jugador> ListaJugadores = new ArrayList<>();
            List<Carril> ListaCarriles = new ArrayList<>();
            Integer cantidadJugadores;
            String nombreJugador;
            Juego juego;
            Pista pista;
            List<Conductor> OrdenLLegada = new ArrayList<>();


            System.out.println("Nuevo Juego...");

           do {
               Scanner in = new Scanner(System.in);
               System.out.println("¿Cuántos jugadores desea crear? minimo 3");
               while (!in.hasNextInt()) in.next();
               cantidadJugadores = in.nextInt();
           }while (cantidadJugadores<3);

            for (Integer i = 0; i < cantidadJugadores; i++) {
                nombreJugador = "jugador" + (i + 1);
                Jugador jugador = new Jugador(nombreJugador, 0);
                ListaJugadores.add(jugador);
                Carro carro = new Carro(new Conductor(nombreJugador), 0);
                ListaCarriles.add(new Carril(carro, new Posicion(0,0 ), TAMAÑO_PISTA , Boolean.FALSE));

            }

            pista = new Pista(TAMAÑO_PISTA /1000, cantidadJugadores, ListaCarriles);

            juego = new Juego(pista, ListaJugadores);

            while (!juego.getTerminado()){
                juego.setTerminado(Boolean.TRUE);
                for (Integer i = 0; i < juego.getPista().numeroDeCarriles();i++){
                    if (!juego.getPista().getCarriles().get(i).desplazamientoFinal()){
                        juego.setTerminado(Boolean.FALSE);

                        Integer AdelantarDado = juego.getPista()
                                .getCarriles()
                                .get(i)
                                .getCarro()
                                .getConductor()
                                .AdelantarDados();
                        juego.getPista().getCarriles().get(i).moverCarro(AdelantarDado*100);
                        if (juego.getPista().getCarriles().get(i).getCarro().getDistancia() >= juego.getPista().kilometros()* 1000){
                            juego.getPista().getCarriles().get(i).setDesplazamientoFinal(Boolean.TRUE);
                            OrdenLLegada.add(juego.getPista()
                                    .getCarriles()
                                    .get(i)
                                    .getCarro()
                                    .getConductor());
                        }
                        System.out.println("El jugador " + juego.getPista()
                                .getCarriles()
                                .get(i)
                                .getCarro()
                                .getConductor().getNombre() + " Ha sacado " + AdelantarDado + " Por lo tanto avanza " + AdelantarDado*100);
                        for (Integer j = 0; j < juego.getPista().numeroDeCarriles(); j++) {
                            System.out.println("El jugador " + juego.getPista()
                                    .getCarriles()
                                    .get(j)
                                    .getCarro()
                                    .getConductor().getNombre() + " Ha avanzado " + juego.getPista()
                                    .getCarriles()
                                    .get(j)
                                    .getCarro().getDistancia());
                        }
                    }

                }
            }

            Podio podio = new Podio();
            podio.asignarPrimerLugar(OrdenLLegada.get(0));
            podio.asignarSegundoLugar(OrdenLLegada.get(1));
            podio.asignarTercerLugar(OrdenLLegada.get(2));

            BD bd = new BD();
            bd.Conectar();

            bd.insertar("INSERT INTO ganadores VALUES ("+null+",'"+podio.primerLugar().getNombre()+"','"+podio.segundoLugar().getNombre()+"','"+podio.tercerLugar().getNombre()+"');");



            System.out.println(podio);

        }
}
