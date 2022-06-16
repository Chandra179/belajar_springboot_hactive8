package sesi_05;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BangunDatar persegi = new Persegi(7);
		BangunDatar lingkaran = new Lingkaran(9);
		BangunDatar persegiPanjang = new PersegiPanjang(5, 6);
		BangunDatar segitiga = new Segitiga(9, 3, 4);

		persegi.luas();
		persegi.keliling();
		System.out.println("\n");

		lingkaran.luas();
		lingkaran.keliling();
		System.out.println("\n");

		persegiPanjang.luas();
		persegiPanjang.keliling();
		System.out.println("\n");

		segitiga.luas();
		segitiga.keliling();

	}

}
