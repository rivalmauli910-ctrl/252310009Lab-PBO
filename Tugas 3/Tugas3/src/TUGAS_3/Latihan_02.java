package TUGAS_3;

import javax.swing.JOptionPane;

public class Latihan_02 {
	    public static void main(String[] args) {
	        Biodata bio = new Biodata();

	        String nama = JOptionPane.showInputDialog("Masukkan Fullname:");
	        String usia = JOptionPane.showInputDialog("Masukkan Usia:");
	        String alamat = JOptionPane.showInputDialog("Masukkan Alamat:");

	        bio.simpan(nama, usia, alamat);

	        JOptionPane.showMessageDialog(null,
	                "Fullname : " + bio.getFullname() + "\n"
	              + "Usia     : " + bio.getUsia() + "\n"
	              + "Alamat   : " + bio.getAlamat());
	}
}
