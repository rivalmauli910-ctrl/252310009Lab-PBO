package TUGAS_3;

import javax.swing.JOptionPane;

public class Latihan_3 {

	    static String ambil(String label) {
	        String hasil = JOptionPane.showInputDialog("Masukkan " + label + ":");
	        if (hasil == null) {
	            System.exit(0);
	        }
	        return hasil.trim();
	    }

	    public static void main(String[] args) {
	        Biodata bio = new Biodata();
	        String nama, usia, alamat;

	        do {
	            nama = ambil("Fullname");
	            if (nama.isEmpty()) {
	                JOptionPane.showMessageDialog(null, "Field fullname tidak boleh kosong",
	                        "Error", JOptionPane.ERROR_MESSAGE);
	            }
	        } while (nama.isEmpty());

	        boolean usiaValid;
	        do {
	            usia = ambil("Usia");
	            usiaValid = false;
	            if (usia.isEmpty()) {
	                JOptionPane.showMessageDialog(null, "Field usia tidak boleh kosong",
	                        "Error", JOptionPane.ERROR_MESSAGE);
	            } else if (!usia.matches("\\d+")) {
	                JOptionPane.showMessageDialog(null, "Isian usia harus angka",
	                        "Error", JOptionPane.ERROR_MESSAGE);
	            } else {
	                usiaValid = true;
	            }
	        } while (!usiaValid);

	        boolean alamatValid;
	        do {
	            alamat = ambil("Alamat");
	            alamatValid = false;
	            if (alamat.isEmpty()) {
	                JOptionPane.showMessageDialog(null, "Field alamat tidak boleh kosong",
	                        "Error", JOptionPane.ERROR_MESSAGE);
	            } else if (alamat.length() < 10) {
	                JOptionPane.showMessageDialog(null, "Masukan alamat minimum 10 karakter",
	                        "Warning", JOptionPane.WARNING_MESSAGE);
	            } else {
	                alamatValid = true;
	            }
	        } while (!alamatValid);

	        bio.simpan(nama, usia, alamat);

	        JOptionPane.showMessageDialog(null,
	                "Fullname : " + bio.getFullname() + "\n"
	              + "Usia     : " + bio.getUsia() + "\n"
	              + "Alamat   : " + bio.getAlamat(),
	                "Informasi", JOptionPane.INFORMATION_MESSAGE);
	  }
}
