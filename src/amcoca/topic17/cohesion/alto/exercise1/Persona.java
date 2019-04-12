package amcoca.topic17.cohesion.alto.exercise1;

public class Persona {

	// Datos propios de la clase
	private String primerNombre;
	private String segundoNombre;
	private String apPaterno;
	private String apMaterno;
	private int nroCarnet;
	private String lugarNacimiento;
	private int telefono;

	public Persona(String primerNombre, String segundoNombre,
			String apPaterno, String apMaterno, int nroCarnet,
			String lugarNacimiento, int telefono) {
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
		this.nroCarnet = nroCarnet;
		this.lugarNacimiento = lugarNacimiento;
		this.telefono = telefono;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
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

	public int getNroCarnet() {
		return nroCarnet;
	}

	public void setNroCarnet(int nroCarnet) {
		this.nroCarnet = nroCarnet;
	}

	public String getLugarNacimiento() {
		return lugarNacimiento;
	}

	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
}
