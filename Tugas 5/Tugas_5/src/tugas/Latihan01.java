package tugas;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan01 {

    static ArrayList<ArrayList<Integer>> isiMatrix(String nama) {
        ArrayList<ArrayList<Integer>> m = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < 2; i++) {
            ArrayList<Integer> baris = new ArrayList<Integer>();
            for (int j = 0; j < 2; j++) {
                int angka = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukan angka:",
                        "Matrix " + nama + " [" + i + "][" + j + "]", JOptionPane.QUESTION_MESSAGE));
                baris.add(angka);
            }
            m.add(baris);
        }
        return m;
    }

    static String tampil(String nama, ArrayList<ArrayList<Integer>> m) {
        String teks = "Matrix " + nama + "\n";
        for (int i = 0; i < m.size(); i++) {
            for (int j = 0; j < m.get(i).size(); j++) {
                teks += m.get(i).get(j) + "   ";
            }
            teks += "\n";
        }
        return teks;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> a = isiMatrix("A");
        ArrayList<ArrayList<Integer>> b = isiMatrix("B");

        String hasil = tampil("A", a) + "\n" + tampil("B", b);

        JOptionPane.showMessageDialog(null, hasil, "Output Matrix", JOptionPane.INFORMATION_MESSAGE);
    }
}