package Ejercicio6;

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
	
	
	public boolean igual(Topografia t) {
		return t.igualMixta(this);
	}

	public boolean igualMixta(Mixta m) {
		return this.hijos.equals(m.getHijos());
	}
	
	public boolean igualPura(Topografia t){
		return false;
	}
	
	public List<Topografia> getHijos(){
		return this.hijos;
	}
}
