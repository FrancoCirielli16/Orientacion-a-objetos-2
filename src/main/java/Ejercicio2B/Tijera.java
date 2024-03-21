package Ejercicio2B;




public class Tijera extends Opcion {
    
	
	
	public Tijera() {
        super("Tijera");
    }
	
	public int comparar(Opcion otraOpcion) {
        if (otraOpcion instanceof Papel) return 1;
        if (otraOpcion instanceof Lagarto) return 1;
        if (otraOpcion instanceof Piedra) return -1;
        if (otraOpcion instanceof Spock) return -1;
        return 0; // Empate
    }
}
