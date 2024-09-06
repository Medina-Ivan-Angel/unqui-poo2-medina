package ar.edu.unq.po2.tp2.ejercicio1;

import java.time.LocalDate;

public class Recibo {
	
	//Atributos
	private String    nombreEmpleado;
	private String    direccion;
	private LocalDate fechaEmision;
	private double    sueldoBruto;
	private double    sueldoNeto;
	private String    desgloce;
	
	//Constructor
	public Recibo(String nombreEmpleado, String direccion,
			      double sueldoBruto, double sueldoNeto, String desgloce) {
		
		this.nombreEmpleado = nombreEmpleado;
		this.direccion      = direccion;
		this.sueldoBruto 	= sueldoBruto;
		this.sueldoNeto		= sueldoNeto;
		//La fecha del recibo es la actual (al momento de generar el recibo)
		this.fechaEmision   = LocalDate.now(); 
		
		this.setDesgloce(desgloce);
		
	}
	
	//Metodos
	
	
	//Getters and setters
	public String getDesgloce() {
		return this.desgloce;
	}
	
	public void setDesgloce(String desgloceEmpleado) {
		
		this.desgloce = "Desgloce de conceptos del empleado: " + this.nombreEmpleado + "\n"
						+ "Fecha de emision: " + this.fechaEmision + "\n" + 
						"-------------------- Resumen ----------------------\n" +
						desgloceEmpleado;
	}
	
	
	
	
	
	
	
}
