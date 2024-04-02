package Ejerciccio4;

public class Temporario extends Empleado {
	private boolean casado; 
	private int horas, hijos; 
	
	
	public Temporario(boolean casado, int hijos, int horas) {
		super();
		this.casado = casado;
		this.horas = horas;
		this.hijos = hijos;
	}

	@Override
	public double getBasico() { 
		return 20000 + (horas * 300);
	}
	
	@Override
	public double getAdicional() {
		double montoDeHijos = hijos * 2000; 
		return casado ? (5000 + montoDeHijos) : montoDeHijos ;
	}
}