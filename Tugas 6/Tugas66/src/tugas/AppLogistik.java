package tugas;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AppLogistik {

    static ArrayList<ArrayList<String>> pesanan = new ArrayList<ArrayList<String>>();

    static boolean konfirmasiKeluar() {
        int pilih = JOptionPane.showConfirmDialog(null, "Apakah anda ingin keluar ?",
                "Konfirmasi", JOptionPane.YES_NO_OPTION);
        return pilih == JOptionPane.YES_OPTION;
    }

    static String ambilTeks(String pesan, String judul) {
        while (true) {
            String hasil = JOptionPane.showInputDialog(null, pesan, judul, JOptionPane.QUESTION_MESSAGE);
            if (hasil == null) {
                if (konfirmasiKeluar()) {
                    System.exit(0);
                }
                return null;
            }
            hasil = hasil.trim();
            if (hasil.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Field tidak boleh kosong", "Error Info",
                        JOptionPane.ERROR_MESSAGE);
                continue;
            }
            return hasil;
        }
    }

    static Integer ambilAngka(String pesan, String judul) {
        while (true) {
            String hasil = JOptionPane.showInputDialog(null, pesan, judul, JOptionPane.QUESTION_MESSAGE);
            if (hasil == null) {
                if (konfirmasiKeluar()) {
                    System.exit(0);
                }
                return null;
            }
            hasil = hasil.trim();
            if (!hasil.matches("\\d+")) {
                JOptionPane.showMessageDialog(null, "Masukan angka", "Error Info",
                        JOptionPane.ERROR_MESSAGE);
                continue;
            }
            return Integer.parseInt(hasil);
        }
    }

    static String rupiah(int nilai) {
        return String.format("Rp %,d", nilai).replace(',', '.');
    }

    static void inputPesanan() {
        String pengirim = ambilTeks("Masukan nama pengirim:", "Input Pesanan");
        if (pengirim == null) {
            return;
        }

        String tujuan = ambilTeks("Masukan kota tujuan:", "Input Pesanan");
        if (tujuan == null) {
            return;
        }

        Integer berat = ambilAngka("Masukan berat barang (gr):", "Input Pesanan");
        if (berat == null) {
            return;
        }

        Integer jarak = ambilAngka("Masukan jarak tempuh (km):", "Input Pesanan");
        if (jarak == null) {
            return;
        }

        int kelipatanBerat = Math.max(1, (int) Math.ceil(berat / 100.0));
        int kelipatanJarak = Math.max(1, (int) Math.ceil(jarak / 10.0));
        int biayaBerat = kelipatanBerat * 5000;
        int biayaJarak = kelipatanJarak * 8000;
        int total = biayaBerat + biayaJarak;

        String resi = String.format("XYZ%04d", pesanan.size() + 1);

        ArrayList<String> data = new ArrayList<String>();
        data.add(resi);
        data.add(pengirim);
        data.add(tujuan);
        data.add(berat + " gr");
        data.add(jarak + " km");
        data.add(rupiah(total));
        data.add("Barang sedang diproses");
        pesanan.add(data);

        JOptionPane.showMessageDialog(null,
                "Pesanan berhasil dibuat\n\n"
              + "Nomor resi : " + resi + "\n"
              + "Biaya berat : " + rupiah(biayaBerat) + "\n"
              + "Biaya jarak : " + rupiah(biayaJarak) + "\n"
              + "Total biaya : " + rupiah(total),
                "Informasi", JOptionPane.INFORMATION_MESSAGE);
    }

    static void trackingPesanan() {
        if (pesanan.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Silakan lakukan Input Pesanan terlebih dahulu",
                    "Error Info", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String resi = ambilTeks("Masukan nomor resi:", "Tracking Pesanan");
        if (resi == null) {
            return;
        }

        for (int i = 0; i < pesanan.size(); i++) {
            ArrayList<String> data = pesanan.get(i);
            if (data.get(0).equalsIgnoreCase(resi)) {
                JOptionPane.showMessageDialog(null,
                        "Nomor resi : " + data.get(0) + "\n"
                      + "Pengirim   : " + data.get(1) + "\n"
                      + "Tujuan     : " + data.get(2) + "\n"
                      + "Berat      : " + data.get(3) + "\n"
                      + "Jarak      : " + data.get(4) + "\n"
                      + "Total      : " + data.get(5) + "\n"
                      + "Status     : " + data.get(6),
                        "Status Pengiriman", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "Data tidak ditemukan", "Error Info",
                JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] args) {
        String[] menu = {"Input Pesanan", "Tracking Pesanan", "Keluar"};

        while (true) {
            int pilih = JOptionPane.showOptionDialog(null, "Selamat datang di PT. XYZ Logistik",
                    "Menu Utama", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, menu, menu[0]);

            if (pilih == 0) {
                inputPesanan();
            } else if (pilih == 1) {
                trackingPesanan();
            } else {
                if (konfirmasiKeluar()) {
                    System.exit(0);
                }
            }
        }
    }
}