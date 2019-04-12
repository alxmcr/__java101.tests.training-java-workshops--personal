package amcoca.topic10.staticmethods.exercise1;

public class Estudiante {

	private int idEstudiante;
	private String nombre;
	private String apPaterno;
	private String apMaterno;
	private static int numeroEstudiante = 1;

	public Estudiante(String nombre, String apPaterno, String apMaterno) {
		this.idEstudiante = Estudiante.numeroEstudiante++;
		this.nombre = nombre;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
	}

	public int getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(int idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApPaterno() {
		return apPaterno;
	}

	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}

	public String getApMaterno() {
		return apMaterno;
	}

	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}

	public static int getNumeroEstudiante() {
		return numeroEstudiante;
	}

	public static void setNumeroEstudiante(int numeroEstudiante) {
		Estudiante.numeroEstudiante = numeroEstudiante;
	}

	public String toString() {
		return "Estudiante [idEstudiante=" + idEstudiante + ", nombre="
				+ nombre + ", apPaterno=" + apPaterno + ", apMaterno="
				+ apMaterno + "]";
	}
}
