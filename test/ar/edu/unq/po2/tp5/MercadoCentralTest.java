package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MercadoCentralTest {

	private MercadoCentral mercado;
	private Caja caja1;
	private Caja caja2;
	
	private Cliente cliente1;
	private Cliente cliente2;
	private Cliente cliente3;

	
	private ProductoCooperativa arroz;     // 1
	private ProductoTradicional fideo;     // 2
	private ProductoTradicional atun;      // 3
	private ProductoTradicional cocacola;  // 4
	private ProductoTradicional sinStock;  // Este producto no debe estar en el mercado
	

	
	@BeforeEach
	void setUp() throws Exception {
		
		arroz 	 = new ProductoCooperativa(100);
		fideo 	 = new ProductoTradicional(100);
		atun  	 = new ProductoTradicional(50);
		cocacola = new ProductoTradicional(10);
		sinStock = new ProductoTradicional(1000);
		
		cliente1 = new Cliente();
		cliente2 = new Cliente();
		cliente3 = new Cliente();
		
		
		//140
		cliente1.addProducto(arroz);
		cliente1.addProducto(atun);
		cliente1.addProducto(sinStock);
		
		//120
		cliente2.addProducto(fideo);
		cliente2.addProducto(cocacola);
		cliente2.addProducto(cocacola);
		cliente2.addProducto(sinStock);
		
		//0
		cliente3.addProducto(arroz);
		cliente3.addProducto(arroz);
		cliente3.addProducto(arroz);
		cliente3.addProducto(arroz);
		cliente3.addProducto(arroz);
		cliente3.addProducto(arroz);
		cliente3.addProducto(arroz);
		
		mercado = new MercadoCentral();
		
		caja1 = new Caja(mercado);
		caja2 = new Caja(mercado);
		
		caja1.agregarCliente(cliente1);
		caja2.agregarCliente(cliente2);
		caja2.agregarCliente(cliente3);
		
		
		
		mercado.addCaja(caja1);
		mercado.addCaja(caja2);
		
		mercado.addProducto(arroz);
		mercado.addProducto(fideo);
		mercado.addProducto(fideo);
		mercado.addProducto(atun);
		mercado.addProducto(atun);
		mercado.addProducto(atun);
		mercado.addProducto(cocacola);
		mercado.addProducto(cocacola);
		mercado.addProducto(cocacola);
		mercado.addProducto(cocacola);
	}

	@Test
	void testCliente1() {
		
		mercado.abrirCajas();
		assertEquals(140, cliente1.getMontoTotalAPagar());
	}

	@Test
	void testCliente2() {
		
		mercado.abrirCajas();
		assertEquals(120, cliente2.getMontoTotalAPagar());
	}
	
	@Test
	void testCliente3() {
		
		mercado.abrirCajas();
		assertEquals(0, cliente3.getMontoTotalAPagar());
	}
}
