package amcoca.topic4.inheritance.poo.exercise4;

public class Estudiante extends Persona {

	private String matricula;

	public Estudiante(String nombre, String apPaterno, String apMaterno,
			String direccion, int telefono, int carnet, String matricula) {
		super(nombre, apPaterno, apMaterno, direccion, telefono, carnet);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Estudiante [toString()=");
		builder.append(super.toString());
		builder.append(", matricula=");
		builder.append(matricula);
		builder.append("]");
		return builder.toString();
	}
}
