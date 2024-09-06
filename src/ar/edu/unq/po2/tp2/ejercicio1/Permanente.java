package ar.edu.unq.po2.tp2.ejercicio1;

import java.time.LocalDate;

public class Permanente extends Empleado {
	
	//Atributos
	private int cantidadHijos;
	private int antiguedad;  //Años de antiguedad
	
	//Constructor
	public Permanente(String nombre, String direccion, String estadoCivil,
					  LocalDate fechaNacimiento, double sueldoBasico,
					  int cantidadHijos, int antiguedad) {
					
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		this.cantidadHijos = cantidadHijos;
		this.antiguedad    = antiguedad;
	}

	//Metodos
	@Override
	public double sueldoNeto() {
		//Sueldo Bruto - retenciones
		return this.sueldoBruto() - this.retenciones();
	}
	
	@Override
	public double sueldoBruto() {
		return this.getSueldoBasico() 
			 + this.asignacionPorHijo()
			 + this.asignacionPorConyuge()
			 + this.antiguedad();
	}
	
	public double asignacionPorHijo() {
		return this.getCantidadHijos() * 150;
	}
	
	public double asignacionPorConyuge() {
		if(this.getEstadoCivil().equals("Casado")) {
			return 100;
		}else {
			return 0;
		}
	}
	
	public double antiguedad() {
		return this.getAntiguedad() * 50;
	}
	
	@Override
	public double retenciones() {
		return this.obraSocial() + this.aportes();
	}

	@Override
	public double obraSocial() {
		//Obra Social: 10% de su sueldo bruto + $20 por cada hijo.
		return this.getSueldoBasico()* 0.10 + this.getCantidadHijos() * 20;
	}

	@Override
	public double aportes() {
		// Aportes Jubilatorios: 15% de su sueldo bruto
		return this.getSueldoBasico() * 0.15;
	}
	
	
	@Override
	public String desgloce() {
		return "-- Sueldo Basico : $"      + this.getSueldoBasico()   + "\n" +
			   "---Salario Familiar--- \n" +
			   "Asignacion Por Hijo: $"    + this.asignacionPorHijo() 	 + "\n" +
			   "Asignacion Por Conyuge: $" + this.asignacionPorConyuge() + "\n" +
			   "Años de Antiguedad : "     + this.getAntiguedad()        + " Años.\n" +
			   "Bonus Antiguedad: $"       + this.antiguedad() 		     + "\n" +
			   "-- Sueldo Bruto : $"	   + this.sueldoBruto()			 + "\n" +
			   "---RETENCIONES--\n"		   +
			   "Obra Social: $" 		   + this.obraSocial() 			 + "\n" +
			   "Aportes Jubilatorios: $"   + this.aportes()    			 + "\n" +
			   "-- Sueldo Neto : $"		   + this.sueldoNeto()			 + "\n" ;
	}
	
	//Getters and Setters
	
	public int getCantidadHijos() {
		return cantidadHijos;
	}

	public void setCantidadHijos(int cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	
	
	
	
	
	
	
	
}
