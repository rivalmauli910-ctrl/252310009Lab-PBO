package Tugas2;

import java.util.Scanner;

public class Latihan_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris persegi: ");
        int baris = input.nextInt();

        if (baris <= 0) {
            System.out.println("Jumlah baris harus lebih dari 0.");
        } else {
            int i = 1;

            while (i <= baris) {
                int j = 1;

                while (j <= baris) {
                    System.out.print("* ");
                    j++;
                }

                System.out.println();
                i++;
            }
        }

        input.close();
    }
}
