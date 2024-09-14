package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends Producto {

		//Variables de instancia
	
	
		//Constructor
		public ProductoCooperativa(double precio) {
			super(precio);
		}
		
		//Metodos
		
		
		//Getters and setters
		@Override
		public double getPrecio() {
			return super.getPrecio() * 0.9;
		}
}
