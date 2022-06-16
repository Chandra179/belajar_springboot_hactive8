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
		float kalkulasi = panjang * lebar;
		System.out.println(res + kalkulasi);
	}

	@Override
	public void keliling() {
		// TODO Auto-generated method stub
		String res = "Keliling PersegiPanjang : ";
		float kalkulasi = 2 * (panjang + lebar);
		System.out.println(res + kalkulasi);
	}
}
