package Praktikum2;

import java.util.Iterator;
import java.util.Scanner;

public class repetition {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("masukan jumlah pengulangan: ");
		int number = input.nextInt();
		
//		for(int i=0;i<number;i++) {
//			System.out.println("hello world");
//		}
//		int a=0;
//		while(a<number) {
//			System.out.println("hello world");
//			a++;
//		}
		int b=0;
		do {
			System.out.println("hello world");
			b++;
		}while(b<number);
	}
}