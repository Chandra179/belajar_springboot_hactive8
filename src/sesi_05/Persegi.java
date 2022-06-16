package sesi_05;

public class Persegi implements BangunDatar {

	int sisi;

	public Persegi(int sisi) {
		this.sisi = sisi;
	}

	@Override
	public void luas() {
		// TODO Auto-generated method stub
		String res = "Luas Persegi : ";
		System.out.println(res + (sisi * sisi));
	}

	@Override
	public void keliling() {
		// TODO Auto-generated method stub
		String res = "Keliling Persegi : ";
		System.out.println(res + (4 * sisi));
	}

}
