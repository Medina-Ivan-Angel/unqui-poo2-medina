package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {

	//Variables de instancia
	private String nombre;
	private String direccion;
	
	private List<Producto> productos = new ArrayList<Producto>();
	
	//Constructor
	public Supermercado(String nombre, String direccion) {
		this.nombre    = nombre;
		this.direccion = direccion;
	}
	
	
	//Metodos
	public void agregarProducto(Producto nuevoProducto) {
		this.productos.add(nuevoProducto);
	}

	
	public int getCantidadDeProductos() {
		return (int) this.productos.stream().count();
	}
	
	public double getPrecioTotal() {
		return this.productos.stream().mapToDouble(p -> p.getPrecio()).sum();
	}
	
	
	//Getters and Setters
	
	
	
}
