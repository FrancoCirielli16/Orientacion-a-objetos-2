package Ejercicio7;

import Ejercicio7.*;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio7Test {
	private Archivo ar1, ar2, ar3, ar4, ar5, ar6;
	private Directorio dir1, dir2, dir3, dir4, dir5, dir6,dir7,dir8;

	
	@BeforeEach
	public void setUp() {
		
		this.ar1 = new Archivo("UML1.png",LocalDate.of(2023, 9, 17),996);
		this.ar2 = new Archivo("UML2.png",LocalDate.of(2023, 9, 20),1000);
		this.ar3 = new Archivo("Ejercicio1.java",LocalDate.of(2023, 9, 20),2400);
		this.ar4 = new Archivo("Ejercicio1Test.java",LocalDate.of(2023, 9, 17),2000);
		this.ar5 = new Archivo("Clase1.pdf",LocalDate.of(2023, 9, 17),800);
		this.ar6 = new Archivo("Clase2.pdf",LocalDate.of(2023, 9, 17),600);
		this.dir1 = new Directorio("Root",LocalDate.of(2023, 7, 24));
		this.dir2 = new Directorio("OO2",LocalDate.of(2023, 7, 29));
		this.dir3 = new Directorio("Teorias",LocalDate.of(2023, 8, 14));
		this.dir4 = new Directorio("Practicas",LocalDate.of(2023, 8, 24));
		this.dir5 = new Directorio("UML",LocalDate.of(2023, 9, 16));
		this.dir6 = new Directorio("Test",LocalDate.of(2023, 9, 21));
		this.dir7 = new Directorio("Carpeta Vacia",LocalDate.of(2023, 8, 14));
		this.dir8 = new Directorio("Books",LocalDate.of(2023, 8, 14));
		dir1.agregar(dir2);
		dir2.agregar(dir3);
		dir2.agregar(dir4);
		dir3.agregar(ar5);
		dir3.agregar(ar6);
		dir4.agregar(dir5);
		dir4.agregar(dir6);
		dir4.agregar(ar3);
		dir5.agregar(ar1);
		dir5.agregar(ar2);
		dir6.agregar(ar4);
		dir3.agregar(dir8);
		dir3.agregar(dir8);
		dir3.agregar(dir7);
		dir7.agregar(dir8);
	}
	
	@Test
	public void testTamanoTotalOcupado() {
		assertEquals(996, this.ar1.tamanoTotalOcupado());
		assertEquals(1000, this.ar2.tamanoTotalOcupado());
		assertEquals(2400, this.ar3.tamanoTotalOcupado());
		assertEquals(2000, this.ar4.tamanoTotalOcupado());
		assertEquals(800, this.ar5.tamanoTotalOcupado());
		assertEquals(600, this.ar6.tamanoTotalOcupado());
		assertEquals(7988, this.dir1.tamanoTotalOcupado());
		assertEquals(7956, this.dir2.tamanoTotalOcupado());
		assertEquals(1432, this.dir3.tamanoTotalOcupado());
		assertEquals(2432, this.dir4.tamanoTotalOcupado());
		assertEquals(996, this.dir5.tamanoTotalOcupado());
		assertEquals(996, this.dir6.tamanoTotalOcupado());
	}

	@Test
	public void testArchivoMasGrande() {
		assertEquals(this.ar3, this.dir1.archivoMasGrande());
		assertEquals(this.ar5, this.dir3.archivoMasGrande());
		assertEquals(this.ar3, this.dir4.archivoMasGrande());
		assertEquals(this.ar2, this.dir5.archivoMasGrande());
		assertEquals(this.ar4, this.dir6.archivoMasGrande());
	}
	
	@Test
	public void testBuscar() {
		assertEquals(this.dir5, this.dir1.buscar("UML"));
		assertEquals(this.ar3, this.dir4.buscar("Ejercicio1.java"));
		assertEquals(this.ar6, this.dir3.buscar("Clase2.pdf"));
		assertNull(this.dir6.buscar("UML"));
		assertNull(this.dir3.buscar("Ejercicio1.java"));
	}
	
	@Test
	public void buscarTodos() {
		assertEquals(Arrays.asList(this.dir8,this.dir8,this.dir8), this.dir2.buscarTodos("Books"));
		assertEquals(3, this.dir2.buscarTodos("Books").size());
		assertEquals(0, this.dir5.buscarTodos("None").size());
	}
	
	
	@Test
	public void listarContenido() {
		assertEquals("/UML2.png", this.ar2.listadoDeContenido());
		assertEquals(
				"/Practicas\n/Practicas/UML\n/Practicas/UML/UML1.png\n/Practicas/UML/UML2.png\n/Practicas/Test\n/Practicas/Test/Ejercicio1Test.java\n/Practicas/Ejercicio1.java",
				this.dir4.listadoDeContenido());
		assertEquals("/OO2\n/OO2/Teorias\n/OO2/Teorias/Clase1.pdf\n/OO2/Teorias/Clase2.pdf\n/OO2/Teorias/Books\n/OO2/Teorias/Books\n/OO2/Teorias/Carpeta Vacia\n/OO2/Teorias/Carpeta Vacia/Books\n/OO2/Practicas\n/OO2/Practicas/UML\n/OO2/Practicas/UML/UML1.png\n/OO2/Practicas/UML/UML2.png\n/OO2/Practicas/Test\n/OO2/Practicas/Test/Ejercicio1Test.java\n/OO2/Practicas/Ejercicio1.java",
				this.dir2.listadoDeContenido());
		
	}
	
}
