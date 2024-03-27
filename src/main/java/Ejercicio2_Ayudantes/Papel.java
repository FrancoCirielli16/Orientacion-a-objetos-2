package Ejercicio2_Ayudantes;

public class Papel extends Opcion {
    
	
	
	public String jugasContraPapel() {
		return "Empata";
	}
	
	public String jugasContraTijera() {
		return "Pierde";
	}
	
	public String  jugasContraPiedra() {
		return "Gana";
	}
	
	public String jugar(Opcion o) {
		return o.jugasContraPapel();
	}
	
	public String toString() {
		return "Papel";
	}
	
}