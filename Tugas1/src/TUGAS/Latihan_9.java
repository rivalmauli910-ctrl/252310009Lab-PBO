
package TUGAS;

import java.util.Scanner;

public class Latihan_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student myBio = new Student();

        System.out.print("Masukkan NPM: ");
        Integer npm = Integer.parseInt(input.nextLine());

        System.out.print("Masukkan Nama Lengkap: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Nama Kelas: ");
        String kelas = input.nextLine();

        System.out.print("Masukkan Semester: ");
        Integer semester = Integer.parseInt(input.nextLine());

        System.out.print("Masukkan IPK: ");
        Float ipk = Float.parseFloat(input.nextLine());

        myBio.getNPM(npm);
        myBio.getFullname(nama);
        myBio.getClassName(kelas);
        myBio.getSemester(semester);
        myBio.getGPA(ipk);

        System.out.println("\n=== DATA MAHASISWA ===");
        System.out.println("NPM      : " + myBio.getNPM(npm));
        System.out.println("Nama     : " + myBio.getFullname(nama));
        System.out.println("Kelas    : " + myBio.getClassName(kelas));
        System.out.println("Semester : " + myBio.getSemester(semester));
        System.out.println("IPK      : " + myBio.getGPA(ipk));

        input.close();
    }
}
