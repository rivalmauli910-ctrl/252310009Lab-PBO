package tugas;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan02 {

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

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> a = isiMatrix("A");
        ArrayList<ArrayList<Integer>> b = isiMatrix("B");
        ArrayList<ArrayList<Integer>> c = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < 2; i++) {
            ArrayList<Integer> baris = new ArrayList<Integer>();
            for (int j = 0; j < 2; j++) {
                int jumlah = 0;
                for (int k = 0; k < 2; k++) {
                    jumlah += a.get(i).get(k) * b.get(k).get(j);
                }
                baris.add(jumlah);
            }
            c.add(baris);
        }

        String hasil = "Matrix C = A * B\n";
        for (int i = 0; i < c.size(); i++) {
            for (int j = 0; j < c.get(i).size(); j++) {
                hasil += c.get(i).get(j) + "   ";
            }
            hasil += "\n";
        }

        JOptionPane.showMessageDialog(null, hasil, "Output Matrix C", JOptionPane.INFORMATION_MESSAGE);
    }
}