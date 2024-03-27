package Ejercicio2B_Ayudantes;

public class Partida {
	private Jugador jugador1, jugador2;

	public Partida (Jugador jugador1, Jugador jugador2) {
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
	}
	
	public void jugar() {
		System.out.println("Eleccion "+ jugador1.getNombre()+": "+jugador1.getMiOpcion().toString());
		System.out.println("Eleccion "+ jugador2.getNombre()+": "+jugador2.getMiOpcion().toString());
		System.out.println("Jugador "+this.jugador2.getNombre()+":"+this.jugador1.getMiOpcion().jugar(this.jugador2.getMiOpcion()));
	}
}
