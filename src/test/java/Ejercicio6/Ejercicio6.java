package Ejercicio6;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Ejercicio6.Mixta;
import Ejercicio6.Pura;

public class Ejercicio6 {
	private Pura agua;
	private Pura tierra;
	private Mixta mixta1;
	private Mixta mixta2;
	private Mixta mixta3;
	private Mixta mixta4;
	
	
	@BeforeEach
	public void setUp() {
		this.agua = Pura.PuraAgua();
		this.tierra = Pura.PuraTierra();
		this.mixta1 = new Mixta();
		this.mixta1.agregarTopografia(this.agua);
		this.mixta1.agregarTopografia(this.tierra);
		this.mixta1.agregarTopografia(this.tierra);
		this.mixta1.agregarTopografia(this.agua);
		this.mixta2 = new Mixta();
		this.mixta2.agregarTopografia(this.agua);
		this.mixta2.agregarTopografia(this.tierra);
		this.mixta2.agregarTopografia(this.tierra);
		this.mixta2.agregarTopografia(this.mixta1);
		this.mixta3 = new Mixta();
		this.mixta3.agregarTopografia(this.agua);
		this.mixta3.agregarTopografia(this.tierra);
		this.mixta3.agregarTopografia(this.mixta1);
		this.mixta3.agregarTopografia(this.mixta2);
		this.mixta4 = new Mixta();
		this.mixta4.agregarTopografia(this.tierra);
		this.mixta4.agregarTopografia(this.mixta1);
		this.mixta4.agregarTopografia(this.mixta2);
		this.mixta4.agregarTopografia(this.mixta3);
	}
	
	
	@Test
	public void proporcionTierra() {
		assertEquals(1,this.tierra.calcularProporcionTierra());
		assertEquals(0,this.agua.calcularProporcionTierra());
		assertEquals(0.5,this.mixta1.calcularProporcionTierra());
		assertEquals(0.625,this.mixta2.calcularProporcionTierra());
		assertEquals(0.53125,this.mixta3.calcularProporcionTierra());
		assertEquals(0.6640625,this.mixta4.calcularProporcionTierra());
	}
	
	
	@Test
	public void proporcionAgua() {
		assertEquals(0,this.tierra.calcularProporcionAgua());
		assertEquals(1,this.agua.calcularProporcionAgua());
		assertEquals(0.5,this.mixta1.calcularProporcionAgua());
		assertEquals(0.375,this.mixta2.calcularProporcionAgua());
		assertEquals(0.46875,this.mixta3.calcularProporcionAgua());
		assertEquals(0.3359375,this.mixta4.calcularProporcionAgua());
	}
	
}

