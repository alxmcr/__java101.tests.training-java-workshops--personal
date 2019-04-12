package amcoca.topic9.staticvariables.exercise2;

public class Principal {

	public static void main(String[] args) {

		StringBuffer amcoca = new StringBuffer();
		amcoca.append(ConstantesAMCOCA.ALEJANDRO).append(ConstantesLiterales.ESPACIO_BLANCO)
				.append(ConstantesAMCOCA.MAURICIO).append(ConstantesLiterales.ESPACIO_BLANCO)
				.append(ConstantesAMCOCA.COCA).append(ConstantesLiterales.ESPACIO_BLANCO).append(ConstantesAMCOCA.ROJAS)
				.append(ConstantesLiterales.ESPACIO_BLANCO);
		System.out.println(amcoca.toString());

	}

}
