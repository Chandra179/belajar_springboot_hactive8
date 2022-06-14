package sesi_02;

public class ConditionalLogic {
	public static void main(String[] args) {
		int x = 5;
		boolean y = (x == 5);

		if (y)
			System.out.println(y);
		if (x == 5) {
			System.out.println("x bernilai " + x);
		}

		boolean hasil;
		int k = 5;
		int z = 10;

		hasil = k < z;
		hasil = k > z;
		hasil = k <= 5;
		hasil = k >= 11;
		hasil = k == z;
		hasil = k != z;
		hasil = k > z || k < z;
		hasil = 3 < k && k < 6;
		hasil = !hasil;
	}
}
