package Ejercicio2B;

public class Partida {
	
	private Jugador jugador1;
    private Jugador jugador2;
    
    public Partida(Jugador jugador1, Jugador jugador2) {
    	this.jugador1 = jugador1;
    	this.jugador2 = jugador2;
    }
    
    public String determinarGanador() {
    	Opcion opcionJugador1 = jugador1.getOpcion();
        Opcion opcionJugador2 = jugador2.getOpcion();

        int resultado = opcionJugador1.comparar(opcionJugador2);

        if (resultado == 0) {
            return "¡Empate!";
        } else if (resultado == 1) {
           return (jugador1.getNombre() + " gana con " + opcionJugador1.getNombre());
        } else {
            return (jugador2.getNombre() + " gana con " + opcionJugador2.getNombre());
        }
    }
}
