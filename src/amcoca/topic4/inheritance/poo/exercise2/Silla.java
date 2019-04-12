package amcoca.topic4.inheritance.poo.exercise2;

public class Silla extends Mobiliario {
	private double capacidadEnKG;

	public Silla(String nombre, String material, double pesoKG, int alturaCM, int anchoCM,
			int profundidadCM, String color, double precioEnBolivianos, double capacidadEnKG) {
		super(nombre, material, pesoKG, alturaCM, anchoCM, profundidadCM, color, precioEnBolivianos);
		this.capacidadEnKG = capacidadEnKG;
	}

	public double getCapacidadEnKG() {
		return capacidadEnKG;
	}

	public void setCapacidadEnKG(double capacidadEnKG) {
		this.capacidadEnKG = capacidadEnKG;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Silla [");
		if (super.toString() != null) {
			builder.append("toString()=");
			builder.append(super.toString());
			builder.append(", ");
		}
		builder.append("capacidadEnKG=");
		builder.append(capacidadEnKG);
		builder.append("]");
		return builder.toString();
	}

}
