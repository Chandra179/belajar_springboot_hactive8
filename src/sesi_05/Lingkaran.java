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
		System.out.println(res + (PI * r));
	}

	@Override
	public void keliling() {
		// TODO Auto-generated method stub
		String res = "Keliling lingkaran : ";
		System.out.println(res + (2 * PI * r));
	}

}
