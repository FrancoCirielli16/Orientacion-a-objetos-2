package Ejercicio1;

import java.util.List;

public class Tweet extends Elemento {
	private String texto;
	

	
	public Tweet(String texto) {
		// super();
		this.texto = texto;
	}



	@Override
	public String toString() {
		return "Tweet [texto=" + texto + "]";
	}

	
	

}
