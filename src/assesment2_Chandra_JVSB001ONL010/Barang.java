package assesment2_Chandra_JVSB001ONL010;

import java.text.NumberFormat;

public class Barang {

	static NumberFormat formatter = NumberFormat.getCurrencyInstance();
	private String nama;
	private double harga;
	private int diskon = 0;
	private int kode;

	public Barang(int kode, String nama, double harga, int diskon) {
		this.nama = nama;
		this.harga = harga;
		this.diskon = diskon;
		this.kode = kode;
	}
	
	public Barang(int kode, String nama, double harga) {
		this.nama = nama;
		this.harga = harga;
		this.kode = kode;
	}

	public String getNama() {
		return nama;
	}

	public double getHarga() {
		return harga;
	}

	public double getDiskon() {
		return diskon;
	}

	public Integer getKode() {
		return kode;
	}

	public String getDiskonInPersen() {
		String diksonInPersen = (diskon != 0 ? (diskon + "%") : "-");
		return diksonInPersen;
	}

	public String getSubtotal() {
		double subTotal = harga - (harga * (diskon / 100));
		String total = formatter.format(subTotal); // currency format
		return total;
	}

}
