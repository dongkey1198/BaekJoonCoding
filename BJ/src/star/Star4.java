package star;

import java.util.Scanner;

public class Star4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0 ; i < n; i++ ) {
			for(int k = i; k > 0; k--) {
				System.out.print(" ");
			}
			for(int j = n; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
