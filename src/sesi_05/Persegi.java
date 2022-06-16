package sesi_05;

public class Persegi implements BangunDatar {

	private int sisi;

	public Persegi(int sisi) {
		this.sisi = sisi;
	}

	@Override
	public void luas() {
		// TODO Auto-generated method stub
		String res = "Luas Persegi : ";
		float kalkulasi = sisi * sisi;
		System.out.println(res + kalkulasi);
	}

	@Override
	public void keliling() {
		// TODO Auto-generated method stub
		String res = "Keliling Persegi : ";
		float kalkulasi = 4 * sisi;
		System.out.println(res + kalkulasi);
	}

}
