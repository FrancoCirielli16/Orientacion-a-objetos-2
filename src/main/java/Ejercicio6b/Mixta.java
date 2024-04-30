package Ejercicio6b;

import java.util.ArrayList;
import java.util.List;

import Ejercicio6b.Topografia;

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
	
	public List<Topografia> getHijos(){
		return this.hijos;
	}

	@Override
	public boolean igual(Topografia t) {
		return t.igualMixta(this);
	}

	@Override
	protected boolean igualMixta(Mixta m) {
		return this.hijos.equals(m.getHijos());
	}

	@Override
	protected boolean igualPura(Topografia t) {
		return false;
	}
}
