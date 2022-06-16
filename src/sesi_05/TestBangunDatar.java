package sesi_05;

public class TestBangunDatar {

	public static void ringkasanBangunDatar(BangunDatar... listBangunDatar) {
		for (BangunDatar i : listBangunDatar) {
			i.getHasil();
			System.out.println("\n");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BangunDatar persegi = new Persegi(7);
		BangunDatar lingkaran = new Lingkaran(9);
		BangunDatar persegiPanjang = new PersegiPanjang(5, 6);
		BangunDatar segitiga = new Segitiga(9, 3);

		ringkasanBangunDatar(persegi, lingkaran, persegiPanjang, segitiga);
	}

}
