package star;

import java.util.Scanner;

public class Star3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i = 0; i<a; i++) {
			for(int j = a; j>i; j --) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
