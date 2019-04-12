package amcoca.topic8.multidimensional.arrays.exercise3;

public class Principal {
	public static void main(String[] args) {

		int[][] a = new int[3][5];

		a[0][0] = 0;
		a[0][1] = 1;
		a[0][2] = 2;
		a[0][3] = 3;
		a[0][4] = 4;

		a[1][0] = 5;
		a[1][1] = 6;
		a[1][2] = 7;
		a[1][3] = 8;
		a[1][4] = 9;

		a[2][0] = 10;
		a[2][1] = 11;
		a[2][2] = 12;
		a[2][3] = 13;
		a[2][4] = 14;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("----------");

	}
}
