package Ejercicio2;

public class Piedra extends Opcion {
    
	
	
	public Piedra() {
        super("Piedra");
    }
	
	
	public int comparar(Opcion otraOpcion) {
        if (otraOpcion instanceof Tijera) return 1;
        if (otraOpcion instanceof Papel) return -1;
        return 0; // Empate
    }
	
	
}
