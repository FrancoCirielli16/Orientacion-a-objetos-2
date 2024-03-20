package ar.edu.info.unlp.Ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Ejercicio1.Tweet;
import Ejercicio1.Twitter;
import Ejercicio1.Usuario;

public class TwitterTest {
	Twitter twitter;
	
	Usuario usuarioAEliminar;
	
	Tweet tweet;
	
	
	@BeforeEach
	void setUp() throws Exception {
		twitter = new Twitter();
		usuarioAEliminar = twitter.darDeAltaUsuario("Franco");
		usuarioAEliminar.twittear("Hola");
		usuarioAEliminar.twittear("Buenas");
		usuarioAEliminar.twittear("Jajaja");
	}
	
    @Test
    public void testCrearUsuario() {
    	assertEquals(1, twitter.cantidadUsuarios());
    }
    
    @Test
    public void testEliminarUsuario() {
        assertEquals(3, usuarioAEliminar.cantidadTweets());
        twitter.eliminarUsuario(usuarioAEliminar);
        assertEquals(0, usuarioAEliminar.cantidadTweets());
        assertEquals(0, twitter.cantidadUsuarios());
    }
	
}
