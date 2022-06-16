package sesi_05;

public class Segitiga implements BangunDatar {

	private float alas;
	private float tinggi;

	public Segitiga(float alas, float tinggi) {
		this.tinggi = tinggi;
		this.alas = alas;
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
		float kalkulasi = alas * 3;
		System.out.println(res + kalkulasi);
	}

	@Override
	public void getHasil() {
		luas();
		keliling();
	}
}
