package Tugas_4;

import javax.swing.JOptionPane;

public class Latihan04 {
    public static void main(String[] args) {
        int jumlah = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Masukan jumlah array:", "Input", JOptionPane.QUESTION_MESSAGE));

        int[] x = new int[jumlah];
        String hasil = "";

        for (int i = 0; i < jumlah; i++) {
            x[i] = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "Masukan angka:", "Data array ke-" + i,
                            JOptionPane.QUESTION_MESSAGE));
            hasil += "x[" + i + "]=" + x[i] + "\n";
        }

        int terbesar = x[0];
        int terkecil = x[0];

        for (int i = 1; i < jumlah; i++) {
            if (x[i] > terbesar) {
                terbesar = x[i];
            }
            if (x[i] < terkecil) {
                terkecil = x[i];
            }
        }

        hasil += "Nilai terbesar adalah " + terbesar + "\n";
        hasil += "Nilai terkecil adalah " + terkecil;

        JOptionPane.showMessageDialog(null, hasil, "Output Array", JOptionPane.INFORMATION_MESSAGE);
    }
}