package Ejerciccio4;

public abstract class Empleado {
	public abstract double getBasico();
	public abstract double getAdicional();
	
	public double sueldo() {
		return this.getBasico() + this.getAdicional() - this.getDescuento(); 
	}
	
	public double getDescuento() {
		return (this.getBasico() * 0.13) + (this.getAdicional() * 0.05); 
	}
	
}
