package Ejercicio3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import biblioteca.Biblioteca;
import biblioteca.Socio;


public class BibliotecaTest {
	
	private Biblioteca biblioteca; 
	private Socio aryaStark; 
	private Socio tyronLannister; 
	
	
	@BeforeEach
	void setUp() throws Exception {
		biblioteca = new Biblioteca(); 
		aryaStark = new Socio("Arya Stark", "needle@stark.com", "5234-5"); 
		tyronLannister = new Socio("Tyron Lannister", "tyron@thelannisters.com", "2345-2"); 
		biblioteca.agregarSocio(aryaStark); 
		biblioteca.agregarSocio(tyronLannister);
	}
	
	@Test
	public void exportarSociosTest() {
		String separator = System.lineSeparator();
		String json = "["+separator
				+ "	{"+ separator
				+ "		\"nombre\": \"Arya Stark\"," + separator
				+ "		\"email\": \"needle@stark.com\"," + separator
				+ "		\"legajo\": \"5234-5\"" + separator
				+ "	},"+ separator
				+ "	{"+ separator
				+ "		\"nombre\": \"Tyron Lannister\"," + separator
				+ "		\"email\": \"tyron@thelannisters.com\","+ separator
				+ "		\"legajo\": \"2345-2\""+ separator
				+ "	}"+ separator
				+ "]";
		assertEquals(json, biblioteca.exportarSocios());
	}
}
