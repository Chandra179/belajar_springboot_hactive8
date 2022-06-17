package sesi_07;

import java.util.Scanner;

class BinarySearch {
	 public static void binarySearch(int arr[], int first, int last, int key){  
		   int mid = (first + last)/2;  
			// 1 2 3 4 5 6 7 8 9 10
			// mid 5
			// 5 < 10
			// 6 7 8 9 10
			// 6+10 / 2 = 8 mid 8

		   while( first <= last ){  
		      if ( arr[mid] < key ){  
		        first = mid + 1;     
		      }else if ( arr[mid] == key ){  
		        System.out.println("Element is found at index: " + mid);  
		        break;  
		      }else{  
		         last = mid - 1;  
		      }  
		      mid = (first + last)/2;  
		   }  
		   if ( first > last ){  
		      System.out.println("Element is not found!");  
		   }  
		 }  

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		int arraySize = 0;
		int valueToFind;

		// INPUT ARRAY SIZE
		System.out.print("Enter number of elements : ");
		arraySize = scan.nextInt();
		int[] data = new int[arraySize];

		System.out.format("Enter %d integers : \n", arraySize);
		for (int i = 0; i < arraySize; i++) {
			data[i] = scan.nextInt();
		}

		// FIND ARRAY
		System.out.print("Value to find : ");
		valueToFind = scan.nextInt();
		int last = data.length - 1;

		BinarySearch.binarySearch(data, 0, last, valueToFind);
	}
}
