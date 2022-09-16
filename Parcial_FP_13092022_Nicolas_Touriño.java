package fp.actividad3;

import java.util.Scanner;

public class Parcial13_9_22 {

	private final static Scanner input = new Scanner(System.in);
	static final int MIN = 1;
	static final int MAX = 10;

	public static void main(String[] args) {

		// Inicializacion de variables
		String jugador1 = " ", jugador2 = " ", ganador = "Ninguno.";
		int cantRondas = 0, intentoJugador1 = 0, intentoJugador2 = 0;

		do {
			System.out.println("Ingrese el nombre del jugador 1: ");
			jugador1 = input.nextLine().toUpperCase();
		} while (jugador1.isEmpty());

		do {
			System.out.println("Ingrese el nombre del jugador 2: ");
			jugador2 = input.nextLine().toUpperCase();
		} while (jugador2.isEmpty());

		// Cantidad rondas

		do {
			System.out.println("Ingrese la cantidad de rondas maximas:  ");
			cantRondas = Integer.parseInt(input.nextLine());
		} while (cantRondas <= 0);

		
		for (int i = 1; i <= cantRondas; i++) {
			int numero = MIN + (int) (Math.random() * (MAX - MIN + 1));


			System.out.println("");
			

				do {
					System.out.println("Jugador 1.");
					System.out.println("Ingrese su numero: ");
					intentoJugador1 = Integer.parseInt(input.nextLine());
				} while (intentoJugador1 < 1 || intentoJugador1 > 10);

				do {
					System.out.println("Jugador 2.");
					System.out.println("Ingrese su numero: ");
					intentoJugador2 = Integer.parseInt(input.nextLine());
				} while (intentoJugador2 < 1 || intentoJugador2 > 10);
				
				
				if (intentoJugador1 == numero) {
					ganador = jugador1;
					i = cantRondas;
				}

				if (intentoJugador2 == numero) {
					ganador = jugador2;
					i = cantRondas;
				}

				if (intentoJugador1 == numero && intentoJugador2 == numero) {
					ganador = "Empate";
					i = cantRondas;
				}
				
				System.out.println("EL NUMERO ERA: " + numero);
				System.out.println("El ganador es: " + ganador);
			
		}
		
	}

}
