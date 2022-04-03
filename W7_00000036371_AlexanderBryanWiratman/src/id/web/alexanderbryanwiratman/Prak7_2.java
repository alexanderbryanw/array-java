package id.web.alexanderbryanwiratman;

import java.util.Scanner;

public class Prak7_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Jumlah data yang diinput : ");
		int data = scan.nextInt();
		String nama[] = new String[data];
		int harga[] = new int[data];
		int diskon[] = new int[data];
		int total[] = new int[data];
		for (int i = 0; i < data; i++) {
			System.out.println("----------Input Barang-" + (i + 1) + ("---------"));
			System.out.print("Masukkan nama Barang " + (i + 1) + (": "));
			nama[i] = scan.next();
			System.out.print("Masukkan harga Barang " + (i + 1) + (": "));
			harga[i] = scan.nextInt();
			System.out.print("Masukkan diskon Barang " + (i + 1) + (": "));
			diskon[i] = scan.nextInt();
			total[i] = harga[i] - (diskon[i] * harga[i] / 100);
			System.out.println();
		}
		System.out.printf("%-3s %-10s %-10s %-8s %-15s", "No", "Nama", "Harga", "Diskon", "Total");
		System.out.print("\n=========================================");
		for (int i = 0; i < data; i++) {
			int urut = i + 1;
			System.out.printf("\n%-5d %-12s %-12d %-10d %-17d", urut, nama[i], harga[i], diskon[i], total[i]);
		}
		scan.close();
	}

}
