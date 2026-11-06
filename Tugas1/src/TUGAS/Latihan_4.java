package TUGAS;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Latihan_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan jumlah produk yang dibeli : ");
        int qty = input.nextInt();
        int harga = 6300;
        int total = qty * harga;
        
        double diskon = (qty >= 3 && qty % 3 == 0) ? total * 0.05 : 0;
        double subTotal = total - diskon;
        
        System.out.println("=========================================");
        System.out.println("          TOKO SERBAGUNA IBIK            ");
        System.out.println("=========================================");
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd MMM yyyy (HH:mm)")));
        System.out.println("ITEM\t\tQTY\tHARGA\t\tTOTAL");
        System.out.println("=========================================");
        System.out.println("ROTI ENAK.\t" + qty + "\tRp " + harga + ",-\tRp " + total);
        System.out.println("-----------------------------------------");
        System.out.println("Diskon: " + (diskon > 0 ? "5%" : "0%"));
        System.out.println("Sub Total : Rp " + subTotal);
        input.close();
    }
}