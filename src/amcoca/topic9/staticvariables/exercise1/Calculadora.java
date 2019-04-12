package amcoca.topic9.staticvariables.exercise1;

public class Calculadora {

	//variables de clase
	static int numero1 = 5;
	static int numero2 = 3;

	//Metodos de clase: suma, resta, multiplicacion, division y main
	private static int suma(int i, int j) {
		return i + j;
	}

	private static int resta(int i, int j) {
		return i - j;
	}

	private static int multiplicacion(int i, int j) {
		return i * j;
	}

	private static double division(int i, int j) {

		if (j != 0) {
			return i / j;
		} else {
			return -99999;
		}

	}

	public static void main(String[] args) {
		System.out.print("Suma (" + Calculadora.numero1 + "+" + Calculadora.numero2+") = ");
		System.out.println(Calculadora.suma(Calculadora.numero1, Calculadora.numero2));

		Calculadora.numero1 = 9;
		Calculadora.numero2 = 8;

		System.out.print("Resta (" + Calculadora.numero1 + "-" + Calculadora.numero2+") = ");
		System.out.println(Calculadora.resta(Calculadora.numero1, Calculadora.numero2));

		Calculadora.numero1 = 5;
		Calculadora.numero2 = 4;

		System.out.print("Multiplicacion (" + Calculadora.numero1 + "*" + Calculadora.numero2+") = ");
		System.out.println(Calculadora.multiplicacion(Calculadora.numero1, Calculadora.numero2));

		Calculadora.numero1 = 10;
		Calculadora.numero2 = 2;

		System.out.print("Division (" + Calculadora.numero1 + "/" + Calculadora.numero2+") = ");
		System.out.println(Calculadora.division(Calculadora.numero1, Calculadora.numero2));
	}

}
