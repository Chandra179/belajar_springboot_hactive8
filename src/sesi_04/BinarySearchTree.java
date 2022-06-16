package sesi_04;

import java.util.Scanner;

public class BinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userInput = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("1. Input");
		System.out.println("2. View");
		System.out.println("3. Exit");

		System.out.print("Pilih : ");
		userInput = scan.nextInt();
		
		// 2 3 4 5 7 9 11

		String res = switch (userInput) {
		case 1 -> "1";
		case 2 -> "2";
		case 3 -> "3";
		default -> throw new IllegalArgumentException("Unexpected value: " + userInput);
		};

		System.out.println(res);
	}

}
