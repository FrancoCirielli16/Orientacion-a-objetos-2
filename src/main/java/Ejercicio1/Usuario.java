package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String screenName;
	private List<Elemento> elementos;
	
	
	public Usuario(String screenName){
		this.screenName = screenName;
		this.tweets = new ArrayList<Elemento>();
	}
	
	public Tweet twittear(String texto) {
		if (texto.length() < 1 || texto.length() < 280) {
			Tweet t = new Tweet(texto);
			this.elementos.add(t);
			return t;
		}
		return null;
	}
	
	public String getScreenName() {
		return screenName;
	}

	public ReTweet reTwittear(Elemento elemento) {
		 ReTweet reTweet = new ReTweet(elemento);
		//  elemento.ReTwittear(reTweet);
		 this.elementos.add(reTweet);
		 return reTweet;
	}
	
	public void eleminarme() {
		elementos.clear(); 
	}
	
}

	
	

