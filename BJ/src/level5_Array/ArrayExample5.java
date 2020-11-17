package level5_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int subjectNumber = sc.nextInt();
		int[] arr = new int[subjectNumber];
		double sum = 0;
		double average;
		int m = 0;
		
		for(int i =0; i< arr.length; i++) {
			arr[i] = sc.nextInt();
			if(m<arr[i]) {
				m = arr[i];
			}
		}
		
		for(int i = 0 ; i< arr.length; i++) {
			sum += (double)arr[i]/m*100;
		}
		
		average = (double)sum/arr.length;
		System.out.println(average);
	}

}
