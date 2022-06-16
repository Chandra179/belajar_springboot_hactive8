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
		System.out.println(res + (0.5f * alas * tinggi));
	}

	@Override
	public void keliling() {
		// TODO Auto-generated method stub
		String res = "Keliling segitiga : ";
		System.out.println(res + (sisi * 3));
	}

}
