package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

		//Variables de instancia
		private double montoTotalAPagar;
	    private List<Producto> listaDeCompra = new ArrayList<Producto>();
	    
		//Constructor
		
		
		//Metodos
		public void addProducto(Producto producto) {
			this.listaDeCompra.add(producto);
		}
		
		//Getters and setters
		public double getMontoTotalAPagar() {
			return this.montoTotalAPagar;
		}
		
		public void setMontoTotalAPagar(double nuevoMonto) {
			this.montoTotalAPagar = nuevoMonto;
		}
		
		public List<Producto> getListaDeCompra(){
			return this.listaDeCompra;
		}
}
