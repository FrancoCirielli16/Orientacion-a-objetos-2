package Ejercicio2_SIN_IF;

public class main {
	public static void main(String[] args) {
		Jugador jugador1, jugador2, jugador3;
		jugador1 = new Jugador("Fran", new Piedra());
		jugador2 = new Jugador("Juan", new Papel());
		jugador3 = new Jugador("Felipe", new Tijera());
		System.out.println(new Partida(jugador1, jugador2).jugar());
		System.out.println(new Partida(jugador1, jugador1).jugar());
		System.out.println(new Partida(jugador1, jugador3).jugar());
		System.out.println(new Partida(jugador2, jugador3).jugar());
		System.out.println(new Partida(jugador3, jugador3).jugar());
		System.out.println(new Partida(jugador2, jugador1).jugar());
	}
}