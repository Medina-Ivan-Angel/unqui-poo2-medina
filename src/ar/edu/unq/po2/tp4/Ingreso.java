package ar.edu.unq.po2.tp4;

public class Ingreso {

	//Variables de instancia
	private String mes;
	private String concepto;
	private double montoPercibido;
	
	//Constructor
	public Ingreso(double monto) {
		this.montoPercibido = monto;
	}
		
	//Metodos
		
		
		
	//Getters and Setters
	public double getMontoImponible() {
		return this.getMontoPercibido();
	}
	
	public double getMontoPercibido() {
		return this.montoPercibido;
	}
}
