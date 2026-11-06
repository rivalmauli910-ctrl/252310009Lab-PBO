package tugas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;

public class Latihan04 {
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

        Collections.sort(data, new Comparator<ArrayList<String>>() {
            public int compare(ArrayList<String> p, ArrayList<String> q) {
                return p.get(0).compareToIgnoreCase(q.get(0));
            }
        });

        String hasil = "";
        for (int i = 0; i < data.size(); i++) {
            for (int j = 0; j < kolom.length; j++) {
                hasil += kolom[j] + ": " + data.get(i).get(j) + "\n";
            }
            hasil += "\n";
        }

        JOptionPane.showMessageDialog(null, hasil, "Data Urut Ascending (Nama Lengkap)",
                JOptionPane.INFORMATION_MESSAGE);
    }
}