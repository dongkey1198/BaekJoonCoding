package level5_Array;

import java.util.Scanner;

public class ArrayExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int max;
		int min;
		
		int a = sc.nextInt();
		int[] arr = new int[a]; // 배열생성
		
		for(int i = 0; i < arr.length; i ++) { // 배열 인트값 넣기
			arr[i] = sc.nextInt();
		}
		
		for(int j = 0, tmp = 0; j < arr.length - 1; j++) {
			if(arr[j] > arr[j+1]) {
				tmp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = tmp;
			}
			
		}
		
	}

}
