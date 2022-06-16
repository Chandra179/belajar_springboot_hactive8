package assesment2_Chandra_JVSB001ONL010;

import java.time.Year;
import java.util.Scanner;

public class TahunKabisat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tahun = 1;

		while (tahun != 0) {

			Scanner scan = new Scanner(System.in);
			System.out.print("Input tahun: ");
			tahun = scan.nextInt();

			String s = Integer.toString(tahun);

			if (s.length() < 4) {
				System.out.println("Minimal tahun 1000");
				continue;
			}

			if (s.length() > 2022) {
				System.out.println("Maksimal tahun 2022");
				continue;
			}

			int totalHari = Year.of(tahun).length();
			System.out.println(totalHari);
		}
	}

}
