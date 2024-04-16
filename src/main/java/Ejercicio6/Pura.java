package Ejercicio6;

public class Pura extends Topografia{
	private double proporcion;
	
	public Pura(double p) {
		this.proporcion = p;
	}

	public static Pura PuraAgua() {
		return new Pura(1);
	}

	public static Pura PuraTierra() {
		return new Pura(0);
	}
	
	public double calcularProporcionAgua() {
		return this.proporcion;
	}
	
	public boolean igual(Topografia t){
		return t.igualPura(t);
	}
	
	public boolean igualMixta(Mixta m){
		return false;
	}
	
	public boolean igualPura(Topografia t){
		return this.calcularProporcionAgua() == t.calcularProporcionAgua();
	}
	
}
