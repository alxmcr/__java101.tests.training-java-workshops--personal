package amcoca.topic15.internationalization.timezone.exercise2;

import java.util.TimeZone;

public class Principal {
	public static void main(String[] args) {
		String[] idsTimeZone = TimeZone.getAvailableIDs();

		for (int i = 0; i < idsTimeZone.length; i++) {
			System.out.println(i + " -> " + idsTimeZone[i]);
		}
	}
}
