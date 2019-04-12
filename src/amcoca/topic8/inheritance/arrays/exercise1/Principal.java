package amcoca.topic8.inheritance.arrays.exercise1;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {

		Persona[] personas = new Persona[5];

		Persona persona1 = new Persona("Ale", "Coca", "Rojas",
				"av. morales # 1234", 22233344, 123456);
		Persona persona2 = new Persona("Jorge", "Rodriguez", "Gutierrez",
				"av. linares # 4845", 36393814, 5859564);
		Persona persona3 = new Persona("Ana", "Torrez", "Alvarado",
				"av. bustillos # 258", 78879, 3545648);

		Estudiante estudiante1 = new Estudiante("Maria", "Nogales", "Jimenez",
				"Av. Bolivar # 4432", 2345786, 4859698, "148565");

		Empleado empleado1 = new Empleado("Hugo", "Vargas", "Calle",
				"Calle Chuquisaca #158", 3571596, 253552, 1, 10000,
				"Desarrollador Java");

		personas[0] = persona1;
		personas[1] = estudiante1;
		personas[2] = persona2;
		personas[3] = persona3;
		personas[4] = empleado1;

		System.out.println(Arrays.toString(personas));

	}
}
