package Tugas_4;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Latihan09 {
    public static void main(String[] args) {
        int jumlah = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Masukan jumlah array:", "Input", JOptionPane.QUESTION_MESSAGE));

        ArrayList<Integer> x = new ArrayList<Integer>();
        String hasil = "";

        for (int i = 0; i < jumlah; i++) {
            int angka = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "Masukan angka:", "Data array ke-" + i,
                            JOptionPane.QUESTION_MESSAGE));
            x.add(angka);
            hasil += "x[" + i + "]=" + x.get(i) + "\n";
        }

        hasil += "Nilai terbesar adalah " + Collections.max(x) + "\n";
        hasil += "Nilai terkecil adalah " + Collections.min(x);

        JOptionPane.showMessageDialog(null, hasil, "Output Array", JOptionPane.INFORMATION_MESSAGE);
    }
}