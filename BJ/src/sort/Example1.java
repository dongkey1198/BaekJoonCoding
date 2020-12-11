package sort;

import java.util.Scanner;

public class Example1 {
	
	static int[] arr;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		arr = new int[t];
		
		for(int i = 0; i < t; i++) {
			arr[i] = sc.nextInt();
		}
	
		selectionSort(arr);
		
		for(int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		selectionSort2(arr);
		
		for(int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
	static void selectionSort2(int[] arr) {
		int tmp;
		int max;
		for(int i = 0; i< arr.length-1; i++) {
			max = i;
			for(int j = i+1; j<arr.length; j++) {
				if(arr[j] > arr[max]) {
					max = j;
				}
			}
			tmp = arr[i];
			arr[i] = arr[max];
			arr[max] = tmp;
		}
	}
	static void selectionSort(int[] arr) {
		
		int tmp;
		int min;
		
		for(int i = 0; i<arr.length-1; i++) {
			min = i;
			for(int j = i + 1; j<arr.length; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			tmp = arr[i];
			arr[i] = arr[min];
			arr[min] = tmp;
		}
		
	}

}
