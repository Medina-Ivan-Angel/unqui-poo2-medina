package ar.edu.unq.po2.tp4;

public class Producto {
	
	//Variables de instancia
	private String nombre;
	private double precio;
	private boolean esPrecioCuidado = false;
	
	//Constructor
	public Producto(String nombre, double precio, boolean esPrecioCuidado) {
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = esPrecioCuidado;
	}
	
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
		
	}
	
	
	//Metodos
	
	public boolean esPrecioCuidado(){
		return getEsPrecioCuidado();
	}
	
	public void aumentarPrecio(double aumento) {
		setPrecio(getPrecio() + aumento);
	}
	
	
	//Getters and Setters
	public boolean getEsPrecioCuidado() {
		return this.esPrecioCuidado;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public void setPrecio(double nuevoPrecio) {
		this.precio = nuevoPrecio;
	}

}
