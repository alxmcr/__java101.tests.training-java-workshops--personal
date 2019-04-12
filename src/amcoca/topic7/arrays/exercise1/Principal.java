package amcoca.topic7.arrays.exercise1;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		int longitud = 2;

		Persona persona1 = new Persona("Maria", "Perez", "Flores",
				"Av. Gonzales #123", "123456 L.P.", 22312121, false);
		Persona persona2 = new Persona();

		Persona[] personas = new Persona[longitud];

		personas[0] = persona1;
		personas[1] = persona2;

		System.out.println("Mostrando Arreglo de personas");
//		for (Persona persona : personas) {
//			System.out.println(persona);
//		}
		System.out.println(Arrays.toString(personas));


	}
}
