	package Ejercicio1;
	
	import java.util.ArrayList;
	import java.util.List;
	
	public abstract class Elemento {
		
		
		// private List<ReTweet> reTweets;
		
		
		// public Elemento() {
		// 	this.reTweets = new ArrayList<ReTweet>();
		// }
		
		public void eliminar() {}
	
		public void ReTwittear(ReTweet reTweet) {
			this.reTweets.add(reTweet);
		}
		
		public void eliminarme() {
			this.reTweets.forEach(rt -> rt.eliminarme());
			this.reTweets.clear();
			
		}
	
		
	
	}
