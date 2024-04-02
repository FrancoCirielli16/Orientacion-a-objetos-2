package Ejercicio3b;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import biblioteca.Biblioteca;
import biblioteca.Socio;
import biblioteca.VoorheesExporterAdapter;

public class BibliotecaTest {
	
	private Biblioteca biblioteca; 
	private Socio aryaStark; 
	private Socio tyronLannister; 
	private VoorheesExporterAdapter adapterExporter; 
	private JSONParser parser; 
	
	@BeforeEach
	public void setup() throws Exception{
		biblioteca = new Biblioteca(); 
		aryaStark = new Socio("Arya Stark", "needle@stark.com", "5234-5"); 
		tyronLannister = new Socio("Tyron Lannister", "tyron@thelannisters.com", "2345-2"); 
		biblioteca.agregarSocio(aryaStark); 
		biblioteca.agregarSocio(tyronLannister);
		adapterExporter = new VoorheesExporterAdapter(); 
		parser = new JSONParser(); 
	}
	
	@Test
	public void exportarSociosTest() throws ParseException {
		String separator = System.lineSeparator();
		biblioteca.setExporter(adapterExporter);
		String json = "["+separator
				+ "	{"+ separator
				+ "		\"Nombre\": \"Arya Stark\"," + separator
				+ "		\"Email\": \"needle@stark.com\"," + separator
				+ "		\"Legajo\": \"5234-5\"" + separator
				+ "	},"+ separator
				+ "	{"+ separator
				+ "		\"Nombre\": \"Tyron Lannister\"," + separator
				+ "		\"Email\": \"tyron@thelannisters.com\","+ separator
				+ "		\"Legajo\": \"2345-2\""+ separator
				+ "	}"+ separator
				+ "]";
		assertEquals(parser.parse(json),  parser.parse(biblioteca.exportarSocios()));
	}
	
}