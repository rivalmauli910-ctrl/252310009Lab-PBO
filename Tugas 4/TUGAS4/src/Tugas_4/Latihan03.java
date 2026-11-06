package Tugas_4;

import javax.swing.JOptionPane;

public class Latihan03 {
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

	        JOptionPane.showMessageDialog(null, hasil, "Output Array", JOptionPane.INFORMATION_MESSAGE);
	    }
	}
