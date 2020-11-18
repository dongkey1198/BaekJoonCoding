package star;

import java.util.Scanner;

public class Star7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			for(int j = 1; j < n-i; j++) {
				System.out.print(" ");
			}
			for(int k = i; k + i >= 0  ; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for(int k = n - i; (k+n)-2 > i + 1; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
