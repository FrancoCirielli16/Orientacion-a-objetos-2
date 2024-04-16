package Ejercicio6b;

public abstract class Topografia {

	
	public abstract double calcularProporcionAgua();
	
	public double calcularProporcionTierra() {
		return 1 - this.calcularProporcionAgua();
	}
}
