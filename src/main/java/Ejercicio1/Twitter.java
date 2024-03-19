package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Twitter {
	
	private List<Usuario> usuarios;
	
	public Twitter() {
		this.usuarios = new ArrayList<Usuario>();
	}
	
	public Usuario darDeAltaUsuario(String screenName) {
		Usuario u = new Usuario(screenName);
		this.usuarios.add(u);
		return u;
	}
		
	
	public void eliminarUsuario(Usuario u) {
		u.eliminarme();
		this.usuarios.remove(u);
	}
	
	
	
}
