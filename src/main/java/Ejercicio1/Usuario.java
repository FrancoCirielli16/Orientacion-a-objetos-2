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
		if (texto.length() < 1 || texto.length() < 280) {
			Tweet t = new Tweet(texto);
			this.tweets.add(t);
			return t;
		}
		return null;
	}
	
	public String getScreenName() {
		return screenName;
	}

	public ReTweet reTwittear(Elemento elemento) {
		 ReTweet reTweet = new ReTweet(elemento);
		 elemento.ReTwittear(reTweet);
		 this.tweets.add(reTweet);
		 return reTweet;
	}
	
	public List<Elemento> eliminarme() {
		List<Elemento> borrados = new ArrayList<Elemento>(this.tweets);
		this.tweets.forEach(t -> t.eliminarme());
		this.tweets.clear();
		return borrados;
	}
	
	public void eliminarReTweets(List<Elemento> e) {
		e.forEach(t -> this.tweets.remove(t));
		
	}
	
}

	
	

