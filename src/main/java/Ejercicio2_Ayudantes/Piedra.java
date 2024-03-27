package Ejercicio2_Ayudantes;

public class Piedra extends Opcion {
    
	
	public String jugasContraPapel() {
		return "Pierde";
	}
	
	public String jugasContraTijera() {
		return "Gana";
	}
	
	public String jugasContraPiedra() {
		return "Empata";
	}
	
	
	public String jugar(Opcion o) {
		return o.jugasContraPiedra();
	}
	
	public String toString() {
		return "Piedra";
	}
	
}
