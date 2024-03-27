package Ejercicio2B_Ayudantes;


public class Lagarto extends Opcion {

	
	public String jugasContraPapel() {
		return "Gana";
	}
	
	public String jugasContraSpock() {
		return "Gana";
	}
	
	public String jugasContraTijera() {
		return "Pierde";
	}
	
	public String jugasContraPiedra() {
		return "Pierde";
	}
	
	public String jugasContraLagarto() {
		return "Empata";
	}
	
	public String jugar(Opcion o) {
		return o.jugasContraLagarto();
	}

	public String toString() {
		return "Lagarto";
	}
	
}