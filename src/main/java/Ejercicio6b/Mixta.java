package Ejercicio6b;

import java.util.ArrayList;
import java.util.List;

public class Mixta extends Topografia {
	private List<Topografia> hijos;
	
	public Mixta() {
		this.hijos = new ArrayList<Topografia>();
	}
	
	public double calcularProporcionAgua() {
		return hijos.stream().mapToDouble(t->t.calcularProporcionAgua()).sum() / 4;
	}
	
	public void agregarTopografia(Topografia t) {
		this.hijos.add(t);
	}
}
