package level3_For;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ForExample11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int [] array = new int[n];
		
		for(int i = 0; i<n; i++) {
			array[i] = sc.nextInt();
		}
		
		
		for(int i = 0; i< array.length; i++) {
			if(x > array[i]) {
				System.out.print(array[i] + " ");
			}
		}
		
	}

}
