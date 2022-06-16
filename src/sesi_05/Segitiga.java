package sesi_05;

public class Segitiga implements BangunDatar {

	private float alas;
	private float tinggi;

	public Segitiga(float alas, float tinggi) {
		this.tinggi = tinggi;
		this.alas = alas;
	}

	@Override
	public float luas() {
		return 0.5f * alas * tinggi;
	}

	@Override
	public float keliling() {
		return alas * 3;
	}
}
