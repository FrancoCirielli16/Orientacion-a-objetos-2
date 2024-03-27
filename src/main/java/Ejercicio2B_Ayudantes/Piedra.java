package Ejercicio2B_Ayudantes;

public class Piedra extends Opcion {
    
	
	public String jugasContraPapel() {
		return "Pierdes";
	}
	
	public String jugasContraTijera() {
		return "Gana";
	}
	
	public String jugasContraPiedra() {
		return "Empata";
	}
	
	public String jugasContraSpock() {
		return "Pierde";
	}
	
	public String jugasContraLagarto() {
		return "Gana";
	}
	
	public String jugar(Opcion o) {
		return o.jugasContraPiedra();
	}
	
	public String toString() {
		return "Piedra";
	}
	
}
