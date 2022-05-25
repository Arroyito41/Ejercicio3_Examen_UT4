import java.util.*;

public class Principal {

	/**
	 * Metodo principal de la clase
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		String[] array = { "ANA", "LUIS", "ANTONIO", "MANUEL" };
		numeroVocales(array);
	}

	/**
	 * Método para realizar la funcionalidad
	 * 
	 * @param array
	 */
	public static void numeroVocales(String[] array) {

		int contadorA = 0;
		int contadorE = 0;
		int contadorI = 0;
		int contadorO = 0;
		int contadorU = 0;

		for (int i = 0; i < array.length; i++) {
			
				if (arraycharAt(i) == 'A') {
					contadorA++;
				}
				if (arraycharAt(i) == 'E') {
					contadorE++;
				}
				if (arraycharAt(i) == 'I') {
					contadorI++;
				}
				if (arraycharAt(i) == 'O') {
					contadorO++;
				}
				if (arraycharAt(i) == 'U') {
					contadorU++;
				}
			}
		

		System.out.println("Numero de vocales a: " + contadorA);
		System.out.println("Numero de vocales e: " + contadorE);
		System.out.println("Numero de vocales i: " + contadorI);
		System.out.println("Numero de vocales o: " + contadorO);
		System.out.println("Numero de vocales u: " + contadorU);
	}

	private static char arraycharAt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
