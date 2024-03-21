package Ejercicio2;




public class Tijera extends Opcion {
    
	
	
	public Tijera() {
        super("Tijera");
    }
	
	public int comparar(Opcion otraOpcion) {
        if (otraOpcion instanceof Papel) return 1;
        if (otraOpcion instanceof Piedra) return -1;
        return 0; // Empate
    }
}
