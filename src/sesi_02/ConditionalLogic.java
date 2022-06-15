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

		hasil = k < z; // true
		hasil = k > z; // false
		hasil = k <= 5; // true
		hasil = k >= 11; // false
		hasil = k == z; // false
		hasil = k != z; // true
		hasil = k > z || k < z; // true
		hasil = 3 < k && k < 6; // false
		hasil = !hasil; // false
	}
}
