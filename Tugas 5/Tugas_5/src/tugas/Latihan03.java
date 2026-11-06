package tugas;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan03 {
    public static void main(String[] args) {
        String[] kolom = {"Nama Lengkap", "Alamat", "No Telp"};
        ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();

        for (int i = 0; i < 3; i++) {
            ArrayList<String> baris = new ArrayList<String>();
            for (int j = 0; j < kolom.length; j++) {
                String isi = JOptionPane.showInputDialog(null, "Masukan " + kolom[j] + ":",
                        "Data ke-" + (i + 1), JOptionPane.QUESTION_MESSAGE);
                baris.add(isi);
            }
            data.add(baris);
        }

        String hasil = "";
        for (int i = 0; i < data.size(); i++) {
            for (int j = 0; j < kolom.length; j++) {
                hasil += kolom[j] + ": " + data.get(i).get(j) + "\n";
            }
            hasil += "\n";
        }

        JOptionPane.showMessageDialog(null, hasil, "Data ArrayList Multidimensi", JOptionPane.INFORMATION_MESSAGE);
    }
}