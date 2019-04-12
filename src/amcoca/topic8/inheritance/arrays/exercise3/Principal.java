package amcoca.topic8.inheritance.arrays.exercise3;

public class Principal {

	public static void main(String[] args) {

		Persona[] personas = new Persona[6];

		Persona persona1 = new Persona("Ale", "Coca", "Rojas",
				"av. morales # 1234", 22233344, 123456);
		Persona persona2 = new Persona("Jorge", "Rodriguez", "Gutierrez",
				"av. linares # 4845", 36393814, 5859564);
		Persona persona3 = new Persona("Ana", "Torrez", "Alvarado",
				"av. bustillos # 258", 78879, 3545648);

		Estudiante estudiante1 = new Estudiante("Maria", "Nogales", "Jimenez",
				"Av. Bolivar # 4432", 2345786, 4859698, "148565");

		Estudiante estudiante2 = new Estudiante("Julia", "Flores", "Morales",
				"Av. Barrera # 2535", 2536788, 3123213, "6546422");

		Empleado empleado1 = new Empleado("Hugo", "Vargas", "Calle",
				"Calle Chuquisaca #158", 3571596, 253552, 1, 10000,
				"Desarrollador Java");

		personas[0] = persona1;
		personas[1] = estudiante1;
		personas[2] = persona2;
		personas[3] = persona3;
		personas[4] = empleado1;
		personas[5] = estudiante2;

		mostrarPersonas(personas);

		contarDePersonas(personas);
		contarDeEstudiantes(personas);
		contarDeEmpleados(personas);
	}

	private static void mostrarPersonas(Persona[] personas) {
		System.out.println("============= ESTUDIANTES ===============");
		int i = 1;

		for (Persona persona : personas) {
			System.out.println(i + " " + persona);
			i++;
		}
		System.out.println("==========================================");
	}

	private static void contarDePersonas(Persona[] personas) {

		int contarPersonas = 0;

		for (Persona persona : personas) {
			if (persona instanceof Persona) {
				contarPersonas++;
			}
		}
		System.out.println("# Personas: " + contarPersonas);
	}

	private static void contarDeEstudiantes(Persona[] personas) {

		int contarEstudiantes = 0;

		for (Persona persona : personas) {
			if (persona instanceof Estudiante) {
				contarEstudiantes++;
			}
		}
		System.out.println("# estudiantes: " + contarEstudiantes);
	}

	private static void contarDeEmpleados(Persona[] personas) {

		int contarEmpleados = 0;

		for (Persona persona : personas) {
			if (persona instanceof Empleado) {
				contarEmpleados++;
			}
		}
		System.out.println("# estudiantes: " + contarEmpleados);
	}

}
