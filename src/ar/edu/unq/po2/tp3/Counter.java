package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {

	//Atributos
	private List<Integer> numeros = new ArrayList<Integer>();
	
	/*
	 *  1. La cantidad de pares
		2. La cantidad de impares
		3. La cantidad de múltiplos de un cierto número.
	 * 
	 */
	
	//Metodos
	public long contarPares() {
		return numeros.stream().filter(n -> n % 2 == 0).count();
	}
	
	public long contarImpares() {
		return numeros.stream().filter(n -> n % 2 != 0).count();
	}
	
	public long multiplosDe(int multiplo) {
		return numeros.stream().filter(n -> n % multiplo == 0).count();
	}
	
	public void add(int n) {
		numeros.add(n);
	}
	
	
	//Getters and Setters
	public long getSize() {
		return numeros.stream().count();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
