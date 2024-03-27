package Ejercicio2_Ayudantes;




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
	
	
	
	public String jugar(Opcion o) {
		return o.jugasContraTijera();
	}

	public String toString() {
		return "Tijera";
	}
	
}
