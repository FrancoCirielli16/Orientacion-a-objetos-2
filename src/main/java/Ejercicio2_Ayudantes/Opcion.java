package Ejercicio2_Ayudantes;

public abstract class Opcion {
		
	public Opcion() {
		
	}
	
	public abstract String jugasContraPapel();
	
	public abstract String jugasContraTijera();
	
	public abstract String jugasContraPiedra();
	
	
	public abstract String jugar(Opcion o);

}
