package level5_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int testNum = sc.nextInt();
		
		for(int i = 0; i < testNum; i++) {
			int n = sc.nextInt();
			int[] stNum = new int[n];
			double sum = 0;
			double average;
			
			for(int j = 0; j < stNum.length; j++) {
				stNum[i] = sc.nextInt();
				sum += stNum[i];
			}
			
			average = sum/stNum.length;
			System.out.println(Arrays.toString(stNum));
			int count = 0;
			for(int k = 0; k < stNum.length; k++) {
				System.out.println(stNum[k]);
				if(average < stNum[k]) {
					count++;
				}
			}
			System.out.println(count);
			
		
			
		}
	}

}
