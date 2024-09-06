package ar.edu.unq.po2.tp3;

public class Multiplo {

	public static void main(String[] args) {
		
		System.out.println(mulDe(7,786));
	}
	
	
	// Metodos
	public static int mulDe(int a, int b) {

		int limit = 1000;

		while (limit != -1) {

			// Si es multiplo de ambos numeros
			if ((limit % a == 0) && (limit % b == 0)) {

				return limit;

			} else {

				limit--;
			}

		}

		return limit;

	}

}
