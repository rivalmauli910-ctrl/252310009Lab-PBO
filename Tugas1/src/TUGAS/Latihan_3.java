package TUGAS;

public class Latihan_3 {
    static final double PI = 3.14; 

    public static double hitungVolumeTabung(double r, double t) {
        return PI * r * r * t;
    }

    public static void main(String[] args) {
        double jariJari = 7.0; 
        double tinggi = 10.0;
        System.out.println("Volume Tabung: " + hitungVolumeTabung(jariJari, tinggi));
    }
}