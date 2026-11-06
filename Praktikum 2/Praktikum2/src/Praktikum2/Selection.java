package Praktikum2;

import java.util.Scanner;

public class Selection {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Masukan warna: ");
		String warna = input.nextLine();
		
		switch(warna) {
		case "red":{
			System.out.println("Warna yang anda pilih adalah merah");
			break;
		}
		case "blue":{
			System.out.println("Warna yang anda pilih adalah biru");
			break;
		}
		case "white":{
			System.out.println("Warna yang anda pilih adalah putih");
			break;
		}
		default: System.out.println("warna anda bukan biru, merah atau putih");
		break;
		}
	}
}