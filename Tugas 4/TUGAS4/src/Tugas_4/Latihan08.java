package Tugas_4;

import javax.swing.JOptionPane;

public class Latihan08 {
    public static void main(String[] args) {
        String[][] data = {
            {"Septian Cahyadi", "Dramaga cantik residance II, Bogor", "+62 899-9506-210"},
            {"Isnan Mulia", "Jl.Manunggal, Bogor", "+62 819-3208-0875"},
            {"Edi Nurachmad", "Taman Cimanggu Permai, Bogor", "+62 856-9380-0384"}
        };

        String[] kolom = {"Nama Lengkap", "Alamat", "No Telp"};
        String hasil = "";

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < kolom.length; j++) {
                hasil += kolom[j] + ": " + data[i][j] + "\n";
            }
            hasil += "\n";
        }

        JOptionPane.showMessageDialog(null, hasil, "Data Array Multidimensi", JOptionPane.INFORMATION_MESSAGE);
    }
}