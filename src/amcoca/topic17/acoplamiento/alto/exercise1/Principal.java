package amcoca.topic17.acoplamiento.alto.exercise1;

public class Principal {

	public static void main(String[] args) {

		Estudiante[] estudiantes = new Estudiante[5];

		Estudiante e1 = new Estudiante("a1", "b1", "c1", "d1", true, "f1");
		Estudiante e2 = new Estudiante("a2", "b2", "c2", "d2", false, "f2");
		Estudiante e3 = new Estudiante("a3", "b3", "c3", "d3", true, "f3");
		Estudiante e4 = new Estudiante("a4", "b4", "c4", "d4", false, "f4");
		Estudiante e5 = new Estudiante("a5", "b5", "c5", "d5", false, "f5");

		estudiantes[0] = e1;
		estudiantes[1] = e2;
		estudiantes[2] = e3;
		estudiantes[3] = e4;
		estudiantes[4] = e5;

		mostrarEstudiantes(estudiantes);
		mostrarMujeres(estudiantes);
		mostrarHombres(estudiantes);
	}

	private static void mostrarHombres(Estudiante[] estudiantes) {

		System.out.println("\n Hombres");
		for (Estudiante estudiante : estudiantes) {
			if (estudiante.isSexo()) {
				System.out.println(estudiante);
			}
		}

	}

	private static void mostrarMujeres(Estudiante[] estudiantes) {
		System.out.println("\n Mujeres");
		for (Estudiante estudiante : estudiantes) {
			if (!estudiante.isSexo()) {
				System.out.println(estudiante);
			}
		}
	}

	private static void mostrarEstudiantes(Estudiante[] estudiantes) {

		System.out.println("\n Todos los estudiantes: ");

		for (Estudiante estudiante : estudiantes) {
			System.out.println(estudiante);
		}
	}
}
