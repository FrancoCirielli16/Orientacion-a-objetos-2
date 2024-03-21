package Ejercicio2B;

public class Spock extends Opcion {
	
	
	public Spock() {
		super("Spock");
	}
	
	public int comparar(Opcion otraOpcion) {
        if (otraOpcion instanceof Piedra) return 1;
        if (otraOpcion instanceof Tijera) return 1;
        if (otraOpcion instanceof Papel) return -1;
        if (otraOpcion instanceof Lagarto) return -1;
        return 0; // Empate
    }
}
