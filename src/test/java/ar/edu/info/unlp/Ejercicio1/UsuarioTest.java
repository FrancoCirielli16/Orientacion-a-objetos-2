package ar.edu.info.unlp.Ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Ejercicio1.ReTweet;
import Ejercicio1.Tweet;
import Ejercicio1.Usuario;

public class UsuarioTest {
	Usuario user;
	String textoValido;
	String textoVacio;
	String textoLargo;
	Tweet tweet1;
	Tweet tweet2;
	Tweet tweet3;
	
	
	@BeforeEach
	void setUp() throws Exception {
		user = new Usuario("Franco");
		textoValido = "Tremendo dia de lluvia";
		textoVacio= "";
		textoLargo="waodwadkmawdwadowadpwakdawkdk92a290aakpopkpwadkopwakdopwakdwopakdopwakdopwakdp2kawpdkwaopdkwopadkwdwadwadawdawdwadwadawdadopakpwoakdwopadkwopakdwpaokdwopakdwpakdwpakdopwakdopwakdopwakwopkdopwakdopwakdpowakdopwafjawmdfamdkmwadwadkwopakdwopakdpapwdwadwadawdadwadawdwadadawdawdwadawdawdad";
		
	}
	
	 @Test
    public void testRealizarTweet() {
		tweet1 = user.twittear(textoValido);
		assertNotEquals(null, tweet1);
	    tweet2 = user.twittear(textoLargo);
	    assertEquals(null, tweet2);
	    tweet3 = user.twittear(textoVacio);
	    assertEquals(null, tweet3);
	}
	 
	 
	 @Test
	    public void testRealizarReTweet() {
			Tweet tweetOriginal = user.twittear(textoValido);
			ReTweet reTweet = user.reTwittear(tweetOriginal);
			assertNotEquals(null, reTweet);
			
			
		}
}
