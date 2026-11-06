package TUGAS_3;

import javax.swing.JOptionPane;

public class Latihan_04 {

	    static boolean konfirmasiKeluar() {
	        int pilih = JOptionPane.showConfirmDialog(null, "Apakah anda ingin keluar ?",
	                "Konfirmasi", JOptionPane.YES_NO_OPTION);
	        return pilih == JOptionPane.YES_OPTION;
	    }

	    static String ambil(String label) {
	        while (true) {
	            String hasil = JOptionPane.showInputDialog(null, "Masukkan " + label + ":",
	                    "Input Biodata", JOptionPane.QUESTION_MESSAGE);
	            if (hasil == null) {
	                if (konfirmasiKeluar()) {
	                    System.exit(0);
	                }
	                continue;
	            }
	            return hasil.trim();
	        }
	    }

	    public static void main(String[] args) {
	        Biodata bio = new Biodata();

	        while (true) {
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

	            if (konfirmasiKeluar()) {
	                System.exit(0);
	            }
	        }
	    }
	}

