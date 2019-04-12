package amcoca.topic8.multidimensional.arrays.exercise2;

import java.util.Arrays;

public class Principal {
	public static void main(String[] args) {
		String[][] palabras = new String[3][3];

		// fila 0
		palabras[0][0] = "a1";
		palabras[0][1] = "a2";
		palabras[0][2] = "a3";

		// fila 1
		palabras[1][0] = "a4";
		palabras[1][1] = "a5";
		palabras[1][2] = "a6";

		// fila 2
		palabras[2][0] = "a7";
		palabras[2][1] = "a8";
		palabras[2][2] = "a9";

		for (String[] fila : palabras) {
			System.out.print(Arrays.toString(fila));
			System.out.println();
		}
	}
}
