package Ejercicio1;

import java.util.List;

public class ReTweet extends Elemento{
	
	private Elemento origen;
	
	
	public ReTweet(Elemento origen) {
		this.origen = origen;
		// super();
		// this.origen.ReTwittear(this);
	}
	
	
	
	@Override
	public String toString() {
		return "ReTweet [origen=" + origen.toString() + "]";
	}

	
	
	

}
