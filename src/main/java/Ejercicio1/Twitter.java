package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Twitter {
	
	private List<Usuario> usuarios;
	
	public Twitter() {
		this.usuarios = new ArrayList<Usuario>();
	}
	
	
	private boolean existeUsuario(String screenName) {
        for (int i = 0; i<this.usuarios.size(); i++) {
            return this.usuarios.get(i).getScreenName().equals(screenName);
        }
        return false;
    }
	
	public Usuario darDeAltaUsuario(String screenName) {
		if (existeUsuario(screenName)) {
			return null;
		}
		Usuario u = new Usuario(screenName);
		this.usuarios.add(u);
		return u;
	}
		
	
	public void eliminarUsuario(Usuario u) {
		List<Elemento> e = u.eliminarme();
		this.usuarios.remove(u);
		this.usuarios.forEach(us -> us.eliminarReTweets(e));
	}
	
	
	
}
