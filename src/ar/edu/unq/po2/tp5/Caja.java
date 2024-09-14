package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Caja {

		//Variables de instancia
		//private double costoTotal = 0;
		private MercadoCentral mercadoCentral;
		private List<Cliente> clientes = new ArrayList<Cliente>();
		
		//Constructor
		public Caja(MercadoCentral mercado) {
			this.mercadoCentral = mercado;
		}
		
		//Metodos
		private double registrarProducto(Producto producto) {
			
			double precio = 0;
			
			if(hayStockDe_En(producto, this.mercadoCentral)) {
				
				precio = producto.getPrecio();
				
				//Quitamos el producto del stock del mercado
				this.mercadoCentral.quitarProducto(producto);
				
			}else {
				//Si no hay stock el precio retornado es 0
				return 0;

			}
			
			return precio;
		}
		
		public boolean hayStockDe_En(Producto producto, MercadoCentral mercado) {
			return mercado.getStock().stream().anyMatch(p -> p.equals(producto));
		}
		
		
		
		
		public void operar() {
			//Les cobramos los productos a los clientes
			this.clientes.stream().forEach(cliente -> this.cobrarAlCliente(cliente));
			
			//Removemos los clientes atendidos
			this.clientes.clear();
		
		}
		
		private void cobrarAlCliente(Cliente cliente) {
			//Suma de todos los precios de los productos del cliente
			double costoTotal = cliente.getListaDeCompra().stream().mapToDouble(p -> this.registrarProducto(p)).sum(); 
			
			//Informamos al cliente 
			this.informarCliente(costoTotal, cliente);
			
		}
		
		
		private void informarCliente(double monto, Cliente cliente) {
			cliente.setMontoTotalAPagar(monto);
		}
		
		public void agregarCliente(Cliente cliente) {
			this.clientes.add(cliente);
		}
		
		
		//Getters and setters
		public List<Cliente> getClientes(){
			return this.clientes;
		}
}
