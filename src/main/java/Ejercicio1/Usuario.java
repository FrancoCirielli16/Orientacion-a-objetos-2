package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String screenName;
	public List<Elemento> tweets;
	
	
	public Usuario(String screenName){
		this.screenName = screenName;
		this.tweets = new ArrayList<Elemento>();
	}
	
	public Tweet twittear(String texto) {
		Tweet t = new Tweet(texto);
		this.tweets.add(t);
		return t;
	}
	
	public ReTweet reTwittear(Elemento elemento) {
		 ReTweet reTweet = new ReTweet(elemento);
		 elemento.ReTwittear(reTweet);
		 this.tweets.add(reTweet);
		 return reTweet;
	}
	
	public void eliminarme() {
		this.tweets.forEach(t -> t.eliminarme());
		this.tweets.clear();
	}

	
	
	
}
