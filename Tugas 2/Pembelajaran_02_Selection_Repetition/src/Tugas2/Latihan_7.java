package Tugas2;

import java.util.Scanner;

public class Latihan_7 {
    private long Harga;

    public void chooseMenu() {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU SARAPAN ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Bubur Ayam");
        System.out.println("3. Soto Ayam");
        System.out.print("Pilih menu (1-3): ");

        int pilihan = input.nextInt();
        getPrices(pilihan);

        if (Harga > 0) {
            System.out.println("Harga adalah Rp " + Harga);
        } else {
            System.out.println("Maaf menu yang anda masukan salah.");
        }
    }

    private long getPrices(int pilihan) {
        switch (pilihan) {
            case 1:
                Harga = 22000;
                break;
            case 2:
                Harga = 15000;
                break;
            case 3:
                Harga = 25000;
                break;
            default:
                Harga = 0;
        }

        return Harga;
    }
}
