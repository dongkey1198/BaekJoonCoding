package level5_Array;

import java.util.Scanner;

public class ArrayExample8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		int testNum = sc.nextInt(); 
		double[] arr = new double[testNum];
		
		for(int i = 0; i< testNum; i++) {
			
			int [] stNum = new int[sc.nextInt()];
			double sum = 0;
			double average;
			
			for(int j = 0; j < stNum.length; j++) {
				stNum[j] = sc.nextInt();
				sum += stNum[j];
			}
			average = sum/stNum.length;
			
			int cnt = 0;
			for(int k = 0; k < stNum.length; k++) {
				if(average < stNum[k]) {
					cnt++;
				}
			}
			
			arr[i] =((double)cnt/stNum.length)*100;
		}
       
		for(double ar : arr) {
			System.out.printf("%.3f%%", ar);
			System.out.println();
		}
	}

}