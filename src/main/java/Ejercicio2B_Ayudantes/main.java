package Ejercicio2B_Ayudantes;

public class main {
	public static void main(String[] args) {
		Jugador jugador1, jugador2, jugador3,jugador4,jugador5;
		jugador1 = new Jugador("Fran", new Piedra());
		jugador2 = new Jugador("Juan", new Papel());
		jugador3 = new Jugador("Felipe", new Tijera());
		jugador4 = new Jugador("Franco", new Spock());
		jugador5 = new Jugador("Lautaro", new Lagarto());
		Partida p1 = new Partida(jugador1, jugador2);
		Partida p2 = new Partida(jugador1, jugador1);
		Partida p3 = new Partida(jugador1, jugador3);
		Partida p4 = new Partida(jugador2, jugador3);
		Partida p5 = new Partida(jugador3, jugador3);
		Partida p6 = new Partida(jugador2, jugador1);
		Partida p7 = new Partida(jugador4, jugador4);
		Partida p8 = new Partida(jugador4, jugador5);
		Partida p9 = new Partida(jugador5, jugador1);
		Partida p10 = new Partida(jugador4, jugador2);
		p1.jugar();
		p2.jugar();
		p3.jugar();
		p4.jugar();
		p5.jugar();
		p6.jugar();
		p7.jugar();
		p8.jugar();
		p9.jugar();
		p10.jugar();
	}
}