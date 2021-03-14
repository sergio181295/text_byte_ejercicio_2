package test_byte_ejercicio_2;

public class Ejercicio2 {

	public boolean esPalindromo(String palabra) {
		String palabraInvertida = new StringBuilder(palabra).reverse().toString();
		return palabra.equalsIgnoreCase(palabraInvertida);
	}
}
