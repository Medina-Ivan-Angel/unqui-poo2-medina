package ar.edu.unq.po2.tp2.ejercicio1;

import java.time.LocalDate;

public abstract class Empleado {
	
	//Atributos
	private String    nombre;
	private String    direccion;
	private String    estadoCivil;
	private LocalDate fechaNacimiento;
	private double    sueldoBasico;

	//Metodos
	public int edad() {
		//año actual - año de nacimiento
		return LocalDate.now().getYear() - fechaNacimiento.getYear();
		
	}
	
	//Constructor (A ser heredado por las subclases)
	public Empleado(String nombre, String direccion, String estadoCivil,
				    LocalDate fechaNacimiento, double sueldoBasico) {
		
		this.nombre          = nombre;
		this.direccion       = direccion;
		this.estadoCivil     = estadoCivil;
		this.fechaNacimiento = fechaNacimiento;
		this.sueldoBasico    = sueldoBasico;
		
	}
	
	//Metodos
	public Recibo reciboHaberes() {
		return new Recibo(
				this.getNombre(),
				this.getDireccion(),
				this.getSueldoBasico(),
				this.sueldoNeto(),
				this.desgloce());
	}
	
	//Metodos a ser definidos por las subclases
	public abstract double sueldoNeto();
	public abstract double sueldoBruto();
	public abstract double retenciones();
	public abstract double obraSocial();
	public abstract double aportes();
	public abstract String desgloce();
	
	
	//Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}
	
	public String getEstadoCivil() {
		return this.estadoCivil;
	}
	
	
	
}
