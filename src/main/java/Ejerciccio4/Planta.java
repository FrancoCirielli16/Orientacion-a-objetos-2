package Ejerciccio4;

public class Planta extends Empleado {
	private boolean casado; 
	private int hijos, antiguedad; 

	
	public Planta(boolean casado, int hijos, int antiguedad) {
		super();
		this.casado = casado;
		this.hijos = hijos;
		this.antiguedad = antiguedad;
	}

	@Override
	public double getBasico() {
		return 50000;
	}
	
	@Override
	public double getAdicional() {
		double montoDeHijos = hijos * 2000; 
		double montoAntiguedad = antiguedad * 2000; 
		return casado ? (5000 + montoDeHijos + montoAntiguedad ) : montoDeHijos  + montoAntiguedad ;
	}
}
