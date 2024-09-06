package ar.edu.unq.po2.tp2.ejercicio1;

import java.time.LocalDate;

public class Contratado extends Empleado {

	//Atributos
	private int    numeroContrato;
	private String medioDePago;
	
	
	//Constructor
	public Contratado(String nombre, String direccion, String estadoCivil, LocalDate fechaNacimiento,
			double sueldoBasico, int numeroContrato, String medioDePago) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		
		this.numeroContrato = numeroContrato;
		this.medioDePago    = medioDePago;
	}
	
	
	

	//Metodos
	@Override
	public double sueldoNeto() {
		return this.sueldoBruto() - this.retenciones();
	}
   
	@Override
	public double sueldoBruto() {
		return this.getSueldoBasico();
	}

	@Override
	public double retenciones() {
		// Gastos Administrativos Contractuales
		return 50;
	}

	@Override
	public double obraSocial() {
		return 0;
	}

	@Override
	public double aportes() {
		return 0;
	}

	@Override
	public String desgloce() {

		return "Nro de Contrato : "         			  + this.getNumeroContrato() + "\n" +
			   "-- Sueldo Basico : $"         			  + this.getSueldoBasico()   + "\n" +
			   "-- Sueldo Bruto : $"           			  + this.sueldoBruto()       + "\n" +
			   "---RETENCIONES--\n"		                  +
			   "Obra Social : $"						  + this.obraSocial()	     + "\n" +
			   "Aportes Jubilatorios : $"				  + this.aportes()		     + "\n" +
			   "Gastos Administrativos Contractuales: "   + this.retenciones() 	     + "\n" +
			   "-- Sueldo Neto : $"           			  + this.sueldoNeto()        + "\n" +
			   "Medio de Pago: "           			      + this.getMedioDePago()    + "\n" ;
			   
	}
	
	//Getters and Setters
	public int getNumeroContrato() {
		return numeroContrato;
	}


	public String getMedioDePago() {
		return medioDePago;
	}

}
