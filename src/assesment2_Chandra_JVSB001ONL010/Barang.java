package assesment2_Chandra_JVSB001ONL010;

public class Barang {

	private String nama;
	private double harga;
	private double diskon = 0;
	private int kode;

	public Barang(int kode, String nama, double harga, double diskon) {
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
}
