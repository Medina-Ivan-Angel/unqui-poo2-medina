import ar.edu.unq.po2.tp3.Counter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


class CounterTestCase {
	
	Counter counter = new Counter();
	
	@BeforeEach
	public void setUp() throws Exception {
		//Se crea el contador
		
		//Se agregan los numeros. Un solo par y nueve impares
		counter.add(1);
		counter.add(3);
		counter.add(5);
		counter.add(7);
		counter.add(9);
		counter.add(1);
		counter.add(1);
		counter.add(1);
		counter.add(1);
		counter.add(4);
	}
	
		@Test
		public void testSize() {
			long size = counter.getSize();
			assertEquals(10L, size);
		}
		
		/**
		* Verifica la cantidad de pares
		*/
		@Test
		public void testEvenNumbers() {
			// Getting the even occurrences
			long amount = counter.contarPares();
			// I check the amount is the expected one
			assertEquals(1,amount);
		}
		
		@Test
		public void testOddNumbers() {
			long amount = counter.contarImpares();
			assertEquals(9,amount);
		}
		
		@Test
		public void testMultiplosDe3() {
			long amount = counter.multiplosDe(3);
			assertEquals(2,amount);
		}
}
