package Ejercicio2B_Ayudantes;


public class Spock extends Opcion {
	
	public String jugasContraPapel() {
		return "Pierde";
	}
	
	public String jugasContraSpock() {
		return "Empata";
	}
	
	public String jugasContraTijera() {
		return "Gana";
	}
	
	public String jugasContraPiedra() {
		return "Gana";
	}
	
	public String jugasContraLagarto() {
		return "Pierde";
	}
	
	public String jugar(Opcion o) {
		return o.jugasContraSpock();
	}

	public String toString() {
		return "Spock";
	}
}
