package sort;

import java.util.Scanner;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		int[] arr = new int[t];
		
		for(int i = 0 ; i < t; i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] sorted_arr = bubbleSort(arr);
		
		System.out.print("결과: ");
		for(int a : sorted_arr) {
			System.out.print(a + " ");
		}
	}
	static int[] bubbleSort(int[] arr) {
		
		int tmp;
		
		for(int i = arr.length - 1; i > 0 ; i--) {
			
			for(int j = 0; j < i; j++) {
				
				if(arr[j] > arr[j + 1]) {
					
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
					
					for(int a : arr) {
						System.out.print(a + " ");
					}
					System.out.println();
				
				}
			
			}

		}
		return arr;
		
	}
}
