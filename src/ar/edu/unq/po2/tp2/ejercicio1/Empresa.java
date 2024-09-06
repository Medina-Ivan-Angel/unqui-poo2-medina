package ar.edu.unq.po2.tp2.ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Empresa {

	//Atributos
	private String nombre;
	private String CUIT;
	
	//Planta de empleados
	List<Empleado> empleados = new ArrayList<Empleado>();
	//Recibos de sueldo
	List<Recibo> recibos	 = new ArrayList<Recibo>();
	
	//Constructor
	public Empresa(String nombre, String CUIT) {
		
		this.nombre = nombre;
		this.CUIT   = CUIT;
		
	}
	
	//Metodos
	public double totalSueldosNetos() {
		return this.empleados.stream()
				   .mapToDouble(Empleado::sueldoNeto) //array de valores double (sueldos netos)
				   .sum() ;//sumar los valores del array
	}
	
	public double totalSueldosBrutos() {
		return this.empleados.stream()
				   .mapToDouble(Empleado::getSueldoBasico) // array de valores double (sueldos brutos)
				   .sum(); // sumar los valores del array
	}
	
	public double totalRetenciones() {
		return this.empleados.stream()
				.mapToDouble(Empleado::retenciones) // array de valores double (retenciones)
				.sum(); // sumar los valores del array
	}
	
	//Agregar un nuevo empleado a la empresa
	public void addEmpleado(Empleado nuevoEmpleado) {

		this.empleados.add(nuevoEmpleado);
		
	}
	
	public void liquidarSueldos() {
		
		this.recibos.addAll(this.empleados.stream()
				                .map(Empleado :: reciboHaberes) // mapeamos empleado a recibo
				                .collect(Collectors.toList())); // hacemos una lista de recibos para añadirla a "recibos"
		
		
	}
	
	
	
	
	//Getters and Setters
	public Recibo getRecibo(int indice) {
		return recibos.get(indice);
	}
	
	
	
	
	
}
