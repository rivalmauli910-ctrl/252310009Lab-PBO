package TUGAS;

import java.util.Scanner;
public class Latihan_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student bio = new Student();
        
        System.out.print("Masukkan Nama Member: ");
        String namaMember = input.nextLine();
        System.out.print("Masukan jumlah produk yang dibeli : ");
        int qty = input.nextInt();
        
        int total = qty * 6300;
        double diskon = (qty >= 3 && qty % 3 == 0) ? total * 0.05 : 0;
        
        System.out.println("=== TOKO SERBAGUNA IBIK ===");
        System.out.println("Sub Total : Rp " + (total - diskon));
        System.out.println("Member Name : " + bio.getFullname(namaMember));
        input.close();
    }
}