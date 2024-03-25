package Ejercicio2B;

public class Papel extends Opcion {
    
	
	
	public Papel() {
        super("Papel");
    }
	
	
	public int comparar(Opcion otraOpcion) {
        if ((otraOpcion instanceof Piedra)||(otraOpcion instanceof Spock)) return 1;
        if ((otraOpcion instanceof Lagarto)||(otraOpcion instanceof Tijera)) return -1;
        return 0; // Empate
    }
}