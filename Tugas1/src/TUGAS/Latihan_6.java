package TUGAS;

import java.util.Scanner;
public class Latihan_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Usia: "); String usia = input.nextLine();
        System.out.print("Firstname: "); String firstName = input.nextLine();
        System.out.print("Lastname: "); String lastName = input.nextLine();
        System.out.print("NPM: "); String npm = input.nextLine();
        
        System.out.println(usia.concat(firstName).concat(lastName).concat(npm));
        input.close();
    }
}


