package TUGAS;

import java.util.Scanner;
public class Latihan_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama Lengkap: ");
        String nama = input.nextLine();
        System.out.println(nama.replaceAll("[aAiIuUeEoO]", "X"));
        input.close();
    }
}


