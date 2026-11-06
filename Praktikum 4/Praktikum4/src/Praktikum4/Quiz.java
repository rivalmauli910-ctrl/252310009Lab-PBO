package Praktikum4;

import javax.swing.JOptionPane;

public class Quiz {
    public static void main(String[] args) {
        
        double[] nilai = new double[5];
        double total = 0;
        
        for (int i = 0; i < nilai.length; i++) {
            String input = JOptionPane.showInputDialog(null, "Masukkan nilai ke-" + (i + 1) + ":");
            
            nilai[i] = Double.parseDouble(input);
            
            total += nilai[i];
        }
        
        double rataRata = total / nilai.length;
        
        JOptionPane.showMessageDialog(null, 
            "Nilai yang dimasukkan telah disimpan dalam array.\n" +
            "Total Nilai: " + total + "\n" +
            "Rata-rata Nilai: " + rataRata,
            "Hasil Perhitungan",
            JOptionPane.INFORMATION_MESSAGE);
    }
}