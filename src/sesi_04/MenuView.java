package sesi_04;

import java.util.Scanner;

public class MenuView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int menu = 1;
		int inputNode;
		Scanner in = new Scanner(System.in);
		
		while (menu != 3) {
			System.out.println("1. input");
			System.out.println("2. view");
			System.out.println("3. exit");
			System.out.print("Pilih : ");

			menu = in.nextInt(); // pilih menu

			switch (menu) {
			case 1:
				System.out.print("Masukan angka : ");
				inputNode = in.nextInt();
			case 2:
				// tr.view(root);
				System.out.println("no 2");
			case 3:
				System.out.println("Keluar");
			};
		}
	}

}
