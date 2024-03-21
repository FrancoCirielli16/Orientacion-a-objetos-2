package Ejercicio2B;

public class Jugador {
	private String nombre;
    private Opcion opcion;
    
    
    public Jugador(String nombre) {
        this.nombre = nombre;
    }
    
    public Jugador(String nombre,Opcion opcion) {
        this.nombre = nombre;
        this.opcion = opcion;
    }
    
    public void elegirOpcion(Opcion opcion) {
        this.opcion = opcion;
    }
    
	public String getNombre() {
		return nombre;
	}
	
	public Opcion getOpcion() {
		return opcion;
	}
	
	
    
    
}
