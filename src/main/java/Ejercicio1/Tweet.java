package Ejercicio1;



public class Tweet implements Elemento {
	private String texto;
	

	
	public Tweet(String texto) {
		// super();
		this.texto = texto;
	}


	public String getContenido() {
		if(this.texto == null) {
			return "la publicacion no existe";
		}
		return "Tweet -> "+this.texto;
	}
	
	

	public void eliminarme() {
		this.texto = null;
	}
	
	

}
