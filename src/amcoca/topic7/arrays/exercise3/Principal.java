package amcoca.topic7.arrays.exercise3;

import java.util.Arrays;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] numeros = new int[5];

		numeros[0] = 45;
		numeros[1] = 56;
		numeros[2] = 76;
		numeros[3] = 10;
		numeros[4] = 35;

		for (int i : numeros) {
			System.out.print(i + ",");
		}

		System.out.println();

		Arrays.sort(numeros);

		for (int i : numeros) {
			System.out.print(i + ",");
		}
		System.out.println();

		String[] cadenas = new String[5];

		cadenas[0] = "ggg";
		cadenas[1] = "aaa";
		cadenas[2] = "ccc";
		cadenas[3] = "eee";
		cadenas[4] = "fff";

		for (String i : cadenas) {
			System.out.print(i + ",");
		}

		System.out.println();

		Arrays.sort(cadenas);

		for (String i : cadenas) {
			System.out.print(i + ",");
		}
		System.out.println();

		int posicion = Arrays.binarySearch(cadenas, "eee");

		if (posicion != -1) {
			System.out.println("Existe el elemento eee, een la posicion: "
					+ posicion);
		} else {
			System.out.println("no existe eee");
		}

	}

}
