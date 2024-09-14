package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class MercadoCentral {
	
	//Variables de instancia
	private List<Caja> cajas     = new ArrayList<Caja>();
	private List<Producto> stock = new ArrayList<Producto>();
	
	//Constructor
	
	
	//Metodos
	
	public void quitarProducto(Producto producto) {
		this.stock.remove(producto); // La validacion de si existe el producto la hace la caja.
	}
	
	public void addProducto(Producto producto) {
		this.stock.add(producto);
	}
	
	public void addCaja(Caja caja) {
		this.cajas.add(caja);
	}
	
	
	public void abrirCajas() {
		this.cajas.stream().forEach(caja -> caja.operar());
	}
	
	//Getters and setters
	public List<Producto> getStock(){
		return this.stock;
	}
	
}
