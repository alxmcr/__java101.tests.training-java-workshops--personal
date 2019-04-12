package amcoca.topic4.inheritance.poo.exercise1;

public class Refrigerador extends Electrodomestico {
	private String tipoLuzInterior;
	private String sistemaDeEnfriamiento;

	public Refrigerador(String nombre, int alturaCM, int anchoCM, int profundidadCM, double pesoKG, String color,
			double capacidadTotalEnKG, double precioEnBolivianos, String tipoLuzInterior,
			String sistemaDeEnfriamiento) {
		super(nombre, alturaCM, anchoCM, profundidadCM, pesoKG, color, capacidadTotalEnKG, precioEnBolivianos);
		this.tipoLuzInterior = tipoLuzInterior;
		this.sistemaDeEnfriamiento = sistemaDeEnfriamiento;
	}

	public String getTipoLuzInterior() {
		return tipoLuzInterior;
	}

	public void setTipoLuzInterior(String tipoLuzInterior) {
		this.tipoLuzInterior = tipoLuzInterior;
	}

	public String getSistemaDeEnfriamiento() {
		return sistemaDeEnfriamiento;
	}

	public void setSistemaDeEnfriamiento(String sistemaDeEnfriamiento) {
		this.sistemaDeEnfriamiento = sistemaDeEnfriamiento;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Refrigerador [");
		if (super.toString() != null) {
			builder.append("toString()=");
			builder.append(super.toString());
			builder.append(", ");
		}
		if (tipoLuzInterior != null) {
			builder.append("tipoLuzInterior=");
			builder.append(tipoLuzInterior);
			builder.append(", ");
		}
		if (sistemaDeEnfriamiento != null) {
			builder.append("sistemaDeEnfriamiento=");
			builder.append(sistemaDeEnfriamiento);
		}
		builder.append("]");
		return builder.toString();
	}

}
