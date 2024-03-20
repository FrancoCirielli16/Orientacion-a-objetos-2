package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Twitter {
	
	private List<Usuario> usuarios;
	
	public Twitter() {
		this.usuarios = new ArrayList<Usuario>();
	}
	
	
	private boolean existeUsuario(String screenName) {
        return this.usuarios.stream().filter(u -> u.getScreenName().equals(screenName)).findAny().orElse(null) != null;
    }
	
	public Usuario darDeAltaUsuario(String screenName) {
		if (existeUsuario(screenName)) {
			return null;
		}
		Usuario u = new Usuario(screenName);
		this.usuarios.add(u);
		return u;
	}
		
	
	public boolean eliminarUsuario(Usuario u) {
		if (existeUsuario(u.getScreenName())) {
			u.eliminarme();
			return this.usuarios.remove(u);
			
		}
		return false;
	}
	
	public int cantidadUsuarios() {
		return this.usuarios.size();
	}
	
}
