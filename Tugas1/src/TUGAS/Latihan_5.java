package TUGAS;

import java.util.Scanner;

public class Latihan_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan teks: ");
        String teks = input.nextLine();
        System.out.println("Output: " + teks.toUpperCase());
        input.close();
    }
}
	


