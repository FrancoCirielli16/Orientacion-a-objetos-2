package Ejercicio2B_Ayudantes;

public class Jugador {
	private String nombre;
	private Opcion miOpcion;
	
	public Jugador(String nombre, Opcion miOpcion) {
		this.nombre = nombre;
		this.miOpcion = miOpcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Opcion getMiOpcion() {
		return miOpcion;
	}

	public void setMiOpcion(Opcion miOpcion) {
		this.miOpcion = miOpcion;
	}
	
    
    
}
