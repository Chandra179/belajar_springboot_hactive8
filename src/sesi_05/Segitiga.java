package sesi_05;

public class Segitiga implements BangunDatar {

	float alas;
	float sisi;
	float tinggi;

	public Segitiga(float alas, float tinggi, float sisi) {
		this.tinggi = tinggi;
		this.alas = alas;
		this.sisi = sisi;
	}

	@Override
	public void luas() {
		// TODO Auto-generated method stub
		String res = "Luas segitiga : ";
		float kalkulasi = 0.5f * alas * tinggi;
		System.out.println(res + kalkulasi);
	}

	@Override
	public void keliling() {
		// TODO Auto-generated method stub
		String res = "Keliling segitiga : ";
		float kalkulasi = sisi * 3;
		System.out.println(res + kalkulasi);
	}

}
