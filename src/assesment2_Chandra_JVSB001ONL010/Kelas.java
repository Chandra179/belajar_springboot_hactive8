package assesment2_Chandra_JVSB001ONL010;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kelas {
	
	public static void main(String[] args) {
		String userInput = "";
		Scanner scan = new Scanner(System.in);

		int i = 0;
		int j = 0;
		List<String> daftarKelas = new ArrayList<String>();
		
		System.out.println("Ketik 99 untuk keluar");
		while (true) {
			System.out.print("Input orang : ");
			userInput = scan.next();

			// EXIT PROGRAM
			if (userInput.equalsIgnoreCase("99")) {
				break;
			}

			if (j == 3) { // reset kelas
				i++;
				j = 0;
			}
			
			String keterangan = "Kamu akan duduk di (" + i + "," + j + ") : " + userInput;
			daftarKelas.add(keterangan);
			daftarKelas.forEach(x -> System.out.println(x));
			j++;
		}
	}
}
