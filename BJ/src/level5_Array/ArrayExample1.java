package level5_Array;

import java.util.Scanner;

public class ArrayExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int[] arr = new int[a];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int min = arr[0];
		int max = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.println(min + " " + max);
		
	}

}
