package Ejercicio2B_Ayudantes;

public abstract class Opcion {
		
	public Opcion() {
		
	}
	
	public abstract String jugasContraPapel();
	
	public abstract String jugasContraTijera();
	
	public abstract String jugasContraPiedra();
	
	public abstract String jugasContraSpock();

	public abstract String jugasContraLagarto();
	
	public abstract String jugar(Opcion o);

}
