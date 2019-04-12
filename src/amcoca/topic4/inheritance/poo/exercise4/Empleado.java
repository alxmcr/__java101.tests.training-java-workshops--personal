package amcoca.topic4.inheritance.poo.exercise4;

public class Empleado extends Persona {

	private int nroItem;
	private int sueldo;
	private String puesto;

	public Empleado(String nombre, String apPaterno, String apMaterno,
			String direccion, int telefono, int carnet, int nroItem,
			int sueldo, String puesto) {
		super(nombre, apPaterno, apMaterno, direccion, telefono, carnet);
		this.nroItem = nroItem;
		this.sueldo = sueldo;
		this.puesto = puesto;
	}

	public int getNroItem() {
		return nroItem;
	}

	public void setNroItem(int nroItem) {
		this.nroItem = nroItem;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Empleado [toString()=");
		buffer.append(super.toString());
		buffer.append(", nroItem=");
		buffer.append(nroItem);
		buffer.append(", sueldo=");
		buffer.append(sueldo);
		buffer.append(", puesto=");
		buffer.append(puesto);
		buffer.append("]");
		return buffer.toString();
	}

}
