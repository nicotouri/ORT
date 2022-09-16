package parcial;

import java.util.Scanner;

public class ParcialNicolasTourino {

	static final int TOPE_MAXIMO = 1000;
	static final int TOPE_MINIMO = 1;
	static final String MAYOR = "MA";
	static final String MENOR = "ME";
	static final String IGUAL = "IG";

	private final static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// Inicializacion de variables
		int contadorPuntos = 0;
		String respuesta = " ";
		char acerto = 'S';

		int numero = TOPE_MINIMO + (int) (Math.random() * (TOPE_MAXIMO - TOPE_MINIMO + 1));
		System.out.println("El numero actual es: " + numero);

		do {

			do {
				System.out.println("Como sera el proximo numero respecto a este? ([MA]yor, [ME]nor o [IG]ual).");
				respuesta = input.nextLine().toUpperCase();

			} while (!respuesta.equals(MENOR) && !respuesta.equals(IGUAL) && !respuesta.equals(MAYOR));

			int numeroNuevo = TOPE_MINIMO + (int) (Math.random() * (TOPE_MAXIMO - TOPE_MINIMO + 1));

			switch (respuesta) {

			case "ME":
				if (numeroNuevo < numero) {
					System.out.println("Acertaste!");
					System.out.println("El numero actual es :" + numeroNuevo);
					numero = numeroNuevo;
					contadorPuntos++;

				} else
					System.out.println("Perdiste. Acertaste durante: " + contadorPuntos + " rondas.");
				acerto = 'N';
				break;

			case "MA":
				if (numeroNuevo > numero) {
					System.out.println("Acertaste!");
					System.out.println("El numero actual es :" + numeroNuevo);
					numero = numeroNuevo;
					contadorPuntos++;

				} else
					System.out.println("Perdiste. Acertaste durante: " + contadorPuntos + " rondas.");
				acerto = 'N';

				break;

			case "IG":
				if (numeroNuevo == numero) {
					System.out.println("Acertaste!");
					System.out.println("El numero actual es :" + numeroNuevo);
					numero = numeroNuevo;
					contadorPuntos++;

				} else
					System.out.println("Perdiste. Acertaste durante: " + contadorPuntos + " rondas.");
				acerto = 'N';
				break;

			default:
				break;
			}

			respuesta = " ";
			// No sé porque me esta pasando el flag a N, cuando en los if del case, si es
			// true no los pasa a false. Es como que procesa el true e igualmente luego
			// procesa el false..
			System.out.println(acerto);

		} while (acerto == 'N');

	}

}