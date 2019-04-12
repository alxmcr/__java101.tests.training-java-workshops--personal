package amcoca.topic3.poo.exercise3;

import java.util.Scanner;

public class MainScanner {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);

		System.out.println("Leer un numero...");
		int numero = Integer.parseInt(leer.nextLine());
		System.out.println("el # ingresado -> " + numero);

		leer.close();
	}
}
