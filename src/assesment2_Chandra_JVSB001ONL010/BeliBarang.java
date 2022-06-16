package assesment2_Chandra_JVSB001ONL010;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class BeliBarang {

	static DaftarBarang daftarBarang = new DaftarBarang();
	static HashMap<Integer, Barang> detailBarang = daftarBarang.getDaftarBarang();

	public static void ringkasanBelanja(HashMap<Integer, Integer> barangYangDibeli) {

	    System.out.println(String.format("%30s %25s %10s %25s %10s", "No", "|", "Nama Barang", "|", "Harga", "|", "Harga", "|", "QTY", "|", "Diskon", "|", "SubTotal", "|"));
	    System.out.println(String.format("%s", "----------------------------------------------------------------------------------------------------------------"));
	    
	    public void printInvoice() {
	        System.out.println(String.format("%30s %25s %10.2f %25s %10s", this.getItemName(), "|", this.getPrice(), "|", this.getQuantity()));
	    }
	    
		System.out.println("No. %25Nama Barang %10Harga %10QTY %10Diskon %15SubTotal");
		System.out.format("%s %25s %s %10s %10s %15s%n", "No.", "Nama Barang", "Harga", "QTY", "Diskon", "SubTotal");

		for (Entry<Integer, Integer> entry : barangYangDibeli.entrySet()) {
			int kode = entry.getKey();
			int qty = entry.getValue();

			if (detailBarang.containsKey(kode)) {
				Barang barang = detailBarang.get(kode);
				String nama = barang.getNama();
				double harga = barang.getHarga();
				double diskon = barang.getDiskon();
				double subTotal = harga - (harga * diskon);

				System.out.format("%d %25s %10.2f %10d %10.2f %15.2f%n", kode,
						nama, 
						harga,
						qty,
						diskon, subTotal);
			}

		}
	}

	public static void main(String[] args) {

		// BARANG YANG DIBELI
		HashMap<Integer, Integer> barangYangDibeli = new HashMap<>();

		int jumlahBeli = 0;
		int i = 0;
		Scanner scan = new Scanner(System.in);

		System.out.print("Masukan jumlah beli : ");
		jumlahBeli = scan.nextInt();

		while (i < jumlahBeli) {
			System.out.format("Masukan Kode Barang ke-%d :", i);
			int kodeBarang = scan.nextInt();
			
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
