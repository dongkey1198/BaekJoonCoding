package level5_Array;

import java.util.Scanner;

public class ArrayExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] arr = new String[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		
		for(int i = 0; i < arr.length; i++) {
			
			int sum = 0;
			int count = 1;
			
			for(int j =0; j<arr[i].length(); j++) {
				if(arr[i].charAt(j) == 'O') {
					sum += count;
					count++;
				}
				else {
					count = 1;
				}
			}
			System.out.println(sum);
		}
		
	}

}
