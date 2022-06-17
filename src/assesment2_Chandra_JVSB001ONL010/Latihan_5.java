package assesment2_Chandra_JVSB001ONL010;

import java.util.HashMap;
import java.util.Scanner;

public class Latihan_5 {

	static DaftarBarang daftarBarang = new DaftarBarang();
	static HashMap<Integer, Barang> detailBarang = daftarBarang.getDaftarBarang();
	static Scanner scan = new Scanner(System.in);

	// Daftar barang
	public static void tampilkanBarang() {
		TabelDaftarBelanja.header();
		TabelDaftarBelanja.body(detailBarang);
		TabelDaftarBelanja.footer();
	}

	// Ringkasan pembelian
	public static void ringkasanBelanja(HashMap<Integer, Integer> barangYangDibeli) {
		TabelRingkasanBelanja.header();
		TabelRingkasanBelanja.body(detailBarang, barangYangDibeli);
		TabelRingkasanBelanja.footer();
	}

	public static void main(String[] args) {

		// BARANG YANG DIBELI
		HashMap<Integer, Integer> barangYangDibeli = new HashMap<>();

		int jumlahBeli = 0;
		int i = 1;


		// DAFTAR BARANG
		tampilkanBarang();


		// INPUT KODE BARANG
		System.out.print("Masukan jumlah beli : ");
		jumlahBeli = scan.nextInt();


		// jika pembelian lebih dari item maka input ulang
		if (jumlahBeli > detailBarang.size()) {
			System.out.println("Maksimal pembelian 5!");
			System.out.print("Masukan jumlah beli : ");
			jumlahBeli = scan.nextInt();
		}

		while (i <= jumlahBeli) {
			System.out.format("Masukan Kode Barang ke-%d :", i);
			int kodeBarang = scan.nextInt();

			// Jika barang sudah dibeli
			if (barangYangDibeli.containsKey(kodeBarang)) {
				System.out.println("Barang sudah dibeli!");
				continue;
			}

			// Jika barang tidak ada
			if (!detailBarang.containsKey(kodeBarang)) {
				System.out.println("Barang tidak ada!");
				continue;
			}

			// input QTY
			System.out.format("Masukan Qty ke-%d : ", i);
			int qtyBarang = scan.nextInt();

			// Simpan pembelian
			barangYangDibeli.put(kodeBarang, qtyBarang);
			i++;
		}

		ringkasanBelanja(barangYangDibeli);
	}

}
