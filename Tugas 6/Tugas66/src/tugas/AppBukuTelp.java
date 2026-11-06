package tugas;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AppBukuTelp {
    public static void main(String[] args) {
        ArrayList<String> kolom = new ArrayList<String>();
        kolom.add("Nama Lengkap");
        kolom.add("Alamat");
        kolom.add("No Telp");

        ArrayList<ArrayList<String>> bukuTelp = new ArrayList<ArrayList<String>>();

        int lagi;
        do {
            ArrayList<String> kontak = new ArrayList<String>();
            for (int i = 0; i < kolom.size(); i++) {
                String isi = JOptionPane.showInputDialog(null, "Masukan " + kolom.get(i) + ":",
                        "Data Kontak ke-" + (bukuTelp.size() + 1), JOptionPane.QUESTION_MESSAGE);
                kontak.add(isi);
            }
            bukuTelp.add(kontak);

            lagi = JOptionPane.showConfirmDialog(null, "Tambah kontak lagi?", "Buku Telepon",
                    JOptionPane.YES_NO_OPTION);
        } while (lagi == JOptionPane.YES_OPTION);

        String hasil = "";
        for (int i = 0; i < bukuTelp.size(); i++) {
            hasil += (i + 1) + ".\n";
            for (int j = 0; j < kolom.size(); j++) {
                hasil += kolom.get(j) + " : " + bukuTelp.get(i).get(j) + "\n";
            }
            hasil += "\n";
        }

        JOptionPane.showMessageDialog(null, hasil, "Buku Telepon", JOptionPane.INFORMATION_MESSAGE);
    }
}
