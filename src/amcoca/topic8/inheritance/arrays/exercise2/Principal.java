package amcoca.topic8.inheritance.arrays.exercise2;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {

		Persona[] personas = new Persona[6];
		int[] cantidadObjetosPorTipo = new int[3];

		Persona persona1 = new Persona("Ale", "Coca", "Rojas",
				"av. morales # 1234", 22233344, 123456);
		Persona persona2 = new Persona("Jorge", "Rodriguez", "Gutierrez",
				"av. linares # 4845", 36393814, 5859564);
		Persona persona3 = new Persona("Ana", "Torrez", "Alvarado",
				"av. bustillos # 258", 78879, 3545648);

		Estudiante estudiante1 = new Estudiante("Maria", "Nogales", "Jimenez",
				"Av. Bolivar # 4432", 2345786, 4859698, "148565");
		Estudiante estudiante2 = new Estudiante("Julio", "Martinez", "Perez",
				"Av. Dolores # 124", 586419, 2537151, "784512");

		Empleado empleado1 = new Empleado("Hugo", "Vargas", "Calle",
				"Calle Chuquisaca #158", 3571596, 253552, 1, 10000,
				"Desarrollador Java");

		int contadorPersonas = 0;
		int contadorEstudiantes = 0;
		int contadorEmpleados = 0;

		personas[0] = persona1;
		contadorPersonas++;
		personas[1] = persona2;
		contadorPersonas++;
		personas[2] = persona3;
		contadorPersonas++;
		personas[3] = empleado1;
		contadorEmpleados++;
		personas[4] = estudiante1;
		contadorEstudiantes++;
		personas[5] = estudiante2;
		contadorEstudiantes++;

		cantidadObjetosPorTipo[0] = contadorPersonas;
		cantidadObjetosPorTipo[1] = contadorEmpleados;
		cantidadObjetosPorTipo[2] = contadorEstudiantes;

		System.out.println(Arrays.toString(personas));
		System.out.println("\n" + Arrays.toString(cantidadObjetosPorTipo));

		ejercicio(personas, cantidadObjetosPorTipo);
		//ejercicio1(personas);

	}

	private static void ejercicio(Persona[] personas,
			int[] cantidadObjetosPorTipo) {

		int contador = 0, posicion = 0;

		System.out.println("=============");
		System.out.println("\nPersonas");
		while (contador < cantidadObjetosPorTipo[0]) {
			System.out.println(personas[posicion]);
			posicion++;
			contador++;
		}
		contador = 0;
		System.out.println("=============");
		System.out.println("Empleados");
		while (contador < cantidadObjetosPorTipo[1]) {
			System.out.println(personas[posicion]);
			posicion++;
			contador++;
		}

		contador = 0;
		System.out.println("=============");
		System.out.println("\nEstudiante");
		while (contador < cantidadObjetosPorTipo[2]) {
			System.out.println(personas[posicion]);
			posicion++;
			contador++;
		}
		System.out.println("=============");

	}
}
