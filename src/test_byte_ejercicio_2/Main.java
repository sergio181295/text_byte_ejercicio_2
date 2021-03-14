package test_byte_ejercicio_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("********* Programa para identificar palindormos **********");
		Scanner entrada = new Scanner(System.in);
		Ejercicio2 ejercicio2 = new Ejercicio2();

		while (true) {
			System.out.println("Ingrese una palabra:");
			String palabra = entrada.nextLine();

			if (ejercicio2.esPalindromo(palabra)) {
				System.out.println("La palabra: " + palabra + " SI es un palindromo.");
			} else {
				System.out.println("La palabra: " + palabra + " NO es un palindromo.");
			}
			System.out.println("**********************************************************");
		}

	}

}
