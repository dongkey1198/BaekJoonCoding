package sort;

import java.util.Scanner;

public class InsertionSort {
	
	static int[] arr;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		arr = new int[t];
		
		for(int i = 0 ; i < t; i++) {
			arr[i] = sc.nextInt(); 
		}
		
		insertionSort();
		for(int a: arr) {
			System.out.println(a);
		}
		
	}
	static void insertionSort() {
		
		int tmp;
		for(int i = 1; i < arr.length; i++) {
			for(int j = i; j > 0; j--) {
				if(arr[j-1]> arr[j]) {
					tmp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
	}
}
