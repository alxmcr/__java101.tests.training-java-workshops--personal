package amcoca.topic4.inheritance.poo.exercise3;

public class Electrodomestico extends ArticuloHogar {

	public Electrodomestico(String nombre, int alturaCM, int anchoCM, int profundidadCM,
			double pesoKG, String color, double capacidadTotalEnKG, double precioEnBolivianos) {
		super(nombre, alturaCM, anchoCM, profundidadCM, pesoKG, color, capacidadTotalEnKG,
				precioEnBolivianos);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Electrodomestico [");
		if (super.toString() != null) {
			builder.append("toString()=");
			builder.append(super.toString());
		}
		builder.append("]");
		return builder.toString();
	}


}
