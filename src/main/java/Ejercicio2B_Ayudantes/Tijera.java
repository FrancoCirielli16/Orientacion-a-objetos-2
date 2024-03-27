package Ejercicio2B_Ayudantes;




public class Tijera extends Opcion {
    
	
	public String jugasContraPapel() {
		return "Gana";
	}
	
	public String jugasContraTijera() {
		return "Empata";
	}
	
	public String jugasContraPiedra() {
		return "Pierde";
	}
	
	public String  jugasContraSpock() {
		return "Pierde";
	}
	
	public String  jugasContraLagarto() {
		return "Gana";
	}
	
	public String jugar(Opcion o) {
		return o.jugasContraTijera();
	}
	
	

	public String toString() {
		return "Tijera";
	}
	
}
