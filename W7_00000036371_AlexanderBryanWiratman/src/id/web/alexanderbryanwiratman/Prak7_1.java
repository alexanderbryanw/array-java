package id.web.alexanderbryanwiratman;

import java.util.Scanner;

public class Prak7_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, sum = 0;
		String tipe = null;
		int a[] = new int[1000];
		for (int i = 0; i < a.length; i++) {
			System.out.print("Masukkan nilai ke-" + (i + 1) + " = ");
			a[i] = scan.nextInt();
			sum = sum + a[i];
			if (a[i] == 0)
				break;
		}
		if (sum % 2 == 0 && sum != 2) {
			System.out.print("HASILNYA ADALAH GENAP");
		} else if (sum % 2 == 1 || sum == 2) {
			int temp;
			boolean prima = true;
			for (int bagi = 2; bagi <= sum / 2; bagi++) {
				temp = sum % bagi;
				if (temp == 0) {
					prima = false;	
					break;
				}

			}
			if (prima && ((sum > 0) && (sum != 1)))
				System.out.print("HASILNYA ADALAH PRIMA");
			else
				System.out.print("HASILNYA ADALAH GANJIL");
		}
	}
}
