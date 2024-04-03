package Ejercicio4;

public class Pasante extends Empleado {
	private int examenes; 
	
	public Pasante(int examenes) {
		super();
		this.examenes = examenes;
	}

	@Override
	public double getBasico() {
		return 20000;
	}
	
	@Override
	public double getAdicional() {
		return (examenes * 2000);
	}
	
}
