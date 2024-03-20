package Ejercicio1;



public class ReTweet implements Elemento{
	
	private Elemento origen;
	
	
	public ReTweet(Elemento origen) {
		this.origen = origen;
		// super();
		// this.origen.ReTwittear(this);
	}
	
	public String getContenido() {
		if(this.origen == null) {
			return "La publicacion ya no existe";
		}
		return "ReTweet ->" + this.origen.getContenido();
	}
	

	public void eliminarme() {
		this.origen = null;
	}
	
	

}
