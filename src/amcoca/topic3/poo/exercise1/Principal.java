package amcoca.topic3.poo.exercise1;

class Principal {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		p2.setNombre("Reynaldo");

		System.out.println(p1);
		System.out.println(p2);

		if (p1.isIguales(p2)) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son distintos");
		}

		StringBuffer p1Invertida = new StringBuffer(p1.toString());
		System.out.println(p1Invertida.reverse().toString());
		StringBuffer p2Invertida = new StringBuffer(p2.toString());
		System.out.println(p2Invertida.reverse().toString());
	}
}