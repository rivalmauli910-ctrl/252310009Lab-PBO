package Tugas_4;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan10 {
    public static void main(String[] args) {
        ArrayList<String> field = new ArrayList<String>();
        field.add("Nama Lengkap");
        field.add("Alamat");
        field.add("No Telp");

        ArrayList<String> isi = new ArrayList<String>();

        for (int i = 0; i < field.size(); i++) {
            String masukan = JOptionPane.showInputDialog(null, "Masukan " + field.get(i) + ":",
                    "Data array ke-" + i, JOptionPane.QUESTION_MESSAGE);
            isi.add(masukan);
        }

        String hasil = "";
        for (int i = 0; i < field.size(); i++) {
            hasil += field.get(i) + ": " + isi.get(i) + "\n";
        }

        JOptionPane.showMessageDialog(null, hasil, "Message", JOptionPane.INFORMATION_MESSAGE);
    }
}