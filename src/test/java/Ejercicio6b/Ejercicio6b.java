package Ejercicio6b;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Ejercicio6b.Mixta;
import Ejercicio6b.Pura;

public class Ejercicio6b {
	private Pura agua;
	private Pura pantano;
	private Pura tierra;
	private Mixta mixta1;
	private Mixta mixta2;
	private Mixta mixta3;
	private Mixta mixta4;
	
	
	@BeforeEach
	public void setUp() {
		this.agua = Pura.PuraAgua();
		this.tierra = Pura.PuraTierra();
		this.pantano = Pura.PuraPantano();
		this.mixta1 = new Mixta();
		this.mixta1.agregarTopografia(this.agua);
		this.mixta1.agregarTopografia(this.tierra);
		this.mixta1.agregarTopografia(this.tierra);
		this.mixta1.agregarTopografia(this.pantano);
		this.mixta2 = new Mixta();
		this.mixta2.agregarTopografia(this.agua);
		this.mixta2.agregarTopografia(this.tierra);
		this.mixta2.agregarTopografia(this.pantano);
		this.mixta2.agregarTopografia(this.mixta1);
		this.mixta3 = new Mixta();
		this.mixta3.agregarTopografia(this.agua);
		this.mixta3.agregarTopografia(this.tierra);
		this.mixta3.agregarTopografia(this.mixta1);
		this.mixta3.agregarTopografia(this.mixta2);
		this.mixta4 = new Mixta();
		this.mixta4.agregarTopografia(this.pantano);
		this.mixta4.agregarTopografia(this.mixta1);
		this.mixta4.agregarTopografia(this.mixta2);
		this.mixta4.agregarTopografia(this.mixta3);
	}
	
	
	@Test
	public void proporcionTierra() {
		assertEquals(1,this.tierra.calcularProporcionTierra());
		assertEquals(0,this.agua.calcularProporcionTierra());
		assertEquals(0.575,this.mixta1.calcularProporcionTierra());
		assertEquals(0.46875,this.mixta2.calcularProporcionTierra());
		assertEquals(0.5109375,this.mixta3.calcularProporcionTierra());
		assertEquals(0.463671874999999965,this.mixta4.calcularProporcionTierra());
	}
	
	
	@Test
	public void proporcionAgua() {
		assertEquals(0,this.tierra.calcularProporcionAgua());
		assertEquals(1,this.agua.calcularProporcionAgua());
		assertEquals(0.425,this.mixta1.calcularProporcionAgua());
		assertEquals(0.53125,this.mixta2.calcularProporcionAgua());
		assertEquals(0.4890625,this.mixta3.calcularProporcionAgua());
		assertEquals(0.536328125,this.mixta4.calcularProporcionAgua());
	}
	
}

