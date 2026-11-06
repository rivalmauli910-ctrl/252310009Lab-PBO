package Tugas2;

import java.util.Scanner;


public class Latihan_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NPM: ");
        long npm = input.nextLong();

        if (npm <= 1) {
            System.out.println("Bukan termasuk bilangan prima.");
        } else {
            boolean prima = true;

            for (long i = 2; i <= npm / i; i++) {
                if (npm % i == 0) {
                    prima = false;
                    break;
                }
            }

            if (prima) {
                System.out.println("Termasuk bilangan PRIMA.");
            } else if (npm % 2 == 0) {
                System.out.println(
                    "Bukan termasuk bilangan prima karena dapat dibagi dengan 2"
                );
            } else {
                System.out.println("Bukan termasuk bilangan prima.");
            }
        }

        input.close();
    }
}



