package Praktikum3;

import javax.swing.JOptionPane;

public class massage {

	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		
//		jop.showMessageDialog(null, "hello", "Pesan penting", jop.WARNING_MESSAGE);
		
//		String nama = jop.showInputDialog(null, "Masukan nama anda");
//		jop.showMessageDialog(null, nama);
		
//		int confirm=jop.showConfirmDialog(null, "apakah ini kelas PBO", "konfirmasi", jop.YES_NO_OPTION);
//		
//		if(confirm==1) {
//			jop.showMessageDialog(null, "andan pilih no");
//		}else {
//			jop.showMessageDialog(null, "anda pilih yes");
		
		
//		}
		String input = JOptionPane.showInputDialog(null, "Masukan umur anda");
		
		int umur = Integer.parseInt(input);
		
		if (umur > 17) {
			JOptionPane.showMessageDialog(null, "Selamat Datang");
		}else {
			JOptionPane.showMessageDialog(null, "Mohon Maaf Anda Belum Mencukupi Umur");
		}
	}
}
