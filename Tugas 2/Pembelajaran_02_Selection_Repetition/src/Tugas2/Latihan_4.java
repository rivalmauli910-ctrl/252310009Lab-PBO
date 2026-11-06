package Tugas2;

import java.util.Scanner;

public class Latihan_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan minimal 20: ");
        int angka = input.nextInt();

        if (angka < 20) {
            System.out.println("Bilangan tidak boleh kurang dari 20.");
        } else {
            System.out.print("DESC: Faktor " + angka + " adalah ");

            boolean pertama = true;

            for (int i = angka; i >= 1; i--) {
                if (angka % i == 0) {
                    if (!pertama) {
                        System.out.print(", ");
                    }

                    System.out.print(i);
                    pertama = false;
                }
            }

            System.out.println();
        }

        input.close();
    }
}

