package sesi_03;

import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		final double PI = 3.14;
		double Luas;
		int r;

		Scanner scan = new Scanner(System.in);


		System.out.print("Input r : ");
		r = scan.nextInt();

		scan.close();

		Luas = PI * r;
		System.out.println("PI * r = " + Luas);

	}
}
