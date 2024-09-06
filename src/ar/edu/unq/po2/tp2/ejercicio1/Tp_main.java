package ar.edu.unq.po2.tp2.ejercicio1;

import java.time.LocalDate;

public class Tp_main {

	public static void main(String[] args) {
		
		/*	RESPUESTA EJERCICIO 2 C:
		 *  Al crear la clase "Contratado" no fue necesario modificar la 
		 *  clase "Empresa" dado que "Contratado" hereda de "Empleado",
		 *  por lo que un "Contratado" ES un "Empleado" y debido al 
		 *  polimorfismo este responde correctamente a los mensajes ya
		 *  definidos que envia la clase Empresa.
		 * 
		 * 
		 * */
		
		
		
		
		//Instanciamos la empresa
		Empresa empresa = new Empresa("Bimbo", "123456789");
		
		//Instanciamos los empleados (2 permanentes y 2 temporales)
		
		
		Empleado ep1 = new Permanente("Miguel", "Av.Falsa 123", "Casado",
									   LocalDate.of(1990, 5, 25), 1000,
									   5, 10);
		
		Empleado ep2 = new Permanente("Jose", "Av.Falsa 124", "Soltero",
				   					   LocalDate.of(1980, 5, 25), 2000,
				   					   1, 1);
		
		Empleado et1 = new Temporal("Lorena", "Av.Callisto 123", "Casado",
					   				 LocalDate.of(1970, 5, 25), 1000,
					   				 LocalDate.of(2024, 5, 25), 50);
		
		Empleado et2 = new Temporal("Mariela", "Av.Callisto 124", "Soltero",
				   					 LocalDate.of(1976, 5, 25), 500,
				   					 LocalDate.of(2024, 5, 25), 0);
		
		//Ej2 añadimos un empleado "Contratado"
		Empleado ec1 = new Contratado("Ivan", "Calle 23", "Casado",
				   					   LocalDate.of(1991, 5, 1), 1000,
				   					   5, "Cheque");
		
		
		//Añadimos los empleados a la empresa
		empresa.addEmpleado(ep1); // Permanente
		empresa.addEmpleado(ep2); // Permanente
		empresa.addEmpleado(et1); // Temporal
		empresa.addEmpleado(et2); // Temporal
		empresa.addEmpleado(ec1); // Contratado
		
		//Calculo total de sueldos netos:
		System.out.print("Total Sueldos Netos : " + empresa.totalSueldosNetos());
		System.out.println("\n\n\n");
		
		//Liquidacion de sueldo
		empresa.liquidarSueldos();
		
		//Chequeamos los cuatro recibos
		System.out.println("Empleado 1 : \n" + empresa.getRecibo(0).getDesgloce() + "\n") ;
		System.out.println("Empleado 2 : \n" + empresa.getRecibo(1).getDesgloce() + "\n") ;
		System.out.println("Empleado 3 : \n" + empresa.getRecibo(2).getDesgloce() + "\n") ;
		System.out.println("Empleado 4 : \n" + empresa.getRecibo(3).getDesgloce() + "\n") ;
		System.out.println("Empleado 5 : \n" + empresa.getRecibo(4).getDesgloce() + "\n") ;
	
	}

}
