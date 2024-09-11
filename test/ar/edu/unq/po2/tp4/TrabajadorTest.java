package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTest {

	private Trabajador t1;
	private Ingreso ing1;
	private IngresoPorHorasExtra ex1;
	
	
	
	@BeforeEach
	public void setUp() {
		
		t1 = new Trabajador();
		
		ing1 = new Ingreso(100);
		
		ex1  = new IngresoPorHorasExtra(2000, 10);
		
		t1.agregarIngreso(ing1);
		t1.agregarIngreso(ex1);
	}
	
	
	
	
	@Test
	void test1() {
		assertEquals(2100, t1.getTotalPercibido());
	}
	
	@Test
	void test2() {
		assertEquals(100, t1.getMontoImponible());
	}
	
	@Test
	void test3() {
		assertEquals(2, t1.getImpuestoAPagar());
	}

}
