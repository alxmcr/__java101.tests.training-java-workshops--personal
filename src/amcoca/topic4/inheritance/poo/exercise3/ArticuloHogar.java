package amcoca.topic4.inheritance.poo.exercise3;

public class ArticuloHogar {
	private String nombre;
	private int alturaCM;
	private int anchoCM;
	private int profundidadCM;
	private double pesoKG;
	private String color;
	private double capacidadTotalEnKG;
	private double precioEnBolivianos;

	public ArticuloHogar(String nombre, int alturaCM, int anchoCM, int profundidadCM,
			double pesoKG, String color, double capacidadTotalEnKG, double precioEnBolivianos) {
		super();
		this.nombre = nombre;
		this.alturaCM = alturaCM;
		this.anchoCM = anchoCM;
		this.profundidadCM = profundidadCM;
		this.pesoKG = pesoKG;
		this.color = color;
		this.capacidadTotalEnKG = capacidadTotalEnKG;
		this.precioEnBolivianos = precioEnBolivianos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAlturaCM() {
		return alturaCM;
	}

	public void setAlturaCM(int alturaCM) {
		this.alturaCM = alturaCM;
	}

	public int getAnchoCM() {
		return anchoCM;
	}

	public void setAnchoCM(int anchoCM) {
		this.anchoCM = anchoCM;
	}

	public int getProfundidadCM() {
		return profundidadCM;
	}

	public void setProfundidadCM(int profundidadCM) {
		this.profundidadCM = profundidadCM;
	}

	public double getPesoKG() {
		return pesoKG;
	}

	public void setPesoKG(double pesoKG) {
		this.pesoKG = pesoKG;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getCapacidadTotalEnKG() {
		return capacidadTotalEnKG;
	}

	public void setCapacidadTotalEnKG(double capacidadTotalEnKG) {
		this.capacidadTotalEnKG = capacidadTotalEnKG;
	}

	public double getPrecioEnBolivianos() {
		return precioEnBolivianos;
	}

	public void setPrecioEnBolivianos(double precioEnBolivianos) {
		this.precioEnBolivianos = precioEnBolivianos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ArticuloHogar [");
		if (nombre != null) {
			builder.append("nombre=");
			builder.append(nombre);
			builder.append(", ");
		}
		builder.append("alturaCM=");
		builder.append(alturaCM);
		builder.append(", anchoCM=");
		builder.append(anchoCM);
		builder.append(", profundidadCM=");
		builder.append(profundidadCM);
		builder.append(", pesoKG=");
		builder.append(pesoKG);
		builder.append(", ");
		if (color != null) {
			builder.append("color=");
			builder.append(color);
			builder.append(", ");
		}
		builder.append("capacidadTotalEnKG=");
		builder.append(capacidadTotalEnKG);
		builder.append(", precioEnBolivianos=");
		builder.append(precioEnBolivianos);
		builder.append("]");
		return builder.toString();
	}

}
