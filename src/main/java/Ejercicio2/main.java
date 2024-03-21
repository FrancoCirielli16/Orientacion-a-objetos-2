package Ejercicio2;

import java.util.Random;

public class main {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Jugador 1");
        Jugador jugador2 = new Jugador("Jugador 2");

        
        Random random = new Random();
        Opcion[] opciones = {new Piedra(), new Papel(), new Tijera()};
        
        jugador1.elegirOpcion(opciones[random.nextInt(opciones.length)]);
        jugador2.elegirOpcion(opciones[random.nextInt(opciones.length)]);
        
        Partida partida = new Partida(jugador1,jugador2);
        System.out.println(jugador1.getNombre() + " eligió: " + jugador1.getOpcion().getNombre());
        System.out.println(jugador2.getNombre() + " eligió: " + jugador2.getOpcion().getNombre());

        System.out.println(partida.determinarGanador());
        
    }
}