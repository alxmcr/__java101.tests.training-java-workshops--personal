package amcoca.topic4.inheritance.poo.exercise3;

public class Silla extends Mobiliario {
	private double capacidadEnKG;

	public Silla(String nombre, int alturaCM, int anchoCM, int profundidadCM, double pesoKG,
			String color, double capacidadTotalEnKG, double precioEnBolivianos, double capacidadEnKG) {
		super(nombre, alturaCM, anchoCM, profundidadCM, pesoKG, color, capacidadTotalEnKG,
				precioEnBolivianos);
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
