package sesi_05;

public class Lingkaran implements BangunDatar {

	final static float PI = 3.14f;
	float r;

	public Lingkaran(float r) {
		this.r = r;
	}

	@Override
	public void luas() {
		// TODO Auto-generated method stub
		String res = "Luas lingkaran : ";
		float kalkulasi = PI * r;
		System.out.println(res + kalkulasi);
	}

	@Override
	public void keliling() {
		// TODO Auto-generated method stub
		String res = "Keliling lingkaran : ";
		float kalkulasi = 2 * PI * r;
		System.out.println(res + kalkulasi);
	}

}
