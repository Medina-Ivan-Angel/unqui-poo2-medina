package ar.edu.unq.po2.tp2.ejercicio1;

import java.time.LocalDate;

public class Temporal extends Empleado {
	
	//Atributos
	private LocalDate fechaFinDesignacion;
	private int       horasExtra;
	
	//Constructor
	public Temporal(String nombre, String direccion, String estadoCivil,
				    LocalDate fechaNacimiento, double sueldoBasico,
				    LocalDate fechaFinDesignacion, int horasExtra) {
		
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		this.fechaFinDesignacion = fechaFinDesignacion;
		this.horasExtra       = horasExtra;
		
	}

	//Metodos
	@Override
	public double sueldoNeto() {
		//Sueldo Bruto - retenciones
		return this.sueldoBruto() - this.retenciones();
	}
	
	@Override
	public double sueldoBruto() {
		return this.getSueldoBasico() + this.horasExtra();
	}
	
	public double horasExtra() {
		return this.getHorasExtra() * 40;
	}
	
	@Override
	public double retenciones() {
		return this.obraSocial() + this.aportes();
	}

	@Override
	public double obraSocial() {
		// Obra Social: 10% de su sueldo bruto + $25 si supera los 50 años 
		return this.getSueldoBasico() * 0.10 + this.bonoPorEdad();
	}
	
	public double bonoPorEdad() {
		if(this.edad() > 50) {
			return 25;
		}else {
			return 0;
		}
	}
	
	@Override
	public double aportes() {
		//Aportes Jubilatorios: 10% de su sueldo bruto + $5 por cada hora extra.
		return this.getSueldoBasico() * 0.10 + this.getHorasExtra() * 5;
	}
	
	@Override
	public String desgloce() {
		return "-- Sueldo Basico : $"        + this.getSueldoBasico() + "\n" +
			   "Horas Extras : "             + this.getHorasExtra()   + " hs.\n" +	
			   "Bonus Horas Extras : $"      + this.horasExtra()      + "\n" +
			   "-- Sueldo Bruto : $"         + this.sueldoBruto() 	  + "\n" +
	           "---RETENCIONES---\n"         +
			   "Obra Social : $"             + this.obraSocial()      + "\n" +
	           "Aportes Jubilatorios : $"    + this.aportes()         + "\n" +
	           "-- Sueldo Neto : $"          + this.sueldoNeto() 	  + "\n" ;
	}
	
	// Getters and Setters
	public double getHorasExtra() {
		return this.horasExtra;
	}
	
	public void setHorasExtra(int horasExtra) {
		this.horasExtra = horasExtra;
	}
}
