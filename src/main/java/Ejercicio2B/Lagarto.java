package Ejercicio2B;

public class Lagarto extends Opcion {
	
	public Lagarto() {
		super("Lagarto");
	}
	
	public int comparar(Opcion otraOpcion) {
        if ((otraOpcion instanceof Papel)||(otraOpcion instanceof Spock)) return 1;
        if ((otraOpcion instanceof Piedra)||(otraOpcion instanceof Tijera)) return -1;
        return 0; // Empate
    }
}
	