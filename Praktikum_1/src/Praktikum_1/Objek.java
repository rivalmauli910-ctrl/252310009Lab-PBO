package Praktikum_1;

import java.util.Scanner;

public class Objek {

	public static void main(String[] args) {
		int panjang, lebar, hasil;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Masukan Panjang");
		panjang = scanner.nextInt();
		System.out.println("Masukan lebar");
		lebar = scanner.nextInt();
		hasil = panjang * lebar;
		System.out.println("hasil : "+ hasil);
		
	}
}
