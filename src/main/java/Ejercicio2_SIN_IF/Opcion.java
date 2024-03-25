package Ejercicio2_SIN_IF;

public abstract class Opcion {
	private String soy, miGanador, miPerdedor;
		
	public Opcion(String soy, String ganador, String perdedor) {
		this.soy = soy;
		this.miGanador = ganador;
		this.miPerdedor = perdedor; 
	}
	
	public String jugarContra(Opcion otroElemento) {
		if (this.getSoy().equals(otroElemento.getSoy()))
			return "Empate";
		if (this.getSoy().equals(otroElemento.getMiPerdedor()))
			return "Perdedor";
		return "Ganador";
	}
	
	public String getMiGanador() {
		return this.miGanador;
	}
	
	public String getMiPerdedor() {
		return this.miPerdedor;
	}
	
	public String getSoy() {
		return this.soy;
	}
}
