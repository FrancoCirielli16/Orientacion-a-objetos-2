package Ejercicio2_SIN_IF;

public class Partida {
	private Jugador jugador1, jugador2;

	public Partida (Jugador jugador1, Jugador jugador2) {
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
	}
	
	public String jugar() {
		String res = jugador1.getMiOpcion().jugarContra(jugador2.getMiOpcion());
		if (res.equals("Empate"))
			return res;
		String nombreGanador = res.equals("Ganador") ? this.jugador1.getNombre() : this.jugador2.getNombre();
		String elemGanador = res.equals("Ganador") ? this.jugador1.getMiOpcion().getSoy() : this.jugador2.getMiOpcion().getSoy();
		String nombrePerdedor = res.equals("Ganador") ? this.jugador2.getNombre() : this.jugador1.getNombre();
		String elemPerdedor = res.equals("Ganador") ? this.jugador2.getMiOpcion().getSoy() : this.jugador1.getMiOpcion().getSoy();
		return "El jugador " + nombreGanador + ", con su elemento " + elemGanador + ", le gano al jugador " + nombrePerdedor + " que tenia el elemento " + elemPerdedor;
	}
}
