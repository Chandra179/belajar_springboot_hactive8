package sesi_02;

import java.util.Scanner;

public class OperatorAritmatika {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int angka1;
		int angka2;
		int hasil;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Input angka-1 : ");
		angka1 = keyboard.nextInt();
		System.out.println("Input angka-1 : ");
		angka2 = keyboard.nextInt();
		
		hasil = angka1 + angka2;
		System.out.println("Hasil = " + hasil);
	}

}
