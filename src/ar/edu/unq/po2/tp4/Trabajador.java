package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {

	//Variables de instancia
	private List<Ingreso> ingresosAnuales = new ArrayList<Ingreso>();
	
	//Constructor
	
	
	//Metodos
	public void agregarIngreso(Ingreso nuevoIngreso) {
		this.ingresosAnuales.add(nuevoIngreso);
	}
	
	
	//Getters and Setters
	public double getTotalPercibido() {
		return this.ingresosAnuales.stream()
				   .mapToDouble(p -> p.getMontoPercibido())
				   .sum();
	}
	
	public double getMontoImponible() {
		return this.ingresosAnuales.stream()
				   .mapToDouble(p -> p.getMontoImponible())
				   .sum();
	}
	
	public double getImpuestoAPagar() {
		return this.getMontoImponible() * 0.02;
	}
	
	
}
