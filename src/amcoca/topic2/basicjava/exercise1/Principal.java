package amcoca.topic2.basicjava.exercise1;

import java.util.Scanner;

/**
 * Practica Java-Basico
 * 
 * @author Alejandro M. Coca Rojas
 * 
 */
public class Principal {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		menuOpciones();
	}

	/**
	 * 
	 */
	private static void menuOpciones() {

		Scanner leer = new Scanner(System.in);

		int nroOpcion = 0;

		do {
			desplegarMenu();

			System.out.print("Elija una opcion:");
			nroOpcion = Integer.parseInt(leer.nextLine());

			switch (nroOpcion) {
			case 1:
				ejercicio1(leer);
				break;
			case 2:
				ejercicio2(leer);
				break;
			case 3:
				ejercicio3(leer);
				break;
			case 4:
				ejercicio4(leer);
				break;
			case 5:
				ejercicio5(leer);
				break;
			case 6:
				ejercicio6(leer);
				break;
			case 7:
				ejercicio7(leer);
				break;
			case 8:
				ejercicio8(leer);
				break;
			case 9:
				ejercicio9(leer);
				break;
			case 10:
				ejercicio10(leer);
				break;
			case 11:
				System.out.println("Gracias¡¡¡ Hasta otra oportunidad");
				System.out.println("Termino exitosamente");
				break;

			default:
				System.out.println("No es una opcion valida.");
				break;
			}

		} while (nroOpcion != 11);

	}

	/**
	 * 
	 * @param leer
	 */
	private static void ejercicio10(Scanner leer) {
		System.out.println("---------- EJERCICIO 10 -------------");
		System.out.print("Ingrese el A: ");
		int a = Integer.parseInt(leer.nextLine());
		System.out.print("Ingrese el B: ");
		int b = Integer.parseInt(leer.nextLine());
		System.out.println("Nros. Comprendidos entre [" + a + " - " + b + "]");

		if (a > b) {
			System.out.println(a + " es mayor que " + b);
		} else {
			for (int i = a; i <= b; i++) {
				System.out.print(i + ",");
			}
		}

	}

	/**
	 * 
	 * @param leer
	 */
	private static void ejercicio9(Scanner leer) {
		System.out.println("---------- EJERCICIO 9 -------------");
		System.out.print("Ingrese el #1: ");
		int n1 = Integer.parseInt(leer.nextLine());
		System.out.println("\t Tabla del " + n1);
		for (int i = 1; i <= 10; i++) {
			System.out.println(n1 + "x" + i + "=" + (n1 * i));
		}

	}

	/**
	 * 
	 * @param leer
	 */
	private static void ejercicio8(Scanner leer) {
		System.out.println("---------- EJERCICIO 8 -------------");
		System.out.print("Ingrese el #1: ");
		int n1 = Integer.parseInt(leer.nextLine());

		if (n1 % 2 == 0) {
			System.out.println("Cubo: " + Math.pow(n1, 3));
		} else {
			System.out.println("Cuadrado: " + Math.pow(n1, 2));
		}

	}

	/**
	 * 
	 * @param leer
	 */
	private static void ejercicio7(Scanner leer) {
		System.out.println("---------- EJERCICIO 7 -------------");
		System.out.print("Ingrese una cadena: ");
		String cadena = leer.nextLine();
		StringBuffer cadenaSB = new StringBuffer(cadena);

		System.out.println("Mayusculas: " + cadena.toUpperCase());
		System.out.println("Invertida: " + cadenaSB.reverse());
	}

	/**
	 * 
	 * @param leer
	 */
	private static void ejercicio6(Scanner leer) {
		System.out.println("---------- EJERCICIO 6 -------------");
		System.out.print("Nota #1: ");
		int n1 = Integer.parseInt(leer.nextLine());
		System.out.print("Nota #2: ");
		int n2 = Integer.parseInt(leer.nextLine());
		System.out.print("Nota #3: ");
		int n3 = Integer.parseInt(leer.nextLine());
		System.out.print("Nota #4: ");
		int n4 = Integer.parseInt(leer.nextLine());
		System.out.print("Nota #5: ");
		int n5 = Integer.parseInt(leer.nextLine());

		int notaGlobal = n1 + n2 + n3 + n4 + n5;
		System.out.println("notaGlobal: " + notaGlobal);

		if (notaGlobal > 50) {
			System.out.println("Aprobado");
		} else {
			System.out.println("En suspenso...");
		}
	}

	/**
	 * 
	 * @param leer
	 */
	private static void ejercicio5(Scanner leer) {
		System.out.println("---------- EJERCICIO 5 -------------");
		System.out.print("Ingrese el #1: ");
		int n1 = Integer.parseInt(leer.nextLine());
		double cuadradoN1 = Math.pow(n1, 2);
		System.out.println("cuadradoN1: " + cuadradoN1);
		System.out.print("Ingrese el #2: ");
		int n2 = Integer.parseInt(leer.nextLine());
		double cuadradoN2 = Math.pow(n2, 2);
		System.out.println("cuadradoN2: " + cuadradoN2);
		System.out.println("Producto de Cuadrados: "
				+ (cuadradoN1 * cuadradoN2));
	}

	/**
	 * 
	 * @param leer
	 */
	private static void ejercicio4(Scanner leer) {
		System.out.println("---------- EJERCICIO 4 -------------");
		System.out.print("Ingrese el #1: ");
		int n1 = Integer.parseInt(leer.nextLine());
		System.out.print("Ingrese el #2: ");
		int n2 = Integer.parseInt(leer.nextLine());

		if (n1 > 100 && n2 > 100) {
			System.out.println("Media: " + ((n1 + n2) / 2));
		} else {
			System.out.println("Producto: " + (n1 * n2));
		}
	}

	/**
	 * 
	 * @param leer
	 */
	private static void ejercicio3(Scanner leer) {
		System.out.println("---------- EJERCICIO 3 -------------");
		System.out.print("Ingrese el #1: ");
		int n1 = Integer.parseInt(leer.nextLine());
		System.out.print("Ingrese el #2: ");
		int n2 = Integer.parseInt(leer.nextLine());

		System.out.println("Suma:" + n1 + "+" + n2 + "=" + (n1 + n2));
		System.out.println("Resta:" + n1 + "-" + n2 + "=" + (n1 - n2));
		System.out.println("Resta:" + n1 + "*" + n2 + "=" + (n1 * n2));
	}

	/**
	 * 
	 * @param leer
	 */
	private static void ejercicio2(Scanner leer) {
		System.out.println("---------- EJERCICIO 2 -------------");
		System.out.print("Ingrese el # de impares a mostrar: ");
		int n = Integer.parseInt(leer.nextLine());

		int i = 1, numero = 1;

		while (i <= n) {
			if (numero % 2 != 0) {
				System.out.print(numero + ", ");
				i++;
			}
			numero++;
		}
	}

	/**
	 * 
	 * @param leer
	 */
	private static void ejercicio1(Scanner leer) {
		System.out.println("---------- EJERCICIO 1 -------------");
		System.out.print("Ingrese el # de primos a mostrar: ");
		int n = Integer.parseInt(leer.nextLine());

		int i = 1, numero = 1;

		while (i <= n) {
			if (isPrimo(numero)) {
				System.out.print(numero + ", ");
				i++;
			}
			numero++;
		}
	}

	/**
	 * 
	 * @param numero
	 * @return booleano
	 */
	private static boolean isPrimo(int numero) {

		int nroDivisores = 1;

		for (int i = 2; i <= numero; i++) {
			if (numero % i == 0) {
				nroDivisores++;
			}
		}

		if (nroDivisores == 2) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 */
	private static void desplegarMenu() {
		System.out.println("\n============ MENU DE OPCIONES ============");
		System.out.println("1. Ejercicio 1 ");
		System.out.println("2. Ejercicio 2 ");
		System.out.println("3. Ejercicio 3 ");
		System.out.println("4. Ejercicio 4 ");
		System.out.println("5. Ejercicio 5 ");
		System.out.println("6. Ejercicio 6 ");
		System.out.println("7. Ejercicio 7 ");
		System.out.println("8. Ejercicio 8 ");
		System.out.println("9. Ejercicio 9 ");
		System.out.println("10. Ejercicio 10 ");
		System.out.println("11. Salir ");
		System.out.println("==================================");

	}
}
