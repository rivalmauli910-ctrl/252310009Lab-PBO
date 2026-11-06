package Praktikum2;

import java.util.Scanner;

public class Ifelse {
	public static void main(String[] args) {
		int umur;
		Scanner input=new Scanner(System.in);
		System.out.println("Masukan umur anda : ");
		umur=input.nextInt();
		
		if(umur>17) {
			System.out.println("umur anda lebih dari 17");
		}
		else if(umur<17) {
			System.out.println("umur anda kurang dari 17");
		}
		else {
			System.out.println("umur anda 17 tahun");
		}
	}
}