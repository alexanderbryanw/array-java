package id.web.alexanderbryanwiratman;

import java.util.Scanner;

public class Prak7_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukkan deret bilangan: ");
		int array[][] = new int[5][5];
		int[] samping = new int[5];
		int[] bawah = new int[5];
		int diagonal = 0;
		int x, y;
		for (x = 0; x < 5; x++) {
			samping[x] = 0;
			for (y = 0; y < 5; y++) {
				array[x][y] = scan.nextInt();
				samping[x] = samping[x] + array[x][y];
			}

		}
		for (y = 0; y < 5; y++) {
			bawah[y] = 0;
			for (x = 0; x < 5; x++) {
				bawah[y] = bawah[y] + array[x][y];

			}
		}
		for (x = 0; x < 5; x++) {
			for (y = 0; y < 5; y++) {
				if (x == y) {
					diagonal = diagonal + array[x][y];

				}
			}
		}
		System.out.print("Nilai ");
		for (x = 0; x < 5; x++)
			System.out.print(samping[x] + " ");
		for (y = 0; y < 5; y++)
			System.out.print(bawah[y] + " ");
		System.out.println(diagonal);
		scan.close();
	}
}
