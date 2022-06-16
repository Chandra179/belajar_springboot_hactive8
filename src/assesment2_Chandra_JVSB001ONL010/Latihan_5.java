package assesment2_Chandra_JVSB001ONL010;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Latihan_5 {

	static DaftarBarang daftarBarang = new DaftarBarang();
	static HashMap<Integer, Barang> detailBarang = daftarBarang.getDaftarBarang();
	static NumberFormat formatter = NumberFormat.getCurrencyInstance();

	public static void ringkasanBelanja(HashMap<Integer, Integer> barangYangDibeli) {

		System.out.println(String.format("%s %25s %20s %15s %15s %20s",
				"No |", 
				"Nama Barang |", 
				"Harga |", 
				"QTY |", 
				"Diskon |", 
				"SubTotal |"));
		System.out.println(String.format("%s",
				"-------------------------------------------------------------------------------------------------------"));

		for (Entry<Integer, Integer> entry : barangYangDibeli.entrySet()) {
			int kode = entry.getKey();
			int qty = entry.getValue();

			if (detailBarang.containsKey(kode)) {
				Barang barang = detailBarang.get(kode);
				String nama = barang.getNama();
				double harga = barang.getHarga();
				double diskon = barang.getDiskon();

				double subTotal = harga - (harga * (diskon / 100));
				String subTotalCurrency = formatter.format(subTotal);

				System.out.println(String.format("%s %25s %20s %15s %15s %20s%n",
						kode, nama, harga, qty, (diskon+"%"), subTotalCurrency));
			}

		}
	}

	public static void main(String[] args) {

		// BARANG YANG DIBELI
		HashMap<Integer, Integer> barangYangDibeli = new HashMap<>();

		int jumlahBeli = 0;
		int i = 1;
		Scanner scan = new Scanner(System.in);

		System.out.print("Masukan jumlah beli : ");
		jumlahBeli = scan.nextInt();

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

			System.out.format("Masukan Qty ke-%d : ", i);
			int qtyBarang = scan.nextInt();

			// Simpan pembelian
			barangYangDibeli.put(kodeBarang, qtyBarang);
			i++;
		}

		ringkasanBelanja(barangYangDibeli);
	}

}
