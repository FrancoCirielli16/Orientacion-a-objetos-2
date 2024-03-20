package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String screenName;
	private List<Elemento> tweets;
	
	
	public Usuario(String screenName){
		this.screenName = screenName;
		this.tweets = new ArrayList<Elemento>();
	}
	
	public Tweet twittear(String texto) {
		if (texto.length() < 1 || texto.length() > 280) 
			return null;
		Tweet t = new Tweet(texto);
		this.tweets.add(t);
		return t;
	}
	
	public String getScreenName() {
		return screenName;
	}

	public ReTweet reTwittear(Elemento elemento) {
		 ReTweet reTweet = new ReTweet(elemento);
		 this.tweets.add(reTweet);
		 return reTweet;
	}
	
	public void eliminarme() {
		this.tweets.forEach(t -> t.eliminarme());
		this.tweets.clear(); 
	}
	
	
	public int cantidadTweets() {
		return this.tweets.size();
	}
	
	public String verPublicacion(){
		String txt = "Publicaciones: ";
		for(int i=0; i<this.cantidadTweets(); i++) {
			 txt += this.tweets.get(i).getContenido() + "\n";
		}
		return txt;
	}
}

	
	

