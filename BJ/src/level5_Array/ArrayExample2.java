package level5_Array;

import java.util.Scanner;

public class ArrayExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		
		for(int i = 0; i < arr.length; i ++) {
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		int index = 0;
		
		for(int i = 1; i < arr.length ; i++) {
			if(max < arr[i]) {
				max = arr[i];
				index = i;
			}
		}
		System.out.println(max);
		System.out.println(index+1);
		
	}

}
