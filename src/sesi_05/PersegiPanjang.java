package sesi_05;

public class PersegiPanjang implements BangunDatar {

	float lebar;
	float panjang;

	public PersegiPanjang(float panjang, float lebar) {
		this.panjang = panjang;
		this.lebar = lebar;
	}

	@Override
	public void luas() {
		// TODO Auto-generated method stub
		String res = "Luas PersegiPanjang : ";
		System.out.println(res + (panjang * lebar));
	}

	@Override
	public void keliling() {
		// TODO Auto-generated method stub
		String res = "Keliling PersegiPanjang : ";
		System.out.println(res + (2 * (panjang + lebar)));
	}
}
