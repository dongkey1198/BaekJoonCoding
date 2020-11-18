package star;

import java.util.Scanner;

public class Star5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i ++) {
			for(int j = 1; j < (n-i) ; j++) {
				System.out.print(" ");
			}
			for(int k = i; k + i >= 0; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
