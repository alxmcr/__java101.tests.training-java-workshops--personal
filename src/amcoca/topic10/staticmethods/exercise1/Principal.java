package amcoca.topic10.staticmethods.exercise1;

public class Principal {

	public static void main(String[] args) {

		Estudiante estu1 = new Estudiante("a", "b", "c");
		Estudiante estu2 = new Estudiante("d", "e", "f");
		Estudiante estu3 = new Estudiante("g", "h", "i");
		Estudiante estu4 = new Estudiante("j", "k", "l");

		System.out.println(estu1);
		System.out.println(estu2);
		System.out.println(estu3);
		System.out.println(estu4);

		System.out.println("Cuantos objetos se instanciaron --> " + (Estudiante.getNumeroEstudiante() - 1));

	}
}