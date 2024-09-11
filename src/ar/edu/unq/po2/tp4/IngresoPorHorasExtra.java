package ar.edu.unq.po2.tp4;

public class IngresoPorHorasExtra extends Ingreso {
	
	//Variables de instancia
	private int cantidadHorasExtra;
	
	//Constructor
	public IngresoPorHorasExtra(double monto, int horas) {
		super(monto);
		this.cantidadHorasExtra = horas;
	}
		
	//Metodos
		
		
		
	//Getters and Setters
	@Override
	public double getMontoImponible() {
		return 0;
	}
}
