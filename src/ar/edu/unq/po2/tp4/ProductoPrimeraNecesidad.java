package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto{
	
	//Variables de Instancia
	private double descuento;
	
	//Constructor
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado, double descuento) {
		super(nombre, precio, esPrecioCuidado);
		this.descuento = descuento;
	}
	
	
	//Metodos
	//Getters and Setters
	@Override
	public double getPrecio() {
		return super.getPrecio() - super.getPrecio() * descuento;
	}

}
