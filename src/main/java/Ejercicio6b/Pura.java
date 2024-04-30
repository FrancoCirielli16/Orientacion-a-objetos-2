package Ejercicio6b;

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
	
	public static Pura PuraPantano() {
		return new Pura(0.7);
	}
	
	public double calcularProporcionAgua() {
		return this.proporcion;
	}

	@Override
	public boolean igual(Topografia t) {
		return t.igualPura(t);
	}

	@Override
	protected boolean igualMixta(Mixta m) {
		return false;
	}

	@Override
	protected boolean igualPura(Topografia t) {
		return this.calcularProporcionAgua() == t.calcularProporcionAgua();
	}
}
