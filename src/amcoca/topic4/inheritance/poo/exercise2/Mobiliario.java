package amcoca.topic4.inheritance.poo.exercise2;

public class Mobiliario {
	private String nombre;
	private String material;
	private double pesoKG;
	private int alturaCM;
	private int anchoCM;
	private int profundidadCM;
	private String color;
	private double precioEnBolivianos;

	public Mobiliario(String nombre, String material, double pesoKG, int alturaCM, int anchoCM,
			int profundidadCM, String color, double precioEnBolivianos) {
		this.nombre = nombre;
		this.material = material;
		this.pesoKG = pesoKG;
		this.alturaCM = alturaCM;
		this.anchoCM = anchoCM;
		this.profundidadCM = profundidadCM;
		this.color = color;
		this.precioEnBolivianos = precioEnBolivianos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getPesoKG() {
		return pesoKG;
	}

	public void setPesoKG(double pesoKG) {
		this.pesoKG = pesoKG;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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
		builder.append("Mobiliario [");
		if (nombre != null) {
			builder.append("nombre=");
			builder.append(nombre);
			builder.append(", ");
		}
		if (material != null) {
			builder.append("material=");
			builder.append(material);
			builder.append(", ");
		}
		builder.append("pesoKG=");
		builder.append(pesoKG);
		builder.append(", alturaCM=");
		builder.append(alturaCM);
		builder.append(", anchoCM=");
		builder.append(anchoCM);
		builder.append(", profundidadCM=");
		builder.append(profundidadCM);
		builder.append(", ");
		if (color != null) {
			builder.append("color=");
			builder.append(color);
			builder.append(", ");
		}
		builder.append("precioEnBolivianos=");
		builder.append(precioEnBolivianos);
		builder.append("]");
		return builder.toString();
	}

}
